package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo1 {
    public static void main (String[]args){
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
       /* List<WebElement> links = driver.findElements(By.tagName("div"));
        System.out.println(links.size());
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());*/
        driver.findElement(By.linkText("About us"));
        //driver.findElement(By.partialLinkText("About us"));



    }
}
