package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
public class CogmentoLoginTest {
    WebDriver driver;
    LoginPage loginPage;
    CompaniesPage companiesPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.cogmento.com/");
        loginPage = new LoginPage(driver);
        companiesPage = new CompaniesPage(driver);
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
        loginPage.enterUsername("kurallasravya@gmail.com");
        loginPage.enterPassword("sravya123");
        loginPage.clickLoginButton();

        companiesPage.clickCompaniesIcon();
        companiesPage.clickAddDetailsButton();
        companiesPage.enterCompanyName("sravya");

        Thread.sleep(2000);

        companiesPage.selectSource();
        companiesPage.selectPriority();
        companiesPage.selectStatus();
        companiesPage.enterPhoneDetails("Mobile");

        HashMap<String, String> companyDetails = objectdata();
        companiesPage.enterCompanyDetails(companyDetails);
        companiesPage.clickSaveButton();

        Thread.sleep(2000);
        companiesPage.verifyNavigationBackToCompanies();

        String companyName = "sravya";
        companiesPage.deleteCompany(companyName);
    }
}
