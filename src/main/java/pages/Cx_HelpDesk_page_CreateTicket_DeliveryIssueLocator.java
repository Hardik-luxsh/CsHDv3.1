package pages;

import TestUtil.Constants;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_CreateTicket_DeliveryIssueLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//img[@class=\"logo-default\"]")
    public WebElement logo_img;

    //    @FindBy(xpath = "//span[contains(text(),'Customer')]")
    @FindBy(xpath = "//span[contains(text(),'Customer') and @class='title']") //Changes in v2.0 on 04-Feb-2021
    public WebElement sidebar_textCustomer;

    @FindBy(xpath = "//span[contains(text(),'Create a New Ticket')]")
    public WebElement sidebar_textCreateTicket;

    @FindBy(xpath = "//a[contains(text(),'Outbound Call')]")
    public WebElement channel_OutboundCall;

    @FindBy(xpath = "//a[contains(text(),'Email')]")
    public WebElement channel_Email;

    @FindBy(xpath = "//a[contains(text(),'Received Call')]")
    public WebElement channel_ReceivedCall;

    @FindBy(xpath = "//select[@id='selectBox']") //Changes in v3.1 on 27-May-2021
    public WebElement Site;

    @FindBy(xpath = "//input[@formcontrolname=\"AccountNumber\"]") //Changes in v3.1 on 27-May-2021
    public WebElement AccountNoAutoSuggestion;

    @FindBy(xpath = "//strong[normalize-space()='Ankur Bhavsar']") //Changes in v3.1 on 27-May-2021
    public WebElement AccountNo_S1032;

    //    @FindBy(xpath = "//select[@id='selectBox']") //Existing in v2.0
    @FindBy(xpath = "//input[@formcontrolname='name']") //Changes in v3.1 on 27-May-2021
    public WebElement customer;

    @FindBy(xpath = "//input[@placeholder='Enter Address']") //Changes in v3.1 on 27-May-2021
    public WebElement Address;

    @FindBy(xpath = "//input[@placeholder='Enter Contact No.']") //Changes in v3.1 on 27-May-2021
    public WebElement ContactNo;

    @FindBy(xpath = "//span[contains(text(),'Create New Ticket')]")
    public WebElement titleCreateTicket;

    @FindBy(xpath = "//select[@id='createTicketTitle']")
    public WebElement ticketType; //Returns

    @FindBy(xpath = "//select[@formcontrolname='Priority']")
    public WebElement priority;

    @FindBy(xpath = "//input[@formcontrolname='Description']") //Changes in v3.1 on 27-May-2021
    public WebElement description;

    @FindBy(xpath = "//input[@formcontrolname='Owner']") //Changes in v3.1 on 27-May-2021
    public WebElement Owner;

    @FindBy(xpath = "//select[@formcontrolname='Status']")
    public WebElement state;

    @FindBy(xpath = "//input[@formcontrolname='Tags']")
    public WebElement tag;

    //    //div[@class='form-control uneditable-input input-fixed input-small fileUPload'] //v3.1
