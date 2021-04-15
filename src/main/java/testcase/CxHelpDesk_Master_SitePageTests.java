package testcase;

import TestUtil.Constants;
import base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_LoginLocator;
import pages.Cx_HelpDesk_page_Master_SiteLocator;

public class CxHelpDesk_Master_SitePageTests extends TestBase {

    Cx_HelpDesk_page_LoginLocator objLoginPage;
    Cx_HelpDesk_page_Master_SiteLocator objMasterSiteLocator;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.ADMINUSERNAME, Constants.VALIDPASSWORD);
    }

    @Test(priority = 1)
    public void createSite(){
        try {
            objMasterSiteLocator = new Cx_HelpDesk_page_Master_SiteLocator(driver);
            objMasterSiteLocator.createSite();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void editSite(){
        try {
            objMasterSiteLocator = new Cx_HelpDesk_page_Master_SiteLocator(driver);
            objMasterSiteLocator.editSite();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void deleteSite(){
        try {
            objMasterSiteLocator = new Cx_HelpDesk_page_Master_SiteLocator(driver);
            objMasterSiteLocator.deleteSite();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
