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


//    // xpath bol.com klantenservice menu button
//    // //*[@id="header"]/wsp-main-nav-offcanvas/div[2]/div/div/nav[1]/ul[2]/li[4]/a
//    @FindBy(xpath="//*[@id=\"header\"]/wsp-main-nav-offcanvas/div[2]/div/div/nav[1]/ul[2]/li[4]/a")
//    public static WebElement klantenserviceButton;
//    // CLICK KLANTENSERVICE MENU BUTTON
//    public static void clickKlantenservice() throws InterruptedException{
//        Thread.sleep(2000);
//        System.out.println(klantenserviceButton.getText());
//        HelperMethods.doClick(klantenserviceButton);
//    }
}
