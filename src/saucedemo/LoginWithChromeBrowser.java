package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class LoginWithChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        // we give implicit time to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // print the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title : " +  title);

        //Print the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //Find the Username field element
        WebElement UsernameField = driver.findElement(By.id("user-name"));
        //Enter the Username to Username field
        UsernameField.sendKeys("jasmeen144@gmail.com");

        //Enter the password to Password field element
        driver.findElement(By.id("password")).sendKeys("Prime");

        //Browser close
        driver.close();


    }
}
