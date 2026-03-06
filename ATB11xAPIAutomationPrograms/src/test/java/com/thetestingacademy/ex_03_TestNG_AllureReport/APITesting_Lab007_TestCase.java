package com.thetestingacademy.ex_03_TestNG_AllureReport;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITesting_Lab007_TestCase {
    String pinCode = "560078";

    @Test
    public void getRequestPositiveTc1() {
        pinCode = "560078";
        given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pinCode)
                .header("Content-Type", "application/json")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void getRequestNegativeTc2() {
        pinCode = "@";
        given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pinCode)
                .header("Content-Type", "application/json")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void getRequestNegativeTc3() {
        pinCode = " ";
        given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pinCode)
                .header("Content-Type", "application/json")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
