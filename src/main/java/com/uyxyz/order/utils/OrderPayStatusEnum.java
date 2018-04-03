package com.uyxyz.order.utils;

import lombok.Getter;

@Getter
public enum OrderPayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private Integer code ;
    private String name ;

    OrderPayStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }


}
