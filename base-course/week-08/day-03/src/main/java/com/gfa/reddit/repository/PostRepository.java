package com.gfa.reddit.repository;

import com.gfa.reddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  @Query(value = "SELECT * FROM post ORDER BY score DESC", nativeQuery = true)
  Iterable<Post> getAllInOrOrderByScore();
}
