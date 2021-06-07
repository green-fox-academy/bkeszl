package com.gfa.reddit.service;

import com.gfa.reddit.model.Post;
import java.util.Collection;

public interface PostService {
  public abstract void createPost(Post post);
  public abstract Iterable<Post> getPosts();
  void changeScore(long id, boolean isPositive);
}
