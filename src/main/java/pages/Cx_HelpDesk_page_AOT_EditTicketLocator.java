package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Cx_HelpDesk_page_AOT_EditTicketLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//a[@href='#/edit_ticket']")
    public WebElement TitleEditTicket; //V3.1

    @FindBy(xpath = "//li[@id='actiononticket']")
    public WebElement sidebar_textActiononTicket;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    public WebElement SatCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    public WebElement SatFullScreen;

    @FindBy(xpath = "//span[contains(text(),' Ticket Search')]")
    public WebElement SatTitle; //V 3.1

    @FindBy(xpath = "//select[@formcontrolname='SelectTicketType']")
    public WebElement STTicketType;

    @FindBy(xpath = "//select[@formcontrolname='SelectStatusType']")
    public WebElement STStateType;

    @FindBy(xpath = "//select[@formcontrolname='SelectShort']")
    public WebElement STSort;

    @FindBy(xpath = "//input[@formcontrolname='TicketNo']")
    public WebElement STTicketNo;

    @FindBy(xpath = "//label[contains(text(),'Start Date')]/..//input[@type='date']")
    public WebElement STStartDate; //V 3.1

    @FindBy(xpath = "//label[contains(text(),'End Date')]/..//input[@type='date']")
    public WebElement STEndDate; //V 3.1

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement STSearchbtn;

    @FindBy(xpath = "//button[contains(text(),'Clear Filters')]")
    public WebElement STClearbtn;

    @FindBy(xpath = "//a[contains(text(),'Ticket 697')]")
    public WebElement Ticket;//V3.1

    @FindBy(xpath = "(//span[contains(text(),' Ticket Details ')])[1]")
    public WebElement TDTicketDetailsTitle;

    @FindBy(xpath = "//span[contains(text(),' Ticket Details ')]/../../..//label[contains(text(),'Account No.')]/..//input[@type='text']")
    public WebElement TDaccountNo;//V3.1

    @FindBy(xpath = "//label[contains(text(),'site')]/..//input[@type='text']")
    public WebElement TDSite;//V3.1

    @FindBy(xpath = "//label[contains(text(),'Customer Comment')]/..//input[@type='text']")
    public WebElement TDCustomerComment;//V3.1

    @FindBy(xpath = "//label[contains(text(),'Agent Comment')]/..//input[@type='text']")
    public WebElement TDAgentComment;//V3.1

    @FindBy(xpath = "//label[contains(text(),'Re-assigned To')]/..//input[@type='text']")
    public WebElement TDReassignedTo;//V3.1

    @FindBy(xpath = "//label[contains(text(),'Self-assigned by')]/..//input[@type='text']")
    public WebElement TDSelfassignedBy;//V3.1

    @FindBy(xpath = "//label[contains(text(),'Ticket Number')]/..//input[@type='text']")
    public WebElement TDTicketNumber;//V3.1

    @FindBy(xpath = "//label[contains(text(),'Ticket Date')]/..//input[@type='text']")
    public WebElement TDDate;

    @FindBy(xpath = "//span[contains(text(),' Ticket Details ')]/../../..//label[contains(text(),'Ticket Title')]/..//input[@type='text']")
    public WebElement TDTicketTitle;//V3.1

    @FindBy(xpath = "(//span[contains(text(),' Ticket Details ')]/../../..//label[contains(text(),'Customer')]/..//input[@type='text'])[1]")
    public WebElement TDCustomer; //V3.1

    @FindBy(xpath = "//label[contains(text(),'Description')]/..//textarea[@class='form-control']")
    public WebElement TDDescription;

    @FindBy(xpath = "//label[contains(text(),'Owner')]/..//input[@type='text']")
    public WebElement TDOwner;

    @FindBy(xpath = "//label[contains(text(),'Priority')]/..//input[@type='text']")
    public WebElement TDPriority;

    @FindBy(xpath = "//label[contains(text(),'Tags')]/..//input[@type='text']")
    public WebElement TDTags;

    //ADDED
    @FindBy(xpath = "//a[@href=\"javascript:\"]")
    public WebElement TDFileAttachment;

    @FindBy(xpath = "//label[contains(text(),'Query Attachment')]/..//div[@class='ng-star-inserted']")
    public WebElement TDQAttachment;

    @FindBy(xpath = "//span[contains(text(),'Summary')]")
    public WebElement TDSummaryTitle;//V3.1

    @FindBy(xpath = "//span[contains(text(),'Summary')]/../..//a[@class='collapse btn btn-circle btn-icon-only btn-default']")
    public WebElement TDSCollapse;//V3.1

    @FindBy(xpath = "//a[contains(text(),'980100123')]")
    public WebElement TDSInvoiceNo;//V3.1

    @FindBy (xpath = "//button[contains(text(),'View Full Invoice')]")
    public WebElement TDSViewFullInvoiceBtn; //V3.1

    @FindBy (xpath = "(//h4[contains(text(),'See Invoice')])[2]/../../..//button[contains(text(),'Close')]")
    public WebElement TDSViewFullInvoicePopCloseBtn;//V3.1

    @FindBy (xpath = "(//h4[contains(text(),'See Invoice')])[2]")
    public WebElement TDSViewFullInvoicePopTitle;

    @FindBy(xpath = "//table[@id='DataTables_Table_4']")
    public WebElement TDSDetails;//V3.1

    @FindBy(xpath = "(//b[contains(text(),'Net Total :')])[2]/../..//td[contains(text(),'330')]")
    public WebElement TDSDetailsNetTotal;//V3.1

    @FindBy(xpath = "(//b[contains(text(),'Grand Total :')])[2]/../..//td[contains(text(),'375')]")
    public WebElement TDSDetailsGrandTotal; //V3.1

    @FindBy(xpath = "//span[contains(text(),'Edit Ticket Details')]/../../..//input[@id='btnSave']")
    public WebElement ETDTitle; //V3.1

    @FindBy(xpath = "//a[@class='collapse btn btn-circle btn-icon-only btn-default']")
    public WebElement ETDCollapse;

    @FindBy(xpath = "//select[@formcontrolname='SelectEditStatusType']")
    public WebElement ETDState;

    @FindBy(xpath = "//select[@formcontrolname='SelectEditStatusType'] /../..//option[@value='Closed']")
    public WebElement ETstate;

    @FindBy(xpath = "//select[@formcontrolname='SelectPriority']")
    public WebElement ETDPriority;

    @FindBy(xpath = "//select[@formcontrolname='selectdepartment']")
    public WebElement ETDEDepartment;

    @FindBy(xpath = "//select[@formcontrolname='EscalatedDepartmentuserId']")
    public WebElement ETDSelectDepartmentUser;

    @FindBy(xpath = "//input[@id='NoteforDepartmentalUser']")
    public WebElement ETDNoteDeptUser;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement ETDSave; //V3.1

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement ETDCancel;

    @FindBy(xpath = "//input[@value='Clear']")
    public WebElement ETDClear;

    @FindBy(xpath = "(//h4[contains(text(),'Alert!')])[1]")
    public WebElement ETDPopAlert;

    @FindBy(xpath = "//input[@value=\"Yes\"]")
    public WebElement ETDPopupYes;

    @FindBy(xpath = "//input[@value=\"No\"]")
    public WebElement ETDPopupNo;

    @FindBy(xpath = "(//h4[contains(text(),'Alert!')])[2]")
    public WebElement ETDSuccessMSG;

    @FindBy(xpath = "(//span[contains(text(),'697')])[2]")
    public WebElement ETDSuccessTNo;

    @FindBy(xpath = "(//input[@value='OK'])[1]")
    public WebElement ETDSuccessMSGOk;

