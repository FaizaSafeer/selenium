package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver = new ChromeDriver();
        //goto smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//maximize the window
        driver.manage().window().maximize();
        //enter the user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
// enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //clicklogin
        driver.findElement(By.className("button")).click();

        // make sure the title is correct i.e Web Order

        // get the title of the page
        String title= driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The Title is correct :"+ title);
        }
        else{
            System.out.println("The title is incorrect :"+title);
        }
    }
}
