package com.thetestingacademy.ex_05_TestNGAnnotationsUsageandExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting017TestNG_Groups {

    @Test(groups = {"sanity", "reg"})
    public void sanityRun() {
        System.out.println("Run Sanity");
        System.out.println("Run QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void regressionRun() {
        System.out.println("Run Regression");
        System.out.println("Run QA");
    }

    @Test(groups = {"p1", "smoke"})
    public void smokeRun() {
        System.out.println("Run Smoke");
        System.out.println("Run QA");
    }

    @Test(groups = {"p2", "slow"})
    public void reportsTest() {
        System.out.println("Run Smoke");
        System.out.println("Run QA");
    }
}
