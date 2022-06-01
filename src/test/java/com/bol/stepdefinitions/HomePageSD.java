package com.bol.stepdefinitions;
import com.bol.base.BasePage;
import com.bol.base.ConfigReader;
import com.bol.pages.HomePage;
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
        public void getHomepageUrl() { System.out.println("Bolcom Home Page URL: "  + HomePage.getHomepageURL());
        }

        @Then("verify if url is expected")
        public void verifyIfUrlIsExpected() {
                String expectedURL = ConfigReader.getProperty("url");
                Assert.assertEquals(expectedURL, HomePage.verifyURL());
        }

        //get home page title and print
        @When("get home page title")
        public void getHomepageTitle() {
                System.out.println(" Expected Title: " + HomePage.getHomepageTitle());
        }

        @Then("verify if title is expected")
        public void verifyIfTitleIsExpected() {
                String expectedTitle = "De winkel van ons allemaal | bol.com";
                Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
        }


}
