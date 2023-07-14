package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By addText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
    By userRole = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By enterUserName = By.xpath("div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']");
    By status = By.xpath("//div[contains(text(),'-- Select --')]");
    By enabled = By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Enabled']");




    public String setAddText() {
        return getTextFromElement(addText);
    }

    public void userRoleField() {
        clickOnElement(userRole);
    }

    public void setEmployeeNameField() {
        clickOnElement(employeeNameField);
    }
    public void setEnterUserName(String userName){
        clickOnElement(enterUserName);
        sendTextToElement(enterUserName, userName);
    }
    public void setStatus(){
       mouseHoverToElementAndClick(status);
       clickOnElement(enabled);
    }
}
