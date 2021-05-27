package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_Master_CustomerLocator;
import pages.Cx_HelpDesk_page_Master_GroupLocator;

public class CxHelpDesk_Master_CustomerPageTests extends TestBase {

    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_Master_CustomerLocator objMasterCustomerLocator;

//    @BeforeTest
//    public void initialBrowserDriver() {
//        driver = TestBase.testBase();
//
//        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
//        objLoginPage.validateLogin(Constants.MANAGERUSERNAME, Constants.VALIDPASSWORD);
//    }

    @Test(priority = 1)
    public void createCustomer(){
        try {
            objMasterCustomerLocator = new Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.addCustomer("TestCustomerName","TestAddress","TestCounty",
                    "1234-_abc","VADODARA","395002","TestContactPersonName",
                    "9638527410", "963852","psp.patel@luxshtech.com","LuxshTechnology");//V3.0
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void editCustomer(){
        try {
            objMasterCustomerLocator = new Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.editCustomer("UpdatedTestCustomerName","UpdatedTestAddress","UpdatedTestCounty",
                    "3421-_cba","BANGLURU","395002","UpdatedTestContactPersonName",
                    "9852367410", "963654","hpp.praati@luxshtech.com","Luxsh UK System");//V3.0
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void deleteCustomer(){
        try {
            objMasterCustomerLocator = new Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.deleteCustomer("UpdatedTestCustomerName");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void importCustomer(){
        try {
            objMasterCustomerLocator = new  Cx_HelpDesk_page_Master_CustomerLocator(driver);
            objMasterCustomerLocator.importCustomer();
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
