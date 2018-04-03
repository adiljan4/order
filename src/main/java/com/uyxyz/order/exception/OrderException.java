package com.uyxyz.order.exception;

import com.uyxyz.order.utils.ResultEnum;
import sun.plugin2.message.Message;

import javax.xml.transform.Result;

public class OrderException extends RuntimeException {

    private Integer code = 0 ;

    public OrderException(Integer code,String message){
        super(message);
        this.code = code ;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
