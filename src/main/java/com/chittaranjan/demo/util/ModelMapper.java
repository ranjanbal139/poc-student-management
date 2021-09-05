package com.chittaranjan.demo.util;

import static java.util.stream.Collectors.joining;
import java.util.ArrayList;
import java.util.List;
import com.chittaranjan.demo.entity.StudentEntity;
import com.chittaranjan.demo.entity.StudentHobbyEntity;
import com.chittaranjan.demo.model.Student;

public class ModelMapper {

  public static StudentEntity convert(final Student student) {
    StudentEntity entity = new StudentEntity();
    entity.setName(student.getName());
    entity.setAddress(student.getAddress());
    entity.setMobile(student.getMobileNo());
    entity.setCityId(student.getCityId());
    entity.setGender(student.getSex());
    entity.setActive(true);
    return entity;
  }

  public static List<Student> convert(final List<StudentEntity> studentEntities) {

    List<Student> students = new ArrayList<>();
    for (StudentEntity entity : studentEntities) {
      List<StudentHobbyEntity> studentHobbies = entity.getHobbies();
      String hobbiesCommaSeparated = "";
      if (studentHobbies != null) {
        hobbiesCommaSeparated = studentHobbies.stream().map(h -> h.getName()).collect(joining(","));
      }
      students.add(new Student(entity.getName(), entity.getAddress(), entity.getMobile(),
          entity.getCityId(), entity.getGender(), null, hobbiesCommaSeparated));
    }
    return students;
  }

}
