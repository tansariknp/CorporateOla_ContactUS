package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_CommentBox {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for Comment Box field$")
	public void i_Click_on_Submit_button_for_Comment_Box_field() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	  
	}

	@Then("^Error message should not display for Comment Box field$")
	public void error_message_should_not_display_for_Comment_Box_field()  {
		String colorCode =  driver.findElement(By.xpath("//textarea[@name = 'comments']")).getCssValue("border-top-color");
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Comment Box is mandatory field");
	    	else
	    		System.out.println("Comment Box is not a mandatory field"); 
	  
	}

	@When("^Enter \"([^\"]*)\" in Comment Box field to check maximum allowed character$")
	public void enter_in_Comment_Box_field_to_check_maximum_allowed_character(String arg1) throws InterruptedException  {
		driver.findElement(By.xpath("//textarea[@name = 'comments']")).click();
		driver.findElement(By.xpath("//textarea[@name = 'comments']")).sendKeys(arg1);
		Thread.sleep(1000);
	  
	}

	@Then("^Comment Box field should not accept more than maximum allowed characters$")
	public void comment_Box_field_should_not_accept_more_than_maximum_allowed_characters()  {
		String Value = driver.findElement(By.xpath("//textarea[@name = 'comments']")).getAttribute("value");
		int length = Value.length();
		if(length<=2000)
			System.out.println("Comment Box field is not accepting more than 2000 charcaters");
		else
			System.out.println("Comment Box field is accepting more than 2000 charcaters");
	  
	}



}
