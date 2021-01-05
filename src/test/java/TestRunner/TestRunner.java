package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = "src/test/java/Features", 
	glue= {"StepDefination","Utilities"}, // To Map packages  
	dryRun = false, // to dryrun the program
	monochrome = true, // to see console in synchronized way
	plugin = { "pretty", "html:target/cucumber-pretty"} //To store result in html form
)

public class TestRunner {

}
