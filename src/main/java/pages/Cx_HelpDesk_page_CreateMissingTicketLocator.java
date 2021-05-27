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

    @FindBy(xpath = "//select[@id='selectBox']")
    public WebElement customer; //EmpCust

    @FindBy(xpath = "//span[contains(text(),'Create New Ticket')]")
    public WebElement titleCreateTicket;

    @FindBy(xpath = "//select[@id='createTicketTitle']")
    public WebElement ticketType; //Missing

    @FindBy(xpath = "//input[@formcontrolname='Description']")
    public WebElement description;

    @FindBy(xpath = "//label[contains(text(),'Owner')]/..//input[@class='form-control']")
    public WebElement labelOwner;

    @FindBy(xpath = "//select[@formcontrolname='Status']")
    public WebElement state;

    @FindBy(xpath = "//select[@formcontrolname='Priority']")
    public WebElement priority;

    @FindBy(xpath = "//input[@formcontrolname='Tags']")
    public WebElement tag;

    //    @FindBy(xpath = "//input[@type=\"file\"]")
    @FindBy(xpath = "//div[@class=\"input-group input-small\"]//div")
    public WebElement file;

    @FindBy(xpath = "//input[@formcontrolname=\"Comment\"]")
    public WebElement agentComment;

    //    @FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
    @FindBy(xpath = "//span[contains(text(),' Create New Ticket ')]/../../..//input[@value=\"Submit\"]")
    public WebElement buttonSubmit;

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

    @FindBy(xpath = "(//div[@class=\"modal-content\"])[11]")
    public WebElement popupMissing;

    @FindBy(xpath = "//select[@id='missinginvoiceno']")
    public WebElement Invoice;

    @FindBy(xpath = "(//label[contains(text(),'Invoice No')])[3]/..//input")
    public WebElement InvoiceNo;

    @FindBy(xpath = "//h4[contains(text(),'Missings')]/../..//label[contains(text(),'Invoice Date')]/..//input")
    public WebElement InvoiceDate;

    @FindBy(xpath ="(//label[contains(text(),'Order No')])[3]/..//input")
    public WebElement OrderNo;

    @FindBy(xpath = "(//label[contains(text(),'A/C (Account Number)')])[2]/..//input")
    public WebElement AccountNo;

    @FindBy(xpath = "(//label[contains(text(),'Net Amount')])[4]/..//input")
    public WebElement NetAmount;

    @FindBy(xpath = "(//input[@value='Full Invoice'])[2]")
    public WebElement FullInvoicebtn;

    @FindBy(xpath = "//input[@value='Re-Order Full Invoice']")
    public WebElement buttonReOrderFullInvoice;

    @FindBy(xpath ="(//input[@value='Close'])[5]")
    public WebElement InvoicePopClosebtn;

    @FindBy(xpath = "//span[contains(text(),'Paracetamol SF 250/5ml Sus 1Lt')]")
    public WebElement ProductName;

    @FindBy(xpath = "//input[@id='qty0']")
    public WebElement QtyMissing;

    @FindBy(xpath = "//input[@id='Boxes0']")
    public WebElement BoxesMissing;

    @FindBy(xpath = "(//input[@value='Save'])")
    public WebElement MissingSubmitButton;

    @FindBy(xpath = "//input[@id='missingProductName']")
    public WebElement SelectProduct;

    @FindBy(xpath = "//input[@id='missingSelectQuantity']")
    public WebElement Qty;

    @FindBy(xpath = "//textarea[@id='missingProductreason']")
    public WebElement missingProductreason;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement ReturnPopSubmitbtn;


    /*-----------------End of-Missing Pop-Up window---------------*/

    /**
     * TESTCASE: Create Missing Ticket
     *  @param missingreason
     * */
    public void createMissingTicket(String missingreason)
    {
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textCustomer));
            HighlightElement.highlightElement(sidebar_textCustomer);
            sidebar_textCustomer.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(sidebar_textCreateTicket);
            sidebar_textCreateTicket.click();
            genericUtil.pause(1000);

