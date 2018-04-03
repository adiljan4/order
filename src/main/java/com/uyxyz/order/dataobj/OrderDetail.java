package com.uyxyz.order.dataobj;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId        ;
    //订单ID
    private String orderId         ;
    //商品ID
    private String productId       ;
    //商品名称
    private String productName     ;
    //商品价格
    private BigDecimal productPrice    ;
    //商品数量
    private Integer productQuantity ;
    //商品图片
    private String productIcon     ;
    //创建时间
    @DateTimeFormat
    private String createTime      ;
    //更新时间
    @DateTimeFormat
    private String updateTime      ;

}
