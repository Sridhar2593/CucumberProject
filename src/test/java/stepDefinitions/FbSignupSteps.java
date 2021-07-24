package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbSignupSteps {
	
	WebDriver driver = BaseClass.driver;
	
    @Given("^User has opened the Facebook application$")
    public void user_has_opened_the_facebook_application() throws Throwable {
     
    	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://en-gb.facebook.com/");
    }

    @When("^User click on the Create New Account button$")
    public void user_click_on_the_create_new_account_button() throws Throwable {
    	
    	driver.findElement(By.xpath("//a[text() ='Create New Account']")).click();
    
    }

    @Then("^User should able to see Success message$")
    public void user_should_able_to_see_success_message() throws Throwable {
    
    }
    
    @And("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_something_something_and_something(String firstname, String lastname, String mobilenumber, String password) throws Throwable {
    	
    	WebElement Firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		Firstname.sendKeys(firstname);
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		Lastname.sendKeys(lastname);
		
		WebElement Email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		Email.sendKeys(mobilenumber);
		
		WebElement Password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		Password.sendKeys(password);
    
    }

    @And("^User Selects \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_selects_something_something_something_and_something(Integer month, Integer date, Integer year) throws Throwable {
    	
    	WebElement Month = driver.findElement(By.xpath("//select[@name = 'birthday_day']/following-sibling::select[1]"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByIndex(month);
		
		WebElement Day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		Select ddDay = new Select(Day);
		ddDay.selectByIndex(date);
		
		WebElement Year = driver.findElement(By.xpath("//select[@name = 'birthday_day']/following-sibling::select[2]"));
		Select ddYear = new Select(Year);
		ddYear.selectByIndex(year);
		
		WebElement Gender = driver.findElement(By.xpath("//input[@value = '2']"));
    	Gender.click();
    
    }
    
    @And("^User Creates the new account$")
    public void user_creates_the_new_account(DataTable table) throws Throwable {
    	
    	String FirstName = table.cell(1, 1);
    	String LastName = table.cell(2, 1);
    	String MobileNumber = table.cell(3, 1);
    	String Password = table.cell(4, 1);
    	
    	WebElement Firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		Firstname.sendKeys(FirstName);
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		Lastname.sendKeys(LastName);
		
		WebElement Email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		Email.sendKeys(MobileNumber);
		
		WebElement tdPassword = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		tdPassword.sendKeys(Password);
    
    }

    @And("^User Selects$")
    public void user_selects(DataTable table) throws Throwable {
    	
    	String Date = table.cell(1, 1);
    	String Month = table.cell(2, 1);
    	String Year = table.cell(3, 1);
    	
    	WebElement tdMonth = driver.findElement(By.xpath("//select[@name = 'birthday_day']/following-sibling::select[1]"));
		Select ddMonth = new Select(tdMonth);
		ddMonth.selectByValue(Month);
		
		WebElement Day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		Select ddDay = new Select(Day);
		ddDay.selectByValue(Date);
		
		WebElement tdYear = driver.findElement(By.xpath("//select[@name = 'birthday_day']/following-sibling::select[2]"));
		Select ddYear = new Select(tdYear);
		ddYear.selectByValue(Year);
		
		WebElement Gender = driver.findElement(By.xpath("//input[@value = '2']"));
    	Gender.click();
    
    }

    @And("^User click on Signup button$")
    public void user_click_on_signup_button() throws Throwable {
    	
    	driver.findElement(By.xpath("//*[@name = 'websubmit']")).click();
    
    }

}
