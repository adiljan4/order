package com.uyxyz.order.utils;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(01,"参数不正确！"),
    CONVERT_ERROR(02,"转换出错！"),
    ITEMS_ERROR(03,"购物车空！")
    ;

    private Integer code ;

    private String message ;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
