package com.peoplentech.seleniumpractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium3 extends TestBase {


    /*   public static void main(String[] args) throws InterruptedException {
           validateDateUserCanOnSearchBar();
   }
     */

    @Test
    public static void validateFromDropDown() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(3);

        driver.findElement(By.id("gh-ac")).sendKeys("java programming");
        sleepFor(3);

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        sleepFor(3);

        WebElement element = driver.findElement(By.xpath("//span[text()='java programming']"));
        Assert.assertEquals(element, "java programming");


        sleepFor(3);
        closeDriver();


    }

    public void validateDateUserCanOnSearchBar2() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(3);

        driver.findElement(By.id("gh-ac")).sendKeys("java programming");
        sleepFor(3);


        //driver.findElement(B)
        closeDriver();


    }

    public void validateDateUserCanOnSearchBar() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(3);

        driver.findElement(By.id("gh-ac")).sendKeys("java programming");
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        sleepFor(2);
        closeDriver();
    }

    public void validateDateUserCanOnSearchBar3() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(3);

        String data = driver.findElement(By.xpath("//select[@id='gh-cat']")).getText();
        System.out.println(data);


        //driver.findElement(B)
        closeDriver();


        //select[@id='gh-cat']
    }
}
