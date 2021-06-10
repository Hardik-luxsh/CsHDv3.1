package testcase;

import TestUtil.*;
import base.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;

public class Cx_HelpDesk_Customer_RequestCallBackPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_Customer_RequestCallBackLocator objRCB;

    @BeforeTest
    public void initBrowser() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.MANAGER_USERNAME, Constants.VALID_PASSWORD);
    }

    @Test(priority = 1)
    public void requestCallBack(){
        try {
            objRCB = new Cx_HelpDesk_page_Customer_RequestCallBackLocator(driver);
            objRCB.requestCallBack("10-04-2020","08-06-2021");
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
