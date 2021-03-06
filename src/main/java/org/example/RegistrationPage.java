package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Util
{
    LoadProp loadProp = new LoadProp();

    private By _registerPageText = By.xpath("//div/strong[text()=\"Your Personal Details\"]");
    // To create Private Variable (for security) + store Locator in private variable
    String expectedTextMassage = "Your Personal Details";   // message store in string
    // To create Private Variable (for security) + store Locator in private variable
    private By _gender = By.cssSelector("input#gender-male");
    // To create Private Variable (for security) + store Locator in private variable
    private By _firstName = By.cssSelector("input#FirstName");
    // To create Private Variable (for security) + store Locator in private variable
    private By _lastName = By.id("LastName");
    // To create Private Variable (for security) + store Locator in private variable
    private By _dateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    // To create Private Variable (for security) + store Locator in private variable
    private By _dateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    // To create Private Variable (for security) + store Locator in private variable
    private By _dateOfBirthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    // To create Private Variable (for security) + store Locator in private variable
    private By _email = By.cssSelector("input#Email");
    // To create Private Variable (for security) + store Locator in private variable
    private By _company = By.cssSelector("input#Company");
    // To create Private Variable (for security) + store Locator in private variable
    private By _newsLetter = By.cssSelector("input#Newsletter");
    // To create Private Variable (for security) + store Locator in private variable
    private By _password = By.cssSelector("input#Password");
    // To create Private Variable (for security) + store Locator in private variable
    private By _confirmPassword = By.cssSelector("input#ConfirmPassword");
    // To create Private Variable (for security) + store Locator in private variable
    private By _registerButton = By.cssSelector("input#register-button");

    //create method to store all relative actions
    public void toVerifyUserIsOnRegistrationPage()
    {   //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_registerPageText),expectedTextMassage, "user is not on Registration page");
    }
    //create method to store all relative actions
    public void toVerifyUserEnterRegistrationDetails()
    {  // add explicitly wait to allow some extra time before action
        waitUntilElementIsClickAble(_registerButton,40);
        clickOnElement(_gender);  // click on radio button
        //threadSleep(); // // add threadSleep to check Locator is correct
        // add explicitly wait to allow some extra time before action
        waitUntilElementIsClickAble(_firstName,60);
        typeText(_firstName, loadProp.getProperty("FirstName")); // enter user name
        typeText(_lastName, loadProp.getProperty("LastName")); // enter user last name
        selectFromDropDownByIndex(_dateOfBirthday, 2); // select date of Birth Day from Dropdown Menu
        selectFromDropDownByVisibleText(_dateOfBirthMonth, "June"); // select Month of Birth from Dropdown Menu
        selectFromDropDownByValue(_dateOfBirthYear, "2007"); // select year of Birth from Dropdown Menu
        typeText(_email, loadProp.getProperty("Email")); // Enter your Email id
        typeText(_company,loadProp.getProperty("CompanyName")); // Enter Company Name
        waitUntilElementIsClickAble(_newsLetter,40);
        clickOnElement(_newsLetter); // click on Check out Button
        typeText(_password,loadProp.getProperty("Password")); // Enter Password
        typeText(_confirmPassword, loadProp.getProperty("ConfirmPassword")); // Enter Conform Password
     }
    //create method to store all relative actions + click on Register Button
    public void clickOnRegisterButton()
    {
        clickOnElement(_registerButton);
    }
}
