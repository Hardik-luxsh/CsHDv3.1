package testcase;

import TestUtil.*;
import base.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;

public class CxHelpDesk_RegisterPageTests extends TestBase{

    public Cx_HelpDesk_page_RegisterLocator objRegisterPage;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();
    }

    @Test()
    public void validateLogin(){
        try {
            objRegisterPage = new Cx_HelpDesk_page_RegisterLocator(driver);
            objRegisterPage.addCustomer("Test Customer","Test Address","India","963-TW_520","Vadodara"
                    ,"963852","Test Person Name","9638527410" ,"564685" ,
                    "parth183@gmail.com");

            Reporter.log("POSITIVE TESTCASE-1 :Register Page: Add User", true);
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void captureScreenShot(ITestResult result){
        CaptureScreenshot.captureScreenshotForFailedTests(driver,result);
        CaptureScreenshot.captureScreenshotPassedTests(driver,result);
    }
}
