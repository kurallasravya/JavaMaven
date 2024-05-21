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
//        driver.findElement(By.xpath("//label[text()='Phone']/following-sibling::div//i[@class='dropdown icon']")).se;
//        //driver.findElement(By.xpath("//div[@name='hint']//input[@type='text']")).click();
//       driver.findElement(By.xpath("//div[contains(text(),'India')]")).click();
//        //123
        WebElement streetAddress = driver.findElement(By.xpath("//input[@name='address']"));
        streetAddress.sendKeys("Bhel");
        WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
        city.sendKeys("Hyderabad");
//        WebElement state = driver.findElement(By.cssSelector("input[placeholder='State / County']"));
//        state.sendKeys("Telangana");
//        WebElement post = driver.findElement(By.xpath("//input[@name='zip']"));
//        post.sendKeys("502032");
//        div[@name='country']//input[@type='text']//div[@name='country']//i[@class='dropdown icon']//div[@class='fields']//div[100]
//     driver.findElement(By.xpath("//div[@id='main-content']/div/div[2]/form/div[3]/div/div/div/div/div/div/input\n")).click();
//     driver.findElement(By.xpath("//span[(text() = 'United Arab Emirates' or . = 'United Arab Emirates')]")).sendKeys("United Arab Emirates");
        WebElement email = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email address']")));
        email.sendKeys("kurallasravya@gmail.com");
       WebElement Industry = driver.findElement(By.xpath("//label[text()='Industry']/parent::div//input"));
       Industry.click();





    }
}
