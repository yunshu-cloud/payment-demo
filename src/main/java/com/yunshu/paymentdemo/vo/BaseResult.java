package com.yunshu.paymentdemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult<T> {


    private Integer code;

    private String message;

    private T data;


    public static <T> BaseResult<T> ok(){
        return new BaseResult<>(CodeEnum.SUCCESS.getCode(),CodeEnum.SUCCESS.getMessage(), null);
    }

    public static <T> BaseResult<T> ok(T data){
        return new BaseResult<>(CodeEnum.SUCCESS.getCode(),CodeEnum.SUCCESS.getMessage(), data);
    }

}
