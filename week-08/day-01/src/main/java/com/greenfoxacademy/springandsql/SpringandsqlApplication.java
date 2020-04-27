package com.greenfoxacademy.springandsql;

import com.greenfoxacademy.springandsql.model.Todo;
import com.greenfoxacademy.springandsql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringandsqlApplication implements CommandLineRunner {
  private TodoRepository todoRepository;

  @Autowired
  public SpringandsqlApplication(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringandsqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Stuff and all"));
    todoRepository.save(new Todo("Biff and hopp"));
    todoRepository.save(new Todo("Corner the aliens"));
  }
}
