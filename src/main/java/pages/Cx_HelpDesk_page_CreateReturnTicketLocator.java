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

public class Cx_HelpDesk_page_CreateReturnTicketLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_CreateReturnTicketLocator(WebDriver driver) {
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

//    @FindBy(xpath = "//label[contains(text(),'Owner')]/..//input[@class='form-control']")
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

    @FindBy(xpath = "//input[@formcontrolname=\"Comment\"]")
    public WebElement CustomerComment;

//    @FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
//    @FindBy(xpath = "//span[contains(text(),' Create New Ticket ')]/../../..//input[@value=\"Submit\"]")
    @FindBy(xpath = "//form[@class='ng-invalid ng-dirty ng-touched']//input[@value='Save']") //Changes in v3.1 on 27-May-2021
    public WebElement buttonSave;

    //-------------------------------------------------------------------------------
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

    /*-----------------Return Pop-Up window----------------*/

    @FindBy(xpath = "//div[@id='returnsPopUp']//h4[@class='modal-title'][normalize-space()='Returns']") //Changes in v3.1 on 27-May-2021
    public WebElement popupTitleReturn;

//    @FindBy(xpath = "(//div[@class=\"modal-content\"])[4]")
//    public WebElement popupReturn;

//    @FindBy(xpath = "//select[@id='returninvoiceno']")
    @FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-valid']//div[@class='col-md-6']//div[@class='c-btn']") //Changes in v3.1 on 27-May-2021
    public WebElement InvoiceDropdown;

    @FindBy(xpath = "//input[@class='c-input ng-pristine ng-valid ng-star-inserted ng-touched']") //Changes in v3.1 on 27-May-2021
    public WebElement SearchInvoice;

    @FindBy(xpath = "//div[@id='returnsPopUp']//li[1]") //Changes in v3.1 on 27-May-2021
    public WebElement InvoiceNo_980100123;

//    @FindBy(xpath = "//label[normalize-space()='980100123']") //Changes in v3.1 on 27-May-2021
//    public WebElement InvoiceNo_980100123;

    @FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-valid']//div[@class='col-md-6 margin-top-20']//input[@value='Proceed']") //Changes in v3.1 on 27-May-2021
    public WebElement ProceedButton;

    @FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-valid']//div[@class='col-md-6 margin-top-20']//input[@value='Back']") //Changes in v3.1 on 27-May-2021
    public WebElement BackButton;

//    @FindBy(xpath = "(//input[@value='Full Invoice'])[1]")
    @FindBy(xpath = "//div[@class='form-group text-right']//button[@type='button'][normalize-space()='View Full Invoice']") //Changes in v3.1 on 27-May-2021
    public WebElement ViewInvoiceButton;

//    @FindBy(xpath ="(//input[@value='Close'])[4]")
    @FindBy(xpath ="//div[@class='modal-dialog modal-lg']//button[@type='button'][normalize-space()='Close']")    //Changes in v3.1 on 27-May-2021
    public WebElement ViewInvoicePopUp_CloseButton;

//    @FindBy(xpath = "//input[@value=\"Return Full Invoice\"]")
    @FindBy(xpath = "//button[normalize-space()='Return Full Invoice']") //Changes in v3.1 on 27-May-2021
    public WebElement ReturnFullInvoiceButton;

//    @FindBy(xpath = "//span[contains(text(),'Paracetamol SF 250/5ml Sus 1Lt')]")
    @FindBy(xpath = "//span[normalize-space()='Calcium Carb 250mg Disp Tabs 60s']") //Changes in v3.1 on 27-May-2021
    public WebElement ProductName;

//    @FindBy(xpath = "//input[@id='returnqty0']")
    @FindBy(xpath = "//input[@id='returnqty']") //Changes in v3.1 on 27-May-2021
    public WebElement ReturnQty;

//    @FindBy(xpath = "//input[@id='returnBoxes0']")
    @FindBy(xpath = "//input[@id='returnBoxes']") //Changes in v3.1 on 27-May-2021
    public WebElement ReturnBoxesQty;

//    @FindBy(xpath = "(//label[contains(text(),'Net Amount')])[2]/..//input")
    @FindBy(xpath = "//tbody//b[contains(text(),'Net Total :')]") //Changes in v3.1 on 27-May-2021
    public WebElement NetAmount;

    @FindBy(xpath = "//tbody//b[contains(text(),'Grand Total :')]") //Changes in v3.1 on 27-May-2021
    public WebElement GrandAmount;

