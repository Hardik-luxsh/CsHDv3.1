package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_AOT_EscTicketUpdateLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class Cx_HelpDesk_page_AOT_EscTicketUpdatePageTests extends TestBase {
    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_AOT_EscTicketUpdateLocator objEscalatedTU;

//    @BeforeTest
//    public void initialBrowserDriver() {
//        driver = TestBase.testBase();
//
//        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
//        objLoginPage.validateLogin(Constants.ADMINUSERNAME, Constants.VALIDPASSWORD);
//    }

    @Test(priority = 1)
    public void EscTicketUpdate(){
        try {
            objEscalatedTU = new Cx_HelpDesk_page_AOT_EscTicketUpdateLocator(driver);
            objEscalatedTU.ESCTicketUpdate("700");
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
