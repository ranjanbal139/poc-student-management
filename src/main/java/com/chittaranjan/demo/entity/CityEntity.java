package com.chittaranjan.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "city")
public class CityEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "city_id")
  private Integer id;

  @Column(name = "name", columnDefinition = "varchar(50)", nullable = false)
  private String name;

  @Column(name = "active", length = 1, columnDefinition = "tinyint(1) default 1")
  private boolean active;

}
