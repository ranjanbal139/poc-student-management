package com.chittaranjan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.chittaranjan.demo.model.Student;
import com.chittaranjan.demo.service.CityService;
import com.chittaranjan.demo.service.StudentService;
import com.chittaranjan.demo.util.ModelMapper;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

  @Autowired
  private CityService cityService;

  @Autowired
  private StudentService studentService;

  @GetMapping(value = {"", "/"})
  public String defaultAction(Model model) {
    addToModel(model);
    return "student";
  }

  @PostMapping(value = "/save")
  public String saveStudent(@ModelAttribute("student") Student student, Model model) {
    studentService.saveStudent(student);
    addToModel(model);
    model.addAttribute("message", "Student saved successfully");
    return "student";
  }

  @GetMapping(value = "/view")
  public String viewStudents(Model model) {
    model.addAttribute("students", ModelMapper.convert(studentService.getAllStudents()));
    return "studentView";
  }

  private void addToModel(Model model) {
    model.addAttribute("student", new Student());
    model.addAttribute("cities", cityService.getAllCities());
  }

}


