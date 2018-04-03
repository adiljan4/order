package com.uyxyz.order.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class KeyUtils {

    /**
     * 生成订单号
     * @return
     */
    public static synchronized String getOrderId(){
        String keyNo = null ;
        int integer = (int) (Math.random()*(10-1+1));

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        keyNo = "OId" + sdf.format(date).toString()+ String.valueOf(integer) ;

        return  keyNo.toString();
    }

    public static void main(String[] args) {
        KeyUtils keyUtils = new KeyUtils();
        System.out.println(getOrderId());
    }


}
