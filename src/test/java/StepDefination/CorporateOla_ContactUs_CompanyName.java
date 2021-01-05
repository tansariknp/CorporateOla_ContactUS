package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_CompanyName {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for empty Company Name field$")
	public void i_Click_on_Submit_button_for_empty_Company_Name_field() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^Error message should display for Company Name field$")
	public void error_message_should_display_for_Company_Name_field()  {
		String colorCode =  driver.findElement(By.xpath("//*[@name='corporate_name']")).getCssValue("border-top-color");
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Company Name is mandatory field");
	    	else
	    		System.out.println("Company Name is not a mandatory field");
	    
	}

	@When("^Enter \"([^\"]*)\" in Company name field to check maximum allowed character$")
	public void enter_in_Company_name_field_to_check_maximum_allowed_character(String arg1) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='corporate_name']")).sendKeys(arg1);
		Thread.sleep(1000);
	    
	}

	@Then("^Comapny Name field should not accept more than maximum allowed characters$")
	public void comapny_Name_field_should_not_accept_more_than_maximum_allowed_characters()  {
		String Value = driver.findElement(By.xpath("//*[@name='corporate_name']")).getAttribute("value");
		int length = Value.length();
		if(length<=100)
			System.out.println("Company Name field is not accepting more than 100 charcaters");
		else
			System.out.println("Company Name field is accepting more than 100 charcaters");
	    
	}

	@When("^Enter \"([^\"]*)\" in Company Name field to check acceptable characters$")
	public void enter_in_Company_Name_field_to_check_acceptable_characters(String arg1) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='corporate_name']")).sendKeys(arg1);
		Thread.sleep(1000);
	    
	}

	@Then("^Company Name field should not accept any charater other than aplhabet$")
	public void company_Name_field_should_not_accept_any_charater_other_than_aplhabet()  {
		String NameValue  = driver.findElement(By.xpath("//*[@name='corporate_name']")).getAttribute("value");
		int count = 0;
		char[] cha = NameValue.toCharArray();
		for (char c : cha)
		{
			int ascii = (int)c;
			if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || ascii==32 || ascii==46 ))
				count+=1;	
		}
		if(count>0)
			System.out.println("Company Name is accpeting characters other than alphabets, spaces and fullstop");
		else
			System.out.println("Company Name is only accpeting alphabets, spaces and fullstop");
	    
	}


}
