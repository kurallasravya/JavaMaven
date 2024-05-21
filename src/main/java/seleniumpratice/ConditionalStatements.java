package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalStatements {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        //is displayed()
       // WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
       // System.out.println("Display status of logo:"+logo.isDisplayed());
       // boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        //System.out.println(status);
        //is enabled();
        boolean status = driver.findElement(By.xpath("//input[@id = 'FirstName']")).isEnabled();
        System.out.println(status);
        //is selected()
        WebElement female_rd = driver.findElement(By.xpath("//input[@id = 'gender-female']"));
        WebElement male_rd = driver.findElement(By.xpath("//input[@id = 'gender-male']"));
        System.out.println(female_rd.isSelected());
        System.out.println(male_rd.isSelected());
        female_rd.click();
        System.out.println(female_rd.isSelected());
        System.out.println(male_rd.isSelected());



    }
}
