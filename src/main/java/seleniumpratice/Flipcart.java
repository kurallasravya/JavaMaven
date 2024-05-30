package seleniumpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Flipcart {
    WebDriver driver = new ChromeDriver();
    String username = "";
    String password = "";

    @BeforeClass
    public void init(){
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     driver.navigate().to("https://www.flipkart.com/");

    }
}
