package com.uyxyz.order.controller;

import com.uyxyz.order.service.OrderService;
import com.uyxyz.order.utils.OrderDTO;
import com.uyxyz.order.utils.PageForm2JasonObj;
import com.uyxyz.order.utils.ResultEnum;
import com.uyxyz.order.exception.OrderException;
import com.uyxyz.order.pageform.OrderForm;
import com.uyxyz.order.vo.ResultVOUtils;
import com.uyxyz.order.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单业务逻辑处理
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService ;

    @PostMapping("/create")
    public ResultVo<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){

        //1.校验参数
        if(bindingResult.hasErrors()){
            log.error("【创建订单出错】 参数不正确！");
                throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        /**
         * 2.查询商品信息
         * 3.计算总价
         * 4.扣库存
         * 5.订单入库
         */
        OrderDTO orderDTO = PageForm2JasonObj.convertInfo(orderForm) ;
        //判断转换后明细是否是空
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单出错】 订单明细为空！");
            throw new OrderException(ResultEnum.ITEMS_ERROR);
        }

        OrderDTO result = orderService.create(orderDTO) ;

        Map<String,String> map = new HashMap<>();
        map.put("orderId",result.getOrderId());

        return  ResultVOUtils.success(map) ;
    }

}
