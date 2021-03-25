package testcase.cxHelpDesk;

import TestUtil.Constants;
import base.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Cx_HelpDesk_page_CreateMissingTicketLocator;
import pages.Cx_HelpDesk_page_CreateReturnTicketLocator;
import pages.Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator;
import pages.Cx_HelpDesk_page_LoginLocator;

public class CxHelpDesk_CreateTicketPageTests extends TestBase{

    public static Cx_HelpDesk_page_LoginLocator objLoginPage;
    public static Cx_HelpDesk_page_CreateReturnTicketLocator objCreateReturnTicketPage;
    public static Cx_HelpDesk_page_CreateMissingTicketLocator objCreateMissingPage;
    public static Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator objCreateTicket;


    @BeforeTest
    public void initialBrowserDriver() {
        driver = TestBase.testBase();

        objLoginPage = new Cx_HelpDesk_page_LoginLocator(driver);
        objLoginPage.validateLogin(Constants.AGENTUSERNAME, Constants.VALIDPASSWORD);
    }
    /*----------------------Return Type---------------------*/
    @Test
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
    @Test
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
    @Test(priority = 1)
    public void createTicketWithDeliveryIssue(){
        try {
            objCreateTicket = new Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator(driver);
            objCreateTicket.createTicketWithDeliveryIssue();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}