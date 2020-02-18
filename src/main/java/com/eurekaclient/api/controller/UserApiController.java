package com.eurekaclient.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 */
@RestController
public class UserApiController {

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

    @RequestMapping()
    public String getUser() {
        return " 你是VIP用户，享受VIP专属服务！你的端口号是 ： " + serverPort;
    }
}
