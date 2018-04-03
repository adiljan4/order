package com.uyxyz.order.utils;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINSHED(1,"完成"),
    CANCEL(2,"取消");

    private Integer code ;
    private String name ;


    OrderStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }




}
