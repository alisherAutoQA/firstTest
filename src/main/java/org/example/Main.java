package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        element.sendKeys("hello world", Keys.ENTER);

        driver.manage().window().maximize();
    }
}

