package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        //tag class
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
        //tag artibute
       // driver.findElement(By.cssSelector("[autocomplete = 'off' ]")).sendKeys("on");
       // driver.findElement(By.cssSelector(("input[placeholder='searchstore]"))).sendKeys("T-shirts");//tag cls
        //tag class attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirt");
    }
}
