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

public class Cx_HelpDesk_page_OverviewLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_OverviewLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),'Overview')]")
    public WebElement sidebar_textOverview;

    @FindBy(xpath = "//h1[contains(text(),'Ticket Overviews ')]")
    public WebElement titleOverview;

    @FindBy(xpath = "//div[@class='portlet-title ui-sortable-handle']//a[@class='expand btn btn-circle btn-icon-only btn-default']") //Added on 10-Jun-2021
    public WebElement TicketSearchCollapse;

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
    public WebElement buttonSearch;

    @FindBy(xpath = "//button[contains(text(),'Clear Filters')]")
    public WebElement buttonClear;

    @FindBy(xpath = "//h4[contains(text(),'Ticket List')]")
    public WebElement titleTicketList;

//    @FindBy(xpath = "//h4[contains(text(),'Ticket List')]/..//li[1]")
    @FindBy(xpath = "//a[normalize-space()='Ticket 736']") //Changes in version 3.1 on 10-June-2021
    public WebElement firstTicketFromTicketList;

    @FindBy(xpath = "//span[contains(text(),'Ticket Details')]")
    public WebElement titleTicketDetails;

    @FindBy(xpath = "//label[contains(text(),'Account Number')]/..//input[@type=\"text\"]")
    public WebElement TDAccountNumber;

    @FindBy(xpath = "//div[@class='col-lg-9 col-xs-12 col-sm-12 column sortable ticketDetails TicketList ng-star-inserted']//div[@class='row']//div[2]//div[1]//input[1]") //Added in version 3.1 on 10-June-2021
    public WebElement TDCustomer;

    @FindBy(xpath = "//label[contains(text(),'Site')]/..//input[@type=\"text\"]")     //Added in version 3.1 on 10-June-2021
    public WebElement TDSite;

    @FindBy(xpath = "//label[contains(text(),'Ticket Number')]/..//input[@type='text']")     //Added in version 3.1 on 10-June-2021
    public WebElement TDTicketNumber;

    @FindBy(xpath = "//label[contains(text(),'Ticket Date')]/..//input[@type='text']")     //Added in version 3.1 on 10-June-2021
    public WebElement TDTicketDate;

    @FindBy(xpath = "//label[contains(text(),'Ticket Title')]/..//input[@type='text']") //Added in version 3.1 on 10-June-2021
    public WebElement TDTicketTitle;

    @FindBy(xpath = "//label[contains(text(),'Priority')]/..//input[@type='text']") //Added in version 3.1 on 10-June-2021
    public WebElement TDPriority;

    @FindBy(xpath = "//label[contains(text(),'Tags')]/..//input[@type='text']") //Added in version 3.1 on 10-June-2021
    public WebElement TDTag;

    @FindBy(xpath = "//label[contains(text(),'Description')]/..//input[@type='text']") //Changes in version 3.1 on 10-June-2021
    public WebElement TDDescription;

    @FindBy(xpath = "//label[contains(text(),'Owner')]/..//input[@type='text']") //Added in version 3.1 on 10-June-2021
    public WebElement TDOwner;

    @FindBy(xpath = "//label[contains(text(),'Re-assigned To')]/..//input[@type='text']") //Added in version 3.1 on 10-June-2021
    public WebElement TDReassignedTo;

    @FindBy(xpath = "//label[contains(text(),'Self-assigned By')]/..//input[@type='text']") //Added in version 3.1 on 10-June-2021
    public WebElement TDSelfAssignedBy;

    @FindBy(xpath = "//label[contains(text(),'Closing Statement')]/..//textarea[@class='form-control']") //Added in version 3.1 on 10-June-2021
    public WebElement TDClosingStatement;

    @FindBy(xpath = "//label[contains(text(),'State')]/..//input[@type='text']")
    public WebElement TDState;

    @FindBy(xpath = "//label[contains(text(),'Message History')]/..//ul[@class=\"form-control ng-star-inserted\"]") //Changes in version 3.1 on 10-June-2021
    public WebElement TDMessageHistory;

    @FindBy(xpath = "//label[contains(text(),'Agent Comment')]/..//input[@type='text']")
    public WebElement TDAgentComment;

    @FindBy(xpath = "//label[contains(text(),'Customer Comment')]/..//input[@type='text']")
    public WebElement TDCustomerComment;

    @FindBy(xpath = "//a[@href=\"javascript:\"]")
    public WebElement TDFileAttachment;

    /*------BEGIN of----------------------------Summary Section---Added in v3.1---------------------------------------*/
    @FindBy(xpath = "//span[normalize-space()='Summary']")    //Changes in v3.1 on 27-May-2021
    public WebElement titleSummary;

    @FindBy(xpath = "//button[@class='btn blue'][normalize-space()='View Full Invoice']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_ViewFullInvoiceButton;

    @FindBy(xpath = "//div[@id='View_Full_Invoice_TicketOverview']//button[@type='button'][normalize-space()='Close']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_ViewFullInvoice_CloseButton;

    @FindBy(xpath = "//button[normalize-space()='Edit']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_EditButton;

    @FindBy(xpath = "//input[@placeholder='Display Responsible Person Name']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_RPName;

    @FindBy(xpath = "//input[@placeholder='Display Position']")    //Changes in v3.1 on 27-May-2021
    public WebElement Summary_RP_Position;

    /*--------------------------------------------------End of-SUMMARY------------------------------------------------*/

    /**
     * TESTCASE METHOD: OVERVIEW TICKET
     */
    public void overviewTicket() {
        genericUtil = new GenericUtil();
        JavascriptExecutor jsDown = (JavascriptExecutor) driver;
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;

        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textOverview));
            HighlightElement.highlightElement(sidebar_textOverview);
            genericUtil.clickWithPause(sidebar_textOverview, 1000);

            HighlightElement.highlightElement(titleOverview);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(buttonSearch);
            genericUtil.clickWithPause(buttonSearch, 2000);

            genericUtil.pause(1000);
            jsDown.executeScript("window.scrollBy(0,2000)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(titleTicketList);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(firstTicketFromTicketList);
            genericUtil.clickWithPause(firstTicketFromTicketList, 1000);

            jsUp.executeScript("window.scrollBy(0,-1000)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(titleTicketDetails);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TicketSearchCollapse);
            genericUtil.clickWithPause(TicketSearchCollapse,1000);

            HighlightElement.highlightElement(TDAccountNumber);
            genericUtil.clickWithPause(TDAccountNumber, 1000);

            HighlightElement.highlightElement(TDCustomer); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDCustomer, 1000);

            HighlightElement.highlightElement(TDSite); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDSite, 1000);

            HighlightElement.highlightElement(TDTicketNumber); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDTicketNumber, 1000);

            HighlightElement.highlightElement(TDTicketDate); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDTicketDate, 1000);

            HighlightElement.highlightElement(TDTicketTitle); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDTicketTitle, 1000);

            HighlightElement.highlightElement(TDPriority); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDPriority, 1000);

            HighlightElement.highlightElement(TDTag); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDTag, 1000);

            HighlightElement.highlightElement(TDAgentComment);
            genericUtil.clickWithPause(TDAgentComment, 1000);

            HighlightElement.highlightElement(TDCustomerComment);
            genericUtil.clickWithPause(TDCustomerComment, 1000);

            HighlightElement.highlightElement(TDDescription);
            genericUtil.clickWithPause(TDDescription, 1000);

            HighlightElement.highlightElement(TDOwner); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDOwner, 1000);

            HighlightElement.highlightElement(TDReassignedTo); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDReassignedTo, 1000);

            HighlightElement.highlightElement(TDSelfAssignedBy); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDSelfAssignedBy, 1000);

            HighlightElement.highlightElement(TDClosingStatement); //Added in version 3.1 on 10-June-2021
            genericUtil.clickWithPause(TDClosingStatement, 1000);

            HighlightElement.highlightElement(TDMessageHistory);
            genericUtil.clickWithPause(TDMessageHistory, 1000);

            /*------BEGIN-----------------------------------SUMMARY SECTION--------------------------------------*/
            HighlightElement.highlightElement(titleSummary);
            genericUtil.clickWithPause(titleSummary,1000);

            HighlightElement.highlightElement(Summary_ViewFullInvoiceButton);
            genericUtil.clickWithPause(Summary_ViewFullInvoiceButton,1000);

            HighlightElement.highlightElement(Summary_ViewFullInvoice_CloseButton);
            genericUtil.clickWithPause(Summary_ViewFullInvoice_CloseButton,1000);
            /*------END Of--------------------------------SUMMARY SECTION-----------------------------------*/

            //File attachment
            if (TDFileAttachment.isDisplayed()) {
                HighlightElement.highlightElement(TDFileAttachment);
                genericUtil.clickWithPause(TDFileAttachment, 1000);
            } else {
                System.out.println("No attachment found!!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
