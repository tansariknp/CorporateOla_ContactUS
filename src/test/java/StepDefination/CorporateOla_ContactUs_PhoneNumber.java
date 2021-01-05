package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_PhoneNumber {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for empty Phone Number field$")
	public void i_Click_on_Submit_button_for_empty_Phone_Number_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
		
	}

	
	@Then("^Error message should display for Phone Number Code and number field$")
	public void error_message_should_display_for_Phone_Number_Code_and_number_field()  {
		String colorCode =  driver.findElement(By.xpath("//*[@name='phone_no']")).getCssValue("border-top-color");
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Phone Number is mandatory field");
	    	else
	    		System.out.println("Phone Number is not a mandatory field");
	    
	}

	@When("^Enter \"([^\"]*)\" in Phone Number field to check maximum allowed numbers$")
	public void enter_in_Phone_Number_field_to_check_maximum_allowed_numbers(String arg1) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='phone_no']")).sendKeys(arg1);
		Thread.sleep(1000);
	    
	}

	@Then("^Phone Number field should not accept more than maximum allowed numbers$")
	public void phone_Number_field_should_not_accept_more_than_maximum_allowed_numbers()  {
		String Value = driver.findElement(By.xpath("//*[@name='phone_no']")).getAttribute("value");
		int length = Value.length();
		if(length<=10)
			System.out.println("Phone Number field is not accepting more than 10 charcaters, Entered Value = " + Value);
		else
			System.out.println("Phone Number field is accepting more than 10 charcaters, Entered Value = " + Value);
	    
	}

	@When("^Enter \"([^\"]*)\" in Phone Number field$")
	public void enter_in_Phone_Number_field(String arg2) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='phone_no']")).sendKeys(arg2);
		Thread.sleep(1000);
	    
	}

	@Then("^Phone Number field should only accept numeric value$")
	public void phone_Number_field_should_only_accept_numeric_value()  {
		String PhoneValue  = driver.findElement(By.xpath("//*[@name='phone_no']")).getAttribute("value");
		int count = 0;
		char[] cha = PhoneValue.toCharArray();
		for (char c : cha)
		{
			int ascii = (int)c;
			if(!((ascii>=48 && ascii<=57)))
				count+=1;	
		}
		if(count>0)
			System.out.println("Phone Number is accpeting characters other than Numeric, Entered Value = " + PhoneValue);
		else
			System.out.println("Phone Number is only accpeting Numeric value , Entered Value = " + PhoneValue);
		
	}



}
