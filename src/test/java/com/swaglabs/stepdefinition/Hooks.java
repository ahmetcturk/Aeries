package com.swaglabs.stepdefinition;

import com.swaglabs.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void start(){
        BasePage.initializeDriver();
    }

    @After
    public void end(){
        BasePage.tearDown();
    }

}
