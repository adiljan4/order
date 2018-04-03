package com.uyxyz.order.pageform;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {

    //用户名
    @NotEmpty(message ="用户名不能为空！")
    private String buyer_name ;

    //手机号
    @NotEmpty(message ="手机号不能为空！")
    private String phone ;

    //地址
    @NotEmpty(message ="地址不能为空！")
    private String addr ;

    //openID
    @NotEmpty(message ="OpenId不能为空！")
    private String openid ;

    //订单明细
    @NotEmpty(message ="购物车不能为空！")
    private String items ;

}
