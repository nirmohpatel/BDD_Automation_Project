package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util
{

    // To create Private Variable (for security) + store Locator in private variable
    private By _welComeTitleText = By.xpath("//div/h2[text()=\"Welcome to our store\"]"); // verify user is on home page
    String expectedTitleOfThePage = "Welcome to our store";// message store in string
    private By _registerButton = By.className("ico-register");//Click on registration page


    public void toVerifyUserIsOnHomePage()  //create method to store all relative actions
    {    //Compare (Assert) actual and expected Message + when condition will fail then message will print in console
        Assert.assertEquals(getTextFromElement(_welComeTitleText),expectedTitleOfThePage,"User is not Homepage");
    }

    //create method to store all relative actions
    public void clickOnRegistrationButton()
    {
        clickOnElement(_registerButton);
    }

}
