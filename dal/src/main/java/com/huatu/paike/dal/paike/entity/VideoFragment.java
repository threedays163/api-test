package com.huatu.paike.dal.paike.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "video_fragment")
public class VideoFragment {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 直播房间ID
     */
    @Column(name = "CLOUD_ROOM_ID")
    private String cloudRoomId;

    /**
     * 模板ID
     */
    @Column(name = "RELATE_TEMPLATE_ID")
    private Long relateTemplateId;

    /**
     * 课节时间
     */
    @Column(name = "DATE")
    private Date date;

    /**
     * 回放的session_id
     */
    @Column(name = "SESSION_ID")
    private Long sessionId;

    /**
     * 回放视频ID
     */
    @Column(name = "VIDEO_ID")
    private Long videoId;

    /**
     * 回放状态（30:转码失败 100:转码成功）
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 转码成功url
     */
    @Column(name = "URL")
    private String url;

    /**
     * 视频大小，单位是字节
     */
    @Column(name = "TOTAL_SIZE")
    private Long totalSize;

    /**
     * 转码成功的总视频大小：源文件加上所有转码后文件，单位：字节
     */
    @Column(name = "TOTAL_TRANSCODE_SIZE")
    private Long totalTranscodeSize;

    /**
     * 转码成功的视频时长，单位为秒
     */
    @Column(name = "LENGTH")
    private Long length;

    /**
     * 视频文件md5值
     */
    @Column(name = "FILE_MD5")
    private String fileMd5;

    /**
     * 当前已转出的清晰度，多种清晰度以英文逗号分隔 
     */
    @Column(name = "NOW_DEFINITION")
    private String nowDefinition;

    /**
     * 原始视频清晰度
     */
    @Column(name = "ORIGIN_DEFINITION")
    private String originDefinition;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 封面地址
     */
    @Column(name = "PREFACE_URL")
    private String prefaceUrl;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取直播房间ID
     *
     * @return CLOUD_ROOM_ID - 直播房间ID
     */
    public String getCloudRoomId() {
        return cloudRoomId;
    }

    /**
     * 设置直播房间ID
     *
     * @param cloudRoomId 直播房间ID
     */
    public void setCloudRoomId(String cloudRoomId) {
        this.cloudRoomId = cloudRoomId;
    }

    /**
     * 获取模板ID
     *
     * @return RELATE_TEMPLATE_ID - 模板ID
     */
    public Long getRelateTemplateId() {
        return relateTemplateId;
    }

    /**
     * 设置模板ID
     *
     * @param relateTemplateId 模板ID
     */
    public void setRelateTemplateId(Long relateTemplateId) {
        this.relateTemplateId = relateTemplateId;
    }

    /**
     * 获取课节时间
     *
     * @return DATE - 课节时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置课节时间
     *
     * @param date 课节时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取回放的session_id
     *
     * @return SESSION_ID - 回放的session_id
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * 设置回放的session_id
     *
     * @param sessionId 回放的session_id
     */
    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 获取回放视频ID
     *
     * @return VIDEO_ID - 回放视频ID
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * 设置回放视频ID
     *
     * @param videoId 回放视频ID
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    /**
     * 获取回放状态（30:转码失败 100:转码成功）
     *
     * @return STATUS - 回放状态（30:转码失败 100:转码成功）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置回放状态（30:转码失败 100:转码成功）
     *
     * @param status 回放状态（30:转码失败 100:转码成功）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取转码成功url
     *
     * @return URL - 转码成功url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置转码成功url
     *
     * @param url 转码成功url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取视频大小，单位是字节
     *
     * @return TOTAL_SIZE - 视频大小，单位是字节
     */
    public Long getTotalSize() {
        return totalSize;
    }

    /**
     * 设置视频大小，单位是字节
     *
     * @param totalSize 视频大小，单位是字节
     */
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * 获取转码成功的总视频大小：源文件加上所有转码后文件，单位：字节
     *
     * @return TOTAL_TRANSCODE_SIZE - 转码成功的总视频大小：源文件加上所有转码后文件，单位：字节
     */
    public Long getTotalTranscodeSize() {
        return totalTranscodeSize;
    }

    /**
     * 设置转码成功的总视频大小：源文件加上所有转码后文件，单位：字节
     *
     * @param totalTranscodeSize 转码成功的总视频大小：源文件加上所有转码后文件，单位：字节
     */
    public void setTotalTranscodeSize(Long totalTranscodeSize) {
        this.totalTranscodeSize = totalTranscodeSize;
    }

    /**
     * 获取转码成功的视频时长，单位为秒
     *
     * @return LENGTH - 转码成功的视频时长，单位为秒
     */
    public Long getLength() {
        return length;
    }

    /**
     * 设置转码成功的视频时长，单位为秒
     *
     * @param length 转码成功的视频时长，单位为秒
     */
    public void setLength(Long length) {
        this.length = length;
    }

    /**
     * 获取视频文件md5值
     *
     * @return FILE_MD5 - 视频文件md5值
     */
    public String getFileMd5() {
        return fileMd5;
    }

    /**
     * 设置视频文件md5值
     *
     * @param fileMd5 视频文件md5值
     */
    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    /**
     * 获取当前已转出的清晰度，多种清晰度以英文逗号分隔 
     *
     * @return NOW_DEFINITION - 当前已转出的清晰度，多种清晰度以英文逗号分隔 
     */
    public String getNowDefinition() {
        return nowDefinition;
    }

    /**
     * 设置当前已转出的清晰度，多种清晰度以英文逗号分隔 
     *
     * @param nowDefinition 当前已转出的清晰度，多种清晰度以英文逗号分隔 
     */
    public void setNowDefinition(String nowDefinition) {
        this.nowDefinition = nowDefinition;
    }

    /**
     * 获取原始视频清晰度
     *
     * @return ORIGIN_DEFINITION - 原始视频清晰度
     */
    public String getOriginDefinition() {
        return originDefinition;
    }

    /**
     * 设置原始视频清晰度
     *
     * @param originDefinition 原始视频清晰度
     */
    public void setOriginDefinition(String originDefinition) {
        this.originDefinition = originDefinition;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取封面地址
     *
     * @return PREFACE_URL - 封面地址
     */
    public String getPrefaceUrl() {
        return prefaceUrl;
    }

    /**
     * 设置封面地址
     *
     * @param prefaceUrl 封面地址
     */
    public void setPrefaceUrl(String prefaceUrl) {
        this.prefaceUrl = prefaceUrl;
    }
}