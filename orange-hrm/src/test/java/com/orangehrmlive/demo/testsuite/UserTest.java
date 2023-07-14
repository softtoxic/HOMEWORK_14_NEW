package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        // Login to Application
        loginPage.setEnterUserName("Admin");
        loginPage.setEnterPassword("admin123");
        loginPage.setLoginButton();
        //	click On "Admin" Tab
        dashboardPage.setAdminButton();
        //	Verify "System Users" Text
        String expectedText = "System Users";
        String actualText = adminPage.setSystemUserText();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
        //	click On "Add" button
        adminPage.setAddButton();
        //	Verify "Add User" Text
        String actualAddText = addUserPage.setAddText();
        String expectedAddText = "Add User";
        Assert.assertEquals(expectedAddText, actualAddText, "Text not verified");
        //	Select User Role "Admin"
        addUserPage.userRoleField();
        //	enter Employee Name "Lisa  Andrews"
       addUserPage.setEmployeeNameField();
       Thread.sleep(3000);
        //	enter Username
        addUserPage.setEnterUserName("lisa.and");
        Thread.sleep(3000);
        //	Select status "Disable"
        addUserPage.setStatus();
        //	enter password
        //	enter Confirm Password
        //	click On "Save" Button
        //	verify message "Successfully Saved"
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        // Login to Application
        loginPage.setEnterUserName("Admin");
        loginPage.setEnterPassword("admin123");
        loginPage.setLoginButton();
        //	click On "Admin" Tab
        dashboardPage.setAdminButton();
        //	Verify "System Users" Text
        String expectedText = "System Users";
        String actualText = adminPage.setSystemUserText();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
        //	Enter Username
        adminPage.setUserName("");
        //	Select User Role
        adminPage.setUserRole();
        //	Select Status
        adminPage.setStatus();
        //	Click on "Search" Button
        adminPage.setSearchButton();
        //	Verify the User should be in Result list.
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {

        // Login to Application
        loginPage.setEnterUserName("Admin");
        loginPage.setEnterPassword("admin123");
        loginPage.setLoginButton();
        //	click On "Admin" Tab
        dashboardPage.setAdminButton();
        //	Verify "System Users" Text
        String expectedText = "System Users";
        String actualText = adminPage.setSystemUserText();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
        //	Enter Username
        adminPage.setUserName("");
        //	Select User Role
        adminPage.setUserRole();
        //	Select Status
        adminPage.setStatus();
        //	Click on "Search" Button
        adminPage.setSearchButton();
        //	Verify the User should be in Result list.
        Thread.sleep(5000);
        //	Click on Check box
        adminPage.setCheckBox();
        //	Click on Delete Button
        Thread.sleep(5000);
        adminPage.setDelete();

        //	Popup will display

        //	Click on Ok Button on Popup
        adminPage.acceptAlert();
        //	verify message "Successfully Deleted"
        String actualPopUp = adminPage.setPopUpText();
        String expectedPopUp = "Successfully Deleted";
        Assert.assertEquals(expectedPopUp, actualPopUp, "Text not verified");
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        // Login to Application
        loginPage.setEnterUserName("Admin");
        loginPage.setEnterPassword("admin123");
        loginPage.setLoginButton();
        //	click On "Admin" Tab
        dashboardPage.setAdminButton();
        //	Verify "System Users" Text
        String expectedText = "System Users";
        String actualText = adminPage.setSystemUserText();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
        //	Enter Username
        adminPage.setUserName("Jaydip");
        //	Select User Role
        adminPage.setUserRole();
        //	Select Status
        adminPage.setStatus();
        //	Click on "Search" Button
        adminPage.setSearchButton();
        //	verify message "No Records Found"
        String expectedRecords = "No Records Found";
        String actualRecords = adminPage.setNoRecords();
        Assert.assertEquals(expectedRecords, actualRecords, "Text not verified");
    }
}
