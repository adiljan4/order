package com.uyxyz.order.dataobj;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class OrderMaster {

    //订单号码
    @Id
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
    //创建时间
    @DateTimeFormat
    private Date createTime ;
    //更新时间
    @DateTimeFormat
    private Date updateTime ;

}
