package com.example.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;

public class StepdefsColor {

	@Given("I have {int} {color} balls")
	public void i_have_balls(int number, Color color) {
		assertEquals(5, number);
		assertEquals(Color.RED, color);
	}
}
