package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CorporateOla_ContactUs_Submit {
	
	WebDriver driver = Hooks.driver;
	
	@When("^Enter \"([^\"]*)\" in name field$")
	public void enter_in_name_field(String Name) throws InterruptedException  {
		driver.findElement(By.xpath("(//*[@name='name'])[2]")).sendKeys(Name);
		Thread.sleep(1000);
		
	}
	
	@When("^\"([^\"]*)\" in Email field$")
	public void in_Email_field(String Email) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(Email);
		Thread.sleep(1000); 
	    
	}

	@When("^\"([^\"]*)\" in Comapny field$")
	public void in_Comapny_field(String Company_name) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='corporate_name']")).sendKeys(Company_name);
		Thread.sleep(1000);
	    
	}

	@When("^\"([^\"]*)\" in Phone field$")
	public void in_Phone_field(String Phone_Number) throws InterruptedException  {
		driver.findElement(By.xpath("//*[@name='phone_no']")).sendKeys(Phone_Number);
		Thread.sleep(1000);
	    
	}

	@When("^Clicks Submit button$")
	public void clicks_Submit_button() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000); 
	    
	}

	@Then("^Common error message should display and remaning empty mandatory field should be highlighted in red\\.$")
	public void common_error_message_should_display_and_remaning_empty_mandatory_field_should_be_highlighted_in_red()  {
	    String Errormessage = driver.findElement(By.xpath("//*[@id='contact']/div/div/div/div/div/form[1]/small[2]")).getText();
	    if(Errormessage.equals("Please correct the highlighted fields"))
	    	System.out.println("Common Error message = " + Errormessage + " is displayed");
	    else
	    	System.out.println("Common Error message = " + Errormessage + " is not displayed");
	    
	    String expectedColorCodeInRGB = "rgba(222, 48, 39, 1)";
	    
	    String colorCodeCountry =  driver.findElement(By.xpath("(//*[@id='country'])[3]")).getCssValue("border-top-color");
	    String colorCodeDepartment =  driver.findElement(By.xpath("(//*[@name='department'])[2]")).getCssValue("border-top-color");
	    String colorCodeEmployees =  driver.findElement(By.xpath("(//*[@name='employees'])[2]")).getCssValue("border-top-color");
	    
	    if((colorCodeCountry.equals(expectedColorCodeInRGB)) && (colorCodeDepartment.equals(expectedColorCodeInRGB)) && (colorCodeEmployees.equals(expectedColorCodeInRGB)))
	    	System.out.println("Value is not available for Country, Department and Employees field and it is as expected");
	    	else
	    		System.out.println("Value is not available for any of Country, Department and Employees field and it is not as expected");
	
	}

	@When("^Selected Country field$")
	public void selected_Country_field() throws InterruptedException  {
		Select Country = new Select(driver.findElement(By.xpath("(//*[@id='country'])[3]")));
	    Country.selectByVisibleText("INDIA"); 
	    Thread.sleep(2000); 
	    
	}

	@When("^Selected Department field$")
	public void selected_Department_field() throws InterruptedException  {
		Select Department = new Select(driver.findElement(By.xpath("(//*[@name='department'])[2]")));
	    Department.selectByVisibleText("Travel desk"); 
	    Thread.sleep(2000);
	    
	}

	@When("^Selected Number of Employees field$")
	public void selected_Number_of_Employees_field() throws InterruptedException  {
		Select Employees = new Select(driver.findElement(By.xpath("(//*[@name='employees'])[2]")));
	    Employees.selectByVisibleText("More than 2,500"); 
	    Thread.sleep(2000);
	    
	}

	@When("^provided \"([^\"]*)\" in Comment Box$")
	public void provided_in_Comment_Box(String Comment) throws InterruptedException  {
		driver.findElement(By.xpath("//textarea[@name = 'comments']")).click();
		driver.findElement(By.xpath("//textarea[@name = 'comments']")).sendKeys(Comment);
		Thread.sleep(1000); 
	    
	}

	@When("^Selected I am not robot check box$")
	public void selected_I_am_not_robot_check_box() throws InterruptedException  {
	    //driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
	    Thread.sleep(100000);
	    
	}

	@Then("^Verify Success message should display$")
	public void verify_Success_message_should_display()  {
	    String Successmessage = driver.findElement(By.xpath("//*[@id='contact']/div/div/div/div/div/form[2]")).getText();
	    String Expectedmessage = "Contact details submitted.\n" + "Our representative will contact you within 24 hrs";
	    System.out.println(Successmessage);
	    System.out.println(Expectedmessage);
	    if(Successmessage.equals(Expectedmessage))
	    	System.out.println("Form Submitted successfully");
	    else
	    	System.out.println("Form not submitted");
		
	}

}
