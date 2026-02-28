package com.thetestingacademy.ex_01_RABasics;

import java.util.Scanner;

import static io.restassured.RestAssured.*;

public class Lab002PinCodeProject {
    public static void main(String[] args) {

        /*
         * given -> request set up -> pre request --> url, body, headers, auth
         * when -> send request --> using HTTP methods -> GET, POST, DELETE, PUT etc
         * then -> validate response -> status code = 200, body, firstname===yash
         *
         *
         *
         * Full URL -> "https://api.zippopotam.us/IN/560078"
         * base UrL - "https://api.zippopotam.us"
         * base path/queryparam/end point - "/IN/560078"
         *
         *
         * Pin Code take from user
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PinCode: ");
        String pinCode = sc.nextLine();

        given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pinCode)
                .header("Content-Type","application/json")
                .when()
                    .get()
                .then()
                    .log().all()
                    .statusCode(200);
    }
}
