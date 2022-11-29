package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get() function to open up the requied website
        driver.get("https://www.google.com/");
        // get the url of the website
         String url=driver.getCurrentUrl();
        System.out.println(url);

        //get the title
      String title=driver.getTitle();
        System.out.println(title);

        //close the chrome
       // driver.quit();
    }
}
