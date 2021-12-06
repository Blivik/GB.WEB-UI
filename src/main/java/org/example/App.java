package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://livejournal.com/");
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        webElement.click();
        WebElement webElement1 = driver.findElement(By.id("user"));
        webElement1.click();
        webElement1.sendKeys("VBGB");
        WebElement webElement2 = driver.findElement(By.id("lj_loginwidget_password"));
        webElement2.click();
        webElement2.sendKeys("kA7Z2FACxr");
        WebElement webElement3 = driver.findElement(By.xpath("//label[1]"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath("//div[2]/form/button"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath("//*[@class='s-header-item-post--long']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//*[@class='_xt']"));
        webElement6.click();
        webElement6.sendKeys("Hello");
        WebElement webElement7 = driver.findElement(By.id("placeholder-uvpu"));
        webElement7.click();
        webElement7.sendKeys("Hello,World");





        // driver.quit();
    }
}
