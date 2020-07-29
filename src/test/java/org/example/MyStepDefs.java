package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs
{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
RegistrationSuccessfully registrationSuccessfully = new RegistrationSuccessfully();


    @Given("^user is on HomePage$")
    public void user_is_on_HomePage()
    {
        homePage.toVerifyUserIsOnHomePage();
    }

    @When("^User click on register$")
    public void user_click_on_register_button()
    {
    homePage.clickOnRegistrationButton();
    }

    @When("^User enter all required registration details$")
    public void user_enter_all_required_registration_details()
    {
       registrationPage.toVerifyUserEnterRegistrationDetails();
    }

    @When("^User click on registerButton$")
    public void user_click_on_register_Button()
    {
        registrationPage.clickOnRegisterButton();
    }

    @Then("^User should able to register successfully$")
    public void user_should_able_to_register_successfully()
    {
        registrationSuccessfully.toVerifyUserIsRegistrationSuccessfulMessage();
        registrationSuccessfully.toVerifyUserClickOnContinueButton();
    }




}
