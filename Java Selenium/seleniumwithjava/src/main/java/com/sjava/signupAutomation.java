package com.sjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signupAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Elon");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Mask");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Dhaka");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Uttara");
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Dhaka");
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("1230");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("8989899");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("ElonMask");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Elonmask1234");
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Elonmask1234");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
