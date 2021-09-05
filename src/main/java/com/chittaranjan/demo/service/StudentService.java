package com.chittaranjan.demo.service;

import java.util.List;
import java.util.Optional;
import com.chittaranjan.demo.entity.StudentEntity;
import com.chittaranjan.demo.model.Student;

public interface StudentService {

  public List<StudentEntity> getAllStudents();

  public Optional<StudentEntity> findStudentById(Integer studentId);

  public void saveStudent(Student student);
}
