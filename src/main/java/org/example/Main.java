package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            js.executeScript("window.open()");

            Set<String> currentWin = driver.getWindowHandles();
            String window2 = null;

            for (String window :currentWin) {
                if(!window.equals(window1)){
                    window2 = window;
                    break;
                }
            };

            driver.switchTo().window(window2);
            driver.get("http://127.0.0.1:5500/index.html");
            driver.close();
            driver.switchTo().window(window1);


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

