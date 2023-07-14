package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By verifyTextDashboard = By.xpath("//h6[text() = 'Dashboard']");
    By userProfile = By.xpath("//p[@class = 'oxd-userdropdown-name']");
    By logout = By.xpath("//a[contains(text(),'Logout')]");
    By admin = By.xpath("//span[text() = 'Admin']");


    public String verifyDashboardMessage(){
        return getTextFromElement(verifyTextDashboard);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfile);
    }

    public void mouseHoverAndClickOnLogout() {
        mouseHoverToElementAndClick(logout);
    }

    public void clickOnAdminTab() {
        clickOnElement(admin);
    }


}
