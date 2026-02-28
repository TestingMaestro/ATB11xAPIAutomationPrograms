package com.thetestingacademy.ex_02_RAConcepts;

public class APITestingLab004BuilderPattern {
    APITestingLab004BuilderPattern step1() {
        System.out.println("Step 1");
        return this;
    }

    APITestingLab004BuilderPattern step2() {
        System.out.println("Step 2");
        return this;
    }

    APITestingLab004BuilderPattern step3(String param) {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {

        APITestingLab004BuilderPattern bp = new APITestingLab004BuilderPattern();
        bp.step1().step2().step3("Yash"); // Method Chaining
    }
}
