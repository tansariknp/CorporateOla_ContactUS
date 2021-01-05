package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_EmailAdress {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for empty email address field$")
	public void i_Click_on_Submit_button_for_empty_email_address_field() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^Error message should display for email address field$")
	public void error_message_should_display_for_email_address_field()  {
		String colorCode =  driver.findElement(By.xpath("//*[@name='email']")).getCssValue("border-top-color");
		//System.out.println(colorCode);
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Email Address is mandatory field");
	    	else
	    		System.out.println("Email Address is not a mandatory field");
	  
	}

	@When("^Enter \"([^\"]*)\" in email address field to check maximum allowed character$")
	public void enter_in_email_address_field_to_check_maximum_allowed_character(String arg1) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(arg1);
		Thread.sleep(1000);
	    
	}

	@Then("^Email Address field should not accept more than maximum allowed characters$")
	public void email_Address_field_should_not_accept_more_than_maximum_allowed_characters()  {
		String Value = driver.findElement(By.xpath("//*[@name='email']")).getAttribute("value");
		int length = Value.length();
		if(length<=100)
			System.out.println("Email Address field is not accepting more than 100 charcaters");
		else
			System.out.println("Email Address field is accepting more than 100 charcaters");
	    
	}

	@When("^Enter \"([^\"]*)\" in email Address field to check acceptable value$")
	public void enter_in_email_Address_field_to_check_acceptable_value(String arg2) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(arg2);
		Thread.sleep(1000);
	    
	}

	@Then("^Email Address field should not accept any value other than proper email Address$")
	public void email_Address_field_should_not_accept_any_value_other_than_proper_email_Address()  {
		String Value = driver.findElement(By.xpath("//*[@name='email']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String colorCode =  driver.findElement(By.xpath("//*[@name='email']")).getCssValue("border-top-color");
		//System.out.println(colorCode);
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Email Address is not accepting value " + Value + " as proper email Address");
	    	else
	    		System.out.println("Email Address is accepting value " + Value + " as proper email Address");
	}



}
