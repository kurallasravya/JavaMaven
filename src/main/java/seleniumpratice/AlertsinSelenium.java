package seleniumpratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsinSelenium {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        //driver.switchTo().alert().accept();
//         Alert mytext =  driver.switchTo().alert();
//        System.out.println( mytext.getText());
//        mytext.accept();
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Thread.sleep(5000);
//        //driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert myalert = driver.switchTo().alert();
       myalert.sendKeys("welcome");
       myalert.accept();



    }

}
