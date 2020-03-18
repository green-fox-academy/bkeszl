package blog;

public class Main {
  public static void main(String[] args) {
    BlogPost lorem = new BlogPost("John Doe",
        "Lorem Ipsum",
        "Lorem ipsum dolor sit amet.",
        "2010.10.10.");
    BlogPost why = new BlogPost("Tim Urban",
        "Wait but why",
        "A popular long-form, stick-figure-illustrated blog about almost everything.",
        "2000.05.04.");
    BlogPost engi = new BlogPost("William Turton",
        "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
        "2017.03.28.");

    Blog blog = new Blog();
    blog.add(lorem);
    blog.add(why);
    blog.add(engi);

    blog.delete(1);
    blog.update(0, why);

    System.out.println(blog.listOfBlogPosts.get(0).title);
    System.out.println(blog.listOfBlogPosts.get(1).title);

  }
}
