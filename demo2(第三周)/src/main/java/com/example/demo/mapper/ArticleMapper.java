package com.example.demo.mapper;

import com.example.demo.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    public Article findArticleByid(Integer id);
    public Article selectArticle(Integer id);


}

