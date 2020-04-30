package com.gfa.reddit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  int score;
  String url;
  String title;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;

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

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }
}
