package com.gfa.mysqlspring.controller;

import com.gfa.mysqlspring.model.Todo;
import com.gfa.mysqlspring.repository.TodoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value ={ "/", "/list"}, method = RequestMethod.GET)
  public String list(@RequestParam String isActive, Model model) {
    Iterable<Todo> todos = new ArrayList<>();
    boolean isActiveBoolean = Boolean.parseBoolean(isActive);
    model.addAttribute("isActive", isActiveBoolean);
    todos = todoRepository.findAll();
    model.addAttribute("todos", todos);
    return "todoList";
  }

  @GetMapping("/add")
  public String todoInput(Model model){
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String todoAddition(@ModelAttribute Todo todo, RedirectAttributes redirectAttributes){
    redirectAttributes.addAttribute("isActive", "true");
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
    redirectAttributes.addAttribute("isActive", "true");
    Todo todelete = todoRepository.findById(id).get();
    todoRepository.delete(todelete);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String todoEdit(Model model, @PathVariable("id") long id){
    Todo toedit = todoRepository.findById(id).get();
    model.addAttribute("todo", toedit);
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String todoEditSubmit(@PathVariable("id") long id, RedirectAttributes redirectAttributes,
                               @RequestParam(required = false) String done,
                               @RequestParam(required = false) String urgent,
                               @RequestParam String title){
    redirectAttributes.addAttribute("isActive", "true");
    Todo toedit = todoRepository.findById(id).get();
    toedit.setTitle(title);
    if (done != null){
      toedit.setDone(true);
    }
    if (urgent != null){
      toedit.setUrgent(true);
    }
    todoRepository.save(toedit);
    return "redirect:/todo/";
  }
}
