package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CogmentoLogin {
    public  static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.cogmento.com/");
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'text']")));
        username.sendKeys("kurallasravya@gmail.com");
        WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'password']")));
        password.sendKeys("sravya123");
        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()= 'Login']")));
        loginButton.click();
        WebElement companies = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='building icon']")));
        companies.click();
        WebElement addDetails = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//button[1]//i[1]")));
        addDetails.click();
        WebElement name = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
        name.sendKeys("sravya");
        //driver.findElement(By.xpath("//label[text()='Phone']/following-sibling::div//div[@role='listbox']")).click();
       driver.findElement(By.xpath("//label[normalize-space()='Phone']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.67'");
        driver.findElement(By.xpath("//label[text()='Phone']/following-sibling::div//i[@class='dropdown icon']")).click();
        //driver.findElement(By.xpath("//div[@name='hint']//input[@type='text']")).click();
       driver.findElement(By.xpath("//div[contains(text(),'India')]")).click();
        




    }
}
