package com.swaglabs.pages;

import com.swaglabs.utils.HelperMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static com.swaglabs.base.BasePage.driver;


public class HomePage {
    @FindBy(xpath = "//img[contains(@alt, 'Aeries Software')]")
    private static WebElement appLogo;

    @FindBy(xpath = "//span[contains(.,\'About Us\')]")
    private static WebElement aboutUsLink;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public static boolean isLogoDisplayed() {
        return HelperMethods.doIsDisplayed(appLogo);
    }

    public static String verifyTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static String isAboutLinkWork(){
        HelperMethods.clickWithJS(aboutUsLink);
        HelperMethods.getWaitUrl("https://www.aeries.com/about/");
        String actualUrl = HelperMethods.getCurrentURL();
        System.out.println(actualUrl);
        return actualUrl;
    }

}
