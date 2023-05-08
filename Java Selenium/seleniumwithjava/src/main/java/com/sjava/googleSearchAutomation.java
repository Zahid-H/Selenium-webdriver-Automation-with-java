package com.sjava;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchAutomation {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("Wellcome to Java selenium Atomation");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Dhaka,Bangladesh");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
        ;
        Thread.sleep(3000);
        driver.quit();
    }
}
