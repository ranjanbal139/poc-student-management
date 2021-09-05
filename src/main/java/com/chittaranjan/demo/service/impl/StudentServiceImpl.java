package com.chittaranjan.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chittaranjan.demo.entity.StudentEntity;
import com.chittaranjan.demo.entity.StudentHobbyEntity;
import com.chittaranjan.demo.model.Student;
import com.chittaranjan.demo.repository.StudentHobbyRepository;
import com.chittaranjan.demo.repository.StudentRepository;
import com.chittaranjan.demo.service.StudentService;
import com.chittaranjan.demo.util.ModelMapper;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private StudentHobbyRepository studentHobbyRepository;

  @Override
  public List<StudentEntity> getAllStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Optional<StudentEntity> findStudentById(Integer studentId) {
    return studentRepository.findById(studentId);
  }

  @Override
  public void saveStudent(Student student) {
    StudentEntity entity = ModelMapper.convert(student);
    studentRepository.saveAndFlush(entity);
    saveHobbies(entity, student.getHobbies());
  }

  private void saveHobbies(final StudentEntity entity, String[] hobbies) {
    if (hobbies != null) {
      for (String hobby : hobbies) {
        studentHobbyRepository.saveAndFlush(new StudentHobbyEntity(hobby, entity));
      }
    }
  }

}
