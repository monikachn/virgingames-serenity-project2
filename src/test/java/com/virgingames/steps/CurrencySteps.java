package com.virgingames.steps;

import com.virgingames.virgingamesinfo.VirginGamesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.Matchers.lessThan;

public class CurrencySteps {
    static ValidatableResponse response;
    @Steps
    VirginGamesSteps virginGamesSteps = new VirginGamesSteps();


        @When("^User send the GET request for currency GBP endpoint$")
        public void userSendTheGETRequestForCurrencyGBPEndpoint() {
         response =virginGamesSteps.getCurrencyGBP();
        }
        @And("^User must see all the money in GBP$")
        public void userMustSeeAllTheMoneyInGBP() {
            response.body("data.pots.size", lessThan(10));
        }


        @Then("^User must get back status code (\\d+)$")
        public void userMustGetBackStatusCode() {
            response.statusCode(200);
        }

        @When("^User send the GET request for currency EUR endpoint$")
        public void userSendTheGETRequestForCurrencyEUREndpoint() {
            response = virginGamesSteps.getCurrencyEUR();
        }

        @When("^User send the GET request for currency SEK endpoint$")
        public void userSendTheGETRequestForCurrencySEKEndpoint() {
            response = virginGamesSteps.getCurrencySEK();
        }

}

