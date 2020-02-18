package com.eurekaclient.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //@Autowired
    //private UserService userService;

    /*@GetMapping("/list")
    @ResponseBody
    public List<User> list(){
        List<User> list = userService.list();
        return list;
    }*/

    @GetMapping("/getById/{id}")
    @ResponseBody
    public String getById(@PathVariable Integer id){
        /*User user = userService.getById(id);
        return user;*/
        return "12345 67890 add : " + id;
    }
}
