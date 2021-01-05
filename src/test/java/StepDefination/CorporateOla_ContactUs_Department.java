package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_Department {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for not selected Department field$")
	public void i_Click_on_Submit_button_for_not_selected_Department_field() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^Error message should display for Department field$")
	public void error_message_should_display_for_Department_field()  {
		String colorCode =  driver.findElement(By.xpath("(//*[@name='department'])[2]")).getCssValue("border-top-color");
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Department Dropdown is mandatory field");
	    	else
	    		System.out.println("Department Dropdown is not a mandatory field");
	    
	}

	@When("^I selected available value from Department dropdown$")
	public void i_selected_available_value_from_Department_dropdown() throws InterruptedException  {
		Select Department = new Select(driver.findElement(By.xpath("(//*[@name='department'])[2]")));
	    Department.selectByVisibleText("Travel desk"); 
	    Thread.sleep(2000);
	    
	}

	@Then("^User should beable to see the selected value for Department dropdown field$")
	public void user_should_beable_to_see_the_selected_value_for_Department_dropdown_field()  {
		String Code = driver.findElement(By.xpath("(//*[@name='department'])[2]")).getAttribute("value");
	    //System.out.println(Code);
	    if(Code.equals("Travel desk"))
	    	System.out.println(Code + " value is selected for Department drodpown field and it is equal to expected value");
	    else
	    	System.out.println(Code + " value is selected for Department drodpown field and it is not equal to expected value");
	    
	}



}
