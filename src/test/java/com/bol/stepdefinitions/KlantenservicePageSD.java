package com.bol.stepdefinitions;

import com.bol.base.BasePage;
import com.bol.pages.HomePage;
import com.bol.pages.KlantenservicePage;
import com.bol.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.bol.pages.KlantenservicePage.*;

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
        Assert.assertTrue(KlantenservicePage.checkBestelButton());
    }

    @Then("user sees Bestellen Button element")
    public static String userSeesBestelButtonElement(){
        String expectedTextBestellen="Bestellen";
        Assert.assertEquals(expectedTextBestellen,KlantenservicePage.getTextBestelButton());
        System.out.println("Text Bestel Button: " + KlantenservicePage.getTextBestelButton());
        return HelperMethods.doGetText(bestelButton);
    }

    @And("user test Retourneren Button")
    public void userTestRetournerenButton() {
        Assert.assertTrue(KlantenservicePage.checkRetournerenButton());
    }

    @Then("user sees Retourneren Button element")
    public static String userSeesRetournerenButtonElement(){
        String expectedTextRetourneren="Retouren & annuleren";
        Assert.assertEquals(expectedTextRetourneren,KlantenservicePage.getTextRetournerenButton());
        System.out.println("Text Retourneren Button: " + KlantenservicePage.getTextRetournerenButton());
        return HelperMethods.doGetText(retournerenButton);
    }

    @And("user test Garantie&Reparatie Button")
    public void userTestGarantieReparatieButton() {
        Assert.assertTrue(KlantenservicePage.checkGarantieReparatieButton());
    }

    @Then("user sees Garantie&Reparatie Button element")
    public static String userSeesGarantieReparatieButtonElement(){
        String expectedTextGarantie="Garantie & reparatie";
        Assert.assertEquals(expectedTextGarantie,KlantenservicePage.getTextGarantieButton());
        System.out.println("Text Garantie Reparatie Button: " + KlantenservicePage.getTextGarantieButton());
        return HelperMethods.doGetText(garantieReparatieButton);
    }

    @And("user sees Contactformulier")
    public void userSeesContactformulier() {
        Assert.assertTrue(KlantenservicePage.checkKlantenContactForm());

    }

    @Then("user sees Contactformulier element")
    public void userSeesContactformulierElement() {
        Assert.assertTrue(KlantenservicePage.checkContactFormSendButton());
        String expectedTextSendButton="Start je gesprek";
        Assert.assertEquals(expectedTextSendButton,KlantenservicePage.getTextContactFormSendButton());
        System.out.println("Text Send Button: " + KlantenservicePage.getTextContactFormSendButton());
    }

    @And("user click Chat met Billie Button")
    public void userClickChatMetBillieButton() {
    }

    @Then("user sees Chat met Billie Popup")
    public void userSeesChatMetBilliePopup() {
    }

}