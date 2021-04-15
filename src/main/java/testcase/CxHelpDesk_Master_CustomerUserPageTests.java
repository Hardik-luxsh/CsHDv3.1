package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_Master_CustomerUserLocator;
import pages.Cx_HelpDesk_page_Master_EmployeeLocator;

public class CxHelpDesk_Master_CustomerUserPageTests extends TestBase {

    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_Master_CustomerUserLocator objMasterCustomerUserLocator;

//    @BeforeTest
//    public void initialBrowserDriver() {
//        driver = TestBase.testBase();
//
//        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
//        objLoginPage.validateLogin(Constants.ADMINUSERNAME, Constants.VALIDPASSWORD);
//    }

    @Test(priority = 1)
    public void createCustomerUser(){
        try {
            objMasterCustomerUserLocator = new Cx_HelpDesk_page_Master_CustomerUserLocator(driver);
            objMasterCustomerUserLocator.createCustomerUser("TestCustomer",
            "TestCust14", "12345678","12345678","Test Department",
            "Test Designation","Admin","TestCust14");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void editCustomerUser(){
        try {
            objMasterCustomerUserLocator = new Cx_HelpDesk_page_Master_CustomerUserLocator(driver);
            objMasterCustomerUserLocator.editCustomerUser("UpdatedTestCustomer",
                    "TestCust15", "87654321","87654321","UpdatedTest Department",
                    "UpdatedTest Designation","User","TestCust14");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }



    @AfterMethod
    public void captureScreenShot(ITestResult result){
        CaptureScreenshot.captureScreenshotForFailedTests(driver,result);
        CaptureScreenshot.captureScreenshotPassedTests(driver,result);
    }
}
