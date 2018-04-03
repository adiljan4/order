package com.uyxyz.order.repository;

import com.uyxyz.order.OrderApplicationTests;
import com.uyxyz.order.dataobj.OrderMaster;
import com.uyxyz.order.utils.OrderStatusEnum;
import com.uyxyz.order.utils.OrderPayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    OrderMasterRepository orderMasterRepository ;

    @Test
    public void saveOrder(){
        OrderMaster o = new OrderMaster();
        o.setOrderId("21");

        o.setBuyerAddress("北京");
        o.setBuyerName("李四");
        o.setBuyerOpenid("1234");
        o.setBuyerPhone("185444444");
        o.setOrderAmount(new BigDecimal(25));
        o.setOrderStatus(OrderStatusEnum.NEW.getCode());
        o.setPayStatus(OrderPayStatusEnum.WAIT.getCode());

        System.out.println(o.toString());
        OrderMaster result = orderMasterRepository.save(o);
        Assert.assertTrue(result != null);
    }

}