package com.website.pages;

import com.website.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-testid='log-in']")
    public List<WebElement> loginButton;

    public void clickLogin(){
        for(WebElement eachElement: loginButton){
            try{
                eachElement.click();
            }catch (Exception e){}
        }
    }

}
