package com.github.fantasy0v0.spring_security_test.controller

import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.IOException

@RestController
@RequestMapping("/test")
class TestController {

  @GetMapping("/hello")
  fun hello(name: String): ResponseEntity<String> {
    return ResponseEntity.ok("hello, $name")
  }

  @PostMapping("/post")
  fun hello(name: String, msg: String): ResponseEntity<String> {
    return ResponseEntity.ok("hello, $name, $msg")
  }

}
