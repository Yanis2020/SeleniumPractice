package com.peoplentech.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
    private static WebDriver driver;

    public static void main(String[] args) {
        openBrowser();
        sleepFor(2);

        openWebsite("https://www.ebay.com");
        sleepFor(2);

        clickOnElement("(//a[text()='Sign in'])[1]");
        sleepFor(2);
        navigateBack();


        clickOnElement("(//a[text()='register'][1]");
        sleepFor(2);
        navigateBack();

        sleepFor(2);
        closeDriver();
    }

    public static void openBrowser() {
        // set up date as chrome driver needs
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    // create object for chrome driver
    public static void openWebsite(String url) {
        driver = new ChromeDriver();
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

    public static void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void navigateBack() {
        driver.navigate().back();
    }

    // close chrome
    public static void closeDriver() {
        driver.close();
    }
}
