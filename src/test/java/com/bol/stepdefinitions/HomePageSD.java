package com.bol.stepdefinitions;
import com.bol.base.BasePage;
import com.bol.base.ConfigReader;
import com.bol.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {

        //Testing HomePage Buttons
        @Given("User is on the home page")
        public void userIsOnTheHomePage() {
                BasePage.initializeDriver();
        }

        //get home page url and print
        @When("get home page url")
        public void getHomepageUrl() throws InterruptedException { System.out.println("Bolcom Home Page URL: "  + HomePage.getHomepageURL());
                Thread.sleep(2000);
        }
        @And("verify if url is expected")
        public void verifyIfUrlIsExpected() throws InterruptedException{
                String expectedURL = ConfigReader.getProperty("url");
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
                Thread.sleep(2000);
        }

        @And("get home page title")
        public void getHomePageTitle() throws InterruptedException {
                System.out.println(" Expected Title: " + HomePage.getHomepageTitle());
                Thread.sleep(2000);
        }

        @And("verify if title is expected")
        public void verifyIfTitleIsExpected() throws InterruptedException{
                String expectedTitle = "De winkel van ons allemaal | bol.com";
//                Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
                Thread.sleep(2000);
        }

        @And("User click Cookies button")
        public void userClickCookiesButton() throws InterruptedException {
                HomePage.clickCookiesButton();
                Thread.sleep(3000);
        }

        @And("User click Doorgaan button")
        public void userClickDoorgaanButton() throws InterruptedException {
                HomePage.clickdoorgaanButton();
                Thread.sleep(2000);
        }

        @Then("User click bolcomLogo button")
        public void userClickBolcomLogoButton() throws InterruptedException {
                HomePage.clickbolcomLogoButton();
                Thread.sleep(2000);
        }

        @When("Test Zakelijk page button")
        public void testZakelijkPageButton()throws InterruptedException {
                HomePage.clickZakelijk();
        }

        @Then("User sees Zakelijk page")
        public void userSeesZakelijkPage() {
                String expectedURL = "https://www.bol.com/be/nl/m/zakendoen-met-bolcom/";
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
                System.out.println("Expected URL: " + HomePage.verifyURL());

        }


        @When("Test Cadeaukaart page button")
        public void testCadeaukaartPageButton() throws InterruptedException{
                HomePage.clickCadeaukaart();
        }

        @Then("User sees Cadeaukaart page")
        public void userSeesCadeaukaartPage() {
                String expectedURL = "https://www.bol.com/be/nl/l/cadeaukaarten/20639/";
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
                System.out.println("Expected URL: " + HomePage.verifyURL());
        }
//
//        //Testing Pricing Page Button
//        @When("Test pricing page button")
//        public void testPricingButton() throws InterruptedException {
//                HomePage.clickPricing();
//        }
//
//        @Then("User sees pricing page")
//        public void userSeesPricingPage() {
//                String expectedURL = "https://eeveemobility.com/pricing";
//                Assert.assertEquals(expectedURL, HomePage.verifyURL());
//                System.out.println("Expected URL: " + HomePage.verifyURL());
//        }


//        @Then("User sees Home page without cookies")
//        public void userSeesHomePageWithoutCookies() {
//                String expectedURL = ConfigReader.getProperty("url");
//                Assert.assertEquals(expectedURL, HomePage.verifyURL());
//        }




//
//        //get home page title and print
//        @When("get home page title")
//        public void getHomepageTitle() {
//                System.out.println(" Expected Title: " + HomePage.getHomepageTitle());
//        }
//
//        @Then("verify if title is expected")
//        public void verifyIfTitleIsExpected() {
//                String expectedTitle = "De winkel van ons allemaal | bol.com";
//                Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
//        }
//
//        // click Cookies button
//        @When("User click Cookies button")
//        public void userClickCookiesButton() {
//                HomePage.clickCookiesButton();
//        }
//
//        @Then("User sees Home page without cookies")
//        public void userSeesHomePageWithoutCookies() {
//                String expectedURL="https://www.bol.com/be/nl/";
//                Assert.assertEquals(expectedURL, HomePage.verifyURL());
//        }
}
