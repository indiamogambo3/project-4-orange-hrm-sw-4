package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By submit = By.xpath("//button[@type = 'submit']");
    By logo = By.xpath("//img[@alt= 'company-branding']");
    By loginText = By.xpath("//h5[@class = 'oxd-text oxd-text--h5 orangehrm-login-title']");



    public void enterUsername(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(submit);
    }

    public void verifyLogoIsDisplayed() {
        boolean logoDisplayed = driver.findElement(logo).isDisplayed();
        Assert.isTrue(logoDisplayed, "Logo not displayed.");
    }

    public String verifyLoginText() {
        return getTextFromElement(loginText);
    }






}
