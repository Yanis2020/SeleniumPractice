package com.peoplentech.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumPractice {
    private static WebDriver driver;

    public static void main(String[] args) {
        openBrowser();
        waitFor(2);

        goToUrl("https://www.ebay.com");
        waitFor(2);

        //  findElementInTheWebsite("(//a[text()='Sign in'][1])");
        //   waitFor(2);

        //   goBack();
        //   waitFor(2);

        //   findElementInTheWebsite("//a[text()='register']");
        //    waitFor(2);
        //  goBack();


        // driver.findElement(By.id("gh-ac")).sendKeys("java program");
        //  waitFor(2);

        //   findElementInTheWebsite("//input[@id='gh-btn']");
        //   waitFor(2);

        findElementInTheWebsite("//select[@id='gh-cat']");
        waitFor(2);

        driver.findElement(By.id("")).sendKeys("Baby");

        closeDriver();


    }

    public static void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();


    }

    public static void goToUrl(String url) {
        driver.get(url);

    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void closeDriver() {
        driver.close();

    }

    public static void goBack() {
        driver.navigate().back();

    }

    public static void findElementInTheWebsite(String elementPath) {

        driver.findElement(By.xpath(elementPath)).click();
    }
}
