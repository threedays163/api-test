
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.dto;

import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.common.utils.DateUtil;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @title TimeSliceDto
 * @desc 时间片
 * @author shanyu
 * @date 2018年7月24日
 * @version 1.0
 */

@Data
public class TimeSliceDto implements Serializable {

    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("HH:mm");
        }
    };

    public static Date parse(String dateStr) throws ParseException {
        return threadLocal.get().parse(dateStr);
    }

    public static String format(Date date) {
        return threadLocal.get().format(date);
    }

    private static final long serialVersionUID = -4119823416766542339L;

    private String startTimeStr;// 开始时间格式：小时:分钟

    private String endTimeStr; // 结束时间：小时:分钟

    private Date date; // 日期：具体到天

    private Date startTime; // 开始时间 具体到分钟

    private Date endTime; // 结束时间 具体到分钟

    public TimeSliceDto(Date date, String startTimeStr, String endTimeStr) {
        if (!validateHourMinute(startTimeStr) || !validateHourMinute(endTimeStr)) {
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "时间格式不正确:小时:分钟");
        }
        this.startTimeStr = startTimeStr;
        this.endTimeStr = endTimeStr;
        this.date = date;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if (!"00:00".equals(startTimeStr)) {
            c.add(Calendar.MINUTE, diffMinute("00:00", startTimeStr));
        }
        this.startTime = c.getTime();
        c.add(Calendar.MINUTE, diffMinute(startTimeStr, endTimeStr));
        this.endTime = c.getTime();
    }

    public TimeSliceDto(Date startTime, Date endTime) {
        this.date = DateUtil.getBeginOfDay(endTime);
        this.startTime = startTime;
        this.endTime = endTime;
        this.startTimeStr = format(startTime);
        this.endTimeStr = format(endTime);
    }

    // private final static String hourMinuteReg = "^([0-1]{1}\\d|2[0-3]):([0-5]\\d)$";
    private final static String hourMinuteReg = "^([0-1]?\\d|2[0-3]):([0-5]\\d)$";

    /**
     * 校验是否符合格式：小时：分钟
     * 
     * @param timeStr
     * @return
     */
    public static boolean validateHourMinute(String timeStr) {
        if (StringUtils.isAllBlank(timeStr)) {
            return false;
        }
        Pattern p = Pattern.compile(hourMinuteReg);
        Matcher matcher = p.matcher(timeStr);
        return matcher.matches();
    }

    public static Date getDateTime(Date date, String timeStr) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, diffMinute("00:00", timeStr));
        return c.getTime();
    }

    public static String getDateStr(Date dateTime) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        return format.format(dateTime);
    }

    /**
     * 比较时间大小
     * 
     * @param timeStr1 小时：分钟
     * @param timeStr2 小时：分钟
     * @return
     */
    public static int compare(String timeStr1, String timeStr2) {
        if (!validateHourMinute(timeStr1) || !validateHourMinute(timeStr2)) {
            return 0;
        }
        return StringUtils.compare(timeStr1, timeStr2);
    }

    /**
     * 判断两个时间片是否交叉
     * 
     * @param slice1 时间片1
     * @param slice2 时间片2
     * @return
     */
    public static boolean intersect(TimeSliceDto slice1, TimeSliceDto slice2) {
        // 不在同一天一定不交叉
        if (DateUtil.getDateDiff(slice1.getDate(), slice2.getDate()) != 0) {
            return false;
        }
        // 时间片2的开始时间落在时间片1之间
        if (diffMinute(slice1.getStartTimeStr(), slice2.getStartTimeStr()) > 0
            && diffMinute(slice2.getStartTimeStr(), slice1.getEndTimeStr()) > 0) {
            return true;
        }
        // 时间片1的开始时间落在时间片2之间
        if (diffMinute(slice2.getStartTimeStr(), slice1.getStartTimeStr()) > 0
            && diffMinute(slice1.getStartTimeStr(), slice2.getEndTimeStr()) > 0) {
            return true;
        }
        // 开始时间或者结束时间完全相同
        if (diffMinute(slice2.getStartTimeStr(), slice1.getStartTimeStr()) == 0
            || diffMinute(slice2.getEndTimeStr(), slice1.getEndTimeStr()) == 0) {
            return true;
        }
        return false;
    }

    /**
     * 计算时间差（分钟数）
     * 
     * @param timeStr1 小时:分钟
     * @param timeStr2 小时:分钟
     * @return
     */
    public static int diffMinute(String timeStr1, String timeStr2) {
        if (!validateHourMinute(timeStr1) || !validateHourMinute(timeStr2)) {
            return 0;
        }
        String[] arr1 = StringUtils.split(timeStr1, ":");
        String[] arr2 = StringUtils.split(timeStr2, ":");
        if ("00:00".equals(timeStr2) || "0:00".equals(timeStr2)) {
            return 24 * 60 - Integer.parseInt(arr1[0]) * 60 - Integer.parseInt(arr1[1]);
        }
        return Integer.parseInt(arr2[0]) * 60 + Integer.parseInt(arr2[1]) - Integer.parseInt(arr1[0]) * 60
            - Integer.parseInt(arr1[1]);
    }

    public static String getHourAndMinuteStr(int minutes) {
        int hour = minutes / 60;
        int minuteElse = minutes % 60;
        StringBuilder sb = new StringBuilder();
        if (hour > 0) {
            sb.append(hour).append("小时");
        }
        sb.append(minuteElse).append("分钟");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new TimeSliceDto(DateUtil.getBeginOfDay(new Date()), "00:00", "00:01"));
        System.out.println(new TimeSliceDto(DateUtil.getBeginOfDay(new Date()), "00:01", "00:00"));
    }

    /**
     * 获取日期（0时0分0秒）
     *
     * @param date 小时：分钟
     * @return
     */
    public static Date getDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

}
