package com.gfa.reddit.service;

import com.gfa.reddit.model.Post;
import java.util.Collection;

public interface PostService {
  public abstract void createPost(Post post);
  public abstract void upVotePost(long id);
  public abstract void downVotePost(long id);
  public abstract Iterable<Post> getPosts();
  void changeScore(long id, boolean isPositive);
}
