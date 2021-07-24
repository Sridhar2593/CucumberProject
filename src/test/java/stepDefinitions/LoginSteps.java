package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("^User has opened the simplilearn application$")
    public void _user_has_opened_the_simplilearn_application() throws Throwable {
        
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.simplilearn.com/");
    }

	@When("^User click on the Login button$")
    public void user_click_on_the_login_button() throws Throwable {
        
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
    }

    @Then("^User should be landed on the home page$")
    public void user_should_be_landed_on_the_home_page() throws Throwable {
        
    }

    @And("^User enters correct username \"([^\"]*)\"$")
    public void user_enters_correct_username_something(String username) throws Throwable {
        
    	WebElement UserName = driver.findElement(By.name("user_login"));
    	UserName.sendKeys(username);
    }

    @And("^User enters correct Password \"([^\"]*)\"$")
    public void password_and_click_on_login_button_something(String password) throws Throwable {
        
    	WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);
    }
    
    @And("^User clicks on Login button$")
    public void click_on_login_button() throws Throwable {
    	
    	WebElement Login = driver.findElement(By.name("btn_login"));
		Login.click();
    }

    @And("^User should be able to see the Welcome message$")
    public void user_should_be_able_to_see_the_welcome_message() throws Throwable {
        
    	//need to add isElementDisplayed 
    	WebElement HomepageLogo = driver.findElement(By.xpath("//*[@title = 'Simplilearn']"));
		HomepageLogo.isDisplayed();
		System.out.println("Test case Passed");
    }

}
