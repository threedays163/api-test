
package com.huatu.paike.api_test.utils;

public class Conf {

    public static final String LOGIN_KEY = "PAIKE_LOGIN_KEY_%s_%s";

    public static final long FRONT_SESSION_TIMEOUT = 60l * 30;// 半个小时
    // AES算法需要的KEY
    public static final String FRONT_AES_KEY = "QAQWSXCDERFVBGTY";

    public static final String WORKFLOW_SEPEROTOR = "::";// 工作流分隔符

    public static final String PROCESS_MODULE = "paike";// 工作流模块名

    public static final int order_stage_filter_task = 1;// 订单阶段结课筛选任务

    public static final int order_clear_task = 2;// 订单阶段结课任务

    public static final int reward_task = 3;// 老师课酬结算任务

    public static final int MAX_CLASS_NAME_LENGTH = 20;// 班级名称最大长度

}
