
package stepDefination;


import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^givet dfds$")
    public void givet_dfds() throws Throwable {
    	System.out.println("JAva project 1st");
    }

    @When("^when to chaba$")
    public void when_to_chaba() throws Throwable {
    	System.out.println("2 -");
    }

    @Then("^wash off then$")
    public void wash_off_then() throws Throwable {
    	System.out.println("3rddd");
    }

    @And("^Aand chaba$")
    public void aand_chaba() throws Throwable {
    	System.out.println("4th "); 
    }

}