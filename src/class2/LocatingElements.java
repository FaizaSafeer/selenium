package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //go to fb.com
      //  enter username
     //enter pasword
        //click login
        // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver=new ChromeDriver();
        //go to fb.com
        driver.get("https://www.facebook.com/");
        //max ur window
        driver.manage().window().maximize();
        //enter thr username inthe textbook
        //locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abcdef");
        //enter password
        driver.findElement(By.name("pass")).sendKeys("dsfgsdg");

      //  driver.findElement(By.name("login")).click();
   //for the following task to work plz make sure to comment login functionality
        //task2
        //click on forgot password
   //
      //  driver.findElement(By.linkText("Forgotten password?")).click();
//task 3
        //click on forgot password using partial linktext locator

     //   driver.findElement(By.partialLinkText("Forgotten")).click();
    }
}
