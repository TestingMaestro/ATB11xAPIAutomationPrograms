package com.thetestingacademy.ex_01_RABasics;

import static io.restassured.RestAssured.*;

public class Lab001RestAssuredFile {
    public static void main(String[] args) {

        given()
                .baseUri("https://restful-booker.herokuapp.com")
                .header("Content-Type", "application/json")
                .when()
                .get("/ping")
                .then()
                .log().all().statusCode(201);
    }
}
