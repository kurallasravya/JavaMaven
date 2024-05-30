package seleniumpratice;

import com.sun.source.tree.AssertTree;
import org.apache.poi.hssf.record.CountryRecord;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.nimbus.State;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class CogmentoLogin {
    //  static State ConvertCity(String city){
//      HashMap<String,State> cityMap = new HashMap<String,State>();
//      cityMap.put("Hyderabad",city.HYDERABAD);
//
//    }
//    static HashMap<String, String> objectdata() {
//        HashMap<String, String> hm = new HashMap<String, String>();
//        hm.put("x", "Hyderabad");
//        hm.put("y", "Telangana");
//        hm.put("z", "Bhel");
//        hm.put("k", "502032");
//        hm.put("l", "kurallasravya@gmail.com");
//        hm.put("m", "9346814958");
//        return hm;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://ui.cogmento.com/");
//        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        try {
//            WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
//            Assert.assertTrue(username.isDisplayed(), "Username field is not displayed.");
//            System.out.println("Username field is displayed.");
//            username.sendKeys("kurallasravya@gmail.com");
//
//            WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
//            Assert.assertTrue(password.isDisplayed(), "Password field is not displayed.");
//            System.out.println("Password field is displayed.");
//            password.sendKeys("sravya123");
//
//            WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login']")));
//            loginButton.click();
//            System.out.println("Login button clicked.");
//
//            WebElement companies = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='building icon']")));
//            companies.click();
//            System.out.println("Companies icon clicked.");
//
//            WebElement addDetails = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//button[1]//i[1]")));
//            addDetails.click();
//            System.out.println("Add details button clicked.");
//
//            WebElement names = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
//            names.sendKeys("sravya");
//            System.out.println("Name entered.");
//
//            Thread.sleep(2000);
//
//            driver.findElement(By.xpath("//label[text()='Source']/parent::div/div[@role='listbox']")).click();
//            driver.findElement(By.xpath("//div[@class='visible menu transition']//div[2]")).click();
//            System.out.println("Source selected.");
//
//            driver.findElement(By.xpath("//label[text()='Priority']/parent::div/div[@role='listbox']")).click();
//            driver.findElement(By.xpath("//span[normalize-space()='Medium']")).click();
//            System.out.println("Priority selected.");
//
//            driver.findElement(By.xpath("//label[text()='Status']/parent::div/div[@role='listbox']")).click();
//            driver.findElement(By.xpath("//span[normalize-space()='Active']")).click();
//            System.out.println("Status selected.");
//
//            driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']")).sendKeys("Mobile");
//            System.out.println("Phone type entered.");
//
//            HashMap<String, String> hm = objectdata();
//            String city = hm.get("x");
//            String state = hm.get("y");
//            String address = hm.get("z");
//            String postcode = hm.get("k");
//            String email = hm.get("l");
//            String phno = hm.get("m");
//
//            driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys(city);
//            driver.findElement(By.xpath("//input[@placeholder='State / County']")).sendKeys(state);
//            driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(postcode);
//            driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys(address);
//            driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(email);
//            driver.findElement(By.xpath("//input[@name='value']")).sendKeys(phno);
//            driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//            System.out.println("Form submitted.");
//            WebElement companiesback = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Companies')]")));
//            companiesback.click();
//            System.out.println("Companies icon clicked.");
//            WebElement companiesbac = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Companies')]")));
//            companiesbac.click();
//            System.out.println("Companies icon clicked.");
//Thread.sleep(3000);
//            // Wait for redirection back to the companies page
//            WebElement companiesHeader = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='active']//td[2]")));
//            Assert.assertTrue(companiesHeader.isDisplayed(), "Failed to navigate back to the Companies page.");
//            System.out.println("Navigated back to the Companies page.");
//        } catch (Exception e) {
//            System.err.println("Test failed: " + e.getMessage());
//        } finally {
//            driver.quit();
//        }

    WebDriver driver;
    WebDriverWait mywait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.cogmento.com/");
        mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    static HashMap<String, String> objectdata() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("x", "Hyderabad");
        hm.put("y", "Telangana");
        hm.put("z", "Bhel");
        hm.put("k", "502032");
        hm.put("l", "kurallasravya@gmail.com");
        hm.put("m", "9346814958");
        return hm;
    }

    @Test
    public void loginAndAddCompany() throws InterruptedException {
        WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        Assert.assertTrue(username.isDisplayed(), "Username field is not displayed.");
        username.sendKeys("kurallasravya@gmail.com");

        WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        Assert.assertTrue(password.isDisplayed(), "Password field is not displayed.");
        password.sendKeys("sravya123");

        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login']")));
        loginButton.click();

        WebElement companies = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='building icon']")));
        companies.click();

        WebElement addDetails = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//button[1]//i[1]")));
        addDetails.click();

        WebElement names = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
        names.sendKeys("sravya");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Source']/parent::div/div[@role='listbox']")).click();
        driver.findElement(By.xpath("//div[@class='visible menu transition']//div[2]")).click();

        driver.findElement(By.xpath("//label[text()='Priority']/parent::div/div[@role='listbox']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Medium']")).click();

        driver.findElement(By.xpath("//label[text()='Status']/parent::div/div[@role='listbox']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Active']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']")).sendKeys("Mobile");

        HashMap<String, String> hm = objectdata();
        String city = hm.get("x");
        String state = hm.get("y");
        String address = hm.get("z");
        String postcode = hm.get("k");
        String email = hm.get("l");
        String phno = hm.get("m");

        driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys(city);
        driver.findElement(By.xpath("//input[@placeholder='State / County']")).sendKeys(state);
        driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(postcode);
        driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys(address);
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='value']")).sendKeys(phno);
        driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
        WebElement companiesback = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Companies')]")));
        companiesback.click();
        System.out.println("Companies icon clicked.");
        WebElement companiesbac = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Companies')]")));
        companiesbac.click();
        System.out.println("Companies icon clicked.");
        Thread.sleep(3000);
        // Wait for redirection back to the companies page
        // WebElement companiesHeader = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='active']//td[2]")));

        // Wait for redirection back to the companies page
        WebElement companiesHeader = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Companies')]")));
        Assert.assertTrue(companiesHeader.isDisplayed(), "Failed to navigate back to the Companies page.");


    }


