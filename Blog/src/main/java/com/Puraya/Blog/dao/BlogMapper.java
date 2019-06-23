package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Blog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository("blogMapper")
public interface BlogMapper {
    Integer insert(Blog record);
    Integer insertSelective(Blog record);

    ArrayList<Blog> getAllBlog();
    boolean addBlog(Blog b);
    boolean deleteBlog(Integer id);
    boolean updateBlog(Blog b);
    Blog getContent(Integer id);
}