//    @FindBy(xpath = "(//button[@class='close']/following::button[6])[1]")
//    public WebElement ETDSuccessClose;

    public Cx_HelpDesk_page_AOT_EditTicketLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     *
     * @param SearchText
     * @param strState
     * @param strPriority
     * @param strDepartment
     * @param strDeptUser
     * @param strNoteDeptUser
     * @param strStartDate
     * @param strEndDate
     */
    public void EditTicket(String SearchText, String strState, String strPriority, String strDepartment, String strDeptUser, String strNoteDeptUser,String strStartDate, String strEndDate ) { //V 3.1
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;

            wait.until(ExpectedConditions.visibilityOf(sidebar_textActiononTicket));
            HighlightElement.highlightElement(sidebar_textActiononTicket);
            sidebar_textActiononTicket.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleEditTicket);
            genericUtil.clickWithPause(TitleEditTicket, 1000);

            HighlightElement.highlightElement(SatTitle);
            genericUtil.clickWithPause(SatTitle, 1000);


            HighlightElement.highlightElement(STTicketNo);
            genericUtil.writeTextWithPause(STTicketNo, SearchText, 1000); //V3.1

            HighlightElement.highlightElement(STTicketType);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(STStateType);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(STSort);
            genericUtil.pause(1000);


            HighlightElement.highlightElement(STStartDate);
            genericUtil.writeTextWithPause(STStartDate,strStartDate,1000);

            HighlightElement.highlightElement(STEndDate);
            genericUtil.writeTextWithPause(STEndDate,strEndDate,1000);

            HighlightElement.highlightElement(STSearchbtn);
            genericUtil.clickWithPause(STSearchbtn, 1000);

            HighlightElement.highlightElement(Ticket);
            genericUtil.clickWithPause(Ticket, 1000);

            HighlightElement.highlightElement(TDTicketDetailsTitle);
            genericUtil.clickWithPause(TDTicketDetailsTitle, 1000);

            HighlightElement.highlightElement(TDaccountNo);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDCustomer);
            genericUtil.clickWithPause(TDCustomer,1000); //V3.1

            HighlightElement.highlightElement(TDSite);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDTicketNumber);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDDate);
            genericUtil.clickWithPause(TDDate,1000); //V3.1

            HighlightElement.highlightElement(TDTicketTitle);
            genericUtil.clickWithPause(TDTicketTitle,1000); //V3.1

            HighlightElement.highlightElement(TDPriority);
            genericUtil.clickWithPause(TDPriority,1000); //V3.1

            HighlightElement.highlightElement(TDTags);
            genericUtil.clickWithPause(TDTags,1000); //V3.1

            HighlightElement.highlightElement(TDAgentComment);
            genericUtil.clickWithPause(TDAgentComment,1000); //V3.1


            jsUp.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDCustomerComment);
            genericUtil.clickWithPause(TDCustomerComment,1000); //V3.1

            HighlightElement.highlightElement(TDOwner);
            genericUtil.clickWithPause(TDOwner,1000); //V3.1

            HighlightElement.highlightElement(TDReassignedTo);
            genericUtil.clickWithPause(TDReassignedTo,1000); //V3.1

            HighlightElement.highlightElement(TDSelfassignedBy);
            genericUtil.clickWithPause(TDSelfassignedBy,1000); //V3.1

            HighlightElement.highlightElement(TDDescription);
            genericUtil.clickWithPause(TDDescription,1000); //V3.1