//    @FindBy(xpath = "//input[@type=\"file\"]")
    @FindBy(xpath = "//div[@class=\"input-group input-small\"]//div")
    public WebElement file;

    @FindBy(xpath = "//input[@formcontrolname='Comment']")
    public WebElement AgentComment;

    @FindBy(xpath = "//form[@class='ng-invalid ng-dirty ng-touched']//input[@value='Save']") //Changes in v3.1 on 27-May-2021
    public WebElement buttonSave;

    /*---START---------------------------------------Delivery Issue popup-----------------------------------------------*/

    @FindBy(xpath = "(//div[@class=\"modal-content\"])[4]")
    public WebElement popupDI;

    @FindBy(xpath = "//h4[contains(text(),'Delivery Issue')]")
    public WebElement titleDeliveryIssue;

    @FindBy(xpath = "//h4[normalize-space()='Delivery Issue']/../..//span[contains(text(),'--- Select ---')]") //Changes in v3.1 on 01-June-2021
    public WebElement InvoiceDropdown;

    @FindBy(xpath = "//input[@class='c-input ng-pristine ng-valid ng-star-inserted ng-touched']") //Changes in v3.1 on 03-June-2021
    public WebElement SearchInvoice;

    @FindBy(xpath = "//label[normalize-space()='980100123']") //Changes in v3.1 on 27-May-2021
    public WebElement InvoiceNo_980100123;

    @FindBy(xpath = "//a[normalize-space()='980100123*']") //Changes in v3.1 on 06-June-2021
    public WebElement Tab_InvoiceNo_980100123;

    @FindBy(xpath = "//label[normalize-space()='980100125']") //Changes in v3.1 on 08-June-2021
    public WebElement InvoiceNo_980100125;

    @FindBy(xpath = "//a[normalize-space()='980100125*']") //Changes in v3.1 on 06-June-2021
    public WebElement Tab_InvoiceNo_980100125;

    @FindBy(xpath = "//label[normalize-space()='980100127']") //Changes in v3.1 on 08-June-2021
    public WebElement InvoiceNo_980100127;

    @FindBy(xpath = "//a[normalize-space()='980100127*']") //Changes in v3.1 on 06-June-2021
    public WebElement Tab_InvoiceNo_980100127;

    @FindBy(xpath = "//h4[contains(text(),'Delivery Issue')]/../..//label[contains(text(),'Invoice No')]/..//input")
    public WebElement InvoiceNo;

    @FindBy(xpath = "//h4[contains(text(),'Delivery Issue')]/../..//label[contains(text(),'Invoice Date')]/..//input")
    public WebElement InvoiceDate;

    @FindBy(xpath = "//h4[normalize-space()='Delivery Issue']/../..//input[@value='Proceed']") //Changes in v3.1 on 02-June-2021
    public WebElement ProceedButton;

    @FindBy(xpath = "//h4[normalize-space()='Delivery Issue']/../..//input[@value='Back']") //Changes in v3.1 on 02-June-2021
    public WebElement BackButton;

    //------------------------------------------------Report A Driver Issue---------------------------------------------*/
    @FindBy(xpath = "//select[@id='selectBoxIssue']")
    public  WebElement SelectDeliveryIssue;

    @FindBy(xpath = "//input[@formcontrolname='message']")
    public  WebElement DeliveryIssueMessage;

    @FindBy(xpath = "//div[@id='delivery_ticket_invoices1']//button[@type='button'][normalize-space()='Save']") //Changes in v3.1 on 02-June-2021
    public WebElement SaveInvoiceButton;

    //    @FindBy(xpath = "//form[@class='ng-touched ng-dirty ng-valid']//div[@class='text-center']//button[@type='button'][normalize-space()='Save']") //Changes in v3.1 on 02-June-2021
    @FindBy(xpath = "//app-delivertissues//div[@class='text-center']//button[@type='button'][normalize-space()='Save']")
    public WebElement SaveDIButton;

    //    @FindBy(xpath = "(//input[@value='Full Invoice'])[1]")
    @FindBy(xpath = "//div[@class='form-group text-right']//button[@type='button'][normalize-space()='View Full Invoice']") //Changes in v3.1 on 02-June-2021
    public WebElement ViewInvoiceButton;

    //    @FindBy(xpath ="(//input[@value='Close'])[4]")
    @FindBy(xpath ="//div[@class='modal-dialog modal-lg']//button[@type='button'][normalize-space()='Close']")    //Changes in v3.1 on 27-May-2021
    public WebElement ViewInvoicePopUp_CloseButton;

    /*---END------------------------------------------Delivery Issue popup----------------------------------------------*/

    /*----------------------------------Summary Section---Added in v3.1-------------------------------------------------*/
    @FindBy(xpath = "//span[normalize-space()='Summary']")    //Changes in v3.1 on 27-May-2021
    public WebElement titleSummary;

