package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_LoginLocator;

public class CxHelpDesk_LoginPageTests extends TestBase {

	public Cx_HelpDesk_page_LoginLocator objLoginPage;
	
	@BeforeTest
	public void initialBrowserDriver() {
		driver = TestBase.testBase();
	}

	@Test()
	public void validateLogin(){
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			objLoginPage.validateLogin(Constants.MANAGER_USERNAME, Constants.VALID_PASSWORD);

			Reporter.log("POSITIVE TESTCASE-1 :Login Page: verify Admin User type", true);
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//POSITIVE TESTCASE-1	:Login Page: verify Admin User type
	@Test(priority = 1)
	public void verifyAdminLogin(){
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			objLoginPage.verifyAdminLogin(Constants.ADMIN_USERNAME, Constants.VALID_PASSWORD);

			Reporter.log("POSITIVE TESTCASE-1 :Login Page: verify Admin User type", true);
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//POSITIVE TESTCASE-2	:Login Page: verify AGENT User type
	@Test(priority = 2)
	public void verifyAgentLogin() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			objLoginPage.verifyEmployeeUser(Constants.AGENT_USERNAME, Constants.VALID_PASSWORD);

			Reporter.log("POSITIVE TESTCASE-2	:Login Page: verify Employee User type", true);
			Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//POSITIVE TESTCASE-3	:Login Page: verify MANAGER User type
	@Test(priority = 3)
	public void verifyUserLogin() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			objLoginPage.verifyNormalUser(Constants.MANAGER_USERNAME, Constants.VALID_PASSWORD);

			Reporter.log("POSITIVE TESTCASE-3	:Login Page: verify Normal User type", true);
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void verifyEmptyUsernameEmptyPassword() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			objLoginPage.verifyEmptyUsernameEmptyPassword(Constants.EMPTY_DATA, Constants.EMPTY_DATA);

			Reporter.log("NEGATIVE TESTCASE-1	:Login Page: Empty Username & Password!", true);
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void EmptyUsernameValidPassword() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			//objLoginPage.invalidLogin("", "12345678");
			objLoginPage.validateEmptyUsernameValidPassword(Constants.EMPTY_DATA, Constants.VALID_PASSWORD);

			Reporter.log("NEGATIVE TESTCASE-2	:Login Page: Empty Username & valid Password", true);
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void ValidUsernameEmptyPassword() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			//objLoginPage.invalidLogin("Emp188", "");
			objLoginPage.verifyValidUsernameEmptyPassword(Constants.ADMIN_USERNAME, Constants.EMPTY_DATA);

			Reporter.log("NEGATIVE TESTCASE-3	:Login Page: Valid Username & Empty Password", true);
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//NEGATIVE TESTCASE-4	:Login Page: Invalid Username & valid Password
	@Test(priority = 7)
	public void InvalidUsernameValidPassword() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			//objLoginPage.invalidLogin("!@$~&", "12345678");
			objLoginPage.verifyInvalidUsernameValidPassword(Constants.INVALID_USERNAME, Constants.PASSWORD);

			Reporter.log("NEGATIVE TESTCASE-4	:Login Page: Invalid Username & valid Password", true);
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//NEGATIVE TESTCASE-5	:Login Page: Valid Username & invalid Password
	@Test(priority = 8)
	public void ValidUsernameInvalidPassword() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			//objLoginPage.invalidLogin("testAdmin", "!@$~&");
			objLoginPage.verifyValidUsernameInvalidPassword(Constants.USERNAME, Constants.INVALID_PASSWORD);

			Reporter.log("NEGATIVE TESTCASE-5	:Login Page: Valid Username & invalid Password", true);
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//NEGATIVE TESTCASE-6	:Login Page: Invalid Username & invalid Password
	@Test(priority = 9)
	public void InvalidUsernameInvalidPassword() {
		try {
			objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
			//objLoginPage.invalidLogin("!@$~&", "!@$~&");
			objLoginPage.verifyInvalidUsernameInvalidPassword(Constants.INVALID_USERNAME, Constants.INVALID_PASSWORD);

			Reporter.log("NEGATIVE TESTCASE-6	:Login Page: Invalid Username & invalid Password", true);
			Thread.sleep(2000);

			driver.close();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void captureScreenShot(ITestResult result){
		CaptureScreenshot.captureScreenshotForFailedTests(driver,result);
		CaptureScreenshot.captureScreenshotPassedTests(driver,result);
	}

}