//            //File attachment
//            if (TDFileAttachment.isDisplayed()) {
//                HighlightElement.highlightElement(TDFileAttachment);
//                genericUtil.clickWithPause(TDFileAttachment, 1000);
//            } else {
//                System.out.println("No attachment found!!");
//            }
//
//            Robot r = new Robot();
//            r.keyPress(KeyEvent.VK_CONTROL);
//            r.keyPress(KeyEvent.VK_T);
//            r.keyRelease(KeyEvent.VK_CONTROL);
//            r.keyRelease(KeyEvent.VK_T);

            HighlightElement.highlightElement(TDSummaryTitle);
            genericUtil.clickWithPause(TDSummaryTitle,1000);

            HighlightElement.highlightElement(TDSCollapse);
            genericUtil.clickWithPause(TDSCollapse,1000);

            HighlightElement.highlightElement(TDSInvoiceNo);
            genericUtil.clickWithPause(TDSViewFullInvoiceBtn,1000);

            Thread.sleep(1000);

            HighlightElement.highlightElement(TDSViewFullInvoicePopTitle);
            genericUtil.clickWithPause(TDSViewFullInvoicePopTitle,1000);

            HighlightElement.highlightElement(TDSViewFullInvoicePopCloseBtn);
            genericUtil.clickWithPause(TDSViewFullInvoicePopCloseBtn,1000);

            HighlightElement.highlightElement(TDSDetails);
            genericUtil.clickWithPause(TDSDetails,1000);

            HighlightElement.highlightElement(TDSDetailsNetTotal);
            genericUtil.clickWithPause(TDSDetailsNetTotal,1000);

            HighlightElement.highlightElement(TDSDetailsGrandTotal);
            genericUtil.clickWithPause(TDSDetailsGrandTotal,1000);

            jsUp.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(1000);

            HighlightElement.highlightElement(ETDTitle);
            genericUtil.clickWithPause(ETDTitle, 2000);

            HighlightElement.highlightElement(ETDCollapse);
            genericUtil.clickWithPause(ETDCollapse,1000);

            HighlightElement.highlightElement(ETDState);
            //genericUtil.clickWithPause(ETDState,1000);
