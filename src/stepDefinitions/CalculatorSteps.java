package stepDefinitions;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {
	
	int result;
	int res;
	
	@Given("^The calculator application is open$")
    public void the_calculator_application_is_open() throws Throwable {
        
		System.out.println("Calculator App is Opened");
		
    }

    @When("^I add two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_add_two_numbers_something_and_something(Integer num1, Integer num2) throws Throwable {
        
    	//System.out.println("Inside When");
    	result = num1+num2;
    	System.out.println("Addition of Two Numbers" + + result);
    	
    }
    
    @When("^I multiply two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_multiplication_of_numbers_something_and_something(Integer a, Integer b) throws Throwable {
        
    	res = a*b;
    	System.out.println("Multiplication of Two Numbers" + + res);
    	
    }

    @Then("^I should get the result as \"([^\"]*)\"$")
    public void i_should_get_the_result_as_something(Integer expResult) throws Throwable {
        
    	//System.out.println("Inside Then");
    	/*if(result==expResult) {
    		System.out.println("Test Passed for Addition of Two Numbers");
    	}else {
    		System.out.println("Test Failed for Addition of Two Numbers");
    	}*/
    	//Assert.assertEquals(expResult, result);
    	
    }


}
