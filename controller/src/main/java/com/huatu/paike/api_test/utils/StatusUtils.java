
package com.huatu.paike.api_test.utils;

import com.huatu.common.enums.EnumService;
import com.huatu.paike.api_test.service.ClassStatus;
import com.huatu.paike.api_test.service.CsstStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StatusUtils {

    /**
     * 获取(班级,课节等时间段的)当前状态
     * 
     * @param status
     * @param startTime
     * @param endTime
     * @return
     */
    public static Integer getRealStatus(Integer status, Date startTime, Date endTime) {
        if (status == null) {
            return null;
        }
        Date now = new Date();
        if (status > ClassStatus.WAIT_FEEDBACK.getValue()) {
            return status;
        } else if (startTime == null || endTime == null || status == ClassStatus.WAIT_ASSIGN.getValue()) {
            return ClassStatus.WAIT_ASSIGN.getValue();
        } else if (endTime.before(now) || status == CsstStatus.WAIT_FEEDBACK.getValue()) {
            return ClassStatus.WAIT_FEEDBACK.getValue();
        } else if ((startTime.before(now) && endTime.after(now)) || status == ClassStatus.IN_CLASS.getValue()) {
            return ClassStatus.IN_CLASS.getValue();
        } else if (startTime.after(now) || status == ClassStatus.WAIT_CLASS_START.getValue()) {
            return ClassStatus.WAIT_CLASS_START.getValue();
        } else {
            return ClassStatus.WAIT_START.getValue();
        }
    }

    public static EnumService getRealStatusEnumService(Integer status, Date startTime, Date endTime) {
        if (status == null) {
            return null;
        }
        Date now = new Date();
        if (status > ClassStatus.WAIT_FEEDBACK.getValue()) {
            return ClassStatus.get(status);
        } else if (startTime == null || endTime == null || status == ClassStatus.WAIT_ASSIGN.getValue()) {
            return ClassStatus.WAIT_ASSIGN;
        } else if (endTime.before(now) || status == CsstStatus.WAIT_FEEDBACK.getValue()) {
            return ClassStatus.WAIT_FEEDBACK;
        } else if ((startTime.before(now) && endTime.after(now)) || status == ClassStatus.IN_CLASS.getValue()) {
            return ClassStatus.IN_CLASS;
        } else if (startTime.after(now) || status == ClassStatus.WAIT_CLASS_START.getValue()) {
            return ClassStatus.WAIT_CLASS_START;
        } else {
            return ClassStatus.WAIT_START;
        }
    }

    public static Integer getRealStatusBySubStatus(List<Integer> statusList) {
        if (statusList.contains(ClassStatus.IN_CLASS.getValue())) {
            return ClassStatus.IN_CLASS.getValue();
        } else {
            // 是否有大于上课中的状态
            boolean gtInclass = false;
            // 是否有小于上课中的状态
            boolean ltInclass = false;
            // 存最大的状态
            Integer maxStatus = ClassStatus.WAIT_START.getValue();
            // 存最小的状态
            Integer minStatus = ClassStatus.DELETED.getValue();
            for (Integer status : statusList) {
                if (status > ClassStatus.IN_CLASS.getValue()) {
                    gtInclass = true;
                } else if (status < ClassStatus.IN_CLASS.getValue()) {
                    ltInclass = true;
                }
                if (maxStatus < status) {
                    maxStatus = status;
                }
                if (minStatus > status) {
                    minStatus = status;
                }
            }

            Integer status = 0;
            if (gtInclass && ltInclass) {
                status = ClassStatus.IN_CLASS.getValue();
            } else if (gtInclass) {
                status = minStatus;
            } else {
                status = maxStatus;
            }
            if (ClassStatus.IN_FEEDBACK.getValue() == status.intValue()) {
                status = ClassStatus.WAIT_FEEDBACK.getValue();
            }
            return status;
        }
    }

    /**
     * 根据时长和排课起始和结束时间判断当前状态(oss使用)
     * 
     * @param startTime
     * @param endTime
     * @param totalDuration 总时长
     * @param finishedDuration 结课时长
     * @param arrangeDuration 排课时长
     * @return
     */
    public static Integer getStatusByDurationAndTime(Date startTime, Date endTime, int totalDuration,
        int finishedDuration, int arrangeDuration) {
        Integer status = null;
        if (totalDuration <= 0) {
            return -1;
        }
        if (totalDuration == finishedDuration) {
            status = ClassStatus.WAIT_FEEDBACK.getValue();
        } else if (finishedDuration > 0 && finishedDuration < totalDuration) {
            status = ClassStatus.IN_CLASS.getValue();
        } else if (arrangeDuration > 0 && finishedDuration == 0) {
            status = ClassStatus.WAIT_CLASS_START.getValue();
        } else {
            status = ClassStatus.WAIT_ASSIGN.getValue();
        }

        Integer newStatus = 0;
        //当状态小于上课中时，需要进一步根据时间判断
        if(status<ClassStatus.WAIT_CLASS_START.getValue()){
            newStatus=getRealStatus(status, startTime, endTime);
        }
        return newStatus > status ? newStatus : status;
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            int status=getStatusByDurationAndTime(format.parse("2019-04-29 09:00:00"),format.parse("2019-04-29 14:00:00") , 1350,120 ,0 );
            System.out.println(status);
        }catch (Exception  e){

        }

    }
}
