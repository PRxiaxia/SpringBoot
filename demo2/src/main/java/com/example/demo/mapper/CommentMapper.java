package com.example.demo.mapper;

import com.example.demo.entity.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id=#{id}")
    public Comment findById(Integer id);

    @Delete("delete from t_comment where id=#{id}")
    public Integer deleteById(Integer id);

    @Insert("insert into t_comment(id,content,author,a_id) values(#{id},#{content},#{author},#{a_Id})")
    public Integer addComment(Comment comment);

    @Update("update t_comment set content=#{content},author=#{author},a_id=#{a_Id} where id=#{id}")
    public Integer updateComment(Comment comment);
}
