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
    private final String URL = ConfigurationReader.URL;
    private final String USERNAME = ConfigurationReader.USERNAME;
    private final String PASSWORD = ConfigurationReader.PASSWORD;
    private final String EXPECTED_PORTFOLIO_VALUE = ConfigurationReader.EXPECTED_PORTFOLIO_VALUE;


    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        goTo(URL);
    }

    @When("user clicks LogIn button on the main page")
    public void userClicksLogInButtonOnTheMainPage() {
        clickElement(mainPage.loginButton);
    }

    @And("user enters valid username")
    public void userEntersValidUsername() {
        enterText(loginPage.usernameInput, USERNAME);
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        enterText(loginPage.passwordInput, PASSWORD);
    }

    @And("user clicks continue")
    public void userClicksContinue() {
        clickElement(loginPage.continueButton);
    }

    @Then("total portfolio balance must be displayed correctly")
    public void totalPortfolioBalanceMustBeDisplayedCorrectly() {
        assertEquals(EXPECTED_PORTFOLIO_VALUE, getElementsText(accountPage.portfolioBalanceValue), "Total Portfolio balance value was incorrect on account page.");
    }
}
