package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Case2 {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().fullscreen();
        driver.get("https://livejournal.com/");

        WebElement authorization = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        authorization.click();
        WebElement login = driver.findElement(By.id("user"));
        login.click();
        login.sendKeys("VBGB");
        WebElement pass = driver.findElement(By.id("lj_loginwidget_password"));
        pass.click();
        pass.sendKeys("kA7Z2FACxr");
        WebElement rememberMe = driver.findElement(By.xpath("//label[1]"));
        rememberMe.click();
        WebElement enter = driver.findElement(By.xpath("//div[2]/form/button"));
        enter.click();

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

       WebElement write = driver.findElement(By.xpath("//span[@class='s-header-item-post--short']"));
        write.click();
        WebElement title = driver.findElement(By.xpath("//*[@class='_xt']"));
        title.click();
        title.sendKeys("Hello");
        WebElement print = driver.findElement(By.xpath("//*[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
        print.click();
        print.sendKeys("Hello,World");
        WebElement puplication = driver.findElement(By.xpath("//button[@class='_11c _11e _11h _11q _11t _127']"));
        puplication.click();
        driver.quit();
    }
}