//    public boolean isCompanyExists(String companyName) {
//        List<WebElement> names = driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr"));
//        for (WebElement row : names) {
//            String name = row.findElement(By.xpath(".//td[2]")).getText();
//            //table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr
//            if (name.equals(companyName)) {
//                return true;
//            }
//        }
//        return false;
//    }


    public void verifyEditDeleteViewOptions() {
        // Locate the company in the list and verify the options
        WebElement companyRow = findCompanyRow("sravya");
        Assert.assertNotNull(companyRow, "Company 'sravya' not found in the list.");

        WebElement optionsColumn = companyRow.findElement(By.xpath(".//td[last()]"));

        // Verify and click View option
        WebElement viewButton = optionsColumn.findElement(By.xpath(".//button//i[@class='unhide icon']"));
        Assert.assertTrue(viewButton.isDisplayed(), "View option is not available for the company.");
        viewButton.click();
        // Add verification for the view action here, if necessary

        // Go back to companies list
        driver.navigate().back();

        // Verify and click Delete option
        WebElement deleteButton = optionsColumn.findElement(By.xpath(".//button[@class='ui button icon']//i"));
        Assert.assertTrue(deleteButton.isDisplayed(), "Delete option is not available for the company.");
        deleteButton.click();

        driver.navigate().back();

        // Verify and click Edit option
        WebElement editButton = optionsColumn.findElement(By.xpath(".//button[@class='ui icon inverted button']//i[@class='edit icon']"));
        Assert.assertTrue(editButton.isDisplayed(), "Edit option is not available for the company.");
        editButton.click();
        // Add verification for the edit action here, if necessary
    }

    public WebElement findCompanyRow(String companyName) {
        return driver.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr[td[1][contains(text(),'" + companyName + "')]]"));
    }

    public boolean isCompanyExists(String companyName) {
        try {
            WebElement companyRow = findCompanyRow(companyName);
            return companyRow != null;
        } catch (Exception e) {
            return false;
        }

    }
    public WebElement editoption(String edit) {
        return driver.findElement(By.xpath("//button[@class='ui icon inverted button']//i[@class='unhide icon']"));
    }

    public boolean isEditoptionExists(String edit) {
        try {
            WebElement editop = findCompanyRow(edit);
            return editop != null;
        } catch (Exception e) {
            return false;
        }

    }
}
//button//i[@class='unhide icon']
//button[@class='ui button icon']//i
//button[@class='ui icon inverted button']//i[@class='edit icon']


