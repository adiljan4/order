package com.uyxyz.order.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.uyxyz.order.dataobj.OrderDetail;
import com.uyxyz.order.exception.OrderException;
import com.uyxyz.order.pageform.OrderForm;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;
@Slf4j
public class PageForm2JasonObj {

    public static OrderDTO convertInfo(OrderForm orderForm){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getBuyer_name());
        orderDTO.setBuyerAddress(orderForm.getAddr());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        //用Gson 把字符串转成OrderDetail 的对象的集合类型
        List<OrderDetail> orderDetailList = new ArrayList<>();
        Gson gson = new Gson();
        //Gson 字符串转换
        try{
            orderDetailList = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType()) ;
        }catch (Exception e){
            log.error("convertInfo{} 转换items 出错了！",orderForm.getItems());
            throw new OrderException(ResultEnum.CONVERT_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO ;
    }

}
