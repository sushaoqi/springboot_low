package com.juzss.jpa;

import com.juzss.SpringbootJpaApplication;
import com.juzss.entity.Student;
import com.juzss.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void test(){
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }
}
