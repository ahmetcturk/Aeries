package com.swaglabs.base;

import com.swaglabs.pages.CheckoutPage;
import com.swaglabs.pages.HomePage;
import com.swaglabs.pages.ItemPage;
import com.swaglabs.pages.LoginPage;

public class PageManager {


    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static CheckoutPage checkOutPage;
    public static HomePage homePage;

    public static  void initialize(){
        // initialize pages
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        checkOutPage = new CheckoutPage();
        homePage = new HomePage();

    }




}
