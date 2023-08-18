package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to Virgin Games')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Casino']")
    WebElement casinoTab;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement acceptCookies;


    public String verifyWelcomeText() {
        log.info("Getting text from element" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnCasinoTab() {
        log.info("click on casino tab" + casinoTab);
        clickOnElement(casinoTab);
    }

    public void setAcceptCookies() throws InterruptedException {
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
}
