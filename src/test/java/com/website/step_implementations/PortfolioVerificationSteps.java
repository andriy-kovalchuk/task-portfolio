package com.website.step_implementations;

import com.website.pages.AccountPage;
import com.website.pages.LoginPage;
import com.website.pages.MainPage;
import com.website.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import static com.website.utilities.BrowserUtils.*;
import static org.junit.Assert.*;

public class PortfolioVerificationSteps {

    private final MainPage mainPage = new MainPage();
    private final LoginPage loginPage = new LoginPage();
    private final AccountPage accountPage = new AccountPage();

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        navigateTo(ConfigurationReader.URL);
    }

    @When("user clicks LogIn button on the main page")
    public void userClicksLogInButtonOnTheMainPage() {
        mainPage.clickLogin();
    }

    @And("user enters valid username")
    public void userEntersValidUsername() {
        enterText(loginPage.usernameInput, ConfigurationReader.USERNAME);
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        enterText(loginPage.passwordInput, ConfigurationReader.PASSWORD);
    }

    @And("user clicks continue")
    public void userClicksContinue() {
        clickElement(loginPage.continueButton);
    }

    @Then("total portfolio balance must be displayed correctly")
    public void totalPortfolioBalanceMustBeDisplayedCorrectly() {
        assertEquals("Total Portfolio balance value was incorrect on account page.", ConfigurationReader.EXPECTED_PORTFOLIO_VALUE, getElementsText(accountPage.portfolioBalanceValue));
    }
}
