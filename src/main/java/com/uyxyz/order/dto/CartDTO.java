package com.uyxyz.product.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class CartDTO {

    private String productId ;

    private Integer productQuantity ;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
