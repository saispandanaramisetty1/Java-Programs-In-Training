package com.basetest;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/**
 * 
 * @author BaseTest
 *Class for basic start of the browser
 */
public class BaseTest
{
	//Declaring the global static variables
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest etest;
	public static Logger logger;
	//method for starting of the browser with argument as an browser	
	@BeforeSuite
	@Parameters("browser")
	public void baseTest(String browser)
	{
		//Generating extent Reports	
		reports = new ExtentReports("./Reports/ExtentReports.html");
		//Generating log4j	
		logger = Logger.getLogger(BaseTest.class.getName());
		DOMConfigurator.configure("log4j.xml");
		logger.info("starting of the browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.firefox.driver", "./Drivers/firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		//navigate to the required url
		driver.get("https://yoaspire.com");
		driver.manage().window().maximize();
	}
	//method for closing the reports
	@AfterSuite
	public void baseClose()
	{
		reports.endTest(etest);
		reports.flush();
		
	}
}
