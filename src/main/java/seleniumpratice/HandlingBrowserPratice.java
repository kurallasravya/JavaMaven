package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class HandlingBrowserPratice {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]")).sendKeys("Selinium");

        driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();


//        for(String windowHandle : windowHandles) {
//
//            driver.switchTo().window(windowHandle);
//
//
//            List<WebElement> links = driver.findElements(By.tagName("a"));
//
//
//            int numLinks = links.size();
//            System.out.println("Number of links in window " + windowHandle + ": " + numLinks);
//
//        }
//

        // Find all links on the page//div[@id="wikipedia-search-result-link"]//div[@id="wikipedia-search-result-link" and //@target = "_blank\
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' and //@target = '_blank']//a"));

        for (WebElement link : links) {
            link.click();
        }
        System.out.println(driver.getWindowHandles());
        Set<String> windowHandles = driver.getWindowHandles();
        int n = 0;
        for(String winID: windowHandles){
            if(n == 3){
                String title = driver.switchTo().window(winID).getTitle();
                System.out.println(title);
                driver.close();
                break;
            }
            String title = driver.switchTo().window(winID).getTitle();
            System.out.println(title);
            n++;
        }
    }
}
