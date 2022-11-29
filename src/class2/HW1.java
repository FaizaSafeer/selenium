package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Faiza");
        driver.findElement(By.id("customer.lastName")).sendKeys("Safeer");
        driver.findElement(By.name("customer.address.street")).sendKeys("Wallsend NSW");
        driver.findElement(By.id("customer.address.city")).sendKeys("Newcaastle");
        driver.findElement(By.name("customer.address.state")).sendKeys("NSW");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("2287");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456");
        driver.findElement(By.name("customer.ssn")).sendKeys("what is this");
        driver.findElement(By.id("customer.username")).sendKeys("FaizaSafeer");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
       // Thread.sleep(3000);
        driver.findElement(By.className("button")).click();// its not registering
       Thread.sleep(1000);
       driver.quit();

    }
}
