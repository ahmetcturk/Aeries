package com.swaglabs.stepdefinition;

import com.swaglabs.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {

        @Given("I am on the home page")
        public void verifyTitle(){
                Assert.assertEquals("Aeries Student Information System - Aeries Software", HomePage.verifyTitle());
        }

        @When("I verify the logo appears")
        public void verifyLogo(){
                Assert.assertTrue(HomePage.isLogoDisplayed());
        }

        @When("I verify About Us link works")
        public void verifyAboutUsLink(){
               Assert.assertEquals("https://www.aeries.com/about/", HomePage.isAboutLinkWork());
        }

}


