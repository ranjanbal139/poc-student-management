package com.chittaranjan.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthCheckController {

  @GetMapping(value = "/status")
  public ResponseEntity<String> status() {
    return ResponseEntity.ok().body("Application is UP and Running!");
  }
}
