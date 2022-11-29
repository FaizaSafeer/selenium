package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class hW {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        String verifyText = text.getText();
        System.out.println(verifyText);
        if(verifyText.equals("It's gone!")){
            System.out.println(verifyText+" is verified");
        }else{
            System.out.println(verifyText+" is not verified");
        }
        WebElement enableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableBtn.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println( "Textbox is enable: "+textbox.isEnabled());
        textbox.sendKeys("abracadbra");
      enableBtn.click();
      WebDriverWait wait2=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        System.out.println("TextBox is enable: " +  textbox.isEnabled());
    }
}
