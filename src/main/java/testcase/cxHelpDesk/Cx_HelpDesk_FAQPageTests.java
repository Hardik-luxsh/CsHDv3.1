package testcase.cxHelpDesk;

import TestUtil.CaptureScreenshot;
import TestUtil.Constants;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_FAQLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class Cx_HelpDesk_FAQPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_FAQLocator objFaqPage;

    @BeforeTest
    public void initBrowser() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.MANAGERUSERNAME, Constants.VALIDPASSWORD);
    }

    @Test(priority = 1)
    public void verifyFAQsDetails(){
        try {
            objFaqPage = new Cx_HelpDesk_page_FAQLocator(driver);
            objFaqPage.verifyFAQsDetails();
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
