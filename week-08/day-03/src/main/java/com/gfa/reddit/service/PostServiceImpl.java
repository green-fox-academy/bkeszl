package com.gfa.reddit.service;

import com.gfa.reddit.model.Post;
import com.gfa.reddit.repository.PostRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public void createPost(Post post) {

    postRepository.save(post);
  }

  @Override
  public void upVotePost(long id) {
    Post toUpVote = postRepository.findById(id).get();
    toUpVote.setScore(toUpVote.getScore()+1);
    postRepository.save(toUpVote);
  }

  @Override
  public void downVotePost(long id) {
    postRepository.findById(id).get().setScore(postRepository.findById(id).get().getScore()-1);
  }

  @Override
  public Iterable<Post> getPosts() {
    return postRepository.getAllInOrOrderByScore();
  }

  @Override
  public void changeScore(long id, boolean isPositive) {
    Post toChangeScore = postRepository.findById(id).get();
    if (isPositive) {
      toChangeScore.setScore(toChangeScore.getScore() + 1);
    } else {
      toChangeScore.setScore(toChangeScore.getScore() - 1);
    }
    postRepository.save(toChangeScore);
  }

}
