package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BroswerMethods {
     public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         //Thread.sleep(5000);
       // driver.findElement(By.linkText("OrangeHRM, Inc")).click();
         //  Thread.sleep(5000);
           //driver.quit();
         // driver.close();
         driver.manage().window().maximize();
         WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder = 'Username']")));
         txtusername.sendKeys("Admin");
         WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder = 'Password']")));
         txtpassword.sendKeys("Admin");
         WebElement loginbtn =  mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@normalize-space() = 'Login']")));
         loginbtn.click();
    }
}
