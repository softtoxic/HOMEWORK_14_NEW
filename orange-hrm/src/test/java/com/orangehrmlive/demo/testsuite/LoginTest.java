package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {
        //  Enter username
        loginPage.setEnterUserName("Admin");
        //  Enter password
        loginPage.setEnterPassword("admin123");
        //  Click on Login Button
        loginPage.setLoginButton();
        //  Verify "Dashboard" Message
        String actualText = homePage.setDashBoardText();
        String expectedText = "Dashboard";
        Assert.assertEquals(expectedText, actualText, "Text not verified");
    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        // Launch the application
        // Verify Logo is Displayed
        loginPage.logoIsDisplayed();

    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() {
        // Login To The application
        loginPage.setEnterUserName("Admin");
        loginPage.setEnterPassword("admin123");
        loginPage.setLoginButton();
        // Click on User Profile logo
        // Mouse hover on "Logout" and click
        homePage.setLogout();
        // Verify the text "Login Panel" is displayed
        String expectedText = "Login";
        String actualText = loginPage.loginPanel();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
    }
}
