package com.bol.pages;

import com.bol.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bol.base.BasePage.driver;

public class  HomePage {

    // Fields: Locators, Webelements,
    // xpath cookies accept button
    // //*[@id="modalWindow"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]
    //full xpath
    // /html/body/wsp-modal-window[1]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]
    // xpath span
    // //*[@id="modalWindow"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]/span
    // xpath weiger button
    // //*[@id="modalWindow"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[2]
    @FindBy(xpath="//*[@id=\"modalWindow\"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]")
   public static WebElement cookiesButton;

    // xpath doorgaan button
    // //*[@id="modalWindow"]/div[2]/div[2]/wsp-country-language-modal/button
    @FindBy(xpath="//*[@id=\"modalWindow\"]/div[2]/div[2]/wsp-country-language-modal/button")
    public static WebElement doorgaanButton;

    // xpath bol.com logo
    // //*[@id="header"]/div/div[1]/a
    // //*[@id="header"]/div/div[1]/a
    @FindBy(id="header")
    public static WebElement bolcomLogo;

    // xpath bol.com zakelijk menu button
    // //*[@id="header"]/wsp-main-nav-offcanvas/div[2]/div/div/nav[1]/ul[2]/li[1]/a
    @FindBy(xpath="//*[@id=\"header\"]/wsp-main-nav-offcanvas/div[2]/div/div/nav[1]/ul[2]/li[1]/a")
    public static WebElement zakelijkButton;

    // xpath bol.com cadeaukaart menu button
    // //*[@id="header"]/wsp-main-nav-offcanvas/div[2]/div/div/nav[1]/ul[2]/li[2]/a
    @FindBy(xpath="//*[@id=\"header\"]/wsp-main-nav-offcanvas/div[2]/div/div/nav[1]/ul[2]/li[2]/a")
    public static WebElement cadeaukaartButton;

    // PageFactory
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public static String getHomepageTitle(){
        return HelperMethods.doGetPageTitle();
    }
    public static String getHomepageURL(){
        return HelperMethods.getCurrentURL();
    }
    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }
    public static void clickCookiesButton(){
        HelperMethods.doClick(cookiesButton);
    };
    public static void clickdoorgaanButton(){
        HelperMethods.doClick(doorgaanButton);
    };
    public static void clickbolcomLogoButton(){
        HelperMethods.doClick(bolcomLogo);
    };

    // CLICK ZAKELIJK MENU BUTTON
    public static void clickZakelijk() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(zakelijkButton.getText());
        HelperMethods.doClick(zakelijkButton);
    }

    // CLICK CADEAUKAART MENU BUTTON
    public static void clickCadeaukaart() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(cadeaukaartButton.getText());
        HelperMethods.doClick(cadeaukaartButton);
    }

}
