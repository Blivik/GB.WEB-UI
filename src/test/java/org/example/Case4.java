package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Case4 {
    static WebDriver driver;

    static Logger logger = LoggerFactory.getLogger(Case1Test.class);

    @BeforeAll
    public static void setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(5));
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://livejournal.com/");
    }

    @Test
    void CaseLanguage() {
        Assertions.assertDoesNotThrow(() -> driver.get("https://livejournal.com/"), "Страница недоступна");
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a")).click();
        driver.findElement(By.id("user")).sendKeys("VBGB");
        driver.findElement(By.id("lj_loginwidget_password")).sendKeys("kA7Z2FACxr");
        driver.findElement(By.xpath("//label[1]")).click();
        driver.findElement(By.xpath("//div[2]/form/button")).click();
        // Пробовала так:
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //И так тоже:
        //driver.findElement(By.xpath("//*[@class = 'label']")).sendKeys(Keys.CONTROL, Keys.END);

        //Через Actions с помощью MoveToElement и MoveByOffset


        driver.findElement(By.xpath("//*[@class = 'label']"));
        driver.findElement(By.xpath("//*[@class = 'b-selectus-scroll']/ul/li[1]")).click();



    }

}
