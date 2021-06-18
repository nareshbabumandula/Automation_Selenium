package com.testng.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.object.repository.Homepage;

@Ignore
public class IgnoreExample extends Homepage{
	
	WebDriver driver;

	@Ignore
	public void login() {

		// WebDriver coding with Page Object Model
		WebElement USERID = driver.findElement(USERNAME);
		WebElement PWD = driver.findElement(PASSWORD);
		
		USERID.sendKeys("Manideep");
		PWD.sendKeys("Ignorance");
		String actPassword = PWD.getAttribute("value");
		Assert.assertEquals(actPassword, "Ignorance"); // Assertion
		USERID.clear();
		PWD.clear();
		
		
	}
	
	@Test(enabled = true)
	public void navigatetoSampleForms(){
		System.out.println("Successfully navigated to SampleForms..!");
		Assert.assertEquals(false, true);
	}

	@Test(alwaysRun =  true, dependsOnMethods = {"navigatetoSampleForms"})
	public void submitBasicContactForm(){
		System.out.println("Successfully submitted basic contact form..!");
	}

	@BeforeClass
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize(); // Maximize the browser window
	}


	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit(); // Terminate the browser
		
	}

}
