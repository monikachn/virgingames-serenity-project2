package com.virgingames.virgingamesinfo;
import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import resources.testdata.TestBase;

import java.util.List;

import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class VirginGamesGETTestWithSteps extends TestBase {
    @Steps
    VirginGamesSteps virginGamesSteps;
    @Title("get the all JACKPOTS GBP")
    @Test
    public void test001(){
        ValidatableResponse response = virginGamesSteps.getCurrencyGBP()
                .log()
                .all()
                .statusCode(200);

    }

    @Title("get the all Jackpots EUR")
    @Test
    public void test002(){
        ValidatableResponse response = virginGamesSteps.getCurrencyEUR()
                .log().all().statusCode(200);
    }

    @Title("get the all Jackpots SEK")
    @Test
    public void test003(){
        ValidatableResponse response = virginGamesSteps.getCurrencySEK().log().all().statusCode(200);
    }


}
