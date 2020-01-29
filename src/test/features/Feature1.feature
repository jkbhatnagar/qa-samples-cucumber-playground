@Regression
Feature: Feature 1

	Background:
		Given I printed Feature name "Feature 1"
		And I have 12.0 liters of water in 4 bottles from Woolworths with "Home Alone" brand and 30 Jan 2020 expiry date
		And I have 1.0 liter of milk in 1 bottle from Coles with "Coles Own" brand and no expiry date

	@TestSuite1
  	Scenario: Feature 1 scenario 1
		Given I get X
		When I set Y
		Then I print X and Y

	@TestSuite2
	Scenario Outline: Sum of two numbers
		Given first number is <firstNumber>
		And second number is <secondNumber>
		When I execute sum function
		Then the sum is <result>

		Examples:
			| firstNumber | secondNumber | result |
			| 10          | 20           | 30     |
			| 50          | 60           | 110    |

	@TestSuite3
	Scenario: List of Map of String
		Given I have a list of map of integers
			| Key1	| 1	|
			| Key2	| 3	|
			| Key3	| 5	|
		When I execute sum function on map
		Then the sum is 9
