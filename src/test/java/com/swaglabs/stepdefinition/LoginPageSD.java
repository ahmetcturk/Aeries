package com.swaglabs.stepdefinition;

import com.swaglabs.base.ConfigReader;
import com.swaglabs.pages.HomePage;
import com.swaglabs.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

        @Given("I am on the login page")
        public void verifyTitle(){
                Assert.assertEquals("Swag Labs", LoginPage.verifyTitle());
        }

        @When("I enter valid username in the username field")
        public void enterValidUsername(){
                LoginPage.enterUserName("standard_user");
        }

        @And("I enter valid password in the password field")
        public void enterValidPassword(){
                LoginPage.enterPassword("secret_sauce");
        }

        @And("I click on the login button")
        public void clickOnLogin(){
                LoginPage.clickLoginBtn();
        }

        @Then("I see the home page")
        public void verifyHomePageTitle() {
                Assert.assertEquals("Swag Labs", HomePage.verifyTitle());
        }

        @When("I enter invalid username in the username field")
        public void enterInValidUsername(){
                LoginPage.enterUserName("admin");
        }

        @And("I enter invalid password in the password field")
        public void enterInValidPassword(){
                LoginPage.enterPassword("123");
        }

        @Then("I see the error message")
        public void verifyErrorMessage(){
                Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", LoginPage.invalidLoginMsg());
        }


}


