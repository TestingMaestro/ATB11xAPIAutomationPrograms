package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.POST;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class APITesting_Lab011_TestCase_NonBDDStyle {

    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_postRequestBDD() {

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        rs = given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/auth");
        rs.contentType(ContentType.JSON);
        rs.log().all().body(payload);


        response = rs.log().all().post();
        System.out.println(response);


        vr = response.then();
        vr.log().all().statusCode(200);


    }
}
