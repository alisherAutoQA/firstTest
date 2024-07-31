package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(2000);

            WebElement element = driver.findElement(By.id("a"));
            WebElement element2 = driver.findElement(By.id("b"));
            WebElement element3 = driver.findElement(By.id("c"));


            element.click();
            Alert alert = wait.until(alertIsPresent());
            alert.accept();


            element2.click();
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Super");
            prompt.accept();


            element.click();
            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(4000);
            alert2.accept();


            element3.click();
            Alert alert3 = wait.until(alertIsPresent());
            alert3.dismiss();

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            Thread.sleep(2000);
            driver.quit();
        }


        WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        element.sendKeys("hello world", Keys.ENTER);

        driver.manage().window().maximize();
    }
}

