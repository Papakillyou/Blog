package com.Puraya.Blog.service;

import com.Puraya.Blog.pojo.Blog;

import java.util.ArrayList;

/**
 * @author 彭路尧
 * @version 1.0
 * @Date Created in 16:08 2019/6/19
 * @Description
 */
public interface BlogService {
    ArrayList<Blog> getAllBlog();
    boolean addBlog(Blog b);
    boolean deleteBlog(Integer id);
    boolean updateBlog(Blog b);
    Blog getContent(Integer id);
}
