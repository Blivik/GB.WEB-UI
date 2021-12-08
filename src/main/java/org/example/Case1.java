package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Case1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver.get("https://livejournal.com/");

        WebElement Enter = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        Enter.click();
        WebElement Login = driver.findElement(By.id("user"));
        Login.click();
        Login.sendKeys("VBGB");
        WebElement Pass = driver.findElement(By.id("lj_loginwidget_password"));
        Pass.click();
        Pass.sendKeys("kA7Z2FACxr");
        WebElement rememberMe = driver.findElement(By.xpath("//label[1]"));
        rememberMe.click();
        WebElement enter = driver.findElement(By.xpath("//div[2]/form/button"));
        enter.click();

        driver.quit();
    }
}
