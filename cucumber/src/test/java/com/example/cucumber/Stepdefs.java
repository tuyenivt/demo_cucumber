package com.example.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

	@Given("^I have (\\d+) cukes in my belly$")
	public void i_have_cukes_in_my_belly(int cukes) {
		Belly belly = new Belly();
		belly.eat(cukes);
	}

	@When("^I wait (\\d+) hour$")
	public void i_wait_hour(int hour) {
		Belly belly = new Belly();
		belly.digest(hour);
	}

	@Then("^my belly should growl$")
	public void my_belly_should_growl() {
	}
}
