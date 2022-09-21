package com.example.demo;

import com.example.demo.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Random;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void contextLoads() {

        System.out.println(articleMapper.selectArticle(2));
    }
    @Test
    public void Test(){
        System.out.println(new Random().nextInt(48));
    }
}
