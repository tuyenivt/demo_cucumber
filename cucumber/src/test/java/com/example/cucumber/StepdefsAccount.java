package com.example.cucumber;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefsAccount {

	@Given("I have {int} accounts:")
	public void i_have_accounts(int numberOfAccount, List<Account> accounts) {
		assertEquals(3, numberOfAccount);
		assertEquals(numberOfAccount, accounts.size());
	}

	@When("I get account which has id = {int}")
	public void i_get_account_which_has_id(int id) {
		assertEquals(10003, id);
	}

	@Then("Amount should be {float}")
	public void amount_should_be(double amount) {
		assertEquals(2000.5, amount, 0.1);
	}
}
