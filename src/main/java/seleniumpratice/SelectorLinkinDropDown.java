package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectorLinkinDropDown {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //select a option from drop down
        WebElement drpcountry = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpcountry);
        drpCountry.selectByVisibleText("India");
        //drpCountry.deselectByValue("brazil");
        //drpCountry.deselectByIndex(3);
        //capture the options from the dropdown
        List<WebElement>options = drpCountry.getOptions();
        System.out.println("Number of options in dropdown:"+options.size());
        //printing the options
//        for(int i=0;i< options.size();i++){
//            System.out.println(options.get(1).getText());
//        }
//Enhanced for loop
        for(WebElement op :options){
            System.out.println(op.getText());
        }

    }

}
