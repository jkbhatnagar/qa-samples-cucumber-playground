package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class Feature1Steps extends FeatureStepsBase {

    private String X, Y;

    @Before()
    public void doSomethingBefore() {
        System.out.println("Executed Before Scenario");
    }

    @After()
    public void doSomethingAfter() {
        System.out.println("Executed After Scenario");
    }

    @Given("I printed Feature name {string}")
    public void i_printed_feature_name(String feature) {
        System.out.println("Feature Name: " + feature);
    }

    @Given("I have {float} liter(s) of water/milk in {int} bottle(s) from {word} with {string} brand and {} expiry date")
    public void i_printed_date_and_time(Float liters, Integer bottles, String store, String brand, String expiry) {
        System.out.format("I have %f liter(s) of water/milk in %d bottle(s) from %s with %s brand and %s expiry date", liters, bottles, store, brand, expiry);
        System.out.println();
    }

    @Given("I get X")
    public void i_get_X() {
        System.out.println("Enter value of X");
        X = "Jatin";
        globals.setZ1(X);
    }

    @When("I set Y")
    public void i_set_Y() {
        System.out.println("Enter value of Y");
        Y = "Sandeep";
        globals.setZ2(Y);
    }

    @Then("I print X and Y")
    public void i_print() {
        System.out.println("X = " + X + " and Y = " + Y);
        System.out.println("Feature1Steps inherits = " + BaseValue);
    }


    private Integer num1 = 0, num2 = 0, sum = 0;

    @Given("first number is {int}")
    public void number1_is(Integer number) {
        System.out.println("Num1 = " + number);
        num1 = number;
    }

    @Given("second number is {int}")
    public void number2_is(Integer number) {
        System.out.println("Num2 = " + number);
        num2 = number;
    }

    @When("I execute sum function")
    public void i_execute_sum_function() {
        sum = num1 + num2;
    }

    @Then("the sum is {int}")
    public void the_sum_is(Integer result) {
        System.out.println("Sum = " + sum);
        assertThat("Addition Failed", result.equals(sum));
    }

    private Map<String,Integer> mapOfInt;
    @Given("I have a list of map of integers")
    public void list_of_map_of_integers(Map<String,Integer> map) {
        mapOfInt = map;
        for (Map.Entry<String, Integer> field : map.entrySet()) {
            System.out.println("Key = " + field.getKey() + " and Value = " + field.getValue());
        }
    }

    @When("I execute sum function on map")
    public void i_execute_sum_function_on_map() {
        sum = 0;
        for (Map.Entry<String, Integer> field : mapOfInt.entrySet()) {
            sum += field.getValue();
        }
    }

    //endregion
}