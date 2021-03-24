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
    public WebElement buttonSearch;

    @FindBy(xpath = "//button[contains(text(),'Clear Filters')]")
    public WebElement buttonClear;

    @FindBy(xpath = "//h4[contains(text(),'Ticket List')]")
    public WebElement titleTicketList;

    @FindBy(xpath = "//h4[contains(text(),'Ticket List')]/..//li[1]")
    public WebElement firstTicketFromTicketList;

    @FindBy(xpath = "//span[contains(text(),'Ticket Details')]")
    public WebElement titleTicketDetails;

    @FindBy(xpath = "//label[contains(text(),'Account Number')]/..//input[@type=\"text\"]")
    public WebElement TDAccountNumber;

    @FindBy(xpath = "//label[contains(text(),'Ticket Number ')]/..//input[@type='text']")
    public WebElement TDTicketNumberAndDate;

    @FindBy(xpath = "//label[contains(text(),'State')]/..//input[@type='text']")
    public WebElement TDState;

    @FindBy(xpath = "//label[contains(text(),'Query Message')]/..//textarea[@class='form-control']")
    public WebElement TDQueryMessage;

    @FindBy(xpath = "//label[contains(text(),'Message History')]/..//ul[@class=\"ng-star-inserted\"]")
    public WebElement TDMessageHistory;

    @FindBy(xpath = "//label[contains(text(),'Agent Comment')]/..//input[@type='text']")
    public WebElement TDAgentComment;

    @FindBy(xpath = "//label[contains(text(),'Customer Comment')]/..//input[@type='text']")
    public WebElement TDCustomerComment;

    @FindBy(xpath = "//a[@href=\"javascript:\"]")
    public WebElement TDFileAttachment;

    /**
     * TESTCASE METHOD: OVERVIEW TICKET
     */
    public void overviewTicket() {
        genericUtil = new GenericUtil();

        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textOverview));
            HighlightElement.highlightElement(sidebar_textOverview);
            genericUtil.clickWithPause(sidebar_textOverview, 1000);

            HighlightElement.highlightElement(titleOverview);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(titleTicketList);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(buttonSearch);
            genericUtil.clickWithPause(buttonSearch, 2000);

            HighlightElement.highlightElement(firstTicketFromTicketList);
            genericUtil.clickWithPause(firstTicketFromTicketList, 2000);

            HighlightElement.highlightElement(titleTicketDetails);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TDAccountNumber);
            genericUtil.clickWithPause(TDAccountNumber, 1000);

            HighlightElement.highlightElement(TDTicketNumberAndDate);
            genericUtil.clickWithPause(TDTicketNumberAndDate, 1000);

            HighlightElement.highlightElement(TDState);
            genericUtil.clickWithPause(TDState, 1000);

            HighlightElement.highlightElement(TDQueryMessage);
            genericUtil.clickWithPause(TDQueryMessage, 1000);

            HighlightElement.highlightElement(TDMessageHistory);
            genericUtil.clickWithPause(TDMessageHistory, 1000);

            HighlightElement.highlightElement(TDAgentComment);
            genericUtil.clickWithPause(TDAgentComment, 1000);

            HighlightElement.highlightElement(TDCustomerComment);
            genericUtil.clickWithPause(TDCustomerComment, 1000);

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
