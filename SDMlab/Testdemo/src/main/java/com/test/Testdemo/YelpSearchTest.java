package com.test.Testdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YelpSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // a. Navigate to https://www.yelp.com/
        driver.get("https://www.yelp.com/");

        // b. Enter Restaurant in search box
        WebElement searchBox = driver.findElement(By.id("find_desc"));
        searchBox.sendKeys("Restaurant");

        // c. Click on search button
        WebElement searchButton = driver.findElement(By.id("header-search-submit"));
        searchButton.click();

        // d. Verify the title of the result page
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Search Results")) {
            System.out.println("Search results page is displayed.");
        } else {
            System.out.println("Search results page is not displayed.");
        }

        // Close the browser
        driver.quit();
    }
}

