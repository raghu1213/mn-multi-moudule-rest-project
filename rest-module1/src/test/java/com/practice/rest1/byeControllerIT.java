package com.practice.rest1;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

@MicronautTest
class byeControllerIT {

  @Test
  void integrationTest(RequestSpecification spec){
    spec
      .when()
      .get("/api/bye")
      .then()
      .statusCode(200)
      .body(is("Bye"));

  }

}
