package com.example.demo.entity;

public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer a_Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getA_Id() {
        return a_Id;
    }

    public void setA_Id(Integer a_Id) {
        this.a_Id = a_Id;
    }

    public Comment(Integer id, String content, String author, Integer a_Id) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.a_Id = a_Id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", a_Id=" + a_Id +
                '}';
    }
}
