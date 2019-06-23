package com.Puraya.Blog.service;

import com.Puraya.Blog.dao.BlogMapper;
import com.Puraya.Blog.pojo.Blog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author 彭路尧
 * @version 1.0
 * @Date Created in 16:08 2019/6/19
 * @Description
 */
@Service("blogService")
public class BlogServiceclass implements BlogService{
    private BlogMapper blogMapper = null;

    @Resource(name="blogMapper")
    public void setBlogMapper(BlogMapper blogMapper){
        this.blogMapper=blogMapper;
    }
    public ArrayList<Blog> getAllBlog() {
        return blogMapper.getAllBlog();
    }

    public boolean addBlog(Blog b) {
        return blogMapper.addBlog(b);
    }

    public boolean deleteBlog(Integer id) {
        return blogMapper.deleteBlog(id);
    }

    public boolean updateBlog(Blog b) {
        return blogMapper.updateBlog(b);
    }

    public Blog getContent(Integer id) {
        return blogMapper.getContent(id);
    }
}
