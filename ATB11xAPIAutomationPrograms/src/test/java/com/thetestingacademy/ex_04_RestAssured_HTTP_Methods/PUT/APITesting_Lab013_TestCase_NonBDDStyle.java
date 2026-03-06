package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.PUT;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITesting_Lab013_TestCase_NonBDDStyle {

    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_postRequestBDD() {

        String bookingId = "2157";
        String payLoad = "{\n" +
                "    \"firstname\" : \"Minniu\",\n" +
                "    \"lastname\" : \"sheiku\",\n" +
                "    \"totalprice\" : 1256,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-05\",\n" +
                "        \"checkout\" : \"2019-01-05\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : [\"Dinner\"]\n" +
                "}";
        String token = "dbb6600e9c93b97";

        rs = given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/"+bookingId);
        rs.contentType(ContentType.JSON);
        rs.cookie("token", token);
        rs.log().all().body(payLoad);

        response = rs.when().log().all().put();

        vr= response.then();
        vr.log().all().statusCode(200);

    }
}
