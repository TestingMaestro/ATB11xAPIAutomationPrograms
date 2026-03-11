package com.thetestingacademy.ex_05_TestNGAnnotationsUsageandExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015BeforeTest_AfterTest {

    @BeforeTest
    public void getAPIToken() {
        System.out.println("Before Test Execution Get the Token");
    }

    @BeforeTest
    public void getBookingId() {
        System.out.println("Before Test Execution Get the Booking Id");
    }

    @Test
    public void testCase1PutRequest() {
        System.out.println("Test Case 1 - Put");
    }

    @Test
    public void testCase2PPatchRequest() {
        System.out.println("Test Case 2 - Patch");
    }

    @AfterTest
    public void cleanUpActivities() {
        System.out.println("Closing up all the things after test");
    }
}
