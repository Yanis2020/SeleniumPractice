package com.peoplentech.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String[] args) throws InterruptedException {

        // set up date as chrome driver needs
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // create object for chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // wait 5 seconds
        Thread.sleep(5000);

        // close chrome
        driver.close();


    }


}
