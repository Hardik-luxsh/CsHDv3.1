package testcase;

import TestUtil.*;
import base.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;

public class Cx_HelpDesk_Customer_SearchMyInvoicePageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_Customer_SearchMyInvoiceLocator objSMI;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.MANAGER_USERNAME, Constants.VALID_PASSWORD);
    }

    @Test(priority = 1)
    public void searchMyInvoice(){
        try {
            objSMI = new Cx_HelpDesk_page_Customer_SearchMyInvoiceLocator(driver);
            objSMI.searchMyInvoice("01-10-2019","10-06-2021");
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
