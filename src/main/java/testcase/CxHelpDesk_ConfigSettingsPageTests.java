package testcase;

import TestUtil.*;
import base.*;
import org.testng.annotations.*;
import pages.*;

public class CxHelpDesk_ConfigSettingsPageTests extends TestBase {

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_ConfigSettingLocator objConfigPage;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.MANAGER_USERNAME, Constants.VALID_PASSWORD);
    }

    @Test(priority = 1)
    public void verifyConfigSetting(){
        try {
            objConfigPage = new Cx_HelpDesk_page_ConfigSettingLocator(driver);
            objConfigPage.verifyConfigSettings();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
