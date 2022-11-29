package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
     // go to google.com
        // go to fb.com
        //go back to google.com
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
   // create Webdriver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //
        driver.navigate().to("https://www.facebook.com/");
        //introduce some sleep which wait

        Thread.sleep(2000);// wait or pause for 2000 millisecond(2sec)
        //go back to ggogle
        driver.navigate().back();
        //wait for 2 sec
        Thread.sleep(2000);
        // go back to fb.com
        driver.navigate().forward();
        Thread.sleep(1000);
        //refresh the page
        driver.navigate().refresh();

        //quit
        driver.quit();




    }

}
