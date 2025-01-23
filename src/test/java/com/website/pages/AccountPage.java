package com.website.pages;

import com.website.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='flex items-baseline'] span[class*='text-ds-primary']")
    public WebElement portfolioBalanceValue;

}
