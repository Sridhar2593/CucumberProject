package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-html"},
		features = "src/Features",
		tags = {"@NegativeLogin, @PositiveLogin"},//or condition and ~ symbol to exclude a tag
		// tags = {"@NegativeLogin", "@Sanity"}, this is and condition
		glue = {"stepDefinitions"}
		)
public class RunnerClass {
	
	

}
