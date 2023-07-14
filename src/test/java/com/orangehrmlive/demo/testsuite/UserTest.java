package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {

        //Enter username
        loginPage.enterUsername("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        //Verify "System Users" Text
        String expectedSystemUserText = "System Users";
        Assert.assertEquals(viewSystemUserPage.verifySystemUsersText(), expectedSystemUserText, "Unable to verify text.");
        //click On "Add" button
        viewSystemUserPage.clickOnAddButton();
        //Verify "Add User" Text
        String expectedAddUserText = "Add User";
        Assert.assertEquals(addUserPage.verifyAddUserText(), expectedAddUserText, "Unable to verify text.");
        //Select User Role "Admin"
        addUserPage.selectUserRoleDropDownButtonAdmin();
        addUserPage.mouseHoverAndClickOnAdmin();
        //enter Employee Name "Lisa Andrews"
        addUserPage.enterEmployeeName("Ananya Dash");
        //enter Username
        addUserPage.enterUsername("L.Andrews");
        //Select status "Disable"
        addUserPage.selectStatusDropdownButton();
        addUserPage.mouseHoverAndClickOnDisabled();
        //enter password
        addUserPage.enterPassword("Mukz1234");
        //enter Confirm Password
        addUserPage.enterConfirmPassword("Mukz1234");
        //click On "Save" Button
        addUserPage.clickOnSaveButton();
//        String expectedSuccessfullySaveMessage = "Successfully Saved";
//        Assert.assertEquals(addUserPage.verifySuccessfullySavedMessage(), expectedSuccessfullySaveMessage, "Unable to verify message.");
    }


    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {

        //Enter username
        loginPage.enterUsername("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        //Verify "System Users" Text
        String expectedSystemUserText = "System Users";
        Assert.assertEquals(viewSystemUserPage.verifySystemUsersText(), expectedSystemUserText, "Unable to verify text.");
        //Enter Username
        viewSystemUserPage.enterUsername("Admin");
        //Select User Role
        viewSystemUserPage.clickSelectUserRoleDropDown();
        //Select Status
        viewSystemUserPage.selectStatus();
        //Click on "Search" Button
        viewSystemUserPage.clickOnSearchButton();
        //Verify the User should be in Result list.
        Thread.sleep(2000);
        String expectedUser = "Admin";
        Assert.assertEquals(viewSystemUserPage.verifyUserIsInResultList(), expectedUser, "Unable to verify text.");
    }
    @Test

    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {

        //Enter username
        loginPage.enterUsername("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        //Verify "System Users" Text
        String expectedSystemUserText = "System Users";
        Assert.assertEquals(viewSystemUserPage.verifySystemUsersText(), expectedSystemUserText, "Unable to verify text.");
        //Enter Username
        viewSystemUserPage.enterUsername("Admin");
        //Select User Role
        viewSystemUserPage.clickSelectUserRoleDropDown();
        //Select Status
        viewSystemUserPage.selectStatus();
        //Click on "Search" Button
        viewSystemUserPage.clickOnSearchButton();
        //Verify the User should be in Result list.
        Thread.sleep(2000);
        String expectedUser = "Admin";
        Assert.assertEquals(viewSystemUserPage.verifyUserIsInResultList(), expectedUser, "Unable to verify text.");
        //Click on Check box
        viewSystemUserPage.clickOnCheckbox();
        //Click on Delete Button
        viewSystemUserPage.clickOnDeleteButton();
        //Click on Ok Button on Popup
//        Thread.sleep(2000);
//        viewSystemUserPage.clickOKOnPopup();
        //verify message "Successfully Deleted"
//        String expectedSuccessfullyDeletedMessage = "Successfully Deleted";
//        Assert.assertEquals(viewSystemUserPage.verifySuccessfullyDeletedMessage(), expectedSuccessfullyDeletedMessage, "Unable to verify message.");
    }
    @Test

    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {

        //Enter username
        loginPage.enterUsername("Admin");
        //Enter password
        loginPage.enterPassword("admin123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        //Verify "System Users" Text
        String expectedSystemUserText = "System Users";
        Assert.assertEquals(viewSystemUserPage.verifySystemUsersText(), expectedSystemUserText, "Unable to verify text.");
        //Enter Username
        viewSystemUserPage.enterUsername("Admin");
        //Select User Role
        viewSystemUserPage.clickSelectUserRoleDropDown();
        //Select Status
        viewSystemUserPage.selectStatus();
        //Click on "Search" Button
        viewSystemUserPage.clickOnSearchButton();
        //verify message "No Records Found"
//        String expectedNoRecordsFoundText = "No Records Found";
//        Assert.assertEquals(viewSystemUserPage.verifyNoRecordsFoundMessage(), expectedNoRecordsFoundText, "Unable to verify text.");
    }


}
