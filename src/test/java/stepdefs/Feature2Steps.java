package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class Feature2Steps extends FeatureStepsBase {

    @Before("@First")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }

    @After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");
    }

    @Given("I have set X and Y")
    public void I_have_set_X_and_Y() {
        System.out.println("I have set X and Y");
    }

    @Then("I print Z1 and Z2")
    public void I_print_Z1_and_Z2() {
        System.out.println("Z1 = " + globals.getZ1() + " and Z2 = " + globals.getZ2());
        System.out.println("Feature2Steps inherits = " + BaseValue);
    }

    //endregion
}