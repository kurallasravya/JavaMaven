package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {
    public static void main (String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://www.automationtestinginsider.com/");
        WebElement searchbox = driver.findElement(By.xpath("//input[@class = 'gsc-input']"));
        String toolTipText = searchbox.getAttribute("title");
        System.out.println(toolTipText);


    }
}
