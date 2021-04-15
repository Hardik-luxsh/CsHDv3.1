package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class Cx_HelpDesk_CreateTicket_DeliveryIssuePageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator objCreateTicket;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.AGENTUSERNAME, Constants.VALIDPASSWORD);
    }

    @Test(priority = 1)
    public void createTicketWithDeliveryIssue(){
        try {
            objCreateTicket = new Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator(driver);
            objCreateTicket.createTicketWithDeliveryIssue();
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
