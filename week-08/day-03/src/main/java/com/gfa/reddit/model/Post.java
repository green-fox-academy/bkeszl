package com.gfa.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  int score;
  String url;
  String title;

  public Post() {  }

  public Post(int score, String url, String title) {
    this.url = url;
    this.title = title;
    this.score = score;
  }

  public Post(String url, String title) {
    this.url = url;
    this.title = title;
    this.score = 0;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
