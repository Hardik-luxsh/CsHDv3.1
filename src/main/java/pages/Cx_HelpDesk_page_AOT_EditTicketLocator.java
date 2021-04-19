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

public class Cx_HelpDesk_page_AOT_EditTicketLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//span[contains(text(),'Edit Ticket') and @class='title']")
    public WebElement TitleEditTicket;

    @FindBy(xpath = "//li[@id='actiononticket']")
    public WebElement sidebar_textActiononTicket;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    public WebElement SatCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    public WebElement SatFullScreen;

    @FindBy(xpath = "//span[contains(text(),'Search Ticket')]")
    public WebElement SatTitle;

    @FindBy(xpath = "//select[@formcontrolname='SelectTicketType']")
    public WebElement STTicketType;

    @FindBy(xpath = "//select[@formcontrolname='SelectStatusType']")
    public WebElement STStateType;

    @FindBy(xpath = "//select[@formcontrolname='SelectShort']")
    public WebElement STSort;

    @FindBy(xpath = "//input[@formcontrolname='TicketNo']")
    public WebElement STTicketNo;

    @FindBy(xpath = "//input[@formcontrolname='SelectStartdate']")
    public WebElement STStartDate;

    @FindBy(xpath = "//input[@formcontrolname='SelectEnddate']")
    public WebElement STEndDate;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement STSearchbtn;

    @FindBy(xpath = "//button[contains(text(),'Clear Filters')]")
    public WebElement STClearbtn;

    @FindBy(xpath = "//a[contains(text(),'Ticket 159')]")
    public WebElement Ticket;

    @FindBy(xpath = "(//span[contains(text(),' Ticket Details ')])[1]")
    public WebElement TDTicketDetailsTitle;

    @FindBy(xpath = "//label[contains(text(),'Ticket Number ')]/..//input[@type='text']")
    public WebElement TDTicketNumber;

    @FindBy(xpath = "//label[contains(text(),'Ticket Date')]/..//input[@type='text']")
    public WebElement TDDate;

    @FindBy(xpath = "//span[contains(text(),' Ticket Details ')]/../../..//label[contains(text(),'Ticket Title')]/..//input[@type='text']")
    public WebElement TDTicketTitle;

    @FindBy(xpath = "//label[contains(text(),'Customer')]/..//input[@type='text']")
    public WebElement TDCustomer;

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

    @FindBy(xpath = "//span[contains(text(),'Edit Ticket Details ')]")
    public WebElement ETDTitle;

    @FindBy(xpath = "//select[@formcontrolname='SelectEditStatusType']")
    public WebElement ETDState;

    @FindBy(xpath = "//select[@formcontrolname='SelectEditStatusType'] /../..//option[@value='Closed']")
    public WebElement ETstate;

    @FindBy(xpath = "//select[@formcontrolname='SelectPriority']")
    public WebElement ETDPriority;

    @FindBy(xpath = "//select[@formcontrolname='selectdepartment']")
    public WebElement ETDEDepartment;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement ETDSubmit;

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

    @FindBy(xpath = "(//span[contains(text(),'159 ')])[2]")
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
     * TESTCASE METHOD: EDIT TICKET
     *
     * @param SearchText
     * @param strState
     * @param strPriority
     * @param strDepartment
     */
    public void EditTicket(String SearchText, String strState, String strPriority, String strDepartment) {
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textActiononTicket));
            HighlightElement.highlightElement(sidebar_textActiononTicket);
            sidebar_textActiononTicket.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleEditTicket);
            genericUtil.clickWithPause(TitleEditTicket, 1000);

            HighlightElement.highlightElement(SatTitle);
            genericUtil.clickWithPause(SatTitle, 1000);

            HighlightElement.highlightElement(STTicketType);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(STStateType);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(STSort);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(STTicketNo);
            genericUtil.writeTextWithPause(STTicketNo, SearchText, 1000);

//            HighlightElement.highlightElement(STStartDate);
//            Thread.sleep(1000);
//
//            HighlightElement.highlightElement(STEndDate);
//            Thread.sleep(1000);

            HighlightElement.highlightElement(STSearchbtn);
            genericUtil.clickWithPause(STSearchbtn, 1000);

            HighlightElement.highlightElement(Ticket);
            genericUtil.clickWithPause(Ticket, 1000);

            HighlightElement.highlightElement(TDTicketDetailsTitle);
            genericUtil.clickWithPause(TDTicketDetailsTitle, 1000);

            HighlightElement.highlightElement(TDTicketNumber);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDDate);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDTicketTitle);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDCustomer);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDDescription);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDOwner);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDPriority);
            Thread.sleep(1000);

            HighlightElement.highlightElement(TDTags);
            Thread.sleep(1000);

            //File attachment
            if (TDFileAttachment.isDisplayed()) {
                HighlightElement.highlightElement(TDFileAttachment);
                genericUtil.clickWithPause(TDFileAttachment, 1000);
            } else {
                System.out.println("No attachment found!!");
            }


//            HighlightElement.highlightElement(TDQAttachment);
//            genericUtil.clickWithPause(TDQAttachment,1000);

            HighlightElement.highlightElement(ETDTitle);
            genericUtil.clickWithPause(ETDTitle, 2000);

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

            HighlightElement.highlightElement(ETDSubmit);
            genericUtil.clickWithPause(ETDSubmit, 1000);

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
