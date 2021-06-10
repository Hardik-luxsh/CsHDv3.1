package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_AOT_EscTicketUpdateLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//span[contains(text(),'Escalated Ticket') and @class='title']")
    public WebElement TitleEscTU;

    @FindBy(xpath = "//li[@id='actiononticket']")
    public WebElement sidebar_textActiononTicket;

    @FindBy(xpath = "//h1[contains(text(),'Escalated Ticket Updation')]")
    public WebElement ESCUHeading;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement ESCUSearch;
    @FindBy(xpath = "//tr[@class='trYellow ng-star-inserted']")
    public WebElement ESCUSelectedRow;

    @FindBy(xpath = "//td[contains(text(),'700')]")
    public WebElement ESCUSelectedRowTicketNo;

    @FindBy(xpath = "(//i[@class='fa fa-eye green green-color greedAction'])[1]")
    public WebElement ESCUEye;

    @FindBy(xpath = "(//h4[contains(text(),'Department Action on Ticket')])[2]")
    public WebElement ESCPopTitle;

    @FindBy(xpath = "(//label[contains(text(),'Ticket Title')])[2]/..//input[@type='text']")
    public WebElement ESCPopTicketTitle;

    @FindBy(xpath = "(//label[contains(text(),'Ticket No.')])[2]/..//input[@type='text']")
    public WebElement ESCPopTicketNo;

    @FindBy(xpath = "//label[contains(text(),'Agent Comment')]/..//input[@type='text']")
    public WebElement ESCPopAgentComment;

    @FindBy(xpath = "(//label[contains(text(),'Note')])[2]/..//input[@type='text']")
    public WebElement ESCPopNote;

    @FindBy(xpath = "(//label[contains(text(),'Query Attachment')])[2]/..//div[@class='ng-star-inserted']")
    public WebElement ESCPopQueryAttach;

    @FindBy(xpath = "//a[contains(text(),'983586533')]")
    public WebElement ESCPopInvoiceNo;

    @FindBy(xpath = "(//b[contains(text(),'Net Total :')])[2]/../..//td[contains(text(),'2.57')]")
    public WebElement ESCPopNettotal;

    @FindBy(xpath = "(//b[contains(text(),'Grand Total :')])[2]/../..//td[contains(text(),'5.14')]")
    public WebElement ESCPopGrandTotal;

    @FindBy(xpath = "//button[contains(text(),'View Full Invoice')]")
    public WebElement ESCPopViewInvoicebtn;

    @FindBy(xpath = "//tbody/tr[@class='ng-star-inserted']")
    public WebElement ESCPopUpFirstRow;

    @FindBy(xpath = "(//h4[contains(text(),'See Invoice')])[2]")
    public WebElement ESCInvoiceTitle;

    @FindBy(xpath = "(//h4[contains(text(),'See Invoice')])[2]/../..//button[contains(text(),'Close')]")
    public WebElement ESCPopVIClosebtn;

    @FindBy(xpath = "//textarea[@type='text']")
    public WebElement ESCComment;

    @FindBy(xpath = "(//label[contains(text(),'View Attachment :')])[2]/..//input[@type='text']")
    public WebElement ESCViewAttachment;

    @FindBy(xpath = "(//h4[contains(text(),'View Attachment')])[2]")
    public WebElement ESCViewAttachmentPopTitle;

    @FindBy(xpath = "(//h4[contains(text(),'View Attachment')])[2]/../..//a[@class='btn btn-success']")
    public WebElement ESCViewAttachmentPopDownload;

    @FindBy(xpath = "(//h4[contains(text(),'View Attachment')])[2]/../..//input[@value='Close']")
    public WebElement ESCViewAttachmentPopClose;

    @FindBy(xpath = "(//div[@class='col-md-12'])[6]//input[@value='Close']")
    public WebElement ESCClosebtn;

    public Cx_HelpDesk_page_AOT_EscTicketUpdateLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * @param strSearch
     */
    public void ESCTicketUpdate(String strSearch) {
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textActiononTicket));
            HighlightElement.highlightElement(sidebar_textActiononTicket);
            sidebar_textActiononTicket.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleEscTU);
            genericUtil.clickWithPause(TitleEscTU,1000);

            HighlightElement.highlightElement(ESCUHeading);
            genericUtil.clickWithPause(ESCUHeading,1000);

            HighlightElement.highlightElement(ESCUSearch);
            genericUtil.writeTextWithPause(ESCUSearch,strSearch,1000);

            HighlightElement.highlightElement(ESCUSelectedRow);
            Thread.sleep(1000);

            HighlightElement.highlightElement(ESCUSelectedRow);
            Thread.sleep(1000);

            HighlightElement.highlightElement(ESCUSelectedRowTicketNo);
            Thread.sleep(1000);

            HighlightElement.highlightElement(ESCUEye);
            genericUtil.clickWithPause(ESCUEye,1000);

            HighlightElement.highlightElement(ESCPopTitle);
            genericUtil.clickWithPause(ESCPopTitle,1000);

            HighlightElement.highlightElement(ESCPopTicketTitle);
            genericUtil.clickWithPause(ESCPopTicketTitle,1000);

            HighlightElement.highlightElement(ESCPopTicketNo);
            genericUtil.clickWithPause(ESCPopTicketNo,1000);

            HighlightElement.highlightElement(ESCPopAgentComment);
            genericUtil.clickWithPause(ESCPopAgentComment,1000);

            HighlightElement.highlightElement(ESCPopNote);
            genericUtil.clickWithPause(ESCPopNote,1000);

            HighlightElement.highlightElement(ESCPopQueryAttach);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(ESCPopInvoiceNo);
            genericUtil.clickWithPause(ESCPopInvoiceNo,1000);

            HighlightElement.highlightElement(ESCPopViewInvoicebtn);
            genericUtil.clickWithPause(ESCPopViewInvoicebtn,1000);

            HighlightElement.highlightElement(ESCInvoiceTitle);
            genericUtil.clickWithPause(ESCInvoiceTitle,1000);

            HighlightElement.highlightElement(ESCPopVIClosebtn);
            genericUtil.clickWithPause(ESCPopVIClosebtn,1000);

            HighlightElement.highlightElement(ESCPopNettotal);
            genericUtil.clickWithPause(ESCPopNettotal,1000);

            HighlightElement.highlightElement(ESCPopGrandTotal);
            genericUtil.clickWithPause(ESCPopGrandTotal,1000);


            HighlightElement.highlightElement(ESCComment);
            genericUtil.clickWithPause(ESCComment,1000);

            HighlightElement.highlightElement(ESCViewAttachment);
            genericUtil.clickWithPause(ESCViewAttachment,1000);

            HighlightElement.highlightElement(ESCViewAttachmentPopTitle);
            genericUtil.clickWithPause(ESCViewAttachmentPopTitle,1000);

            HighlightElement.highlightElement(ESCViewAttachmentPopDownload);
            genericUtil.clickWithPause(ESCViewAttachmentPopDownload,1000);

            HighlightElement.highlightElement(ESCViewAttachmentPopClose);
            genericUtil.clickWithPause(ESCViewAttachmentPopClose,1000);

            HighlightElement.highlightElement(ESCClosebtn);
            genericUtil.clickWithPause(ESCClosebtn,1000);

        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}
