package testcase;

import TestUtil.Constants;
import base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class CxHelpDesk_CreateTicketPageTests extends TestBase{

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_CreateReturnTicketLocator objCreateReturnTicketPage;
    public static Cx_HelpDesk_page_CreateMissingTicketLocator objCreateMissingPage;
    public static Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator objCreateDeliveryPage;
    public static Cx_HelpDesk_page_CreateTicket_OtherLocator objCreateOtherPage;

    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.AGENTUSERNAME, Constants.VALIDPASSWORD);
    }
    /*----------------------Return Type---------------------*/
    @Test(priority = 1)
    public void createReturnTicket(){
        try {
            objCreateReturnTicketPage = new Cx_HelpDesk_page_CreateReturnTicketLocator(driver);
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
            objCreateMissingPage = new Cx_HelpDesk_page_CreateMissingTicketLocator(driver);
            objCreateMissingPage.createMissingTicket("Missing products");
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
}