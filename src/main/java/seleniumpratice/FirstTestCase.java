package seleniumpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[]args){
       // ChromeDriver driver = new ChromeDriver();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String act_title= driver.getTitle();
        if(act_title.equals("your Store")) {
            System.out.println("Test Passed");
        }
            else{
                System.out.println("Test Failed");
            }
       //driver.close();
        //driver.quit();



        }
    }

