package com.hefeifei.service;

import com.hefeifei.entity.WeiXiu;
import com.hefeifei.mapper.JPAMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceImplTest {
    @Autowired
    private ServiceImpl service;

    @Test
    public void test1() {
        List<WeiXiu> all = service.test();
        all.forEach(a->{
            System.out.println(a);
        });
    }
}