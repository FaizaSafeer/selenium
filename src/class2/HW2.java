package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    navigate to fb.com
click on create new account
fill up all the textboxes

close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("firstname")).sendKeys("Faiza");
        driver.findElement(By.name("lastname")).sendKeys("Safeer");
        driver.findElement(By.name("reg_email__")).sendKeys("1234567");
        driver.findElement(By.id("password_step_input")).sendKeys("wat123456");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.name("birthday_year")).sendKeys("1947");
      //  driver.findElement(By.className("_58mt")).sendKeys("Female");
       // Thread.sleep(4000);
       driver.quit();

    }
}
