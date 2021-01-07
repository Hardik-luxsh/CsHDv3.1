package testcase.cxHelpDesk;

import TestUtil.CaptureScreenshot;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_Master_CustomerLocator;

public class CxHelpDesk_Master_CustomerPageTests extends TestBase {

//    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_Master_CustomerLocator objMasterCustomerLocator;

//    @BeforeTest
//    public void initialBrowserDriver() {
//        driver = TestBase.testBase();
//
//        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
//        objLoginPage.validateLogin(Constants.ADMINUSERNAME, Constants.VALIDPASSWORD);
//    }

    @Test(priority = 1)
    public void createCustomer(){
        try {
            objMasterCustomerLocator = new Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.addCustomer();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void editCustomer(){
        try {
            objMasterCustomerLocator = new Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.editCustomer();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void deleteCustomer(){
        try {
            objMasterCustomerLocator = new Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.deleteCustomer();
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
