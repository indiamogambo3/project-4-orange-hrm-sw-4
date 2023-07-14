package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By verifyAddUser = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleDropdownButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
//    By admin = By.cssSelector("div[class='oxd-grid-2 orangehrm-full-width-grid'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1)");
    By admin = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By usernameField = By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By statusRoleDropdownButton = By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By statusDisable = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
By passwordField = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
By confirmPasswordField = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
By saveButton = By.xpath("//button[normalize-space()='Save']");



    public String verifyAddUserText() {
        return getTextFromElement(verifyAddUser);
    }

    public void selectUserRoleDropDownButtonAdmin() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(userRoleDropdownButton);
    }

    public void mouseHoverAndClickOnAdmin() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(admin);
    }

    public void enterEmployeeName(String employeeName) {
        sendTextToElement(employeeNameField, employeeName);
    }

    public void enterUsername(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void selectStatusDropdownButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(statusRoleDropdownButton);
    }

    public void mouseHoverAndClickOnDisabled() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(statusDisable);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }

    public String verifySuccessfullySavedMessage() {
        return getTextFromAlert();
    }




}
