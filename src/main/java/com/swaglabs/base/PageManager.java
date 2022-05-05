package com.swaglabs.base;

import com.swaglabs.pages.HomePage;

public class PageManager {
    public static HomePage homePage;
    public static  void initialize(){
        // initialize pages
        homePage = new HomePage();
    }
}
