package org.example.pages;
import org.example.locators.LoginLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = LoginLocator.USERNAME_INPUT_XPATH)
    private WebElement usernameInput;

    @FindBy(xpath=LoginLocator.PASSWORD_INPUT_XPATH)
    private WebElement passwordInput;

    @FindBy(xpath=LoginLocator.LOGIN_BUTTON_XPATH)
    private WebElement loginButton;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Methods to interact with the login page
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
