package com.juzss.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStartStarter2 {

    @RequestMapping("/quick2")
    public String quick(){
        return "hello springboot2";
    }
}
