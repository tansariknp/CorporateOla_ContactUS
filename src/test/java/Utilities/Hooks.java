package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
public static WebDriver driver;
	
	@Before
	public void beforetest()
	{
		System.out.println("This is before test statements");
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest()
	{
		System.out.println("This is after test statements");
		driver.close();
	}

}
