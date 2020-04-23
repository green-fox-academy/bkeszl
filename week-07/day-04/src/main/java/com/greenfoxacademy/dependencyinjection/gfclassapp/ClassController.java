package com.greenfoxacademy.dependencyinjection.gfclassapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassController {
  private StudentService studentService;

  @Autowired
  ClassController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String showAllStudents(Model model) {
    model.addAttribute("names", studentService.findAll());
    model.addAttribute("studentCount", studentService.count());
    return "main";
  }

  @GetMapping("/gfa/add")
  public String showStudentAddForm() {
    return "studentaddform";
  }

  @PostMapping("/gfa/add")
  public String showSaveStudent(@RequestParam String name) {
    studentService.save(name);
    return "redirect:/gfa";
  }

  @GetMapping("/gfa/check")
  public String showStudentCheckForm() {
    return "studentcheckform";
  }

  @PostMapping("/gfa/check")
  public String showStudentCheckForm(@RequestParam String name, Model model) {
    model.addAttribute("present", studentService.presentCheck(name));
    return "studentcheckform";
  }
}
