package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITesting_Lab009_TestCase_NonBDDStyle {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_GetRequest_NonBddStyle() {
        String pinCode = "560078";

        //GIVEN
        r = given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pinCode);

        //WHEN
        response = r.when().log().all().get();

        System.out.println(response.asString());

        //THEN
        vr = response.then();
        vr.log().all().statusCode(200);
    }
}