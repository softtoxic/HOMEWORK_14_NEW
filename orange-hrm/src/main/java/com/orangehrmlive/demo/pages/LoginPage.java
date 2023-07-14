package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By enterUserName = By.xpath("//input[@placeholder='Username']");
    By enterPassword = By.xpath("//input[@placeholder='Password']");

    By loginButton = By.xpath("//button[@type='submit']");
    By orangeHRMlogo = By.xpath("//img[@alt='company-branding']");
    By loginPanel = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");



    public void setEnterUserName(String userName) {
        sendTextToElement(enterUserName, userName);
    }

    public void setEnterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }

    public void setLoginButton() {
        clickOnElement(loginButton);
    }
    public void logoIsDisplayed(){
        driver.findElement(orangeHRMlogo).isDisplayed();
    }
    public String loginPanel(){
        return getTextFromElement(loginPanel);
    }
}
