package com.virgingames.steps;

import com.virgingames.pages.CasinoPage;
import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class MyStepdefs {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I Accept Cookies All")
    public void iAcceptCookiesAll() throws InterruptedException{
        new HomePage().setAcceptCookies();
    }

    @Then("i should see the Welcome Text")
    public void iShouldSeeTheWelcomeText() {
        Assert.assertEquals(new HomePage().verifyWelcomeText(), "Welcome to Virgin Games", "Unable to Verify");
    }

    @And("I click on casino tab")
    public void iClickOnCasinoTab() {
        new HomePage().clickOnCasinoTab();
    }

    @Then("I should see the Welcome Message on page")
    public void iShouldSeeTheWelcomeMessageOnPage() {
        Assert.assertEquals(new CasinoPage().getPlayOnlineCasinoText(), "Play Online Casino Games, with Many Classics to Choose From", "Not Verify");
    }
}
