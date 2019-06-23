package com.Puraya.Blog.controller;

import com.Puraya.Blog.pojo.Blog;
import com.Puraya.Blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author 彭路尧
 * @version 1.0
 * @Date Created in 14:51 2019/6/20
 * @Description
 */

@Controller
public class BlogController {
    private static boolean isLogined = false;
    private BlogService blogService = null;

    @Resource(name = "blogService")
    public void setBlogService(BlogService blogService) {
        this.blogService = blogService;
    }

    //进入博客网站首页
    @RequestMapping("/blog")
    public ModelAndView getModelAndView() {
        ModelAndView mv = null;
        System.out.println("Model");
        try {

            mv = new ModelAndView("index");

            ArrayList<Blog> blogs = blogService.getAllBlog();
            for(Blog b : blogs)
            {
                System.out.println(blogs.get(0).getBlogId());
                System.out.println(blogs.get(0).getContent());
                System.out.println(b.getTitle());
            }
            mv.addObject("data",blogs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    //进入管理员登录界面
    @RequestMapping("/login")
    public String addBlog(String blog_user,String blog_password) {
        System.out.println("enter addNews...");
        if("Puraya".equals(blog_user)&&"123456".equals(blog_password)) {
            isLogined = true;
            return "addBlog";
        }
        else {
            return "login";
        }
    }

    //进入发布博客界面
    @RequestMapping(value="/add")
    public String returnAddBlog() {
        if(isLogined) {
            return "addBlog";
        }
        else {
            return "login";
        }
    }

    //进入修改博客界面
    @RequestMapping("/update")
    public String updateBlog() {
        if(isLogined) {
            return "updateBlog";
        }
        else {
            return "login";
        }
    }

    //进入删除博客界面
    @RequestMapping("/delete")
    public String deleteBlog() {
        if(isLogined) {
            return "deleteBlog";
        }
        else {
            return "login";
        }
    }

    //点击退出登录按钮后，将登录状态置为假
    @RequestMapping("/exit")
    public String exitLogin() {
        isLogined = false;
        return "login";
    }

    //向数据库添加记录
    @RequestMapping("/add1")
    public String addData(Blog b) {
        boolean isDone = false;
        isDone = blogService.addBlog(b);
        if(isDone) {
            return "done";
        }
        else {
            return "failed";
        }
    }

    //根据博客id删除数据库中的某个记录
    @RequestMapping("/delete1")
    public String deleteData(Integer id) {
        boolean isDone = false;
        isDone = blogService.deleteBlog(id);
        if(isDone) {
            return "done";
        }
        else {
            return "failed";
        }
    }

    //根据博客id更新数据库中的记录
    @RequestMapping("/update1")
    public String updateData(Blog b) {
        boolean isDone = false;
        isDone = blogService.updateBlog(b);
        if(isDone) {
            return "done";
        }
        else {
            return "failed";
        }
    }

    //点击某个博客的链接后根据id获得该条博客的内容等
    @RequestMapping("/read")
    public ModelAndView getContent(Integer id) {
        ModelAndView mv = null;

        try {
            mv = new ModelAndView("content");
            Blog blog = blogService.getContent(id);
            mv.addObject("data",blog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
}
