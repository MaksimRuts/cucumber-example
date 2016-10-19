package com.nivafex.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Maksim Ruts on 10/19/2016.
 */
public class CucumberTest {

    private Bank bank;

    @Given("^I have \\$(\\d+) in my account$")
    public void iHave$InMyAccount(int arg0) throws Throwable {
        bank = new Bank(arg0);
    }

    @When("^i request \\$(\\d+)$")
    public void iRequest$(int arg0) throws Throwable {
        bank.withdraw(arg0);
    }

    @Then("^\\$(\\d+) should be on account$")
    public void $ShouldBeOnAccount(int arg0) throws Throwable {
        Assert.assertEquals(arg0, bank.getCash(), 0);
    }
}
