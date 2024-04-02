package pages;
import com.feature.locators.LoginLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
private WebDriver driver;
    @FindBy(xpath = LoginLocator.USERNAME_INPUT_XPATH)
    private WebElement usernameInput;

    @FindBy(xpath=LoginLocator.PASSWORD_INPUT_XPATH)
    private WebElement passwordInput;

    @FindBy(xpath=LoginLocator.LOGIN_BUTTON_XPATH)
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
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

    public void calculateAmount(String a, String b)
    {
        int c= Integer.parseInt(a+b);
    }
    public void balanceAmount(String a)
    {
        System.out.println("balance amount done");
    }

    public String getTitle()
    {
        return driver.getTitle();
    }
}
