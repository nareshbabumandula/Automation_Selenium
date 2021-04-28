package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocatorsTest {

	static WebDriver driver;

	public static void main(String[] args) {

		//System.setProperty("webdriver.ie.driver", ".\\browsers\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", ".\\browsers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", ".\\browsers\\msedgedriver.exe");
		
		// Set capability of IE driver to Ignore all zones browser protected mode settings.
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		// Initialize InternetExplorerDriver Instance using new capability.
		//WebDriver driver = new InternetExplorerDriver(caps);
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
