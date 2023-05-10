# Selenium-webdriver-Automation-with-java

#Created with maven project
#You will find the automation codes in the directory src->main/java/com/sjava

```
package com.sjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class githubAutomaion {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/Zahid-H/Selenium-webdriver-Automation-with-java");
        Thread.sleep(3000);
        driver.quit();
    }
}
```
