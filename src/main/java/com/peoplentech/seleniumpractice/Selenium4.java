package com.peoplentech.seleniumpractice;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Selenium4 extends TestBase {

    private static Logger LOGGER = Logger.getLogger(Selenium4.class);


    @Test(enabled = false)
    public static void something() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("http://demo.guru99.com/test/drag_drop.html");
        sleepFor(2);
        //  WebElement source = driver.findElement(By.xpath(("(//li[@data-id='2'])[1]"));

        //(//li[@data-id=\"2\"])[1]");
        closeDriver();

    }

    @Test(enabled = false)
    public static void validateFrame() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://demoqa.com/frames");
        sleepFor(2);

        driver.switchTo().frame("frame1");

        driver.switchTo().defaultContent();

        sleepFor(2);
        closeDriver();
    }

    @Test(enabled = false)
    public static void validatDropDown() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(2);

        WebElement element = driver.findElement(By.id("gh-cat"));
        Select select = new Select(element);
        select.selectByVisibleText("Books");


        sleepFor(2);
        closeDriver();
    }

    @Test(enabled = false)
    public static void mouseOver() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(2);

        WebElement motors = driver.findElement(By.linkText("Motors"));
        Actions actions = new Actions(driver);

        actions.moveToElement(motors).build().perform();
        sleepFor(2);
        driver.findElement(By.linkText("Cars & Trucks"));


        sleepFor(2);
        closeDriver();
    }

    @Test(enabled = false)
    public static void mouseOverportingGoods() throws InterruptedException {
        openBrowser("Firefox");
        openWebsite("https://www.ebay.com");
        sleepFor(2);

        WebElement sport = driver.findElement(By.linkText("Sporting Goods"));
        Actions actions = new Actions(driver);

        actions.moveToElement(sport).build().perform();
        sleepFor(3);
        driver.findElement(By.linkText("Golf"));
        sleepFor(3);
        navigateBack();

        WebElement toys = driver.findElement(By.linkText("Toys & Hobbies"));
        Actions actions1 = new Actions(driver);

        actions1.moveToElement(toys).build().perform();
        sleepFor(3);
        driver.findElement(By.linkText("Ball"));
        sleepFor(3);


        closeDriver();
    }

    @Test(enabled = false)
    public static void validateScroll() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        sleepFor(2);
        closeDriver();

    }

    @Test(enabled = false)
    public static void validateScrollToElement() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("https://www.ebay.com");
        sleepFor(2);

        WebElement element = driver.findElement(By.linkText("Announcements"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(2);
        closeDriver();

    }

    @Test(enabled = false)
    public static void validatePopUp() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("http://demo.guru99.com/test/delete_customer.php");
        sleepFor(2);

        driver.findElement(By.xpath("")).sendKeys("1");
        driver.findElement(By.xpath("")).click();

        String popup1 = driver.switchTo().alert().getText();
        LOGGER.info(popup1);
        LOGGER.info("connection failed Yanis");

        driver.switchTo().alert().accept();


        sleepFor(2);
        closeDriver();

    }

    @Test
    public static void logger() throws InterruptedException {
        openBrowser("chrome");
        openWebsite("http://demo.guru99.com/test/delete_customer.php");
        sleepFor(2);

        driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();


        String popup1 = driver.switchTo().alert().getText();
        LOGGER.info(popup1);

        driver.switchTo().alert().accept();

        sleepFor(2);
        String popup2 = driver.switchTo().alert().getText();
        LOGGER.info(popup2);

        driver.switchTo().alert().accept();

        sleepFor(5);
        closeDriver();
    }


}