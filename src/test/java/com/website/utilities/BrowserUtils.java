package com.website.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    /**
     * reusable browser utilities methods; already solved for synchronization issues
     * */

    public static void goTo(String url){
        Driver.getDriver().get(url);
    }

    public static void clickElement(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    public static void enterText(WebElement webElement, String textToEnter){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(textToEnter);
    }

    public static String getElementsText(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }
}
