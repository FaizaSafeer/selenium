package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Home1 {
    /*
    1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code

     */
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get() function to open up the requied website

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@data-testid,'open-regis')]")).click();
        Thread.sleep(2000);
       // driver.findElement(By.name("firstname")).sendKeys("Faiza");
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Faiza");
       // Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Safeer");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234556");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select=new Select(dropdown);
   select.selectByVisibleText("10");
        WebElement monthDD = driver.findElement(By.xpath("//select[@name='birthday_month']"));
   Select select1=new Select(monthDD);
   select1.selectByValue("8");
   WebElement yearDD=driver.findElement(By.xpath("//select[@name='birthday_year']"));
   Select select2=new Select(yearDD);
   select2.selectByVisibleText("1985");
   driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();








    }
}
