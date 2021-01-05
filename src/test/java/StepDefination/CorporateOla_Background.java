package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CorporateOla_Background {
	
WebDriver driver = Hooks.driver;
	
	@Given("^Go to Corporate Ola Page URL$")
	public void go_to_Corporate_Ola_Page_URL() throws InterruptedException  {
	    driver.get("https://corporate.olacabs.com");
	    Thread.sleep(1000);
	}

	@Then("^Click on Contact Us link in Top Header$")
	public void click_on_Contact_Us_link_in_Top_Header() throws InterruptedException  {
	    driver.findElement(By.xpath("//*[@id='link-contact']")).click();
	    Thread.sleep(1000);
	}

}
