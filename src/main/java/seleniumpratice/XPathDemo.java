package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //to find X-path for single element
       // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("t-shirts");
    //to find X-path for multiple elements
     //driver.findElements(By.xpath("//input[@placeholder='Search'][@name = 'search']")).sendKeys("t-shirts");
//BY USING and ,or operator
        //driver.findElement(By.xpath("//input[@placeholder='Search'and @name = 'search']" )).sendKeys("Mobile");
        //driver.findElement(By.xpath("//*[@placeholder = 'Search' or name = 'xyz']")).sendKeys("Laptop");
        //X-Path by inner text using text() operator
        //driver.findElement(By.xpath("//*[text() ='MacBook']")).click();
      // driver.findElement(By.xpath("//*[text() = 'Apple Cinema 30\"']")).click();

        /* boolean displayStatus = driver.findElement(By.xpath("//* [text() = 'Featured']")).isDisplayed();
      System.out.println(displayStatus);
      String value = driver.findElement(By.xpath("//*[text() = 'Featured']")).getTagName();
      System.out.println(value);*/
        //X-path contains() and starts-with()
     //   driver.findElement(By.xpath("//input[contains(@name ,'sea')]")).sendKeys("iphone");
      //  driver.findElement(By.xpath("//input[starts-with(@name ,'sea')]")).sendKeys("Laptop");
        //Chained X-path
        boolean displayStatus = driver.findElement(By.xpath("//div[@id =\"logo\"]/a/img")).isDisplayed();
        System.out.println(displayStatus);



    }
}
