package testcase;

import TestUtil.*;
import base.TestBase;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;

public class CxHelpDesk_CreateTicketPageTests extends TestBase{

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_CreateTicket_ReturnTypeLocator objCreateReturnTicketPage;
    public static Cx_HelpDesk_page_CreateTicket_MissingTypeLocator objCreateMissingPage;
    public static Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator objCreateDeliveryPage;
    public static Cx_HelpDesk_page_CreateTicket_Complaints_Locator objCreateComplaintsPage; //Changes: Added in ver3.1
    public static Cx_HelpDesk_page_CreateTicket_OtherLocator objCreateOtherPage;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.AGENT_USERNAME, Constants.VALID_PASSWORD);
    }

    /*----------------------Return Type---------------------*/
    @Test(priority = 1)
    public void createReturnTicket(){
        try {
            objCreateReturnTicketPage = new Cx_HelpDesk_page_CreateTicket_ReturnTypeLocator(driver);
            objCreateReturnTicketPage.createReturnTicket();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /*----------------------Missing Type---------------------*/
    @Test(priority = 2)
    public void createMissingTicket(){
        try {
            objCreateMissingPage = new Cx_HelpDesk_page_CreateTicket_MissingTypeLocator(driver);
            objCreateMissingPage.createMissingTicket();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /*----------------------DeliveryIssue Type---------------------*/
    @Test(priority = 3)
    public void createDeliveryIssueTicket(){
        try {
            objCreateDeliveryPage = new Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator(driver);
            objCreateDeliveryPage.createTicketWithDeliveryIssue();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /*----------------------Other Type---------------------*/
    @Test(priority = 4)
    public void createOtherTicket(){
        try {
            objCreateOtherPage = new Cx_HelpDesk_page_CreateTicket_OtherLocator(driver);
            objCreateOtherPage.createTicketWithOtherType();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /*----------------------COMPLAINTS Type---------------------*/
    @Test(priority = 5)
    public void createComplaintsTicket(){
        try {
            objCreateComplaintsPage = new Cx_HelpDesk_page_CreateTicket_Complaints_Locator(driver);
            objCreateComplaintsPage.createTicketWithComplaintsType();
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