//    @FindBy(xpath = "//button[@class='btn blue'][normalize-space()='View Full Invoice']")    //Changes in v3.1 on 27-May-2021
//    public WebElement Summary_ViewFullInvoiceButton;
//
//    @FindBy(xpath = "//div[@class='dataTables_scrollFootInner']//b[contains(text(),'Net Total :')]") //Changes in v3.1 on 27-May-2021
//    public WebElement NetTotal;
//
//    @FindBy(xpath = "//div[@class='dataTables_scrollFootInner']//b[contains(text(),'Grand Total :')]") //Changes in v3.1 on 27-May-2021
//    public WebElement GrandTotal;

    @FindBy(xpath = "//button[normalize-space()='Edit']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_EditButton;

    @FindBy(xpath = "//input[@placeholder='Display Responsible Person Name']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_RPName;

    @FindBy(xpath = "//input[@placeholder='Display Position']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_RP_Position;
    /*------------------------------------------------End of-SUMMARY----------------------------------------------------*/

    @FindBy(xpath = "//span[contains(text(),' Create New Ticket ')]/../../..//input[@value='Save']")
    public WebElement DI_SaveButton;

    @FindBy(xpath = "//h4[contains(text(),'Confirm Ticket Creation!')]")
    public WebElement titleConfirmTicket;

    @FindBy(xpath = "//h3[contains(text(),'Are You Sure To Create Ticket For')]")
    public WebElement titleConfirmTicketContent;

    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement optionConfirmYesTicket;

    @FindBy(xpath = "//h4[contains(text(),'Ticket Created Successfully!')]")
    public WebElement successTitleTicket;

    @FindBy(xpath = "//h4[contains(text(),'Ticket Created Successfully!')]/../..//p[contains(text(),\" Ticket Created Successfully for\")]")
    public WebElement successMsgTicket;

    @FindBy(xpath = "//h4[contains(text(),'Ticket Created Successfully!')]/../..//input[@value=\"OK\"]")
    public WebElement okMsgTicket;

    @FindBy(xpath = "//input[@value='No']")
    public WebElement optionConfirmNoTicket;

    @FindBy(xpath = "//input[@value='No']")
    public WebElement optionConfirmCloseTicket;

    @FindBy(xpath = "//h4[text()='Confirm Ticket Creation!']/../button")
    public WebElement closeConfirmCreateTicket;

    /**
     * TESTCASE: CREATE TICKET with DELIVERY ISSUE
     */
    public void createTicketWithDeliveryIssue(){
        genericUtil = new GenericUtil();
        try {
            enterTicketDetails();

            HighlightElement.highlightElement(ticketType);
            genericUtil.click(ticketType);
            Select selectTicketType = new Select(ticketType);
            selectTicketType.selectByVisibleText("Delivery Issue");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

            /*---BEGIN-------------Delivery Issue popup-----------------*/
            HighlightElement.highlightElement(titleDeliveryIssue);

            HighlightElement.highlightElement(InvoiceDropdown);
            genericUtil.clickWithPause(InvoiceDropdown,1000);

            HighlightElement.highlightElement(InvoiceNo_980100123);
            genericUtil.clickWithPause(InvoiceNo_980100123,1000);

            HighlightElement.highlightElement(InvoiceNo_980100125); //Added on 08-June-21
            genericUtil.clickWithPause(InvoiceNo_980100125,1000);

            HighlightElement.highlightElement(InvoiceNo_980100127); //Added on 08-June-21
            genericUtil.clickWithPause(InvoiceNo_980100127,1000);

            HighlightElement.highlightElement(ProceedButton);
            genericUtil.clickWithPause(ProceedButton,1000);

            HighlightElement.highlightElement(Tab_InvoiceNo_980100123); //Added on 08-June-21
            genericUtil.clickWithPause(Tab_InvoiceNo_980100123,1000);
            saveInvoice();

            HighlightElement.highlightElement(Tab_InvoiceNo_980100125); //Added on 08-June-21
            genericUtil.clickWithPause(Tab_InvoiceNo_980100125,1000);
            saveInvoice();

            HighlightElement.highlightElement(Tab_InvoiceNo_980100127); //Added on 08-June-21
            genericUtil.clickWithPause(Tab_InvoiceNo_980100127,1000);
            saveInvoice();
            enterDIData();

            /*---END-------------Delivery Issue popup-----------------*/
            HighlightElement.highlightElement(SaveInvoiceButton);
            genericUtil.clickWithPause(SaveInvoiceButton,1000);

            /*------BEGIN-----------------------------------SUMMARY--------------------------------------*/
            HighlightElement.highlightElement(titleSummary);
            genericUtil.clickWithPause(titleSummary,1000);

//            HighlightElement.highlightElement(Summary_ViewFullInvoiceButton);
//            genericUtil.clickWithPause(Summary_ViewFullInvoiceButton,1000);

            HighlightElement.highlightElement(Summary_EditButton);
            genericUtil.clickWithPause(Summary_EditButton,1000);

//            HighlightElement.highlightElement(NetTotal);
//            genericUtil.clickWithPause(NetTotal,1000);
//
//            HighlightElement.highlightElement(GrandTotal);
//            genericUtil.clickWithPause(GrandTotal,1000);

            HighlightElement.highlightElement(SaveDIButton);
            genericUtil.clickWithPause(SaveDIButton,1000);

            /*------END Of--------------------------------SUMMARY-----------------------------------*/

            enterTicketOtherDetail();

            HighlightElement.highlightElement(DI_SaveButton);
            genericUtil.clickWithPause(DI_SaveButton, 2000);

            HighlightElement.highlightElement(titleConfirmTicket);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(titleConfirmTicketContent);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(optionConfirmYesTicket);
            genericUtil.clickWithPause(optionConfirmYesTicket, 3000);

            HighlightElement.highlightElement(successTitleTicket);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(successMsgTicket);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(okMsgTicket);
            genericUtil.clickWithPause(okMsgTicket, 2000);
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    public void enterTicketDetails(){
        wait.until(ExpectedConditions.visibilityOf(sidebar_textCustomer));
        HighlightElement.highlightElement(sidebar_textCustomer);
        sidebar_textCustomer.click();
        genericUtil.pause(2000);

        HighlightElement.highlightElement(sidebar_textCreateTicket);
        sidebar_textCreateTicket.click();
        genericUtil.pause(2000);
        Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "createnewticket");

        HighlightElement.highlightElement(titleCreateTicket);
        genericUtil.pause(1000);

        HighlightElement.highlightElement(channel_Email);
        genericUtil.clickWithPause(channel_Email,1000);

        HighlightElement.highlightElement(AccountNoAutoSuggestion);
        genericUtil.writeTextWithPause(AccountNoAutoSuggestion,"S1032",1000);

        HighlightElement.highlightElement(AccountNo_S1032);
        genericUtil.clickWithPause(AccountNo_S1032,1000);

        HighlightElement.highlightElement(customer);
        genericUtil.clickWithPause(customer,1000);

        HighlightElement.highlightElement(Site);
        genericUtil.clickWithPause(Site,1000);
        Select selectSiteType = new Select(Site);
        selectSiteType.selectByVisibleText("HP Tech");
        genericUtil.pause(1000);
        genericUtil.click(Site);
        genericUtil.pause(1000);

        HighlightElement.highlightElement(Address);
        genericUtil.clickWithPause(Address,1000);

        HighlightElement.highlightElement(ContactNo);
        genericUtil.clickWithPause(ContactNo,1000);
    }

    public void enterTicketOtherDetail() throws AWTException {
        HighlightElement.highlightElement(priority);
        genericUtil.click(priority);
        genericUtil.pause(1000);
        Select selectPriority = new Select(priority);
        selectPriority.selectByVisibleText("Low");
        genericUtil.clickWithPause(priority,1000);

        HighlightElement.highlightElement(description);
        genericUtil.click(description);
        genericUtil.writeTextWithPause(description, "Test Description", 1000);
        genericUtil.pause(1000);

        HighlightElement.highlightElement(Owner);
        genericUtil.pause(1000);

        HighlightElement.highlightElement(state);
        genericUtil.pause(1000);

        HighlightElement.highlightElement(tag);
        genericUtil.writeTextWithPause(tag, "#New#Created#Open#", 2000);

        HighlightElement.highlightElement(file);
        genericUtil.clickWithPause(file, 2000);

        /*------START------------File Upload Logic--------------------*/
        // Specify the file location with extension
        StringSelection sel1 = new StringSelection(Constants.FILE_UPLOAD_PATH);

        // Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1,null);
        System.out.println("selection" +sel1);
        // Create object of Robot class
        Robot robot1 = new Robot();
        genericUtil.pause(1000);

        // Press Enter
        robot1.keyPress(KeyEvent.VK_ENTER);

        // Release Enter
        robot1.keyRelease(KeyEvent.VK_ENTER);

        // Press CTRL+V
        robot1.keyPress(KeyEvent.VK_CONTROL);
        robot1.keyPress(KeyEvent.VK_V);

        // Release CTRL+V
        robot1.keyRelease(KeyEvent.VK_CONTROL);
        robot1.keyRelease(KeyEvent.VK_V);
        genericUtil.pause(1000);

        //Press Enter
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        /*------END------------File Upload Logic----------------------*/
        genericUtil.pause(2000);

        HighlightElement.highlightElement(AgentComment);
        genericUtil.writeTextWithPause(AgentComment, "Testing Agent comment added..!!", 1000);
    }

    public void saveInvoice(){
        HighlightElement.highlightElement(SelectDeliveryIssue);
        genericUtil.click(SelectDeliveryIssue);
        Select selectDI = new Select(SelectDeliveryIssue);
        selectDI.selectByVisibleText("Report A Driver Issue");
        genericUtil.pause(500);
        genericUtil.click(SelectDeliveryIssue);
        genericUtil.pause(800);

        HighlightElement.highlightElement(DeliveryIssueMessage);
        genericUtil.writeTextWithPause(DeliveryIssueMessage, "Test Message.!!", 1000);
        genericUtil.pause(1000);

        HighlightElement.highlightElement(SaveInvoiceButton);
        genericUtil.clickWithPause(SaveInvoiceButton,2000);
        genericUtil.pause(2000);
    }

    public void enterDIData(){
        HighlightElement.highlightElement(SaveDIButton);
        genericUtil.clickWithPause(SaveDIButton,1000);
    }
}
