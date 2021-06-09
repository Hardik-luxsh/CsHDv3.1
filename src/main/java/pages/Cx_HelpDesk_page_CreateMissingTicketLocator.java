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

public class Cx_HelpDesk_page_CreateMissingTicketLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_CreateMissingTicketLocator(WebDriver driver) {
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

    /*-----------------Missing Pop-Up window----------------*/
    @FindBy(xpath = "//h4[normalize-space()='Missings']") //Changes in v3.1 on 01-June-2021
    public WebElement popupTitleMissing;
    //table[@id='DataTables_Table_5']//button[@type='button'][normalize-space()='Save']
    @FindBy(xpath = "//h4[normalize-space()='Missings Product']") //Changes in v3.1 on 01-June-2021
    public WebElement popupTitleMissingProduct;

    //select[@id='missinginvoiceno']
    @FindBy(xpath = "//h4[normalize-space()='Missings']/../..//span[contains(text(),'--- Select ---')]") //Changes in v3.1 on 01-June-2021
    public WebElement InvoiceDropdown;

    @FindBy(xpath = "//input[@class='c-input ng-pristine ng-valid ng-star-inserted ng-touched']") //Changes in v3.1 on 01-June-2021
    public WebElement SearchInvoice;

    @FindBy(xpath = "//div[@class='col-md-4']//label[contains(text(),'980100123')]") //Changes in v3.1 on 27-May-2021
    public WebElement InvoiceNo_980100123;

    @FindBy(xpath = "//a[normalize-space()='980100123*']") //Changes in v3.1 on 06-June-2021
    public WebElement Tab_InvoiceNo_980100123;

    @FindBy(xpath = "//div[@class='col-md-4']//label[contains(text(),'980100125')]") //Changes in v3.1 on 06-June-2021
    public WebElement InvoiceNo_980100125;

    @FindBy(xpath = "//a[normalize-space()='980100125*']") //Changes in v3.1 on 06-June-2021
    public WebElement Tab_InvoiceNo_980100125;

    @FindBy(xpath = "//div[@class='col-md-4']//label[contains(text(),'980100127')]") //Changes in v3.1 on 06-June-2021
    public WebElement InvoiceNo_980100127;

    @FindBy(xpath = "//a[normalize-space()='980100127*']") //Changes in v3.1 on 06-June-2021
    public WebElement Tab_InvoiceNo_980100127;

//    @FindBy(xpath = "//h4[contains(text(),'Missings')]/../..//label[contains(text(),'Invoice Date')]/..//input")
//    public WebElement InvoiceDate;

    @FindBy(xpath = "//div[@class='col-md-8 margin-top-20']//input[@value='Proceed']") //Changes in v3.1 on 02-June-2021
    public WebElement ProceedButton;

    @FindBy(xpath = "//div[@class='col-md-8 margin-top-20']//input[@value='Back']") //Changes in v3.1 on 02-June-2021
    public WebElement BackButton;

    //    @FindBy(xpath = "(//input[@value='Full Invoice'])[1]")
    @FindBy(xpath = "//div[@class='form-group text-right']//button[@type='button'][normalize-space()='View Full Invoice']") //Changes in v3.1 on 02-June-2021
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

    @FindBy(xpath = "//input[@id='qty0']")
    public WebElement QtyMissing;

    @FindBy(xpath = "//div[@class='col-md-12']//div[@class='form-group text-center']//button[@type='button'][normalize-space()='Save']")
    public WebElement MissingPopupSaveButton;

    @FindBy(xpath = "//input[@id='missingSelectQuantity']")
    public WebElement missingProductQty;

    @FindBy(xpath = "//textarea[@id='missingProductreason']")
    public WebElement missingProductreason;

    @FindBy(xpath = "//table[@id='DataTables_Table_5']//button[@type='button'][normalize-space()='Save']")
    public WebElement missingProductSaveButton;

    @FindBy(xpath = "//div[@class='dataTables_scrollFootInner']//b[contains(text(),'Net Total :')]") //Changes in v3.1 on 27-May-2021
    public WebElement NetTotal;

    @FindBy(xpath = "//div[@class='dataTables_scrollFootInner']//b[contains(text(),'Grand Total :')]") //Changes in v3.1 on 27-May-2021
    public WebElement GrandTotal;

    @FindBy(xpath = "//app-missings//input[@value='Save']") //Changes in v3.1 on 27-May-2021
    public WebElement SaveInvoiceButton;
//   //----------------------------------------DECLARATION FORM----------------------------------------
//
//    //    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline'])[6]/span")
//    @FindBy(xpath = "//div[@class='form-group m-t-30']//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']//span") //Changes in v3.1 on 27-May-2021
//    public WebElement DeclarationCheckbox;
//
//    @FindBy(xpath = "//label[@for='radio14']/span[@class='box']")
//    public WebElement Declaration_Radio1_Yes;
//
//    @FindBy(xpath = "//label[@for='radio18']/span[@class='box']")
//    public WebElement Declaration_Radio3_Yes;
//
//    @FindBy(xpath = "//input[@id='notedeclartionformdate']")    //Changes in v3.1 on 27-May-2021
//    public WebElement Declaration_DateTime;
//
//    @FindBy(xpath = "//input[@id='ResponsiblePersonName']")    //Changes in v3.1 on 27-May-2021
//    public WebElement Declaration_RPName;
//
//    @FindBy(xpath = "//input[@id='Position']")    //Changes in v3.1 on 27-May-2021
//    public WebElement Declaration_RP_Position;
//
//    @FindBy(xpath = "//form[@class='form-horizontal ng-untouched ng-pristine ng-valid']//input[@value='Save']")    //Changes in v3.1 on 27-May-2021
//    public WebElement Declaration_SaveButton;
//    /*---------------End of-------------------DECLARATION--------------------------------------------------*/

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
    @FindBy(xpath = "//span[contains(text(),' Create New Ticket ')]/../../..//input[@value='Save']")     //Changes in v3.1 on 27-May-2021
    public WebElement Missing_SaveButton;

