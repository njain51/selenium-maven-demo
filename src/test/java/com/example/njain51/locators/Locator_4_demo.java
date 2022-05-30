package com.example.njain51.locators;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/30/2022, Monday
 **/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 What this program snippet doing?
 **/
public class Locator_4_demo {

    public static void main(String[] args) throws InterruptedException {

        // set property for chrome webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver.exe");

        //  get webdriver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#username")).sendKeys("dummy@email.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("mypassword");
        driver.findElement(By.cssSelector("#Login")).click();
        Thread.sleep(1000);

        // capture error message here in console
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());
        Thread.sleep(1000);

        driver.quit();

    }
}
