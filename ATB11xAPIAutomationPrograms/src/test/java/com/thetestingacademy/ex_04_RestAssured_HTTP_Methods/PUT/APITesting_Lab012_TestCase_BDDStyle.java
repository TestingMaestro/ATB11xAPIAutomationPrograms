package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.PUT;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class APITesting_Lab012_TestCase_BDDStyle {

    @Test
    public void test_putRequestBddStyle() {
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

        given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/" + bookingId)
                .contentType(ContentType.JSON)
                .cookie("token", token)
                .log().all().body(payLoad)

                .when().log().all().put()

                .then().log().all().statusCode(200);

    }
}
