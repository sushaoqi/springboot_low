package com.juzss.controller;


import com.juzss.dao.UserDao;
import com.juzss.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class MapperController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userDao.queryUserList();
        return users;
    }
}
