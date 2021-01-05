package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_Name {
	
	WebDriver driver = Hooks.driver;
		
	@When("^I Click on Submit button for empty name field$")
	public void i_Click_on_Submit_button_for_empty_name_field() throws InterruptedException  {		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^Error message should display for name field$")
	public void error_message_should_display_for_name_field()  {
		
		String colorCode =  driver.findElement(By.xpath("(//*[@name='name'])[2]")).getCssValue("border-top-color");
		//System.out.println(colorCode);
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Name is mandatory field");
	    	else
	    		System.out.println("Name is not a mandatory field");
	   
	    
	}

	
	@When("^Enter \"([^\"]*)\" in name field to check maximum allowed character$")
	public void enter_in_name_field_to_check_maximum_allowed_character(String Character1) throws InterruptedException  {
		driver.findElement(By.xpath("(//*[@name='name'])[2]")).sendKeys(Character1);
		Thread.sleep(1000);
	}

	@Then("^Name field should not accept more than maximum allowed characters$")
	public void name_field_should_not_accept_more_than_maximum_allowed_characters()  {
		String Value = driver.findElement(By.xpath("(//*[@name='name'])[2]")).getAttribute("value");
		//System.out.println("String displaying in name field = " + Value);
		int length = Value.length();
		//System.out.println(length);
		if(length<=100)
			System.out.println("Name field is not accepting more than 100 charcaters");
		else
			System.out.println("Name field is accepting more than 100 charcaters");
	   
	}
		
	@When("^Enter \"([^\"]*)\" in name field to check acceptable characters$")
	public void enter_in_name_field_to_check_acceptable_characters(String Character2) throws InterruptedException  {
		driver.findElement(By.xpath("(//*[@name='name'])[2]")).sendKeys(Character2);
		Thread.sleep(1000);
	    
	}

	@Then("^Name field should not accept any charater other than aplhabet$")
	public void name_field_should_not_accept_any_charater_other_than_aplhabet()  {
		
		//System.out.println("Entering String validation block");
		String NameValue  = driver.findElement(By.xpath("(//*[@name='name'])[2]")).getAttribute("value");
		//System.out.println(NameValue);
		int count = 0;
		char[] cha = NameValue.toCharArray();
		for (char c : cha)
		{
			//System.out.println(c);
			int ascii = (int)c;
			//System.out.println(ascii);
			if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || ascii==32 ))
				count+=1;	
			//System.out.println(count);
		}
		if(count>0)
			System.out.println("String is accpeting characters other than alphabets and space");
		else
			System.out.println("String is only accpeting alphabets and space");
		//System.out.println("Exiting String validation block");
		
	    
	}
	
}
