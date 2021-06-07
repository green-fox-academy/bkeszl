package com.gfa.mysqlspring;

import com.gfa.mysqlspring.model.Todo;
import com.gfa.mysqlspring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlspringApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public MysqlspringApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlspringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
