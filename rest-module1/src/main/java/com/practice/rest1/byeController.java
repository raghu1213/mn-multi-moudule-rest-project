package com.practice.rest1;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("api")
public class byeController {
  @Get("bye")
  public String bye() {
    return "Bye";
  }
}
