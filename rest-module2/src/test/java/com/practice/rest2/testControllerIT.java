package com.practice.rest2;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;


@MicronautTest
public class testControllerIT {

  @Test
  void integrationTest(RequestSpecification spec) {
    spec
      .when()
      .get("/api/test")
      .then()
      .statusCode(200)
      .body(is("test"));
  }
}
