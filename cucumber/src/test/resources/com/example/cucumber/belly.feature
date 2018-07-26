Feature: Belly

	Scenario: a few cukes
		Given I have 42 cukes in my belly
		When I wait 1 hour
		Then my belly should growl

	Scenario: choice beef
		Given I have 3 types of food
			|bread|
			|pork|
			|beef|
		When I choice 1 type of food
		Then I should get beef
