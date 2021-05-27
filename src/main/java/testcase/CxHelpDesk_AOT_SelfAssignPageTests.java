package testcase;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_AOT_SelfAssignLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class CxHelpDesk_AOT_SelfAssignPageTests extends TestBase {
    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_AOT_SelfAssignLocator objSelfAssign;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.ADMIN_USERNAME, Constants.VALID_PASSWORD);
    }

    @Test(priority = 1)
    public void SelfAssign(){
        try {
            objSelfAssign = new Cx_HelpDesk_page_AOT_SelfAssignLocator(driver);
            objSelfAssign.AssignTicket("153");
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
