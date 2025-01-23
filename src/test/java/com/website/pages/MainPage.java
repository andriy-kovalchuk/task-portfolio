package com.website.pages;

import com.website.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"collaboratively_reconceptualize-off\"]/div/div/header[2]/div/nav/ul[2]/li[1]/a")
    public WebElement loginButton;
}
