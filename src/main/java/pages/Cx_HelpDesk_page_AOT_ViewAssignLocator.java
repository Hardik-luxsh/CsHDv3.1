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

public class Cx_HelpDesk_page_AOT_ViewAssignLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//span[contains(text(),'View Assigned Tickets') and @class='title']")
    public WebElement TitleViewAssign;

    @FindBy(xpath = "//li[@id='actiononticket']")
    public WebElement sidebar_textActionOnTicket;

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

//    @FindBy(xpath = "//input[@class='ng-pristine ng-valid ng-touched']")
//    @FindBy(xpath = "//input[@formcontrolname=\"Start\" and @style='color: black; width: 100%;']")
//    public WebElement FromDate;
//
//    @FindBy(xpath = "//input[@class='ng-pristine ng-valid ng-touched']")
//    public WebElement ToDate;

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

    @FindBy(xpath = "(//tr[@class='odd shown'])[1]")
    public WebElement SelectedRow;

    @FindBy(xpath = "(//td[@class=\"text-center\"])[4]")
    public WebElement SelectedRowTN;

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement buttonCancel;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[1]")
    WebElement EmpPaginationPrevious;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[2]")
    WebElement EmpPaginationNext;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[3]")
    WebElement EmpPaginationNo;

    public Cx_HelpDesk_page_AOT_ViewAssignLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * TESTCASE METHOD: Assign Ticket
     * @param AOTSearchText
     */
    public void AssignTicket(String AOTSearchText) {
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textActionOnTicket));
            HighlightElement.highlightElement(sidebar_textActionOnTicket);
            sidebar_textActionOnTicket.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleViewAssign);
            genericUtil.clickWithPause(TitleViewAssign,1000);

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

//            HighlightElement.highlightElement(FromDate);
//            genericUtil.clickWithPause(FromDate,1000);
//
//            HighlightElement.highlightElement(ToDate);
//            genericUtil.pause(1000);

            HighlightElement.highlightElement(SearchBtn);
            genericUtil.clickWithPause(SearchBtn,3000);

            HighlightElement.highlightElement(TicketListHeading);
            genericUtil.clickWithPause(TicketListHeading,2000);

            HighlightElement.highlightElement(TLSearch);
            genericUtil.writeTextWithPause(TLSearch,AOTSearchText,2000);

            HighlightElement.highlightElement(SelectedRow);
            Thread.sleep(2000);

            HighlightElement.highlightElement(SelectedRowTN);
            Thread.sleep(2000);

            HighlightElement.highlightElement(buttonCancel);
            genericUtil.clickWithPause(buttonCancel,2000);

        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}


