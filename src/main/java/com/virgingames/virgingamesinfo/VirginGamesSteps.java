package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class VirginGamesSteps {
    @Step("Getting all Jackpots GBP")
    public ValidatableResponse getCurrencyGBP() {
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOTS_GBP)
                .then();

    }

    @Step("Getting all Jackpot EUR")
    public ValidatableResponse getCurrencyEUR(){
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOTS_EUR)
                .then().log().all();
    }
    @Step("Getting all Jackpot SEK")
    public ValidatableResponse getCurrencySEK(){
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOTS_SEK)
                .then().log().all();
    }

}
