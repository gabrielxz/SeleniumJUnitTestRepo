package src.test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JUnitExampleWithSeleniumTest 
{
	WebDriver driver;

	@Before
	public void setUp()
	{
	 driver = new FirefoxDriver();
	 driver.get("http://www.google.com");
	}



	@After
	public void tearDown()
	{
	    driver.quit();
	}

	@Test
	public void checkTitle()
	{
	    assertEquals("WRONG!!", "Googlee", driver.getTitle());
	}
	
	@Test
	public void checkTitle2()
	{
	    assertEquals("WRONG!!", "Google", driver.getTitle());
	}


}
