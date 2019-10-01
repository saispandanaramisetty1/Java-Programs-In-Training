package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.basetest.BaseTest;
import com.pages.UserPage;
import com.relevantcodes.extentreports.LogStatus;
import com.util.CommonMethods;
import com.util.ExcelSheet;

/**
 * 
 * @author TestCases
 * Class for executing the different Test Cases
 *
 */
public class TestCases extends BaseTest
{
	//Creating page factory for the user page
	public static UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
	//Testcase for login with valid credentials 
	@Test(priority=1)
	public static void login() throws Exception
	{
		try
		{
			//Starting of the testcase1 for login with valid credentials 
			etest = reports.startTest("testcase1");
			//Reading the username from the Excel Sheet
			String userName = ExcelSheet.readDataFromExcel("UserPageExcel", 1, 1,"./ExcelSheet/UserPageExcel.xlsx");
			//Reading the password from the Excel Sheet
			String password = ExcelSheet.readDataFromExcel("UserPageExcel", 1, 2,"./ExcelSheet/UserPageExcel.xlsx");
			//Calling the login() from the userpage with username and password as an arguments
 			user.login(userName, password);
 			//Testcase info
			etest.log(LogStatus.INFO, "login with valid credentials");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS, "Test is passed");
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
		
	}
	//Testcase for registration of drives with valid credentials 
	@Test(priority=2)
	public static void registerForDrives() throws Exception
	{
		try
		{
			//Starting of the testcase2 for registration of Drives
			etest = reports.startTest("testcase2");
			//Calling the driveRegistration() from the userpage 
			user.driveRegistration();
			//Testcase info
			etest.log(LogStatus.INFO, "register for drives");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS, "Test is passed");	
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
		
	}
	//Testcase for recommending the users
	@Test(priority=3)
	public static void recommendConections() throws Exception
	{
		try
		{
			//Starting of the testcase3 for Recommend Conections
			etest = reports.startTest("testcase3");
			//Reading the search field from the Excel Sheet
			String search = ExcelSheet.readDataFromExcel("UserPageExcel", 2, 1,"./ExcelSheet/UserPageExcel.xlsx");
			//Reading the text from the Excel Sheet
			String text = ExcelSheet.readDataFromExcel("UserPageExcel", 2, 2,"./ExcelSheet/UserPageExcel.xlsx");
			//Calling therecommendingConnections() from the userpage with search and text as an arguments
			user.recommendingConnections(search,text);
			//Testcase info
			etest.log(LogStatus.INFO, "recommend connections");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS,"Test is passed");
		}
		
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
	}
	//Testcase for connecting the other users
	@Test(priority=4)
	public static void connections() throws Exception
	{
		try
		{
			//Starting of the testcase4 for Conections
			etest = reports.startTest("testcase4");
			//Reading the search field from the Excel Sheet
			String search = ExcelSheet.readDataFromExcel("UserPageExcel", 3, 1,"./ExcelSheet/UserPageExcel.xlsx");
			//Calling the myConnections() from the userpage with search as an argument
			user.myConnections(search);
			//Testcase info
			etest.log(LogStatus.INFO, "connect to the new users");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS,"Test is passed");
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
		
	}
	//Testcase for recommending connections connections
	@Test(priority=5)
	public static void connectionsConnections() throws Exception
	{
		try
		{
			//Starting of the testcase5 for Conections Connections
			etest = reports.startTest("testcase5");
			//Reading the text from the Excel Sheet
			String text = ExcelSheet.readDataFromExcel("UserPageExcel", 4, 1,"./ExcelSheet/UserPageExcel.xlsx");
			//Calling the connectionConnections() from the userpage with text as an argument
			user.connectionConnections(text);
			//Testcase info
			etest.log(LogStatus.INFO, "connecting tho the friend connections");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS,"Test is passed");
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
		
	}
	//Testcase for reading the articles
	@Test(priority=6)
	public static void articles() throws Exception
	{
		try
		{
			//Starting of the testcase6 for Articles
			etest = reports.startTest("testcase6");
			//Calling the articles() from the userpage
			user.articles();
			//Testcase info
			etest.log(LogStatus.INFO, "open and read articles");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS,"Test is passed");
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
		
	}
	//Testcase for sending the messages
	@Test(priority=7)
	public static void messages() throws Exception
	{
		try
		{
			//Starting of the testcase7 for Messages
			etest = reports.startTest("testcase7");
			//Reading the message from the Excel Sheet
			String message = ExcelSheet.readDataFromExcel("UserPageExcel", 5, 1,"./ExcelSheet/UserPageExcel.xlsx");
			//Calling the messages() from the userpage with message as an argument
			user.messages(message);
			//Testcase info
			etest.log(LogStatus.INFO, "sending messages");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS,"Test is passed");
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
	}
	//Testcase for logout from the website
	@Test(priority=8 )
	public static void logOut() throws Exception
	{
		try
		{
			//Starting of the testcase8 for logout
			etest = reports.startTest("testcase8");
			//Calling the logout() from the userpage
			user.logout();
			//Testcase info
			etest.log(LogStatus.INFO, "logout");
			//Testcase status as passed or failed
			etest.log(LogStatus.PASS,"Test is passed");
		}
		catch(Exception e)
		{
			//Calling the screenShot() from the CommonMethods class
			CommonMethods.screenShot();
		}
	}
	


}
