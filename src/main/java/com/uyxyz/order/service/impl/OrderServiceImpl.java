package com.uyxyz.order.service.impl;

import com.uyxyz.order.dataobj.OrderMaster;
import com.uyxyz.order.utils.OrderDTO;
import com.uyxyz.order.utils.OrderPayStatusEnum;
import com.uyxyz.order.utils.OrderStatusEnum;
import com.uyxyz.order.repository.OrderDetailRepository;
import com.uyxyz.order.repository.OrderMasterRepository;
import com.uyxyz.order.service.OrderService;
import com.uyxyz.order.utils.KeyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMasterRepository orderMasterRepository ;

    @Autowired
    OrderDetailRepository orderDetailRepository ;



    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        /**
         * 2.查询商品信息
         * 3.计算总价
         * 4.扣库存
         * 5.订单入库
         */
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtils.getOrderId());
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(25));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(OrderPayStatusEnum.WAIT.getCode());


        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
