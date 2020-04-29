package com.gfa.reddit;

import com.gfa.reddit.model.Post;
import com.gfa.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  PostService postService;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Autowired
  public RedditApplication(PostService postService) {
    this.postService = postService;
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
