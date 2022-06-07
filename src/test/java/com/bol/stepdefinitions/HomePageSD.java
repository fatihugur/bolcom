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

        // Get HomePage url and print
        @When("get home page url")
        public void getHomepageUrl() throws InterruptedException { System.out.println("Bolcom Home Page URL: "  + HomePage.getHomepageURL());
                Thread.sleep(2000);
        }
        // Verify HomePage URL
        @And("verify if url is expected")
        public void verifyIfUrlIsExpected() throws InterruptedException{
                String expectedURL = ConfigReader.getProperty("url");
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
                Thread.sleep(2000);
        }
        // Get HomePage Title
        @And("get home page title")
        public void getHomePageTitle() throws InterruptedException {
                System.out.println(" Expected Title: " + HomePage.getHomepageTitle());
                Thread.sleep(2000);
        }
        // Verify HomePage expected Title
        @And("verify if title is expected")
        public void verifyIfTitleIsExpected() throws InterruptedException{
                String expectedTitle = "De winkel van ons allemaal | bol.com";
                Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
                Thread.sleep(2000);
        }
        // When Popup opens > Click Cookies button
        @And("User click Cookies button")
        public void userClickCookiesButton() throws InterruptedException {
                HomePage.clickCookiesButton();
                Thread.sleep(3000);
        }
        // When Cookies button is clicked click Doorgaan and sees HomePage
        @And("User click Doorgaan button")
        public void userClickDoorgaanButton() throws InterruptedException {
                HomePage.clickdoorgaanButton();
                Thread.sleep(2000);
        }
        // Clicks HomePage Bolcom Logo
        @Then("User click bolcomLogo button")
        public void userClickBolcomLogoButton() throws InterruptedException {
                HomePage.clickbolcomLogoButton();
                Thread.sleep(2000);
        }
        // Clicks HomePage Zakelijk menu button
        @And("Test Zakelijk page button")
        public void testZakelijkPageButton()throws InterruptedException {
                HomePage.clickZakelijk();
        }
        // After clicking Zakelijk button sees page and check expected url
        @Then("User sees Zakelijk page")
        public void userSeesZakelijkPage() {
                String expectedURL = "https://www.bol.com/be/nl/m/zakendoen-met-bolcom/";
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
                System.out.println("Expected URL: " + HomePage.verifyURL());
        }
        // Clicks HomePage Cadeaukaart menu button
        @And("Test Cadeaukaart page button")
        public void testCadeaukaartPageButton() throws InterruptedException{
                HomePage.clickCadeaukaart();
        }
        // After clicking Cadeaukaart button sees page and check expected url
        @Then("User sees Cadeaukaart page")
        public void userSeesCadeaukaartPage() {
                String expectedURL = "https://www.bol.com/be/nl/l/cadeaukaarten/20639/";
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
                System.out.println("Expected URL: " + HomePage.verifyURL());
        }

}
