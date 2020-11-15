package com.peoplentech.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;


    public static void openBrowser(String browserName) {
        // set up date as chrome driver needs

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            // Firefox
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    // create object for chrome driver
    public static void openWebsite(String url) {

        driver.get(url);
    }

    // find element
    public static void clickOnElement(String elementToCheck) {
        //a[text()='Sign in']
        //a[text()='register']
        //tagname[text()=' ']
        driver.findElement(By.xpath(elementToCheck)).click();


    }
    // wait for x seconds

    public static void sleepFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    public static void navigateBack() {
        driver.navigate().back();
    }

    // close chrome
    public static void closeDriver() {
        driver.quit();
    }
}
