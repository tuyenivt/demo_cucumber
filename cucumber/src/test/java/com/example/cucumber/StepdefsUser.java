package com.example.cucumber;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;

public class StepdefsUser {

	@Given("I have {int} users:")
	public void i_have_users(int numberOfAccount, List<User> users) {
		assertEquals(3, numberOfAccount);
		assertEquals(numberOfAccount, users.size());
	}
}
