package com.ccbTest.sumCheck;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SumStepDefinitions {
    CheckSum checkSum;
    int res;

    @Given("^Create the testing object$")
    public void create_the_testing_object() throws Throwable {
        checkSum = new CheckSum();
    }

    @When("^Sum the number (\\d+) and (\\d+)$")
    public void sumTheNumberAnd(int arg0, int arg1) {
        res = checkSum.checkSum(arg0, arg1);
    }

    @Then("^The result is (\\d+)$")
    public void the_result_is(int arg1) throws Throwable {
        Assertions.assertEquals(arg1, res);
    }

}
