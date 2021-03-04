package testcase.cxHelpDesk;

import TestUtil.Constants;
import base.TestBase;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_RegisterLocator;

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
                    ,"963852","Test Person Name","9638527410",Constants.ADMINUSERNAME, Constants.VALIDPASSWORD);

            Reporter.log("POSITIVE TESTCASE-1 :Register Page: Add User", true);
            Thread.sleep(3000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
