package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {
  @GetMapping("/")
  String hello() {
    return "Hello World!";
  }
}
