package com.juzss.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.juzss.SpringbootJpaApplication;
import com.juzss.entity.Student;
import com.juzss.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class redisTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    @Test
    public void test() throws JsonProcessingException {

        //从redis缓存中获得指定的数据
        String studentListData = redisTemplate.boundValueOps("student.findAll").get();
        //如果redis中没有数据的话
        if(null == studentListData){
            //查询数据库获得数据
            List<Student> all = studentRepository.findAll();
            //转换陈json格式字符串
            ObjectMapper om = new ObjectMapper();
            studentListData= om.writeValueAsString(all);
            //将数据存储到redis中,下这次在查询从redis中取得数据,不用在查询数据库
            redisTemplate.boundValueOps("student.findAll").set(studentListData);
            System.out.println("===============从数据库获得数据===============");
        }else{
            System.out.println("===============从redis中取得数据===============");
        }

        System.out.println(studentListData);
    }
}
