package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_CreateReturnTicketLocator;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_OverviewLocator;

public class Cx_HelpDesk_OverviewPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_OverviewLocator objOverviewPage;
    public static Cx_HelpDesk_page_CreateReturnTicketLocator objCreateTicket;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.AGENTUSERNAME, Constants.VALIDPASSWORD);

        objCreateTicket = new Cx_HelpDesk_page_CreateReturnTicketLocator(driver);
        objCreateTicket.createReturnTicket();
    }

    @Test(priority = 1)
    public void verifyTicketDetails(){
        try {
            objOverviewPage = new Cx_HelpDesk_page_OverviewLocator(driver);
            objOverviewPage.overviewTicket();
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