//            genericUtil.writeTextWithPause(ETstate,strState,1000);
//            Select selectState = new Select(ETstate);
//            selectState.selectByVisibleText(strState);
//            genericUtil.pause(1000);
            genericUtil.selectElementWithPause(ETDState, strState, 2000);
            HighlightElement.highlightElement(ETDState);

            HighlightElement.highlightElement(ETDPriority);
            genericUtil.selectElementWithPause(ETDPriority, strPriority, 2000);
            HighlightElement.highlightElement(ETDPriority);

            HighlightElement.highlightElement(ETDEDepartment);
//            genericUtil.writeTextWithPause(ETDEDepartment,strDepartment,1000);
            genericUtil.selectElementWithPause(ETDEDepartment, strDepartment, 2000);
            HighlightElement.highlightElement(ETDEDepartment);

            HighlightElement.highlightElement(ETDSelectDepartmentUser);
            genericUtil.selectElementWithPause(ETDSelectDepartmentUser, strDeptUser, 2000);
            HighlightElement.highlightElement(ETDSelectDepartmentUser);

            HighlightElement.highlightElement(ETDNoteDeptUser);
            genericUtil.writeTextWithPause(ETDNoteDeptUser,strNoteDeptUser,2000);

//            HighlightElement.highlightElement(ETDSave);
//            genericUtil.clickWithPause(ETDSave, 1000);

            HighlightElement.highlightElement(ETDCancel);
            genericUtil.clickWithPause(ETDCancel, 1000);

            HighlightElement.highlightElement(ETDPopAlert);

//            HighlightElement.highlightElement(ETDPopupYes);
//            genericUtil.clickWithPause(ETDPopupYes,1000);

//            HighlightElement.highlightElement(ETDPopupNo);
//            genericUtil.clickWithPause(ETDPopupNo,1000);

            HighlightElement.highlightElement(ETDPopupYes);
            genericUtil.clickWithPause(ETDPopupYes, 1000);

            HighlightElement.highlightElement(ETDSuccessTNo);
            Thread.sleep(1000);

            HighlightElement.highlightElement(ETDSuccessMSG);
            genericUtil.clickWithPause(ETDSuccessMSGOk, 1000);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
