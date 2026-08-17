package ru.springtest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestBaseTest {
    @Test
    public void shouldBeCreatePerson(){
        given()
                .spec(Specification.specification)
                .post(Links.CREATE_PERSON)
                .then()
                .statusCode(201);
    }
}
