package com.example.cucumber;

import static org.junit.Assert.assertEquals;

import java.util.List;

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

	@Given("^I have (\\d+) types of food$")
	public void i_have_types_of_food(int numberOfTypes, List<String> foodTypes) {
		assertEquals(numberOfTypes, foodTypes.size());
		assertEquals("beef", foodTypes.get(2));
	}

	@When("^I choice (\\d+) type of food$")
	public void i_choice_type_of_food(int choiceOfTypes) {
		assertEquals(1, choiceOfTypes);
	}

	@Then("I should get {word}")
	public void i_should_get_food(String typeOfFood) {
		assertEquals("beef", typeOfFood);
	}
}
