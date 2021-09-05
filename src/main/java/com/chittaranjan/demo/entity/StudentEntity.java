package com.chittaranjan.demo.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student")
@EqualsAndHashCode(exclude="hobbies")
public class StudentEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "student_id")
  private Integer id;

  @Column(name = "name", columnDefinition = "varchar(100)", nullable = false)
  private String name;

  @Column(name = "city_id", columnDefinition = "INT(11)", nullable = false)
  private Integer cityId;

  @Column(name = "address", columnDefinition = "varchar(250)")
  private String address;

  @Column(name = "mobile", columnDefinition = "varchar(10)")
  private String mobile;

  @Column(name = "gender", columnDefinition = "varchar(6)", nullable = false)
  private String gender;

  @Column(name = "active", length = 1, columnDefinition = "tinyint(1) default 1")
  private boolean active;

  @OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
  private List<StudentHobbyEntity> hobbies;

}

