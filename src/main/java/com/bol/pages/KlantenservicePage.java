package com.bol.pages;

import com.bol.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.bol.base.BasePage.driver;

public class KlantenservicePage {

    //PageFactory
    public KlantenservicePage(){
        PageFactory.initElements(driver, this);
    }

    //FIELDS: LOCATORS, WEBELEMENTS

    // BESTELEN BUTTON
    // xpath bol.com klantenservice page bestelen button
    // //*[@id="mainContent"]/div/nav/div/a[3]
    @FindBy(xpath="//*[@id=\"mainContent\"]/div/nav/div/a[3]")
    public static WebElement bestelButton;

    // RETOURNEREN BUTTON
    // xpath bol.com klantenservice page retourneren button
    // //*[@id="mainContent"]/div/nav/div/a[1]
    @FindBy(xpath="//*[@id=\"mainContent\"]/div/nav/div/a[1]")
    public static WebElement retournerenButton;

    // GARANTIE&REPARATIE BUTTON
    // xpath bol.com klantenservice page garantie&reparatie button
    // //*[@id="mainContent"]/div/nav/div/a[5]
    @FindBy(xpath="//*[@id=\"mainContent\"]/div/nav/div/a[5]")
    public static WebElement garantieReparatieButton;

    //BILLIE BANNER INPUT FORMULEER
    // Help input Billie Banner Area
    // id: billie-banner-input
    @FindBy(id="billie-banner-input")
    public static WebElement klantenContactForm;

    // Help input Billie Banner Button
    //  id: send-message-button
    @FindBy(id="send-message-button")
    public static WebElement contactFormSendButton;

    // Chat met Billie Button - in footer
    // //*[@id="conversation-label"]
    @FindBy(id="send-message-button")
    public static WebElement chatMetBillieButton;

    // Chat Met Billie Popup Header
    ////*[@id="cui-root"]/div/div/div[1]
    @FindBy(xpath="//*[@id=\"cui-root\"]/div/div/div[1]")
    public static WebElement chatMetBilliePopup;


    // ACTIONS
    public static Boolean checkBestelButton(){
        return HelperMethods.doIsDisplayed(bestelButton);
    }
    public static String getTextBestelButton() {
        return HelperMethods.doGetText(bestelButton);
    }
    public static Boolean checkRetournerenButton(){
        return HelperMethods.doIsDisplayed(retournerenButton);
    }
    public static String getTextRetournerenButton() {
        return HelperMethods.doGetText(retournerenButton);
    }
    public static Boolean checkGarantieReparatieButton(){
        return HelperMethods.doIsDisplayed(garantieReparatieButton);
    }
    public static String getTextGarantieButton() {
        return HelperMethods.doGetText(garantieReparatieButton);
    }
    public static Boolean checkKlantenContactForm(){return HelperMethods.doIsDisplayed(klantenContactForm);}
    public static Boolean checkContactFormSendButton(){return HelperMethods.doIsDisplayed(contactFormSendButton);}
    public static String getTextContactFormSendButton() {
        return HelperMethods.doGetText(contactFormSendButton);
    }
    public static void clickChatMetBillieButton()throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(chatMetBillieButton.getText());
        HelperMethods.doClick(chatMetBillieButton);}
    public static Boolean checkChatMetBilliePopup(){
       return HelperMethods.doIsDisplayed(chatMetBilliePopup);}
}
