package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        //  click On "Bank Manager Login" Tab
        homePage.setManagerLogin();
        //	click On "Add Customer" Tab
        addCustomerPage.setAddCustomer();
        //	enter FirstName
        addCustomerPage.setEnterFirstName("abc");
        //	enter LastName
        addCustomerPage.setEnterLastName("xyz");
        //	enter PostCode
        addCustomerPage.setEnterPostCode("395008");
        //	click On "Add Customer" Button
        addCustomerPage.setClickOnAdd();
        //	popup display
        addCustomerPage.getTextFromAlert();
        //	verify message "Customer added successfully"
        String actualText = addCustomerPage.getTextFromAlert();
        String expectedText = "Customer added successfully with customer id :6";
        Assert.assertEquals(actualText, expectedText, "Text not verified");
        //	click on "ok" button on popup.
        addCustomerPage.acceptAlert();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        // click On "Bank Manager Login" Tab
        homePage.setManagerLogin();
        //	click On "Open Account" Tab
        bankManagerLoginPage.setOpenAccount();
        //	Search customer that created in first test
        bankManagerLoginPage.setSearchUser("Hermoine Granger");
        //	Select currency "Pound"
        bankManagerLoginPage.setSelectCurrency("Pound");
        //	click on "process" button
        bankManagerLoginPage.setProcessButton();
        //	popup displayed
        bankManagerLoginPage.getTextFromAlert();
        //	verify message "Account created successfully"
        String actualText = bankManagerLoginPage.getTextFromAlert();
        String expectedText = "Account created successfully with account Number :1016";
        Assert.assertEquals(actualText, expectedText, "Text not verified");
        //	click on "ok" button on popup.
        bankManagerLoginPage.acceptAlert();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        // click on "Customer Login" Tab
        homePage.setCustomerLogin();
        //	search customer that you created.
        customerLoginPage.setSearchCustomer("Hermoine Granger");
        //	click on "Login" Button
        customerLoginPage.setLoginButton();
        //	verify "Logout" Tab displayed.
        String actualText = "Logout";
        String expectedText = customerLoginPage.setLogout();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
        //	click on "Logout"
        customerLoginPage.setLogoutButton();
        //	verify "Your Name" text displayed.
        String actualText1 = "Logout";
        String expectedText1 = customerLoginPage.setYourName();
        Assert.assertEquals(expectedText, actualText, "Text not verified");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        // click on "Customer Login" Tab
        homePage.setCustomerLogin();
        //	search customer that you created.
        customerLoginPage.setSearchCustomer("Hermoine Granger");
        // 	click on "Login" Button
        customerLoginPage.setLoginButton();
        //	click on "Deposit" Tab
        customerLoginPage.setDepositButton();
        //	Enter amount 100
        customerLoginPage.setAmount("100");
        //	click on "Deposit" Button
        customerLoginPage.setDeposit();
        //	verify message "Deposit Successful"
        String actualMessage = customerLoginPage.setDepositMessage();
        String expectedMessage = "Deposit Successful";
        Assert.assertEquals(expectedMessage, actualMessage, "Text not verified");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        // click on "Customer Login" Tab
        homePage.setCustomerLogin();
        //	search customer that you created.
        customerLoginPage.setSearchCustomer("Hermoine Granger");
        //	click on "Login" Button
        customerLoginPage.setLoginButton();
        //	click on "Withdrawl" Tab
        customerLoginPage.setWithdrawl();
        //	Enter amount 50
        customerLoginPage.setWithdrawlAmount("50");
        //	click on "Withdraw" Button
        customerLoginPage.setClickWithdraw();
        //	verify message "Transaction Successful"
        String actualMessage = customerLoginPage.setWithdrawMessage();
        String expectedMessage = "Transaction successful";
        Assert.assertEquals(expectedMessage, actualMessage, "Text not verified");
    }

}
