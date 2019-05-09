/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.common.utils.JacksonUtil;
import com.huatu.paike.api_test.dto.ApiResponse;
import com.huatu.paike.api_test.dto.PlaceApiResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

/**
 * 由北京技术中心提供的场地信息API。
 *
 * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9E%97%E7%90%B3:%E5%9C%BA%E6%89%80%E4%BF%A1%E6%81%AF%E6%8E%A5%E5%8F%A3%E8%A7%84%E8%8C%83">场所信息接口规范</a>
 * @title PlaceApi
 * @desc PlaceApi
 * @author yanmaoyuan
 * @date 2019年2月26日
 * @version 1.0
 */
@Component
@Slf4j
@Setter
public class PlaceApi {

    private static final String CHARSET = "UTF-8";

    @Value("${place.client.apiKey}")
    private String apiKey;

    @Value("${place.client.connectionTimeout:1000}")
    private Integer connectionTimeout;

    @Value("${place.client.readTimeout:5000}")
    private Integer readTimeout;

    @Value("${place.list.url}")
    private String placeListUrl;

    @Value("${place.info.url}")
    private String placeInfoUrl;

    @Value("${place.detail.url}")
    private String placeDetailUrl;

    @Value("${place.fuzzyQuery.url}")
    private String placeFuzzyQueryUrl;

    @Value("${place.hotel.add.url}")
    private String hotelAddUrl;

    @Value("${place.hotel.mod.url}")
    private String hotelModUrl;

    @Value("${place.hotel.del.url}")
    private String hotelDelUrl;

    /**
     * 发送HTTP请求前的操作
     * <p>场地API要进行接口鉴权，提交所有请求之前要先根据apiKey计算出签名，并添加鉴权所需的参数。</p>
     * <p>签名算法类似微信API，对api_key,nonce_str,timestamp进行BASE64运算即可。</p>
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9E%97%E7%90%B3:%E6%8E%A5%E5%8F%A3%E8%A7%84%E8%8C%83%E8%AF%B4%E6%98%8E-%E8%8E%B7%E5%8F%96sign">接口规范说明-获取sign</a>
     * @param params 请求参数
     */
    protected void preOperation(final Map<String, Object> params) {
        Preconditions.checkArgument(params != null, "params is null!");

        /**
         * PlaceApi接口要求有一个verify对象作为接口鉴权参数
         */
        String nonceStr = getNonceStr();// 随机字符串
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);// 时间戳单位为秒
        String sign = getSign(apiKey, nonceStr, timestamp);// 参数签名

        Map<String, String> map = Maps.newHashMap();
        map.put("api_key", apiKey);
        map.put("nonce_str", nonceStr);
        map.put("timestamp", timestamp);
        map.put("sign", sign);

