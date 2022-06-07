package com.bol.stepdefinitions;

import com.bol.base.BasePage;
import com.bol.pages.HomePage;
import com.bol.pages.KlantenservicePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class KlantenservicePageSD {

    @And("User click Klantenservice page button")
    public void userClickKlantenservicePageButton() throws InterruptedException{
        HomePage.clickKlantenservice();
    }

    @Then("verify if Klantenservice url is expected")
    public void verifyIfKlantenserviceUrlIsExpected() {
        String expectedURL = "https://www.bol.com/be/nl/klantenservice/index.html";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL: " + HomePage.verifyURL());
    }

    @And("user test Bestellen Button")
    public void userTestBestellenButton() {
    }

    @And("user test Retourneren Button")
    public void userTestRetournerenButton() {
    }

    @And("user test Garantie&Reparatie Button")
    public void userTestGarantieReparatieButton() {
    }

    @Then("user sees Contactformulier")
    public void userSeesContactformulier() {
    }

    @And("user click Chat met Billie Button")
    public void userClickChatMetBillieButton() {
    }

    @Then("user sees Chat met Billie Popup")
    public void userSeesChatMetBilliePopup() {
    }
}