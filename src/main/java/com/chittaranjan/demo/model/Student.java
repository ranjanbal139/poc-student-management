package com.chittaranjan.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

  private String name;
  private String address;
  private String mobileNo;
  private Integer cityId;
  private String sex;
  private String[] hobbies;
  private String hobbiesCommaSeparated;
}
