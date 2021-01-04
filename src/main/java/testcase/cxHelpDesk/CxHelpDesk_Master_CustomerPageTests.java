package testcase.cxHelpDesk;

import TestUtil.CaptureScreenshot;
import base.TestBase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class CxHelpDesk_Master_CustomerPageTests extends TestBase {

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();
    }


    @AfterMethod
    public void captureScreenShot(ITestResult result){
        CaptureScreenshot.captureScreenshotForFailedTests(driver,result);
        CaptureScreenshot.captureScreenshotPassedTests(driver,result);
    }
}
