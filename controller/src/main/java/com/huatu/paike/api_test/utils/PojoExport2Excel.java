package com.huatu.paike.api_test.utils;

import com.huatu.common.annotation.FieldDesc;
import com.huatu.common.dto.resp.GradeDto;
import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.common.dto.resp.Node;
import com.huatu.common.enums.EnumConstant;
import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.paike.api_test.dto.ResultFieldDto;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PojoExport2Excel {

    /**
     * 根据NeedPrint注解导出类的全部或者部分字段
     *
     * @param beanList 需要打印的po集合
     * @param clazz po类的字节码文件
     * @param request
     * @param response
     * @param returnName 导出的文件名，为空或者null会自动生成UUID
     * @param fieldList 指定头部名称
     * @throws Exception
     */
    public static <T> void printByAnnotation(List<T> beanList, Class<T> clazz, HttpServletRequest request,
        HttpServletResponse response, String returnName, String sheetName, List<String> fieldList, boolean isAppendDate)
        throws Exception {
        // if (CollectionUtils.isEmpty(beanList)) {
        // throw new BusinessException(CommonErrorCode.PARAM_ERROR, "导出的数据为空，导出失败");
        // }
        if (StringUtils.isBlank(returnName)) {
            returnName = UUID.randomUUID().toString().replace("-", "");
        }
        String nowStr;
        if (isAppendDate) {
            synchronized (PojoExport2Excel.class) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                Date now = new Date();
                nowStr = sdf.format(now);
            }
            returnName = returnName + "-" + nowStr;
        }
        returnName += ".xlsx";
        doPrint(beanList, clazz, request, response, returnName, sheetName, fieldList);
    }

    /**
     * 根据NeedPrint注解导出类的全部或者部分字段
     *
     * @param beanList 需要打印的po集合
     * @param clazz po类的字节码文件
     * @param request
     * @param response
     * @param returnName 导出的文件名，为空或者null会自动生成UUID
     * @param fieldList 指定头部名称
     * @throws Exception
     */
    public static void printList(List<List<ResultFieldDto>> beanList, HttpServletRequest request,
                                 HttpServletResponse response, String returnName, List<String> fieldList) throws Exception {
        // if (CollectionUtils.isEmpty(beanList)) {
        // throw new BusinessException(CommonErrorCode.PARAM_ERROR, "导出的数据为空，导出失败");
        // }
        if (StringUtils.isBlank(returnName)) {
            returnName = UUID.randomUUID().toString().replace("-", "");
        }
        doPrint(beanList, request, response, returnName, fieldList);
    }

    /**
     * 通用打印
     *
     * @param beanList
     * @param clazz
     * @param request
     * @param response
     * @param returnName
     * @param fieldList 需要打印的字段集合
     * @throws Exception
     */
    private static void doPrint(List<List<ResultFieldDto>> beanList, HttpServletRequest request,
        HttpServletResponse response, String returnName, List<String> fieldList) throws Exception {

        response.reset();// 清空输出流
        OutputStream os = response.getOutputStream();// 取得输出流
        returnName = URLEncoder.encode(returnName, "UTF-8");
        response.setHeader("Content-disposition", "attachment; filename=" + returnName + ".xlsx");// 设定输出文件头
        response.setContentType("application/msexcel");// 定义输出类型
        // 设置通用变量
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        Integer rowNo = 0, cellNo = 0;
        Row nRow = null;
        Cell nCell = null;
        printHeaderAndValue(beanList, request, response, returnName, fieldList, wb, sheet, rowNo, cellNo, nRow, nCell);
        wb.write(os);
        wb.close();
        os.close();
    }

    private static void printHeaderAndValue(List<List<ResultFieldDto>> beanList, HttpServletRequest request,
        HttpServletResponse response, String returnName, List<String> fieldList, XSSFWorkbook wb, Sheet sheet,
        Integer rowNo, Integer cellNo, Row nRow, Cell nCell) throws Exception {

        // fixed by 闫茂源 @ 2018/05/23
        // 不要在循环内创建CellStyle. 若导入数据量较大，可能会产生下列异常：
        // The maximum number of Cell Styles was exceeded. You can define up to 64000
        // style in a .xlsx Workbook
        CellStyle headerStyle = getCellStyle(wb, true);// 表头样式，粗体
        CellStyle contentStyle = getCellStyle(wb, false);// 内容样式，不加粗。

        // 第一行，设置属性
        nRow = sheet.createRow(rowNo++);
        nRow.setHeightInPoints(20);

        // 打印头部信息
        for (String fieldName : fieldList) {
            sheet.autoSizeColumn(cellNo, true);
            sheet.setColumnWidth(cellNo, fieldName.length() * 4 * 256);
            nCell = nRow.createCell(cellNo++);
            nCell.setCellValue(fieldName);
            nCell.setCellStyle(headerStyle);
        }
        cellNo = 0;
        // 打印值
        for (List<ResultFieldDto> list : beanList) {
            nRow = sheet.createRow(rowNo++);
            for (ResultFieldDto dto : list) {// 获取中文名到字段名的映射
                nRow.setHeightInPoints(20);
                nCell = nRow.createCell(cellNo++);
                if (dto.getType() == ResultFieldDto.FieldType.STRING.getType()) {
                    // fixed by 闫茂源 @ 2018/06/13
                    // PM 王瑞要求工资导出时，组织架构只显示最末一个节点
                    String value = String.valueOf(dto.getValue());
                    if ("组织架构".equals(dto.getDesc())) {
                        int idx = value.lastIndexOf(Node.SEPARATE);
                        if (idx > 0) {
                            value = value.substring(idx + 1);
                        }
                    }
                    nCell.setCellValue(value);
                } else {
                    BigDecimal b = new BigDecimal(Double.parseDouble(String.valueOf(dto.getValue())))
                        .divide(new BigDecimal(dto.getPercent()));
                    if (dto.getPercent() == 1) {
                        nCell.setCellValue(String.valueOf(b.longValue()));
                    } else {
                        if (dto.getPercent() == 100) {
                            nCell.setCellValue(b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                        } else if (dto.getPercent() == 10000) {
                            nCell.setCellValue(b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue());
                        }
                    }
                }
                nCell.setCellStyle(contentStyle);
            }
            cellNo = 0;
        }
    }

    /**
     * 通用打印
     *
     * @param beanList
     * @param clazz
     * @param request
     * @param response
     * @param returnName
     * @param fieldList 需要打印的字段集合
     * @throws Exception
     */
    private static <T> void doPrint(List<T> beanList, Class<T> clazz, HttpServletRequest request,
        HttpServletResponse response, String returnName, String sheetName, List<String> fieldList) throws Exception {

        response.reset();// 清空输出流
        OutputStream os = response.getOutputStream();// 取得输出流
        returnName =new String(returnName.getBytes("gbk"),"ISO-8859-1");    //URLEncoder.encode(returnName, "UTF-8")
        
        response.setHeader("Content-Disposition", "attachment;filename=\"" + returnName+"\"");// 设定输出文件头
        response.setContentType("application/msexcel");// 定义输出类型
        // 设置通用变量
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet(sheetName);
        Integer rowNo = 0, cellNo = 0;
        Row nRow = null;
        Cell nCell = null;
        printHeaderAndValue(beanList, request, response, returnName, clazz, fieldList, wb, sheet, rowNo, cellNo, nRow,
            nCell);
        wb.write(os);
        wb.close();
        os.close();
    }

    /**
     * 打印表头和值
     *
     * @param beanList
     * @param request
     * @param response
     * @param returnName
     * @param clazz
     * @param fieldList
     * @param wb
     * @param sheet
     * @param rowNo
     * @param cellNo
     * @param nRow
     * @param nCell
     * @throws Exception
     */
    private static <T> void printHeaderAndValue(List<T> beanList, HttpServletRequest request,
        HttpServletResponse response, String returnName, Class<T> clazz, List<String> fieldList, XSSFWorkbook wb,
        Sheet sheet, Integer rowNo, Integer cellNo, Row nRow, Cell nCell) throws Exception {

        // 第一行，设置属性
        nRow = sheet.createRow(rowNo++);
        nRow.setHeightInPoints(20);
        Map<String, String> headerFieldMap = Maps.newHashMap();
        Map<String, Boolean> percentMap = Maps.newHashMap();
        Map<String, Integer> percentLengthMap = Maps.newHashMap();
        Map<String, String> dateFormatMap = Maps.newHashMap();
        Field[] fields = clazz.getDeclaredFields();// 得到po类的所有字段
        boolean hasFieldInfo = true;
        if (CollectionUtils.isEmpty(fieldList)) {
            hasFieldInfo = false;
            fieldList = Lists.newArrayList();
        }

        for (Field field : fields) {// 获取中文名到字段名的映射
            if (!field.getType().equals(List.class)) {
                FieldDesc fieldDesc = field.getDeclaredAnnotation(FieldDesc.class);
                if (fieldDesc != null) {
                    if (!hasFieldInfo) {
                        fieldList.add(fieldDesc.desc());
                    }
                    headerFieldMap.put(fieldDesc.desc(), field.getName());
                    percentMap.put(fieldDesc.desc(), fieldDesc.percent());
                    percentLengthMap.put(fieldDesc.desc(), fieldDesc.percentLenth());
                    dateFormatMap.put(fieldDesc.desc(), fieldDesc.dateFormat());
                }
            }
        }
        if (CollectionUtils.isEmpty(fieldList)) {
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "没有需要导出的字段信息");
        }
        CellStyle headerStyle = getCellStyle(wb, true);// 表头样式，粗体
        CellStyle contentStyle = getCellStyle(wb, false);// 内容样式，不加粗。
        Map<String, Integer> lengthMap = Maps.newHashMap();

        // 打印头部信息
        for (String fieldName : fieldList) {
            Integer length = fieldName.length() * 4 * 256;
            sheet.setColumnWidth(cellNo, length);
            lengthMap.put(fieldName, length);
            nCell = nRow.createCell(cellNo++);
            nCell.setCellValue(fieldName);
            nCell.setCellStyle(headerStyle);
        }
        cellNo = 0;
        // 打印值
        for (T t : beanList) {
            nRow = sheet.createRow(rowNo++);
            Map<String, Object> valueMap = Maps.newHashMap();
            for (Field field : fields) {// 获取中文名到字段名的映射
                FieldDesc fieldDesc = field.getDeclaredAnnotation(FieldDesc.class);
                if (fieldDesc != null) {
                    field.setAccessible(true);
                    valueMap.put(fieldDesc.desc(), field.get(t));
                }
            }
            for (String showName : fieldList) {
                nRow.setHeightInPoints(20);
                // sheet.autoSizeColumn(cellNo, true);
                nCell = nRow.createCell(cellNo++);
                Object obj = valueMap.get(showName);
                if (obj != null) {
                    boolean percent = percentMap.get(showName);
                    if (percent) {
                        int percentLength = percentLengthMap.get(showName);
                        Number number = null;
                        try {
                            number = (Number) obj;
                            if (percentLength == 100) {
                                BigDecimal b = new BigDecimal(number.doubleValue()).divide(new BigDecimal(100))
                                    .setScale(2, BigDecimal.ROUND_HALF_UP);
                                nCell.setCellValue(b.doubleValue());
                            } else if (percentLength == 10000) {
                                BigDecimal b = new BigDecimal(number.doubleValue()).divide(new BigDecimal(10000))
                                    .setScale(4, BigDecimal.ROUND_HALF_UP);
                                nCell.setCellValue(b.doubleValue());
                            }
                        } catch (ClassCastException e) {
                            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "需要打印的字段不为数值，描述信息错误");
                        }
                    } else if (obj instanceof IdAndNameDto) {
                        nCell.setCellValue(((IdAndNameDto) obj).getName());
                    } else if (obj instanceof EnumConstant) {
                        nCell.setCellValue(((EnumConstant) obj).getDesc());
                    } else if (obj instanceof Node) {
                        nCell.setCellValue(((Node) obj).getName());
                    } else if (obj instanceof GradeDto) {
                        GradeDto grade = (GradeDto) obj;
                        if (grade.getGradeId() != -1) {
                            nCell.setCellValue(grade.getGradeLevelStr() + "(" + grade.getGradeLevelName() + ")");
                        } else {
                            nCell.setCellValue("未定级");
                        }

                    } else if (obj instanceof Date) {
                        Date date = (Date) obj;
                        String format = dateFormatMap.getOrDefault(showName, "yyyy-MM-dd");
                        SimpleDateFormat sdf = new SimpleDateFormat(format);
                        nCell.setCellValue(sdf.format(date));
                    } else if (obj instanceof List) {

                    } else {
                        nCell.setCellValue(obj.toString());
                    }
                    int oldMaxLength = lengthMap.get(showName);
                    int valueLength = obj.toString().length() * 2 * 256;
                    if (obj instanceof Date) {
                        valueLength = 10 * 256;
                    }
                    // 将之前最长的长度与当前值的长度进行比较
                    int maxLength = oldMaxLength > valueLength ? oldMaxLength : valueLength;
                    if (showName.equals("备注")) {
                        sheet.setColumnWidth(cellNo - 1, maxLength>256*2*5? 256*2*5: maxLength);
                    }
                    // 重新设置该字段最长的值的长度
                    lengthMap.put(showName, maxLength);
                }
                nCell.setCellStyle(contentStyle);
            }
            cellNo = 0;
        }
    }

    /**
     * 设置单元格样式
     *
     * @param wb
     * @param bold 粗体
     * @return
     */
    private static CellStyle getCellStyle(XSSFWorkbook wb, boolean bold) {
        XSSFCellStyle cellStyle = wb.createCellStyle();

        // 设置居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);

        // 设置边框
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);

        // 设置字体
        XSSFFont font = wb.createFont();
        font.setFontName("黑体");
        font.setBold(bold);
        font.setFontHeightInPoints((short) 12);
        cellStyle.setFont(font);

        return cellStyle;
    }

}
