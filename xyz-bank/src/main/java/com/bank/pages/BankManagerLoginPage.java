package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    By searchUser = By.xpath("//select[@id='userSelect']");
    By selectCurrency = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[@type='submit']");




    public void setOpenAccount(){
        clickOnElement(openAccount);
    }
    public void setSearchUser(String DropDown){
        selectByVisibleTextFromDropDown(searchUser, DropDown);
    }
    public void setSelectCurrency(String currency){
        selectByVisibleTextFromDropDown(selectCurrency, currency);
    }
    public void setProcessButton(){
        clickOnElement(processButton);
    }
}
