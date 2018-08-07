package com.example.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefsCucumber {
	
	private int totalCucumbers;

	@Given("there are {int} cucumbers")
	public void there_are_cucumbers(int cucumbers) {
		totalCucumbers = cucumbers;
	}

	@When("I eat {int} cucumbers")
	public void i_eat_cucumbers(int cucumbers) {
		totalCucumbers -= cucumbers;
	}

	@Then("I should have {int} cucumbers")
	public void i_should_have_cucumbers(int cucumbers) {
		assertEquals(cucumbers, totalCucumbers);
	}

}
