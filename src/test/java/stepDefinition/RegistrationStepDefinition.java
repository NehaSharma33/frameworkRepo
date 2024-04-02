package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Registration;
import utils.WebDriverFactory;

public class RegistrationStepDefinition {

    Registration registration = new Registration(WebDriverFactory.getDriver());
    @Given("I click on registration link")
    public void iClickOnRegistrationLink() {
        registration.clickRegistrationLink();
    }

    @When("I fill in the registration form with valid details")
    public void iFillInTheRegistrationFormWithValidDetails() {
        registration.fillRegistrationForm();
    }

    @And("I submit the registration form")
    public void iSubmitTheRegistrationForm() {
        registration.submitRegistrationForm();
    }

    @Then("I should be registered successfully")
    public void iShouldBeRegisteredSuccessfully() {
        registration.registeredSuccessfully();
    }


}
