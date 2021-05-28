package pages;

import TestUtil.*;
import base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;

public class Cx_HelpDesk_page_CreateTicket_Complaints_Locator extends TestBase{

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_CreateTicket_Complaints_Locator(WebDriver driver) {
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
    @FindBy(xpath = "//span[contains(text(),' Create New Ticket ')]/../../..//input[@value='Save']") //Changes in v3.1 on 27-May-2021
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

    /*-----------------COMPLAINTS Pop-Up window---------Added in v3.1 on 28-May-2021-------*/

    @FindBy(xpath = "//h4[normalize-space()='Complaints']")
    public WebElement popupTitleComplaints;

    @FindBy(xpath = "//select[@formcontrolname='ComplaintsReason']")
    public WebElement ComplaintsSelectReason; //Complaints related to Product quality/ Distribution

    @FindBy(xpath =  "//h4[normalize-space()='Complaints']/../..//textarea") //"//textarea[@class='form-control ng-pristine ng-valid ng-touched']")
    public WebElement Complaints_message;

//    @FindBy(xpath = "//form[@class='ng-invalid ng-dirty ng-touched']//div[@class='form-control uneditable-input input-fixed input-large fileUPload']")
    @FindBy(xpath = "//h4[normalize-space()='Complaints']/../..//div[@class=\"input-group input-large\"]")
    public WebElement Complaints_upload;

    @FindBy(xpath = "//form[@class='ng-dirty ng-valid ng-touched']//input[@value='Save']")
    public WebElement Complaints_SaveButton;

    @FindBy(xpath = "//form[@class='ng-dirty ng-valid ng-touched']//input[@value='Cancel']")
    public WebElement Complaints_CancelButton;

    /*-----End Of------------COMPLAINTS Pop-Up window---------Added in v3.1 on 28-May-2021-------*/

    /**
     * TESTCASE: Create Ticket
     */
    public void createTicketWithComplaintsType(){
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
            selectTicketType.selectByVisibleText("Complaints");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

            /*---BEGIN--------Complaints----- popup---------------------------------------------------------------------*/
            HighlightElement.highlightElement(popupTitleComplaints);

            HighlightElement.highlightElement(ComplaintsSelectReason);
            genericUtil.click(ComplaintsSelectReason);
            Select selectReason = new Select(ComplaintsSelectReason);
            selectReason.selectByVisibleText("Complaints related to Product quality/ Distribution");
            genericUtil.pause(500);
            genericUtil.click(ComplaintsSelectReason);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(Complaints_message);
            genericUtil.click(Complaints_message);
            genericUtil.pause(1000);
            genericUtil.writeTextWithPause(Complaints_message,"A verbal, written, or recorded communication sent to or left for a recipient who cannot be contacted directly",1000);

            HighlightElement.highlightElement(Complaints_upload);
            genericUtil.clickWithPause(Complaints_upload, 2000);

            /*------START------------File Upload Logic--------------------*/
            // Specify the file location with extension
            StringSelection sel = new StringSelection(Constants.FILE_UPLOAD_PATH);

            // Copy to clipboard
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
            System.out.println("selection" +sel);
            // Create object of Robot class
            Robot robot = new Robot();
            genericUtil.pause(1000);

            // Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);

            // Release Enter
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Press CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            // Release CTRL+V
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            genericUtil.pause(1000);

            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            /*------END Of------------File Upload Logic--------------------*/

            HighlightElement.highlightElement(Complaints_SaveButton);
            genericUtil.clickWithPause(Complaints_SaveButton, 2000);
            /*---END Of--------Complaints----- popup--------------------------------------------------------------------*/

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
            System.out.println("selection" +sel);
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

            HighlightElement.highlightElement(buttonSave);
            genericUtil.clickWithPause(buttonSave, 2000);

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
            ex.printStackTrace();
        }
    }

}
