package com.bol.pages;

import com.bol.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bol.base.BasePage.driver;

public class  HomePage {

    // Fields: Locators, Webelements,
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[2]/a/div/a")
    public static WebElement pricingButton;

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


}
