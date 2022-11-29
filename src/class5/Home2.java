package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Home2 {
    /*
    1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
     */
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver=new ChromeDriver();
        // use the get() function to open up the requied website

        driver.get("https://www.ebay.com/");
        WebElement categories = driver.findElement(By.xpath("//select[contains(@aria-label,'Select a category for search')]"));
        Select select=new Select(categories);
        List<WebElement> options = select.getOptions();
        for (int i=0;i<options.size();i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            System.out.println(text);

        }
     categories.click();
       Thread.sleep(3000);
        select.selectByValue("58058");
//select.selectByVisibleText("Computers/Tablets & Networking");
driver.findElement(By.xpath("//input[@type='submit']")).click();
String title=driver.getTitle();
        System.out.println("the title is: "+title);





    }
}
