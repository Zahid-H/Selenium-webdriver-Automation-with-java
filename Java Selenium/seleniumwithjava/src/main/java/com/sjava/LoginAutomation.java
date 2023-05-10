package com.sjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        ;
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        ;
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        ;
        Thread.sleep(3000);
        driver.quit();
    }

}
