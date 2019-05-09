package com.huatu.paike.api_test.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultFieldDto implements Serializable {
    private static final long serialVersionUID = -3644973084887233746L;

    private String desc;

    private int type;

    private Object value;

    private int percent = 1; // 百分比

    public static enum FieldType {

        STRING(1), // 字符串

        NUMBER(2), // 普通数字

        MONEY(3), // 钱

        DECIMAL(4),// 系数

        ;
        private int type;

        private FieldType(int type) {
            this.type = type;
        }

        public int getType() {
            return this.type;
        }
    }
}
