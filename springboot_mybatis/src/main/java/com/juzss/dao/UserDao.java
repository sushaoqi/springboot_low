package com.juzss.dao;

import com.juzss.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserDao {

    public List<User> queryUserList();
}
