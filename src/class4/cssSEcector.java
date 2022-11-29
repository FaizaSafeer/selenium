package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSEcector {
    public static void main(String[] args) {


    // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    // create a webdriver instance
        WebDriver driver=new ChromeDriver();
       driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
       driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("asdff");
// another method of doing above
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder= 'Please enter']"));
        textBox.sendKeys("abracadbra");

        //press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
    button.click();




}}
