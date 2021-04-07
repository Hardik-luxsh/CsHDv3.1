package testcase.cxHelpDesk;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_Customer_RequestCallBackLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class Cx_HelpDesk_Customer_RequestCallBackPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_Customer_RequestCallBackLocator objRCB;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.CUSTOMERUSERNAME, Constants.VALIDPASSWORD);
    }

    @Test(priority = 1)
    public void createTicketWithDeliveryIssue(){
        try {
            objRCB = new Cx_HelpDesk_page_Customer_RequestCallBackLocator(driver);
            objRCB.requestCallBack();
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
