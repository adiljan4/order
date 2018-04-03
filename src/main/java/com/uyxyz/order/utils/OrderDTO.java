package com.uyxyz.order.utils;

import com.uyxyz.order.dataobj.OrderDetail;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDTO {

    //订单号码
    private String orderId ;
    //买家姓名
    private String buyerName ;
    //买家电话
    private String buyerPhone ;
    //买家地址
    private String buyerAddress ;
    //买家Openid
    private String buyerOpenid ;
    //订单总金
    private BigDecimal orderAmount ;
    //订单状态
    private Integer orderStatus ;
    //支付状态
    private Integer payStatus ;

    //订单明细
    List<OrderDetail> orderDetailList ;

}
