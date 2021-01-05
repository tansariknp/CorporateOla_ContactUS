package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_NumberofEmployees {
	
	WebDriver driver = Hooks.driver;
	
	@When("^I Click on Submit button for not selected Number of Employees field$")
	public void i_Click_on_Submit_button_for_not_selected_Number_of_Employees_field() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
	  
	}

	@Then("^Error message should display for Number of Employees field$")
	public void error_message_should_display_for_Number_of_Employees_field()  {
		String colorCode =  driver.findElement(By.xpath("(//*[@name='employees'])[2]")).getCssValue("border-top-color");
		String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    if(colorCode.equals(expectedColorCodeInRGB))
	    	System.out.println("Number of Eployees Dropdown is mandatory field");
	    	else
	    		System.out.println("Number of Employees Dropdown is not a mandatory field");
	  
	}

	@When("^I selected available value from Number of Fields dropdown$")
	public void i_selected_available_value_from_Number_of_Fields_dropdown() throws InterruptedException  {
		Select Employees = new Select(driver.findElement(By.xpath("(//*[@name='employees'])[2]")));
	    Employees.selectByVisibleText("More than 2,500"); 
	    Thread.sleep(2000);
	  
	}

	@Then("^User should be able to see the selected value for Number of Employees dropdown field$")
	public void user_should_be_able_to_see_the_selected_value_for_Number_of_Employees_dropdown_field()  {
		String Code = driver.findElement(By.xpath("(//*[@name='employees'])[2]")).getAttribute("value");
	    //System.out.println(Code);
	    if(Code.equals("More than 2,500"))
	    	System.out.println(Code + " value is selected for Number of Employees drodpown field and it is equal to expected value");
	    else
	    	System.out.println(Code + " value is selected for Number of Employees drodpown field and it is not equal to expected value");
	  
	}



}
