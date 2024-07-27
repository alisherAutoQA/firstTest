package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        input.sendKeys("hello");
        List<WebElement> inputs = driver.findElements(By.tagName("a"));
        System.out.println(inputs.size());


    }
}

