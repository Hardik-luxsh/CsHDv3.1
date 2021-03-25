package testcase.cxHelpDesk;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_CreateTicket_OtherLocator;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_OverviewLocator;

public class Cx_HelpDesk_CreateTicket_OtherPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_CreateTicket_OtherLocator objCreateTicketOtherType;
    public static Cx_HelpDesk_page_OverviewLocator objOverview;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.AGENTUSERNAME, Constants.VALIDPASSWORD);
    }

    @Test(priority = 1)
    public void createTicketWithDeliveryIssue(){
        try {
            objCreateTicketOtherType = new Cx_HelpDesk_page_CreateTicket_OtherLocator(driver);
            objCreateTicketOtherType.createTicketWithOtherType();

            objOverview = new Cx_HelpDesk_page_OverviewLocator(driver);
            objOverview.overviewTicket();
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
