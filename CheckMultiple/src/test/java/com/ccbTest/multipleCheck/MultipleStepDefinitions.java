package com.ccbTest.multipleCheck;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MultipleStepDefinitions {
    CheckMultiple checkMultiple;
    String result;

    @Given("^Create the testing object$")
    public void createTheTestingObject() {
        checkMultiple = new CheckMultiple();
    }

    @When("^Set the number (\\d+) as variable$")
    public void setTheNumber(int number) {
        result = checkMultiple.checkNumber(number);
    }

    @Then("^The result \"([^\"]*)\"$")
    public void theResultIs(String resultString) {
        Assertions.assertEquals(result,resultString);
    }
}
