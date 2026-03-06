package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.POST;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class APITesting_Lab0010_TestCase_BDDStyle {


    @Test
    public void test_PostBDDStyle(){

        String payLoad = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payLoad)

                .when().log().all().post()

                .then().log().all().statusCode(200);

    }
}
