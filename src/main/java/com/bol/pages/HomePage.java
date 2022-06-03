package com.bol.pages;

import com.bol.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bol.base.BasePage.driver;

public class  HomePage {

    // Fields: Locators, Webelements,
    ////*[@id="modalWindow"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]
    //*[@id="modalWindow"]/div[2]/div[2]/wsp-consent-modal/div[2]/button[1]
    //full xpath
    // /html/body/wsp-modal-window[1]/div[2]/div[2]/wsp-consent-modal/div[2]
    @FindBy(id="modalWindow")
   public static WebElement cookiesButton;

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

}
