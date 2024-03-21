package org.example.tests;
import org.example.pages.LoginPage;
import org.example.pages.HomePage;
import org.example.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.createWebDriver("chrome"); // Initialize WebDriver
    }

    @Test(dataProvider = "dummyData")
    public void loginTest(String username,String password) {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickLogoutButton();
    }

    @DataProvider(name="dummyData")
    public String[] dummyData(){
        return new String[]{"test1","test2"};
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the browser
        }
    }
}
