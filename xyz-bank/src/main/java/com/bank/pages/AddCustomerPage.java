package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");
    By clickOnAdd = By.xpath("//button[@type='submit']");




    public void setAddCustomer(){
        clickOnElement(addCustomer);
    }
    public void setEnterFirstName(String name){
        sendTextToElement(enterFirstName, name);
    }
    public void setEnterLastName(String name){
        sendTextToElement(enterLastName, name);
    }
    public void setEnterPostCode(String postCode){
        sendTextToElement(enterPostCode, postCode);
    }
    public void setClickOnAdd(){
        clickOnElement(clickOnAdd);
    }
}