        params.put("verify", map);
    }

    /**
     * 获取场所信息接口（分页）
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9D%8E%E8%B6%85:%E8%8E%B7%E5%8F%96%E5%9C%BA%E6%89%80%E4%BF%A1%E6%81%AF%E6%8E%A5%E5%8F%A3%EF%BC%88%E5%88%86%E9%A1%B5%EF%BC%89">获取场所信息接口（分页）</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String placeList(Map<String, Object> params) {
        return post(placeListUrl, params);
    }

    /**
     * 根据ID批量查询场所信息
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9E%97%E7%90%B3:%E6%A0%B9%E6%8D%AEID%E6%89%B9%E9%87%8F%E6%9F%A5%E8%AF%A2%E5%9C%BA%E6%89%80%E4%BF%A1%E6%81%AF">根据ID批量查询场所信息</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String placeInfo(Map<String, Object> params) {
        return post(placeInfoUrl, params);
    }

    /**
     * 排课场所详情
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9D%8E%E8%B6%85:%E6%8E%92%E8%AF%BE%E5%9C%BA%E6%89%80%E8%AF%A6%E6%83%85">排课场所详情</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String placeDetail(Map<String, Object> params) {
        return post(placeDetailUrl, params);
    }

    /**
     * 模糊查询场所
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9D%8E%E8%B6%85:%E6%A8%A1%E7%B3%8A%E6%9F%A5%E8%AF%A2%E5%9C%BA%E6%89%80">模糊查询场所</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String fuzzyQuery(Map<String, Object> params) {
        return post(placeFuzzyQueryUrl, params);
    }

    /**
     * 新增酒店场地场所数据
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9E%97%E7%90%B3:%E6%96%B0%E5%A2%9E%E9%85%92%E5%BA%97%E5%9C%BA%E5%9C%B0%E5%9C%BA%E6%89%80%E6%95%B0%E6%8D%AE">新增酒店场地场所数据</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String addHotel(Map<String, Object> params) {
        return post(hotelAddUrl, params);
    }

    /**
     * 编辑酒店场地场所数据
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9E%97%E7%90%B3:%E7%BC%96%E8%BE%91%E9%85%92%E5%BA%97%E5%9C%BA%E5%9C%B0%E5%9C%BA%E6%89%80%E6%95%B0%E6%8D%AE">编辑酒店场地场所数据</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String modHotel(Map<String, Object> params) {
        return post(hotelModUrl, params);
    }

    /**
     * 删除酒店场地场所数据
     *
     * @see <a href="http://wiki.huatuop.com/index.php?title=%E5%8C%97%E4%BA%AC%E6%8A%80%E6%9C%AF%E4%B8%AD%E5%BF%83:%E5%8C%BB%E7%96%97%E6%8A%80%E6%9C%AF%E7%BB%84:%E6%9E%97%E7%90%B3:%E5%88%A0%E9%99%A4%E9%85%92%E5%BA%97%E5%9C%BA%E5%9C%B0%E5%9C%BA%E6%89%80%E6%95%B0%E6%8D%AE">删除酒店场地场所数据</a>
     * @param params 请求参数
     * @return 返回json格式的响应结果
     */
    public String delHotel(Map<String, Object> params) {
        return post(hotelDelUrl, params);
    }

    /**
     * 发送JSON请求
     *
     * @param url 请求地址
     * @param params 请求参数
     * @return 返回json格式的响应结果
     * @throws BusinessException 当HTTP响应状态不是200时，将抛出异常，提示网络请求失败。
     */
    public String post(String url, Map<String, Object> params) throws BusinessException {
        preOperation(params);
        try{
            ApiResponse resp = postJson(url, params);
            log.debug("response:\nstatus={}\nbody={}\nheaders={}\n", resp.getStatus(), resp.getBodyStr(), resp.getHeader());

            if (resp.getStatus() == 200) {// on success
                return resp.getBodyStr();
            } else { // on failure
                log.error("request failed on url={}, params={}, status={}, headers={}", url, params, resp.getStatus(), resp.getHeader());
                //throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "网络请求失败(" + resp.getStatus() + ")");
            }
        }catch (Exception e){
            log.error("request failed on url={}, params={}", url, params);
        }

        return "";
    }

    /**
     * 将json文本反序列化为范型对象
     *
     * @param json json格式的文本
     * @param reference 转化的目标类型
     * @return
     */
    public <T> PlaceApiResult<T> getApiResult(String json, TypeReference<PlaceApiResult<T>> reference) {
        // 反序列化json数据
        PlaceApiResult<T> result = null;
        try {
            JSONObject jsonObject = JSON.parseObject(json);
            if(jsonObject == null){
                return result;
            }
            String data = jsonObject.getString("data");
            if(StringUtils.isEmpty(data)){
                return result;
            }
            result = JacksonUtil.str2Obj(json, reference);
        } catch (Exception e) {
            log.error("Failed parsing json:{}", json, e);
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "网络请求失败(JSON格式错误)");
        }

        return result;
    }


    /**
     * 将json文本反序列化为PlaceApiResult对象，并直接获取data字段的值。
     *
     * @param json json格式的文本
     * @param reference 转化的目标类型
     * @return 返回json数据中data字段的值
     * @throws BusinessException 若接口响应不成功，则抛出异常。
     */
    public <T> T getData(String json, TypeReference<PlaceApiResult<T>> reference) {

        // 反序列化json数据
        PlaceApiResult<T> result = getApiResult(json, reference);

        // 获得最终返回结果
        if(result == null){
            return null;
        } else if (result.getCode() == PlaceApiResult.CODE_SUCCESS) {
            return result.getData();
        } else {
            log.error("Unexpected result:{}", result);
            String msg = String.format("网络请求失败(code=%d, msg=%s)", result.getCode(), result.getMsg());
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, msg);
        }
    }

    /**
     * 生成签名字符串
     *
     * @param apiKey
     * @param nonceStr
     * @param timestamp
     * @return
     */
    private String getSign(String apiKey, String nonceStr, String timestamp) {
        String data = "api_key=" + apiKey + "&nonce_str=" + nonceStr + "&timestamp=" + timestamp + "&" + apiKey;
        byte[] bytes = Base64.encodeBase64(data.getBytes());
        return new String(bytes).toUpperCase();
    }

    /**
     * 生成签名字符串
     *
     * <p>根据场地API的接口文档描述，应该按自然顺序对请求的参数进行排序，然后生成BASE64。但是由于目前场地API只使用3个固定请求参数，因此这个算法并没有实际作用。</p>
     *
     * @param params
     * @return
     */
    @SuppressWarnings("unused")
    private String getSign(Map<String, Object> params) {
        if (params == null || params.isEmpty()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        // 根据key进行自然排序
        List<String> keys = Lists.newArrayList(params.keySet());
        keys.sort(Comparator.naturalOrder());

        // 生成 key1=value1&key2=value2&..格式的参数字符串
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);

            // 忽略空数据
            Object obj = params.get(key);
            if (obj == null) {
                continue;
            }

            // 忽略空字符串
            String str = String.valueOf(obj);
            if (StringUtils.isBlank(str)) {
                continue;
            }

            // 对字符串进行URL编码
            String value = null;
            try {
                value = URLEncoder.encode(str, CHARSET);
            } catch (UnsupportedEncodingException e) {
                value = str;
                log.error("encoding error with charset={}, value={}", CHARSET, str);
            }

            // 追加到字符串末尾
            sb.append(key).append("=").append(value).append("&");
        }

        // 追加 apiKey
        sb.append(apiKey);

        String signData = sb.toString();

        // 生成BASE64
        byte[] bytes = Base64.encodeBase64(signData.getBytes());
        String str = new String(bytes);
        return str.toUpperCase();// 字符转为大写
    }

    /**
     * 生成随机字符串
     *
     * @return
     */
    private static String getNonceStr() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        Random r = new Random();
        StringBuilder nonceStr = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int index = r.nextInt(uuid.length());
            nonceStr.append(uuid.charAt(index));
        }
        return nonceStr.toString();
    }

    /**
     * 向服务端以post形式发送json请求
     *
     * @param requestUrl 请求地址
     * @param params 请求参数
     * @return 响应结果
     */
    private ApiResponse postJson(String requestUrl, Map<String, Object> params) {
        log.info("post request to url={}, params={}", requestUrl, params);

        // 转化为JSON
        String content = JacksonUtil.obj2Str(params);
        log.debug("request content:\n{}\n", content);

        ApiResponse response = new ApiResponse();

        DataOutputStream out = null;
        InputStream is = null;
        try {
            long requestDataSize;// 发送请求的字节数
            long responseDataSize;// 接收响应的字节数

            long startTime;// 链接开始时间
            long connectTime;// 建立链接的时间
            long requestTime;// 发送请求的时间
            long responseTime;// 获得响应的时间
            long totalTime;// 总计时间。

            startTime = System.nanoTime();// profiling...

            // 创建链接
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // set timeout
            conn.setConnectTimeout(connectionTimeout);
            conn.setReadTimeout(readTimeout);

            conn.setRequestMethod("POST");

            // set headers
            conn.addRequestProperty("Connection","Keep-Alive");//设置与服务器保持连接
            conn.addRequestProperty("Accept", "*/*");
            conn.addRequestProperty("Content-Type", "application/json");
            conn.addRequestProperty("Charset", CHARSET);

            conn.setDoOutput(true);

            conn.connect();

            connectTime = System.nanoTime();// profiling...

            // 发送数据
            byte[] data = content.getBytes(CHARSET);
            requestDataSize = data.length;// profiling...

            out = new DataOutputStream(conn.getOutputStream());
            out.write(data);
            out.flush();

            requestTime = System.nanoTime();// profiling...

            // 响应结果
            int statusCode = conn.getResponseCode();
            response.setHeader(conn.getHeaderFields());
            response.setStatus(statusCode);
            response.setCharset(CHARSET);

            responseDataSize = 0;// profiling...
            if (statusCode == 200) {
                // 获得输入结果
                is = conn.getInputStream();
                if (is != null) {
                    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = is.read(buffer)) != -1) {
                        outStream.write(buffer, 0, len);
                    }
                    response.setBody(outStream.toByteArray());
                    responseDataSize = response.getBody().length;// profiling...
                }
            }

            responseTime = System.nanoTime();// profiling...

            // 计算实际各项操作的时间片长度
            totalTime = responseTime - startTime;
            responseTime = responseTime - requestTime;
            requestTime = requestTime - connectTime;
            connectTime = connectTime - startTime;
            double s = 0.000001;
            log.info("POST, url={}, status:{}, requestSize:{}, responseSize:{}, connectTime:{}ms, requestTime:{}ms, responseTime:{}ms, totalTime:{}ms",
                url, statusCode, requestDataSize, responseDataSize, connectTime * s, requestTime * s, responseTime * s, totalTime * s);

            return response;
        } catch (MalformedURLException e) {
            log.error("postJson", e);
        } catch (UnsupportedEncodingException e) {
            log.error("postJson", e);
        } catch (IOException e) {
            log.error("postJson", e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    log.error("postJson", e);
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    log.error("postJson", e);
                }
            }
        }
        return response;
    }
}
