package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingFramesiFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("selenium");
        driver.switchTo().defaultContent();//go back to page
        //frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name = 'mytext2']")).sendKeys("welcome");
        driver.switchTo().defaultContent();//go back to the page
        //frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@name = 'mytext3']")).sendKeys("java");
        //inner i frame- part of frame 3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
//        WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
//         JavascriptExecutor js = (JavascriptExecutor) driver;
//         js.executeScript("arguments[0].click();",rdbutton);
//         driver.switchTo().defaultContent();

        WebElement frame5 = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name = 'mytext5']")).sendKeys("link");
        driver.findElement(By.xpath("//a[text()='https://a9t9.com']]")).click();


//        // Switch to Frame 5
//        driver.switchTo().frame("frame5");
//
//        // Click on an element within Frame 5 (for example, a button with id="button1")
//        WebElement buttonElement = driver.findElement(By.id("button1"));
//        buttonElement.click();
//
//        // Switch back to the main/default content
        //driver.switchTo().defaultContent();
 }
}
