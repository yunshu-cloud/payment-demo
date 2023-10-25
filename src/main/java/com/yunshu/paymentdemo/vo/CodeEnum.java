package com.yunshu.paymentdemo.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CodeEnum {
    // 成功
    SUCCESS(200,"success"),

    // 系统异常
    SYSTEM_ERROR(500,"系统异常"),

    //
    PAYMENT_ERROR(600,"支付异常");

    // 状态码
    private final Integer code;

    // 响应信息
    private final String message;


}