    /*-----------------End of-Missing Pop-Up window---------------*/

    /**
     * TESTCASE: Create Missing Ticket
     */
    public void createMissingTicket()
    {
        genericUtil = new GenericUtil();
        try {
            enterTicketDetails();

            HighlightElement.highlightElement(ticketType);
            genericUtil.click(ticketType);
            Select selectTicketType = new Select(ticketType);
            selectTicketType.selectByVisibleText("Missings");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

            /*---BEGIN-------------Missing popup-----------------*/
            HighlightElement.highlightElement(popupTitleMissing);

            HighlightElement.highlightElement(InvoiceDropdown);
            genericUtil.clickWithPause(InvoiceDropdown,1000);

            HighlightElement.highlightElement(InvoiceNo_980100123);
            genericUtil.clickWithPause(InvoiceNo_980100123,1000);

            HighlightElement.highlightElement(InvoiceNo_980100125); //Added on 07-June-21
            genericUtil.clickWithPause(InvoiceNo_980100125,1000);

            HighlightElement.highlightElement(InvoiceNo_980100127); //Added on 07-June-21
            genericUtil.clickWithPause(InvoiceNo_980100127,1000);

            HighlightElement.highlightElement(ProceedButton);
            genericUtil.clickWithPause(ProceedButton,1000);

            /*---BEGIN----------------------------------Missing product popup----------------------------------------*/
            HighlightElement.highlightElement(Tab_InvoiceNo_980100123); //Added on 07-June-21
            genericUtil.clickWithPause(Tab_InvoiceNo_980100123,1000);
            saveInvoice();

            HighlightElement.highlightElement(Tab_InvoiceNo_980100125); //Added on 07-June-21
            genericUtil.clickWithPause(Tab_InvoiceNo_980100125,1000);
            saveInvoice();

            HighlightElement.highlightElement(Tab_InvoiceNo_980100127); //Added on 07-June-21
            genericUtil.clickWithPause(Tab_InvoiceNo_980100127,1000);
            saveInvoice();
//            enterMissingData();

            HighlightElement.highlightElement(SaveInvoiceButton);
            genericUtil.clickWithPause(SaveInvoiceButton,2000);

            /*------END Of----------------------------------Missing popup-------------------------------------*/

            /*------BEGIN-----------------------------------SUMMARY-------------------------------------------*/
            HighlightElement.highlightElement(titleSummary);
            genericUtil.clickWithPause(titleSummary,1000);

            HighlightElement.highlightElement(NetTotal);
            genericUtil.clickWithPause(NetTotal,1000);

            HighlightElement.highlightElement(GrandTotal);
            genericUtil.clickWithPause(GrandTotal,1000);

            HighlightElement.highlightElement(Summary_EditButton);
            genericUtil.clickWithPause(Summary_EditButton,1000);

            enterMissingData();

            /*------END Of--------------------------------SUMMARY---------------------------------------*/

            enterTicketOtherDetail();

            /*------------------------------Missing Ticket Save button------------------------------*/
            HighlightElement.highlightElement(Missing_SaveButton);
            genericUtil.clickWithPause(Missing_SaveButton,2000);

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

    public void saveInvoice(){
        HighlightElement.highlightElement(QtyMissing);
        genericUtil.writeTextWithPause(QtyMissing,"01",1000);

        HighlightElement.highlightElement(ProductName);
        genericUtil.clickWithPause(ProductName,1000);

        HighlightElement.highlightElement(popupTitleMissingProduct);
        genericUtil.clickWithPause(popupTitleMissingProduct,1000);

        HighlightElement.highlightElement(missingProductQty);
        genericUtil.clickWithPause(missingProductQty,1000);

        HighlightElement.highlightElement(missingProductreason);
        genericUtil.writeTextWithPause(missingProductreason,"Testing Missing reason..!!",1000);

        HighlightElement.highlightElement(MissingPopupSaveButton);
        genericUtil.clickWithPause(MissingPopupSaveButton,2000);

        HighlightElement.highlightElement(missingProductSaveButton);
        genericUtil.clickWithPause(missingProductSaveButton,2000);
    }

    public void enterMissingData(){
        HighlightElement.highlightElement(SaveInvoiceButton);
        genericUtil.clickWithPause(SaveInvoiceButton,2000);
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

        HighlightElement.highlightElement(CustomerComment);
        genericUtil.writeTextWithPause(CustomerComment, "Testing Agent comment added!", 1000);
    }
}
