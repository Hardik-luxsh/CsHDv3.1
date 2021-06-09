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

//    @BeforeTest
//    public void initialBrowserDriver() {
//        driver = TestBase.testBase();
//
//        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
//        objLoginPage.validateLogin(Constants.ADMIN_USERNAME, Constants.VALID_PASSWORD);
//    }

    @Test(priority = 1)
    public void createSite(){
        try {
            objMasterSiteLocator = new Cx_HelpDesk_page_Master_SiteLocator(driver);
            objMasterSiteLocator.createSite("bns_vd" ,"BNSLAXMICO" +  " " + Constants.tempData,
                    "CHHANI JAKATNAJKA","VDA","VADODARA","INDIA","987456","9874561230",
                    "bns_vd" );
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void editSite(){
        try {
            objMasterSiteLocator = new Cx_HelpDesk_page_Master_SiteLocator(driver);
            objMasterSiteLocator.editSite("BNSLAXMICOLuxshtech" + Constants.formatter.getTimeZone().getDisplayName(),
                    "Updated CHHANI JAKATNAJKA","UpdatedVDA","UpdatedVADODARA","UpdatedINDIA","987456","8998121230",
                    "bns_vd");//V3.1
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void deleteSite(){
        try {
            objMasterSiteLocator = new Cx_HelpDesk_page_Master_SiteLocator(driver);
            objMasterSiteLocator.deleteSite("Updated laxmico"); //V3.1
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
