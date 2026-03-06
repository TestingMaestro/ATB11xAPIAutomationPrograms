package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.GET;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class APITesting_Lab008_TestCase_BDDStyle {

    String pinCode = "560078";

    @Test
    public void test_GetRequest_BddStyle(){
            given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" +pinCode)
                    .when()
                    .log().all().get()
                    .then()
                    .statusCode(200);

    }
}
