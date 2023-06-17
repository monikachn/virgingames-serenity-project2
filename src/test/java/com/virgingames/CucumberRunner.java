package com.virgingames;

import cucumber.api.CucumberOptions;
import resources.testdata.TestBase;

//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/")
public class CucumberRunner extends TestBase {
}
