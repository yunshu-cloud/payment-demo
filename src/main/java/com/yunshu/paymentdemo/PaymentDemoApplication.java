package com.yunshu.paymentdemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.yunshu.paymentdemo.mapper")
public class PaymentDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentDemoApplication.class, args);
        log.info("***** 支付系统启动成功 *****");
    }
}
