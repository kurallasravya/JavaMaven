package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {


    protected WebDriver driver;
    protected WebDriverWait mywait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.mywait = new WebDriverWait(driver, Duration.ofSeconds(30));


    }
}