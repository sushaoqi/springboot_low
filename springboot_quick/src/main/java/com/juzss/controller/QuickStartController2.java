package com.juzss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController2 {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private  Integer age;

    @Value("${person.address}")
    private  String address;


    @RequestMapping("/quick2")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功! name="+name+",age="+age;
    }
}
