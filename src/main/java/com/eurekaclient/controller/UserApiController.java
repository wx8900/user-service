package com.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jack
 *
 */
@RestController
public class UserApiController {

    private static DateTimeFormatter pattern = DateTimeFormatter.ofPattern("G yyyy年MM月dd号 E a hh时mm分ss秒");

    @Value("${server.port}")
    private String serverPort;


    @RequestMapping( value = "/test", method = RequestMethod.GET )
    public String test( @RequestParam String param ){
        return "test " + param  +  ", Port is : " +  serverPort;
    }

    @RequestMapping( value = "/hello", method = RequestMethod.GET )
    public String hello( @RequestParam String param ){
        return "hello " + param  +  ", port is : " + serverPort;
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET )
    public String getUser( @RequestParam String name ) {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(pattern);
        return name + "，您好，您是VIP用户，享受VIP专属服务！你的端口号是 ： "
                + serverPort +", 当前日期是 " + format;
    }

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET )
    public String getUser( @RequestParam String name , @RequestParam Integer age) {
        return name + "，您好，您的年龄是 ： " + age;
    }
}
