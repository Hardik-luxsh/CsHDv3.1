package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_AOT_EditTicketLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class Cx_HelpDesk_page_AOT_EditTicketPageTests extends TestBase {

    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_AOT_EditTicketLocator objEditTicket;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.ADMIN_USERNAME, Constants.VALID_PASSWORD);
    }

    @Test(priority = 1)
    public void EditTicket(){
        try {
            objEditTicket = new Cx_HelpDesk_page_AOT_EditTicketLocator(driver);
            objEditTicket.EditTicket("697","Open","Low","HoD Operations","HodDept","Ticket Esc","10=04=2021","08-06-2021");
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
