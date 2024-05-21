package seleniumpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {
    public static void main(String []args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        String title = driver.getTitle();
        if(title.equals("nop Commerce demo")){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
        //driver.close;
        //driver.quit;
    }

}
