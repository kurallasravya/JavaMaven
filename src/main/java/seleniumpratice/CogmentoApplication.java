package seleniumpratice ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class CogmentoApplication {


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

        @Test
        public void verifyCompanyExists() throws InterruptedException {
            WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
            username.sendKeys("kurallasravya@gmail.com");

            WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
            password.sendKeys("sravya123");

            WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login']")));
            loginButton.click();

            WebElement companies = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='building icon']")));
            companies.click();

            // Debugging: Print the page source
            System.out.println(driver.getPageSource());

            // Adjust timeout and verify the XPath
            mywait = new WebDriverWait(driver, Duration.ofSeconds(60));
            WebElement companiesHeader = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Companies']")));
            Assert.assertNotNull(companiesHeader, "Companies header is not visible.");

            // Check if the company name "sravya" exists in the list
            boolean companyExists = isCompanyExists("sravya");
            Assert.assertTrue(companyExists, "Company name 'sravya' does not exist in the companies list.");
        }

        @Test(dependsOnMethods = "verifyCompanyExists")
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
            // Add confirmation and verification for the delete action here, if necessary

            // Go back to companies list if delete action requires confirmation handling
            driver.navigate().back();

            // Verify and click Edit option
            WebElement editButton = optionsColumn.findElement(By.xpath(".//button[@class='ui icon inverted button']//i[@class='edit icon']"));
            Assert.assertTrue(editButton.isDisplayed(), "Edit option is not available for the company.");
            editButton.click();
            // Add verification for the edit action here, if necessary
        }

        private WebElement findCompanyRow(String companyName) {
            List<WebElement> companyRows = driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr"));
            for (WebElement row : companyRows) {
                String name = row.findElement(By.xpath(".//td[2]")).getText();
                if (name.equals(companyName)) {
                    return row;
                }
            }
            return null;
        }

        private boolean isCompanyExists(String companyName) {
            WebElement companyRow = findCompanyRow(companyName);
            return companyRow != null;
        }
    }

