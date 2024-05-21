package seleniumpratice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class SelectaLink {
    public static void main(String[] args) throws InterruptedException, IOException {

//        WebDriver driver = new ChromeDriver();
//        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//
//        driver.get("https://takeuforward.org/login");
//        int zoomLevel = 80;

        // Set the zoom level using JavaScriptExecutor
//        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='" + zoomLevel + "%'");
//
//
//        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'w-full mx-auto']//input[@type = 'email']")));
//        txtusername.sendKeys("kurallasravya@gmail.com");
//        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w-full mx-auto']//input[@type = 'password']")));
//        txtpassword.sendKeys("Sravya@123");
        //        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));

        // Click on the login button
        //   loginButton.click();


        //WebElement loginbutton =  mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='w-full px-3']//button[@type='submit'])[1]")));
//        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit' and contains(text(),'Login')])[1]"));
//
//        loginButton.click();
        /*boolean status= driver.findElement(By.xpath("//input[@id ='Data Types']")).isEnabled();
        System.out.println(status);

        WebElement datatypes = driver.findElement(By.xpath("//input[@id ='Data Types']"));
        System.out.println("before selection");
        System.out.println(datatypes.isSelected());
        datatypes.click();
        System.out.println("after selection");
        System.out.println(datatypes.isSelected());*/

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://takeuforward.org/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'w-full mx-auto']//input[@type = 'email']")));
        txtusername.sendKeys("kurallasravya@gmail.com");

        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w-full mx-auto']//input[@type = 'password']")));
        txtpassword.sendKeys("Sravya@123");

        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'w-full mx-auto')]//button[@type='submit'][normalize-space()='Login']")));
        loginButton.click();
        WebElement TFX = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'flex items-center gap-2 ']")));
        TFX.click();
        WebElement access = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'p-4 shadow-[0px_0px_2px_0px_#00000040] group dark:hover:border-[#FCEDEF] hover:border-red-600')]//div[contains(@class,'rounded-full border border-zinc-300 dark:border-[#FCEDEF] group-hover:dark:border-[#FCEDEF] flex flex-row gap-x-2 items-center px-2 py-1 md:px-4 md:py-2 sm:mt-4 mt-auto dark:group-active:bg-[#FCEDEF] group-active:bg-red-600 group group-hover:border-red-600')]")));
        access.click();
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
//
//
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Checkbox Data");

            int rowNum = 0;
            for (WebElement checkbox : checkboxes) {
                Row row = sheet.createRow(rowNum++);
                Cell cell = row.createCell(0);
                cell.setCellValue(checkbox.getText()); // Assuming you want to write the text of the checkbox

                // If you have other data to write, you can add more cells here and set their values accordingly
            }

            // Write the workbook content to a file
            try (FileOutputStream outputStream = new FileOutputStream("CheckboxData.xlsx")) {
                workbook.write(outputStream);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Close the workbook
            workbook.close();

            // Close the WebDriver
            driver.quit();


        }
    }
}
//svg[@class =' w-8 h-8 flex-shrink-0  ml-3  rounded-lg text-sm border  rotate-180 fill-brand text-brand_50 group-hover:text-brand border-brand_20 bg-[#FDEDEA] dark:bg-[#ee4c2b39] dark:border-[#ee4c2b88]']

