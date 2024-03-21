package org.example.pages;
import org.example.locators.HomePageLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = HomePageLocator.LOGOUT_BUTTON)
    private WebElement logoutButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Methods to interact with the home page
    public void clickLogoutButton() {
        logoutButton.click();
    }
}
