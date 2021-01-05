package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_Country {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for not selected country field$")
	public void i_Click_on_Submit_button_for_not_selected_country_field() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^Error message should display for Country field$")
	public void error_message_should_display_for_Country_field()  {
		String colorCode =  driver.findElement(By.xpath("(//*[@id='country'])[3]")).getCssValue("border-top-color");
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Country Dropdown is mandatory field");
	    	else
	    		System.out.println("Country Dropdown is not a mandatory field");
	    
	}

	@When("^I selected available value from dropdown$")
	public void i_selected_available_value_from_dropdown() throws InterruptedException  {
		
		Select Country = new Select(driver.findElement(By.xpath("(//*[@id='country'])[3]")));
	    Country.selectByVisibleText("INDIA"); 
	    Thread.sleep(2000);
	    
	}

	@Then("^Phone Code value should get populated$")
	public void phone_Code_value_should_get_populated()  {
	    String Code = driver.findElement(By.xpath("(//*[@name='dialing_code'])[3]")).getAttribute("value");
	    //System.out.println(Code);
	    if(Code.equals("+91"))
	    	System.out.println("Country Code of INDIA got selected automatically");
	    else
	    	System.out.println("Country Code not selected");
	}



}
