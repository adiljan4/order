package com.uyxyz.order.vo;

public class ResultVOUtils {

    public static ResultVo success(Object obj){

        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("成功！");
        resultVo.setData(obj);

        return resultVo ;
    }

}
