package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listOfBlogPosts = new ArrayList<>();

  public void add(BlogPost blogPost) {
    listOfBlogPosts.add(blogPost);
  }

  public void delete(int index) {
    listOfBlogPosts.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    listOfBlogPosts.set(index, blogPost);
  }
}
