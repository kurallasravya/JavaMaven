package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //name
        //driver.findElement(By.name("search")).sendKeys("Mac");
        //id
        boolean logoDisplaystatus =  driver.findElement(By.id("logo")).isDisplayed();
        //linked test and partial linked test
       // driver.findElement(By.linkText("Tablets")).click();
       // driver.findElement(By.partialLinkText(("table"))).click();
        //class name
        List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        System.out.println("total number of headerLinks:"+headerLinks.size());
        //tagname
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total number of links:"+links.size());
        //images
        List<WebElement>images = driver.findElements(By.tagName("img"));
        System.out.println("total number of images :"+images.size());




    }
}
