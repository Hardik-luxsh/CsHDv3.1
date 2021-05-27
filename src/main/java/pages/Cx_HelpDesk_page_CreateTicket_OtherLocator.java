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

public class Cx_HelpDesk_page_CreateTicket_OtherLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_CreateTicket_OtherLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

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
    public WebElement customer;

    @FindBy(xpath = "//span[contains(text(),'Create New Ticket')]")
    public WebElement titleCreateTicket;

    @FindBy(xpath = "//select[@id='createTicketTitle']")
    public WebElement ticketType; //Returns

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
    @FindBy(xpath = "//div[@data-trigger='fileinput']")
    public WebElement file;

    @FindBy(xpath = "//input[@formcontrolname=\"Comment\"]")
    public WebElement agentComment;

    /*---START--------------Other popup--------------*/

    @FindBy(xpath = "(//div[@class=\"modal-content\"])[4]")
    public WebElement popupDI;

    @FindBy(xpath = "//h4[contains(text(),'Other')]")
    public WebElement titleOther;

    @FindBy(xpath = "//h4[contains(text(),'Other')]/../..//label[contains(text(),'Invoice Number')]/..//select")
    public WebElement InvoiceNumber;

    @FindBy(xpath = "//label[contains(text(),'Message *')]/..//textarea")
    public WebElement Message;

    @FindBy(xpath = "//h4[contains(text(),'Other')]/../..//button[contains(text(),'Submit')]")
    public WebElement submitButton;

    /*---END--------------Other popup--------------*/

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

    /**
     * TESTCASE: Create A Ticket With OtherType
     */
    public void createTicketWithOtherType(){
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
            selectTicketType.selectByVisibleText("Other");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

            /*---BEGIN-------------Delivery Issue popup-----------------*/
            HighlightElement.highlightElement(titleOther);

            Select selectInvoice = new Select(InvoiceNumber);
            selectInvoice.selectByVisibleText("983586540"); //983586540
            genericUtil.pause(1000);

            HighlightElement.highlightElement(Message);
            genericUtil.writeTextWithPause(Message, "Message", 1000);

            HighlightElement.highlightElement(submitButton);
            genericUtil.clickWithPause(submitButton, 2000);

            /*---END-------------Delivery Issue popup-----------------*/

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

            /*-----BEGIN-------------File Upload Logic---------------------*/
            // Specify the file location with extension
            StringSelection sel = new StringSelection(Constants.FILE_UPLOAD_PATH);

            // Copy to clipboard
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
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
            genericUtil.pause(2000);
            /*----END--------------File Upload Logic---------------------*/

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
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}
