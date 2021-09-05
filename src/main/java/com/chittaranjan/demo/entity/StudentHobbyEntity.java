package com.chittaranjan.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "student_hobbies")
@EqualsAndHashCode(exclude = "student")
public class StudentHobbyEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "hobby_id")
  private Integer id;

  @Column(name = "name", columnDefinition = "varchar(50)", nullable = false)
  private String name;

  @ManyToOne
  @JoinColumn(name = "student_id",nullable = false)
  private StudentEntity student;

  public StudentHobbyEntity(String name, StudentEntity student) {
    this.name = name;
    this.student = student;
  }

}