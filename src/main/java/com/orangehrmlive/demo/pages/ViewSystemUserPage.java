package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {

    By textSystemUser = By.tagName("h5");
    By addButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    By userNameField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userNameDropDown = By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
    By adminFromDropDown = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By verifyUserName = By.xpath("//div[@class='oxd-table-card']//div[2]//div[1]");
    By checkboxLink = By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButton = By.xpath("//i[@class='oxd-icon bi-trash']");
    By noRecordsFoundText = By.xpath("//span[text()='No Records Found']");


    public String verifySystemUsersText() {
        return getTextFromElement(textSystemUser);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    public void enterUsername(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void clickSelectUserRoleDropDown() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(userNameDropDown);
    }

    public void selectStatus() {
        clickOnElement(adminFromDropDown);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String verifyUserIsInResultList() {
        return getTextFromElement(verifyUserName);
    }

    public void clickOnCheckbox() {
        clickOnElement(checkboxLink);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
    }

    public void clickOKOnPopup () {
        acceptAlert();
    }

    public String verifySuccessfullyDeletedMessage() {
        return getTextFromAlert();
    }
    public String verifyNoRecordsFoundMessage() {
        return getTextFromElement(noRecordsFoundText);
    }

}
