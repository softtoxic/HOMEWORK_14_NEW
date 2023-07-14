package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By dashBoardText = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

By userProfile = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
By logout = By.xpath("//a[@class='oxd-userdropdown-link' and text()= 'Logout']");







public String setDashBoardText(){
    return getTextFromElement(dashBoardText);
}
public void setLogout(){
    clickOnElement(userProfile);
    clickOnElement(logout);
}
}
