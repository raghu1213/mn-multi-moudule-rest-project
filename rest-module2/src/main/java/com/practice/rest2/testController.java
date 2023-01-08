package com.practice.rest2;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api")
public class testController {
  @Get("/test")
  String test(){
    return "test";
  }
}
