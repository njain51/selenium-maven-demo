package com.example.njain51.locators;

/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/27/2022, Friday
 **/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 What this program snippet doing?
 **/
public class LocatorXPathDemo {

    public static void main(String[] args) throws InterruptedException {

        // set property for chrome webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver.exe");

        //  get webdriver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("dummy@email.com");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("mypassword");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
