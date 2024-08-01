package org.example;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(2000);
            String title = driver.getTitle();


            Assert.assertEquals(title, "Document");

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }
}

