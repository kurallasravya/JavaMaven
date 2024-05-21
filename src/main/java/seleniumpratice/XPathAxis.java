package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathAxis {
    public static void main(String []args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();
        //Self- selects the current node
       String text= driver.findElement(By.xpath( "//a[ contains(text (),'Tejas Networks')]//self::a")).getText();
        System.out.println(text);
        //Parent -selects the parent of the current node(Always One)
       text = driver.findElement(By.xpath("//a[ contains(text (),'Tejas Networks')]/parent::td")).getText();
        System.out.println(text);
        //Child -Selects all Ancestors(parent,grand parent etc..)
        List<WebElement> childs = driver.findElements(By.xpath("//a[ contains(text (),'Tejas Networks')]//parent::td//parent::tr//child::*"));
        System.out.println(childs.size());






    }
}
