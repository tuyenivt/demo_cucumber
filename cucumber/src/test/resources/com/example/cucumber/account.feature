Feature: Account

	Scenario: get an account
		Given I have 3 accounts:
			|10001|Peter|25.5|
			|10002|Max|90.0|
			|10003|Nature Line|2000.5|
		When I get account which has id = 10003
		Then Amount should be 2000.5
