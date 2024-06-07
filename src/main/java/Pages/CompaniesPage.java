package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;

public class CompaniesPage extends BasePage {
    private By companiesIconLocator = By.xpath("//i[@class='building icon']");
    private By addDetailsButtonLocator = By.xpath("//div[4]//button[1]//i[1]");
    private By nameFieldLocator = By.xpath("(//input[@autocomplete='new-password'])[1]");
    private By sourceDropdownLocator = By.xpath("//label[text()='Source']/parent::div/div[@role='listbox']");
    private By sourceOptionLocator = By.xpath("//div[@class='visible menu transition']//div[2]");
    private By priorityDropdownLocator = By.xpath("//label[text()='Priority']/parent::div/div[@role='listbox']");
    private By priorityOptionLocator = By.xpath("//span[normalize-space()='Medium']");
    private By statusDropdownLocator = By.xpath("//label[text()='Status']/parent::div/div[@role='listbox']");
    private By statusOptionLocator = By.xpath("//span[normalize-space()='Active']");
    private By phoneFieldLocator = By.xpath("//input[@placeholder='Home, Work, Mobile...']");
    private By cityFieldLocator = By.xpath("//input[@placeholder='City']");
    private By stateFieldLocator = By.xpath("//input[@placeholder='State / County']");
    private By postcodeFieldLocator = By.xpath("//input[@placeholder='Post Code']");
    private By addressFieldLocator = By.xpath("//input[@placeholder='Street Address']");
    private By emailFieldLocator = By.xpath("//input[@placeholder='Email address']");
    private By phoneNumberFieldLocator = By.xpath("//input[@name='value']");
    private By saveButtonLocator = By.xpath("//button[@class='ui linkedin button']");
    private By companiesHeaderLocator = By.xpath("//span[contains(text(),'Companies')]");
    private By deleteButtonLocator = By.xpath("//a[text()='sravya']//ancestor::tr//button[contains(@class, 'ui button icon')]//i[@class='trash icon']");

    public CompaniesPage(WebDriver driver) {
        super(driver);
    }

    public void clickCompaniesIcon() {
        WebElement companiesIcon = mywait.until(ExpectedConditions.elementToBeClickable(companiesIconLocator));
        companiesIcon.click();
    }

    public void clickAddDetailsButton() {
        WebElement addDetailsButton = mywait.until(ExpectedConditions.elementToBeClickable(addDetailsButtonLocator));
        addDetailsButton.click();
    }

    public void enterCompanyName(String name) {
        WebElement nameField = mywait.until(ExpectedConditions.visibilityOfElementLocated(nameFieldLocator));
        nameField.sendKeys(name);
    }

    public void selectSource() {
        driver.findElement(sourceDropdownLocator).click();
        driver.findElement(sourceOptionLocator).click();
    }

    public void selectPriority() {
        driver.findElement(priorityDropdownLocator).click();
        driver.findElement(priorityOptionLocator).click();
    }

    public void selectStatus() {
        driver.findElement(statusDropdownLocator).click();
        driver.findElement(statusOptionLocator).click();
    }

    public void enterPhoneDetails(String phone) {
        driver.findElement(phoneFieldLocator).sendKeys(phone);
    }

    public void enterCompanyDetails(HashMap<String, String> companyDetails) {
        driver.findElement(cityFieldLocator).sendKeys(companyDetails.get("x"));
        driver.findElement(stateFieldLocator).sendKeys(companyDetails.get("y"));
        driver.findElement(postcodeFieldLocator).sendKeys(companyDetails.get("k"));
        driver.findElement(addressFieldLocator).sendKeys(companyDetails.get("z"));
        driver.findElement(emailFieldLocator).sendKeys(companyDetails.get("l"));
        driver.findElement(phoneNumberFieldLocator).sendKeys(companyDetails.get("m"));
    }

    public void clickSaveButton() {
        driver.findElement(saveButtonLocator).click();
    }

    public void verifyNavigationBackToCompanies() {
        WebElement companiesHeader = mywait.until(ExpectedConditions.visibilityOfElementLocated(companiesHeaderLocator));
        Assert.assertTrue(companiesHeader.isDisplayed(), "Failed to navigate back to the Companies page.");
    }

    public void deleteCompany(String companyName) throws InterruptedException {
        try {
            WebElement deleteButton = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='" + companyName + "']//ancestor::tr//button[contains(@class, 'ui button icon')]//i[@class='trash icon']")));
            deleteButton.click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='ui red button']//i")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//i[@class='trash alternate outline icon']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[normalize-space()='Company (70)']")).click();
            Thread.sleep(5000);
            List<WebElement> checkboxes = driver.findElements(By.xpath("//a[text() = 'sravya']/preceding::input[@type = 'checkbox'][1]"));

            for (WebElement chbox : checkboxes) {
                chbox.click();
            }
        } catch (Exception e) {
            System.out.println("Failed to delete company with name '" + companyName + "'. Exception: " + e.getMessage());
        }
    }
}
