package com.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateServiceController {

    @RequestMapping( value = "/test", method = RequestMethod.GET )
    public String test( @RequestParam String param ){
        return "test " + param;
    }

    @RequestMapping( value = "/hello", method = RequestMethod.GET )
    public String hello( @RequestParam String param ){
        return "hello " + param;
    }
}
