package com.uyxyz.product.dataobj;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
public class ProductInfo {
    //商品ID
    @Id
    private String productId  ;
    //商品名
    private String productName;
    //单价
    private BigDecimal productPrice   ;
    //库存
    private Integer productStock   ;
    //描述
    private String productDescription ;
    //图标
    private String productIcon;
    //状态 0正常 1 下架
    private Integer productStatus  ;
    //类目编号
    private Integer categoryType   ;
    //创建时间
    private Date createTime ;
    //更新时间
    private Date updateTime ;

}
