package com.thetestingacademy.ex_05_TestNGAnnotationsUsageandExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting018TestNG_DependsOn {

    @Test(groups = {"smoke"})
    public void startServer() {
        System.out.println("Started and Running on 5137");
    }

    @Test(groups = {"smoke"}, dependsOnMethods = "startServer")
    @Parameters("flag")
    public void login(boolean flag) {
        if (flag)
            System.out.println("User Logged in");
        else System.out.println("Login skipped");
    }

    @Test(groups = {"p1"}, dependsOnMethods = "login")
    public void viewProfile() {
        System.out.println("Profile Viewed");
    }

    @Test(groups = {"p2"}, dependsOnMethods = {"login", "viewProfile"})
    public void changeProfileView() {
        System.out.println("View Changed");
    }
}