//            Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "createTicket");

            HighlightElement.highlightElement(titleCreateTicket);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(channel_OutboundCall);
            genericUtil.clickWithPause(channel_OutboundCall,1000);

            HighlightElement.highlightElement(customer);
            genericUtil.click(customer);
            Select selectCustomer = new Select(customer);
            selectCustomer.selectByVisibleText("TEST CUSTOMER");
            genericUtil.pause(1000);
            genericUtil.click(customer);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(ticketType);
            genericUtil.click(ticketType);
            Select selectTicketType = new Select(ticketType);
            selectTicketType.selectByVisibleText("Missings");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

            /*---BEGIN-------------Missing popup-----------------*/

            HighlightElement.highlightElement(popupMissing);
            Select selectInvoice = new Select(Invoice);
            selectInvoice.selectByVisibleText("983586540"); //983586540
            genericUtil.pause(1000);

            HighlightElement.highlightElement(InvoiceNo);
            genericUtil.clickWithPause(InvoiceNo,1000);

            HighlightElement.highlightElement(InvoiceDate);
            genericUtil.clickWithPause(InvoiceDate,1000);

            HighlightElement.highlightElement(OrderNo);
            genericUtil.clickWithPause(OrderNo,1000);

            HighlightElement.highlightElement(AccountNo);
            genericUtil.clickWithPause(AccountNo,1000);

            HighlightElement.highlightElement(NetAmount);
            genericUtil.clickWithPause(NetAmount,1000);

            HighlightElement.highlightElement(FullInvoicebtn);
            genericUtil.clickWithPause(FullInvoicebtn,2000);

            HighlightElement.highlightElement(InvoicePopClosebtn);
            genericUtil.clickWithPause(InvoicePopClosebtn,1000);

            HighlightElement.highlightElement(buttonReOrderFullInvoice);
            genericUtil.clickWithPause(buttonReOrderFullInvoice,1000);

            HighlightElement.highlightElement(QtyMissing);
            genericUtil.writeTextWithPause(QtyMissing,"01",1000);

            HighlightElement.highlightElement(BoxesMissing);
            genericUtil.writeTextWithPause(BoxesMissing,"01",1000);

            HighlightElement.highlightElement(ProductName);
            genericUtil.clickWithPause(ProductName,1000);

            HighlightElement.highlightElement(SelectProduct);
            genericUtil.clickWithPause(SelectProduct,1000);

            HighlightElement.highlightElement(Qty);
            genericUtil.clickWithPause(Qty,1000);

            HighlightElement.highlightElement(missingProductreason);
            genericUtil.writeTextWithPause(missingProductreason,missingreason,1000);

            HighlightElement.highlightElement(ReturnPopSubmitbtn);
            genericUtil.clickWithPause(ReturnPopSubmitbtn,1000);

            HighlightElement.highlightElement(MissingSubmitButton);
            genericUtil.clickWithPause(MissingSubmitButton,1000);

            /*---END-------------Missing popup-----------------*/

            HighlightElement.highlightElement(description);
            genericUtil.writeTextWithPause(description, "Test Description", 1000);
            genericUtil.pause(2000);

            HighlightElement.highlightElement(labelOwner);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(state);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(priority);
            genericUtil.click(priority);
            genericUtil.pause(1000);
            Select selectPriority = new Select(priority);
            selectPriority.selectByVisibleText("Low");
            genericUtil.pause(2000);

            HighlightElement.highlightElement(tag);
            genericUtil.writeTextWithPause(tag, "#New#Created#Open#", 2000);

            HighlightElement.highlightElement(file);
            genericUtil.clickWithPause(file, 2000);

            /*------------------File Upload Logic------------------------------------*/
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
            genericUtil.pause(2000);

            HighlightElement.highlightElement(agentComment);
            genericUtil.writeTextWithPause(agentComment, "Agent comment added!", 1000);

            HighlightElement.highlightElement(buttonSubmit);
            genericUtil.clickWithPause(buttonSubmit, 2000);

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
