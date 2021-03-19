package com.swaglabs.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
    @Given("Create a FizzBuzz game")
    public void method1() {
        System.out.println("1");
    }

    @When("I play with number {int}")
    public void method2(int in) {
        System.out.println("2");
    }

    @Then("I expect {string}")
    public void method3(String str) {
        System.out.println("3");
    }
}
