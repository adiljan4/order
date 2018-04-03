package com.uyxyz.order.repository;

import com.uyxyz.order.OrderApplicationTests;
import com.uyxyz.order.dataobj.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests{

    @Autowired
    private OrderDetailRepository orderDetailRepository ;

    @Test
    public void save(){

        OrderDetail o = new OrderDetail();
        o.setDetailId("11");
        o.setOrderId("21");
        o.setProductIcon("http://polo.jpg");
        o.setProductId("20180403100000");
        o.setProductName("抓饭");
        o.setProductPrice(new BigDecimal(25));
        o.setProductQuantity(1);

       OrderDetail result =  orderDetailRepository.save(o);
        Assert.assertTrue(result != null);

    }

}