    @FindBy(xpath = "//tbody//button[@type='button'][normalize-space()='Save']") //Changes in v3.1 on 27-May-2021
    public WebElement SaveInvoiceButton;

    //-----------------------------Return Reason Section------------------------------------------
    @FindBy(xpath = "//input[@id='returnSelectProduct']") //Changes in v3.1 on 27-May-2021
    public WebElement ReturnSelectedProduct;

    @FindBy(xpath = "//select[@id='returnProductReason']")
    public WebElement ReturnSelectReason;

//    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline'])[4]/span")
    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline'])[6]/span") //Changes in v3.1 on 27-May-2021
    public WebElement Reason_PIPCodeErrorCheckbox;

//    @FindBy(xpath = "(//input[@value='Submit'])[3]")
    @FindBy(xpath = "//app-returnsproduct//input[@value='Save']")   //Changes in v3.1 on 27-May-2021
    public WebElement ReturnReason_SaveButton;

//    @FindBy(xpath = "(//input[@value='Submit'])[3]")
    @FindBy(xpath = "//app-returns//input[@value='Save']")  //Changes in v3.1 on 27-May-2021
    public WebElement ReturnPop_SaveButton;

    //----------------------------------------DECLARATION FORM----------------------------------------

    //    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline'])[6]/span")
    @FindBy(xpath = "//div[@class='form-group m-t-30']//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']//span") //Changes in v3.1 on 27-May-2021
    public WebElement DeclarationCheckbox;

    @FindBy(xpath = "//label[@for='radio14']/span[@class='box']")
    public WebElement Declaration_Radio1_Yes;

    @FindBy(xpath = "//label[@for='radio18']/span[@class='box']")
    public WebElement Declaration_Radio3_Yes;

//    @FindBy(xpath = "(//input[@value=\"Submit\"])[4]")
//    @FindBy(xpath = "//form[@class='form-horizontal ng-untouched ng-pristine ng-valid']//input[@value='Save']") //Changes in v3.1 on 27-May-2021
//    public WebElement Declaration_SaveButton;

    @FindBy(xpath = "//input[@id='notedeclartionformdate']")    //Changes in v3.1 on 27-May-2021
    public WebElement Declaration_DateTime;

    @FindBy(xpath = "//input[@id='ResponsiblePersonName']")    //Changes in v3.1 on 27-May-2021
    public WebElement Declaration_RPName;

    @FindBy(xpath = "//input[@id='Position']")    //Changes in v3.1 on 27-May-2021
    public WebElement Declaration_RP_Position;

    @FindBy(xpath = "//form[@class='form-horizontal ng-untouched ng-pristine ng-valid']//input[@value='Save']")    //Changes in v3.1 on 27-May-2021
    public WebElement Declaration_SaveButton;
    /*----------------------------------End of-DECLARATION--------------------------------*/

    /*----------------------------------Summary Section---Added in v3.1----------------------------------*/
    @FindBy(xpath = "//span[normalize-space()='Summary']")    //Changes in v3.1 on 27-May-2021
    public WebElement titleSummary;

