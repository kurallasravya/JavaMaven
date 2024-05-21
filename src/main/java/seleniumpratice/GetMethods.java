package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

       // System.out.println(driver.getTitle());
      //  System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        //System.out.println(driver.getWindowHandle());

        Set<String> ids = driver.getWindowHandles();
        System.out.println(ids);



    }

}
