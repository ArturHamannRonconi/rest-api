package com.artur.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
  
  @GetMapping("/user/{id}")
  public String index(@PathVariable String id) {
    return "{\"user_id\":\""+ id +"\"}";
  }

  @PostMapping(
    path = "/user",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public String teste(@RequestBody String userData, HttpServletResponse response) {
    response.setStatus(HttpServletResponse.SC_CREATED);
    return "{\"user\": \"" + userData +"\"}";  
  }
}