    @FindBy(xpath = "//button[@class='btn blue'][normalize-space()='View Full Invoice']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_ViewFullInvoiceButton;

    @FindBy(xpath = "")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_ViewFullInvoice_CloseButton;

    @FindBy(xpath = "//button[normalize-space()='Edit']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_EditButton;

    @FindBy(xpath = "//input[@placeholder='Display Responsible Person Name']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_RPName;

    @FindBy(xpath = "//input[@placeholder='Display Position']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_RP_Position;

    /*----------------------------------End of-SUMMARY--------------------------------*/

//    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline'])[2]")
//    public WebElement ReturnSelectReceivedPI;

//    @FindBy(xpath = "(//input[@value=\"Submit\"])[2]")
    @FindBy(xpath = "//span[contains(text(),' Create New Ticket ')]/../../..//input[@value='Save']")     //Changes in v3.1 on 27-May-2021
    public WebElement Return_SaveButton;

    /**
     * TESTCASE: Create Ticket
     */
    public void createReturnTicket() {
        genericUtil = new GenericUtil();
        try {
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

            HighlightElement.highlightElement(ticketType);
            genericUtil.click(ticketType);
            Select selectTicketType = new Select(ticketType);
            selectTicketType.selectByVisibleText("Returns");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

        /*---BEGIN-------------Return popup-----------------*/

//            HighlightElement.highlightElement(popupReturn);
//            Select selectInvoice = new Select(InvoiceDropdown);
//            selectInvoice.selectByVisibleText("983586540"); //983586540
//            genericUtil.pause(1000);
//
//           HighlightElement.highlightElement(InvoiceNo);
//           genericUtil.clickWithPause(InvoiceNo,1000);
//
//           HighlightElement.highlightElement(InvoiceDate);
//           genericUtil.clickWithPause(InvoiceDate,1000);
//
//           HighlightElement.highlightElement(OrderNo);
//           genericUtil.clickWithPause(OrderNo,1000);

//           HighlightElement.highlightElement(AccountNo);
//           genericUtil.clickWithPause(AccountNo,1000);
           HighlightElement.highlightElement(popupTitleReturn);

           HighlightElement.highlightElement(InvoiceDropdown);
           genericUtil.clickWithPause(InvoiceDropdown,1000);

//           HighlightElement.highlightElement(SearchInvoice);
//           genericUtil.clickWithPause(SearchInvoice,1000);

           HighlightElement.highlightElement(InvoiceNo_980100123);
           genericUtil.clickWithPause(InvoiceNo_980100123,1000);

            HighlightElement.highlightElement(ProceedButton);
            genericUtil.clickWithPause(ProceedButton,1000);

//           HighlightElement.highlightElement(InvoiceNo_980100123);
//           genericUtil.clickWithPause(InvoiceNo_980100123,1000);

           HighlightElement.highlightElement(ReturnQty);
           genericUtil.writeTextWithPause(ReturnQty,"01",1000);

           HighlightElement.highlightElement(ReturnBoxesQty);
           genericUtil.writeTextWithPause(ReturnBoxesQty,"01",1000);

           HighlightElement.highlightElement(ProductName);
           genericUtil.clickWithPause(ProductName,1000);

            HighlightElement.highlightElement(NetAmount);
            genericUtil.clickWithPause(NetAmount,1000);

            HighlightElement.highlightElement(ViewInvoiceButton);
            genericUtil.clickWithPause(ViewInvoiceButton,2000);

            HighlightElement.highlightElement(ViewInvoicePopUp_CloseButton);
            genericUtil.clickWithPause(ViewInvoicePopUp_CloseButton,1000);

            HighlightElement.highlightElement(ReturnFullInvoiceButton);
            genericUtil.clickWithPause(ReturnFullInvoiceButton,1000);

           HighlightElement.highlightElement(ReturnSelectReason);
           Select selectReturnReason = new Select(ReturnSelectReason);
           selectReturnReason.selectByVisibleText("Other");
           genericUtil.pause(1000);
           genericUtil.clickWithPause(ReturnSelectReason,1000);

           HighlightElement.highlightElement(Reason_PIPCodeErrorCheckbox);
           genericUtil.clickWithPause(Reason_PIPCodeErrorCheckbox,1000);

            HighlightElement.highlightElement(ReturnReason_SaveButton);
            genericUtil.clickWithPause(ReturnReason_SaveButton,2000);

           HighlightElement.highlightElement(SaveInvoiceButton);
           genericUtil.clickWithPause(SaveInvoiceButton,1000);

            HighlightElement.highlightElement(ReturnPop_SaveButton);
            genericUtil.clickWithPause(ReturnPop_SaveButton,1000);

//           HighlightElement.highlightElement(DeclarationCheckbox);
//           genericUtil.clickWithPause(DeclarationCheckbox,2000);
//
           HighlightElement.highlightElement(DeclarationCheckbox);
           genericUtil.clickWithPause(DeclarationCheckbox,1000);

           HighlightElement.highlightElement(Declaration_Radio1_Yes);
           genericUtil.clickWithPause(Declaration_Radio1_Yes,1000);

           HighlightElement.highlightElement(Declaration_Radio3_Yes);
           genericUtil.clickWithPause(Declaration_Radio3_Yes,1000);

           HighlightElement.highlightElement(Declaration_SaveButton);
           genericUtil.clickWithPause(Declaration_SaveButton,1000);

        /*---END-------------Return popup-------------------*/

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

            HighlightElement.highlightElement(CustomerComment);
            genericUtil.writeTextWithPause(CustomerComment, "Agent comment added!", 1000);

            HighlightElement.highlightElement(Return_SaveButton);
            genericUtil.clickWithPause(Return_SaveButton,1000);

//            HighlightElement.highlightElement(buttonSave);
//            genericUtil.clickWithPause(buttonSave, 2000);

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

        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
