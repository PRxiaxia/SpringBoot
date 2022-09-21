package com.example.demo.entity;

import lombok.Data;

@Data
public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer a_Id;
}
