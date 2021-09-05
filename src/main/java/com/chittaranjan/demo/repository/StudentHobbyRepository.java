package com.chittaranjan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chittaranjan.demo.entity.StudentHobbyEntity;

@Repository
public interface StudentHobbyRepository extends JpaRepository<StudentHobbyEntity, Integer> {

}
