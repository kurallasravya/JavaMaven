package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By usernameLocator = By.xpath("//input[@type='text']");
    private By passwordLocator = By.xpath("//input[@type='password']");
    private By loginButtonLocator = By.xpath("//div[text()='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        WebElement usernameField = mywait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocator));
        Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed.");
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = mywait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        Assert.assertTrue(passwordField.isDisplayed(), "Password field is not displayed.");
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
        loginButton.click();
    }
}
