package seleniumpratice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExcelFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/");
        Thread.sleep(3000);
        WebElement coursepage = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='Step 1 : Learn the basics']")));
        coursepage.click();
        WebElement page = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'Lec 1: Things to Know in C++/Java/Python or any language']")));
        page.click();
        // String checkboxName = "If Else statements";

        java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//a[text() = 'What are arrays, strings?']/preceding::input[@type = 'checkbox'][1]"));

        for (WebElement chbox : checkboxes) {
//            // String chboxAttribute= chbox.getAttribute("");
            chbox.click();
            

        }
    }
}