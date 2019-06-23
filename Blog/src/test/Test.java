import com.Puraya.Blog.pojo.Blog;
import com.Puraya.Blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * @author 彭路尧
 * @version 1.0
 * @Date Created in 19:47 2019/6/23
 * @Description
 */
public class Test extends BaseTest{
    @Autowired
    private BlogService blogService;

    @org.junit.Test
    public void test(){
        ArrayList<Blog> blogs = blogService.getAllBlog();
        for(Blog b : blogs)
        {
            System.out.println(blogs.get(0).getBlogId());
            System.out.println(blogs.get(0).getContent());
            System.out.println(b.getTitle());
        }
    }
}
