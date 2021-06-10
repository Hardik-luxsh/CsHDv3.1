package pages;

import TestUtil.CheckBox;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_AOT_SelfAssignLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//span[contains(text(),'Self Assign Ticket') and @class='title']")
    public WebElement TitleSelfAssign;

    @FindBy(xpath = "//li[@id='actiononticket']")
    public WebElement sidebar_textActiononTicket;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    public WebElement SatCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    public WebElement SatFullScreen;

    @FindBy(xpath = "//div[@class='c-btn']")
    public WebElement TicketTypeOpen;

    @FindBy(xpath = "//label[@for='selectAll']")
    public WebElement TicketType;

    @FindBy(xpath = "//input[@formcontrolname='User_Name']")
    public WebElement UserName;

    @FindBy(xpath = "//input[@formcontrolname='User_Id']")
    public WebElement UserId;

    @FindBy(xpath = "//label[contains(text(),'From Date ')]/..//input[@type='date']")
//    @FindBy(xpath = "//input[@formcontrolname=\"Start\" and @style='color: black; width: 100%;']")
    public WebElement FromDate; //V3.1

    @FindBy(xpath = "//label[contains(text(),'To Date')]/..//input[@type='date']")
    public WebElement ToDate; //V3.1

    @FindBy(xpath = "(//input[@class='btn btn-success'])[3]")
    public WebElement SearchBtn;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[4]")
    public WebElement ClearBtn;

    @FindBy(xpath = "(//span[@class='caption-subject font-dark bold uppercase'])[2]")
    public WebElement TicketListHeading;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[2]")
    public WebElement TLCollapse;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-icon-only btn-default fullscreen fullscreen1']")
    public WebElement TLFullScreen;

    @FindBy(xpath = "//select[@class='fontColor']")
    public WebElement NumberOfRecordsPerPage;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement TLSearch;

    @FindBy(xpath = "//td//input[@type=\"checkbox\"]")
    public WebElement TLCheckbox;

    @FindBy(xpath = "(//tr[@class='odd shown'])[1]")
    public WebElement SelectedRow;

    @FindBy(xpath = "(//td[@class=\"text-center\"])[5]")
    public WebElement SelectedRowTN;

    @FindBy(xpath = "//input[@value='Assign']")
    public WebElement Assignbtn;

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement Cancelbtn;

    @FindBy(xpath = "//li[@class='pagination-previous disabled ng-star-inserted']")
    WebElement EmpPaginationPrevious;

    @FindBy(xpath = "//li[@class='pagination-next disabled ng-star-inserted']")
    WebElement EmpPaginationNext;

    @FindBy(xpath = "(//li[@class='current ng-star-inserted'])")
    WebElement EmpPaginationNo;

    @FindBy(xpath = "//p[contains(text(),' Tickets Assigned Successfully!! ')]")
    WebElement SuccessMsgSatAssign;

    @FindBy(xpath = "//img[@src='../assets/layouts/layout2/img/check.svg']")
    WebElement OkSatAssign;

    @FindBy(xpath = "//p[contains(text(),' Tickets Assigned Successfully!! ')]/../../..//input[@value='Close']")
    WebElement closedPopupAssign;

    public Cx_HelpDesk_page_AOT_SelfAssignLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     *
     * @param AOTSearchText
     * @param strFromDate
     * @param strToDate
     */
    public void AssignTicket(String AOTSearchText,String strFromDate,String strToDate) { //V3.1
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textActiononTicket));
            HighlightElement.highlightElement(sidebar_textActiononTicket);
            sidebar_textActiononTicket.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleSelfAssign);
            genericUtil.clickWithPause(TitleSelfAssign,1000);

//            HighlightElement.highlightElement(SatCollapse);
//            genericUtil.pause(1000);

            genericUtil.refreshPage(1000);

            HighlightElement.highlightElement(TicketTypeOpen);
            genericUtil.clickWithPause(TicketTypeOpen,1000);

            HighlightElement.highlightElement(TicketType);
            genericUtil.clickWithPause(TicketType,1000);

            HighlightElement.highlightElement(UserName);
            genericUtil.clickWithPause(UserName,2000);

            HighlightElement.highlightElement(UserId);
            genericUtil.clickWithPause(UserId,2000);

            HighlightElement.highlightElement(FromDate);
            genericUtil.writeTextWithPause(FromDate,strFromDate,1000); //V3.1

            HighlightElement.highlightElement(ToDate);
            genericUtil.writeTextWithPause(ToDate,strToDate,1000); //V3.1

            HighlightElement.highlightElement(SearchBtn);
            genericUtil.clickWithPause(SearchBtn,3000);

            HighlightElement.highlightElement(TicketListHeading);
            genericUtil.clickWithPause(TicketListHeading,2000);

            HighlightElement.highlightElement(TLSearch);
            genericUtil.writeTextWithPause(TLSearch,AOTSearchText,2000);

            HighlightElement.highlightElement(TLCheckbox);
            genericUtil.clickWithPause(TLCheckbox,1000);

            HighlightElement.highlightElement(SelectedRow);
            Thread.sleep(2000);

            HighlightElement.highlightElement(SelectedRowTN);
            Thread.sleep(2000);

            HighlightElement.highlightElement(Assignbtn);
            genericUtil.clickWithPause(Assignbtn,2000);

            HighlightElement.highlightElement(SuccessMsgSatAssign);
            genericUtil.clickWithPause(SuccessMsgSatAssign,2000); //V3.0

//            HighlightElement.highlightElement(OkSatAssign);
//            genericUtil.clickWithPause(OkSatAssign,2000);

            HighlightElement.highlightElement(closedPopupAssign);
            genericUtil.clickWithPause(closedPopupAssign,2000); //V3.0

//            HighlightElement.highlightElement(TitleSelfAssign);
//            genericUtil.clickWithPause(TitleSelfAssign,2000);

        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}