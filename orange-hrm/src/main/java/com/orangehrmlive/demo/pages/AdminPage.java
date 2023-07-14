package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
By systemUserText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
By addButton = By.xpath("//button[normalize-space()='Add']");
By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
By userRole = By.xpath("//div[contains(text(),'ESS')]");
By adminRole = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
By enabled = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]");
By status = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]");
By searchButton = By.xpath("//button[@type='submit']");
By noRecords = By.xpath("//span[normalize-space()='No Records Found']");
By checkBox = By.xpath("//div[@role='table']//div[1]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]");

By delete = By.xpath("//button[normalize-space()='Delete Selected']");

By popUpText = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");




public String setSystemUserText(){
    return getTextFromElement(systemUserText);
}
public void setAddButton(){
    clickOnElement(addButton);
}
public void setUserName(String name){
    clickOnElement(userName);
    sendTextToElement(userName, name);
}
public void setUserRole(){
    mouseHoverToElementAndClick(userRole);
    mouseHoverToElementAndClick(adminRole);
}
public void setStatus(){
    mouseHoverToElementAndClick(status);
    mouseHoverToElementAndClick(enabled);
}
public void setSearchButton(){
    clickOnElement(searchButton);
}
public String setNoRecords(){
    return getTextFromElement(noRecords);
}
public void setCheckBox(){
    clickOnElement(checkBox);
}
public void setDelete(){
    clickOnElement(delete);
}
public String setPopUpText(){
    return getTextFromElement(popUpText);
}


}
