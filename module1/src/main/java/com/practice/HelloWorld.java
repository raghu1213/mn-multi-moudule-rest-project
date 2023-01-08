package com.practice;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("api")
public class HelloWorld {

  @Get("hello")
  public String sayHello(){
    return "Hello";
  }

}
