package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw3 {
    /*
    1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty
     */
    public static void main(String[] args) {
        // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get() function to open up the requied website

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
startBtn.click();
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));


    }
}
