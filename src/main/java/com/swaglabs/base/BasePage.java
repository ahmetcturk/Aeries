package com.swaglabs.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {


    public static WebDriver driver;

    public static WebDriver initializeDriver(){
        String browser  =  "chrome";
        String baseURL = "https://www.aeries.com";
        switch (browser){
            case  "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case  "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case  "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
                System.out.println("Invalid Driver");
                throw new RuntimeException("Invalid Browser Name....");

        }
        PageManager.initialize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
        return  driver;
    }

    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }




}
