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
public class Locator_5_demo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#login1")).sendKeys("mylogin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mypassword");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
        Thread.sleep(1000);

        // capture error message here in console
        System.out.println(driver.findElement(By.cssSelector("#div_login_error")).getText());
        Thread.sleep(1000);
        driver.quit();

    }

}
