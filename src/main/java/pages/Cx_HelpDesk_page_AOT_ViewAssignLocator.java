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
import sun.security.krb5.internal.crypto.HmacSha1Des3KdCksumType;

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

    @FindBy(xpath = "(//label[@for='selectAll']/../..//li[@class='pure-checkbox ng-star-inserted'])[1]")
    public WebElement TicketType;

    @FindBy(xpath = "//input[@formcontrolname='User_Name']")
    public WebElement UserName;

    @FindBy(xpath = "//input[@formcontrolname='User_Id']")
    public WebElement UserId;

    @FindBy(xpath = "//label[contains(text(),'From Date ')]/..//input[@type='date']")
//    @FindBy(xpath = "//input[@formcontrolname=\"Start\" and @style='color: black; width: 100%;']")
    public WebElement FromDate;

    @FindBy(xpath = "//label[contains(text(),'To Date')]/..//input[@type='date']")
    public WebElement ToDate;//V 3.1

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

    @FindBy(xpath = "(//tr[@class='odd shown ng-star-inserted'])[1]")
    public WebElement SelectedRow;

    @FindBy(xpath = "(//td[@class=\"text-center\"])[4]")
    public WebElement SelectedRowTN;

    @FindBy(xpath = "(//i[@class='fa fa-eye green green-color greedAction text-center'])[1]")
    public WebElement ViewQuery;

    //   @FindBy(xpath = "//h4[contains(text(),'Missings')]")
    @FindBy(xpath = "(//h4[@class='modal-title'])[5]")
    public WebElement ViewQueryPopTitle;

    @FindBy(xpath = "//a[contains(text(),'980100123')]")
    public WebElement ViewQueryInvoiceNo;

    @FindBy(xpath = "(//button[contains(text(),'Close')])[3]")
    public WebElement ViewQueryCloseBtn;

    @FindBy(xpath = "(//input[@class='group-checkable ng-untouched ng-pristine ng-valid'])[1]/../..//span[1]")
    public WebElement TLCheckbox;

    @FindBy(xpath = "(//option[contains(text(),' Ankit Patel')])[1]/../../..//select")
    public WebElement TLReassignedto;

    @FindBy(xpath = "//input[@value='Re-assign']")
    public WebElement buttonReassign;

    @FindBy(xpath = "//h4[contains(text(),'Do you wish to re-assign selected ticket(s)?')]")
    public WebElement ReassignPopMsg;

    @FindBy(xpath = "//button[contains(text(),' Yes')]")
    public WebElement ReassignPopYes;

    @FindBy(xpath = "//button[contains(text(),'No')]")
    public WebElement ReassignPopNo;

    @FindBy(xpath = "//p[contains(text(),'Ticket Re Assigned Sucessfully.')]")
    public WebElement ReassignSuccessMsg;

    @FindBy(xpath = "//p[contains(text(),'Ticket Re Assigned Sucessfully.')]/../..//button[contains(text(),'Ok')]")
    public WebElement ReassignOkBtn;

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
     *
     * @param AOTSearchText
     * @param strReassign
     * @param strFromDate
     * @param strToDate
     */

    public void ViewAssignTicket(String AOTSearchText,String strReassign,String strFromDate,String strToDate) { //V 3.1
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;

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

            HighlightElement.highlightElement(FromDate);
            genericUtil.writeTextWithPause(FromDate,strFromDate,1000); //V 3.1

            HighlightElement.highlightElement(ToDate);
            genericUtil.writeTextWithPause(ToDate,strToDate,1000); //V 3.1

            HighlightElement.highlightElement(SearchBtn);
            genericUtil.clickWithPause(SearchBtn,3000);

            HighlightElement.highlightElement(TicketListHeading);
            genericUtil.clickWithPause(TicketListHeading,2000);

//            HighlightElement.highlightElement(TLSearch);
//            genericUtil.writeTextWithPause(TLSearch,AOTSearchText,2000);

            HighlightElement.highlightElement(SelectedRow);
            Thread.sleep(2000);

            HighlightElement.highlightElement(SelectedRowTN);
            Thread.sleep(2000);

            HighlightElement.highlightElement(ViewQuery);
            genericUtil.clickWithPause(ViewQuery,1000);

            HighlightElement.highlightElement(ViewQueryPopTitle);
            genericUtil.clickWithPause(ViewQueryPopTitle,1000);

            HighlightElement.highlightElement(ViewQueryInvoiceNo);
            genericUtil.clickWithPause(ViewQueryInvoiceNo,1000);

            HighlightElement.highlightElement(ViewQueryCloseBtn);
            genericUtil.clickWithPause(ViewQueryCloseBtn,1000);

            jsUp.executeScript("window.scrollBy(1000,0)");
            Thread.sleep(2000);

            //Every checkbox Xpath will change

            HighlightElement.highlightElement(TLCheckbox);
            genericUtil.clickWithPause(TLCheckbox,1000);
            HighlightElement.highlightElement(TLCheckbox);

            Thread.sleep(1000);

            HighlightElement.highlightElement(TLReassignedto);
            genericUtil.click(TLReassignedto);
            genericUtil.selectElementWithPause(TLReassignedto,strReassign,1000);
            HighlightElement.highlightElement(TLReassignedto);

            Thread.sleep(1000);

            HighlightElement.highlightElement(buttonReassign);
            genericUtil.clickWithPause(buttonReassign,1000);

            HighlightElement.highlightElement(ReassignPopMsg);
            genericUtil.clickWithPause(ReassignPopMsg,1000);

            HighlightElement.highlightElement(ReassignPopNo);
            genericUtil.clickWithPause(ReassignPopNo,1000);


            //Ticket not reassign  for script changes
//            HighlightElement.highlightElement(ReassignPopYes);
//            genericUtil.clickWithPause(ReassignPopYes,1000);

            HighlightElement.highlightElement(ReassignSuccessMsg);
            genericUtil.clickWithPause(ReassignSuccessMsg,1000);

            HighlightElement.highlightElement(ReassignOkBtn);
            genericUtil.clickWithPause(ReassignOkBtn,1000);

//            HighlightElement.highlightElement(buttonCancel);
//            genericUtil.clickWithPause(buttonCancel,2000);

        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}


