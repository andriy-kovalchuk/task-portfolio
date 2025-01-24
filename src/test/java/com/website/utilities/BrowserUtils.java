package com.website.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    /**
     * reusable browser utilities methods; already solved for synchronization issues
     * */

    private static final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);

    public static void navigateTo(String url){
        Driver.getDriver().get(url);
        wait.until(ExpectedConditions.urlMatches(url));
    }

    public static void clickElement(WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public static void enterText(WebElement webElement, String textToEnter){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.clear();
        webElement.sendKeys(textToEnter);
    }

    public static String getElementsText(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }
}
