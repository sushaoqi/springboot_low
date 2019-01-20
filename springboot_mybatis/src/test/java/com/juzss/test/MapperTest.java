package com.juzss.test;

import com.juzss.SpringbootMybatisApplication;
import com.juzss.dao.UserDao;
import com.juzss.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MapperTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        List<User> users = userDao.queryUserList();
        System.out.println(users);
    }
}
