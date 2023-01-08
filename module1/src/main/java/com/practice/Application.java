package com.practice;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
  info = @Info(
    title = "Hello World",
    description = "My API",
    license = @License(name = "Apache 2.0", url = "https://foo.bar"),
    contact = @Contact(url = "foo.com", name = "Raghu", email = "raghu@raghu.com")
  )
)
public class Application {

  public static void main(String[] args) {
    Micronaut.run(Application.class, args);
  }
}
