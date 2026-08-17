package ru.springtest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class Specification {
    public static final RequestSpecification specification = given()
            .contentType(ContentType.JSON)
            .body(Data.person);
}
