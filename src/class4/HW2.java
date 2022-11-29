package class4;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
   /*Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner
   */
   public static void main(String[] args) {
       // set the path to the driver to link with our class
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       // create a webdriver instance
       WebDriver driver=new ChromeDriver();
       // use the get() function to open up the requied website
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
       driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
       driver.findElement(By.cssSelector("input.button")).click();
         WebElement messageStatus =driver.findElement(By.cssSelector("a#welcome"));
         String msgValue=messageStatus.getText();
         if(msgValue.equals("Welcome Admin")){
             System.out.println(msgValue+" is present on top right corner");
         }else{
             System.out.println(msgValue+ "is not there");
         }




   }
}
