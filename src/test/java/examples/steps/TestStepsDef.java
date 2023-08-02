package examples.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepsDef {
    @Given("^I open the door$")
    public void iOpenTheDoor() throws Throwable {
        System.out.println("I open the door");
    }

    @When("^I search meal$")
    public void iSearchMeal() throws Throwable {
        System.out.println("I search meal");
    }

    @Then("^I find bread$")
    public void iFindBread() throws Throwable {
        System.out.println("I find bread");
    }

}
