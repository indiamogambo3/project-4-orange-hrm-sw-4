package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

LoginPage loginPage = new LoginPage();
DashboardPage dashboardPage = new DashboardPage();


    @Test
    public void verifyUserShouldLoginSuccessFully() {

        //Enter username
        loginPage.enterUsername("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Verify "Dashboard" Message
        String expectedDashboardMessage = "Dashboard";
        Assert.assertEquals(dashboardPage.verifyDashboardMessage(), expectedDashboardMessage, "Unable to verify message.");
    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {

        //Verify Logo is Displayed
        loginPage.verifyLogoIsDisplayed();
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {

        //Enter username
        loginPage.enterUsername("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Click on User Profile logo
        dashboardPage.clickOnUserProfileLogo();
        //Mouse hover on "Logout" and click
        Thread.sleep(2000);
        dashboardPage.mouseHoverAndClickOnLogout();
        //Verify the text "Login" is displayed
        String expectedLoginText = "Login";
        Assert.assertEquals(loginPage.verifyLoginText(), expectedLoginText, "Unable to verify text.");
    }





}
