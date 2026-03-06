package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.PATCH;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITesting_Lab012_TestCase_BDDStyle {

    @Test
    public void test_putRequestBddStyle() {
        String bookingId = "2985";
        String payLoad = "{\n" +
                "    \"firstname\" : \"Sony\",\n" +
                "    \"lastname\" : \"Meeku\",\n" +
                "    \"totalprice\" : 1256,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-05\",\n" +
                "        \"checkout\" : \"2019-01-05\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : [\"Dinner\"]\n" +
                "}";
        String token = "7910c712dc27b7f";

        given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/" + bookingId)
                .contentType(ContentType.JSON)
                .cookie("token", token)
                .log().all().body(payLoad)

                .when().log().all().patch()

                .then().log().all().statusCode(200);

    }
}
