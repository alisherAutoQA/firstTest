package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(2000);

            LoginPage lp = new LoginPage();
            lp.login("admin", "admin");


        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }
}

