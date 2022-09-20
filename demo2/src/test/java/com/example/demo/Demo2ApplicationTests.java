package com.example.demo;

import com.example.demo.entity.Comment;
import com.example.demo.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    private CommentMapper commentMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void findByIdTest() {
        System.out.println(commentMapper.findById(1));
    }

    @Test
    public void deleteByIdTest() {
        System.out.println(commentMapper.findById(1));
        commentMapper.deleteById(1);
        System.out.println(commentMapper.findById(1));
    }

    @Test
    public void addCommentTest() {
        Comment comment = new Comment(6,"test","test",1);
        commentMapper.addComment(comment);
        System.out.println(commentMapper.findById(6));
    }

    @Test
    public void updateCommentTest() {
        Comment comment = new Comment(6,"testtesttesttest","testtesttesttest",123456);
        commentMapper.updateComment(comment);
        System.out.println(commentMapper.findById(6));
    }


    @Test
    public void Test(){
        System.out.println(new Random().nextInt(49));
    }

}
