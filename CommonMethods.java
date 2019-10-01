package com.util;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basetest.BaseTest;
import com.google.common.io.Files;

/**
 * 
 * @author CommonMethods
 * Class for common methods like click(),implicit() and sendKeys()
 *
 */
public class CommonMethods extends BaseTest
{
	//For entering the data in the text box
	public static void enter(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	//For clicking the buttons or fields
	public static void click(WebElement arrowIcon)
	{
		arrowIcon.click();
	}
	//For delay
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	//For capturing ScreenShots
	public static void screenShot() throws Exception
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("E:\\YoAspireScreen.jpg"));
	}
	public static void wait(WebDriver driver,WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver,360);
	    wait.until(ExpectedConditions.visibilityOf(webElement));		
	}

}
