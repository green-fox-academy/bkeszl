package com.greenfoxacademy.springandsql.controller;

import com.greenfoxacademy.springandsql.model.Todo;
import com.greenfoxacademy.springandsql.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value ={ "/", "/list"}, method = RequestMethod.GET)
  public String list(Model model) {
    Iterable<Todo> todos = new ArrayList<>();
    todos = todoRepository.findAll();
    model.addAttribute("todos", todos);
    return "todoList";
  }
}
