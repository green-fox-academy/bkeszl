package com.gfa.reddit.controller;

import com.gfa.reddit.model.Post;
import com.gfa.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {
  private PostService postService;

  @Autowired
  public RedditController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String renderMainPage(Model model) {
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String renderSubmit(Model model){
    return "submit";
  }

  @PostMapping("/submit")
  public String addPost(@ModelAttribute Post post){
    postService.createPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/{isPositive}")
  public String upVotePost(@PathVariable long id, @PathVariable boolean isPositive){
    postService.changeScore(id, isPositive);
    return "redirect:/";
  }
}
