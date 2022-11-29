package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*

Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
       // Thread.sleep(40000);
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("What the hell is goin on");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        Thread.sleep(5000);
        driver.quit();
    }






}
