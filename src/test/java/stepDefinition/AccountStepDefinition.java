package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.WebDriverFactory;

public class AccountStepDefinition {
    private int accountBalance;
    private int withdrawnAmount;
    LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());

    @Given("I have a balance of {string} in my account")
    public void iHaveABalanceOfInMyAccount(String initialBalance) {
        WebDriverFactory.getDriver()
                .get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        String title = loginPage.getTitle();
        System.out.println("title----"+title);
        loginPage.balanceAmount(initialBalance);
    }

    @When("I request {string}")
    public void iRequest(String withdrawalAmount) {
        loginPage.calculateAmount(withdrawalAmount,withdrawalAmount);
    }

    @Then("{string} should be dispensed")
    public void shouldBeDispensed(String dispensedAmount) {
        Assert.assertEquals("Incorrect amount dispensed", dispensedAmount, withdrawnAmount);
    }


}
