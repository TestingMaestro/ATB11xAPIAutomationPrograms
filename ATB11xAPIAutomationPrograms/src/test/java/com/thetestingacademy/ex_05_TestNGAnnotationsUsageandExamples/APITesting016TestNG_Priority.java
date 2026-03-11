package com.thetestingacademy.ex_05_TestNGAnnotationsUsageandExamples;

import org.testng.annotations.Test;

public class APITesting016TestNG_Priority {

    @Test(priority = 3)
    public void logoutTest() {
        System.out.println("Logout Test");
    }

    @Test(priority = 2)
    public void dashboardTest() {
        System.out.println("Dashboard Test");
    }

    @Test(priority = 1)
    public void loginTest() {
        System.out.println("Login Test");
    }
}
