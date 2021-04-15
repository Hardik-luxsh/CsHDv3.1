package pages;

import TestUtil.CheckBox;
import TestUtil.Constants;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_Master_SiteLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;
    public static CheckBox objCheckBox;

    @FindBy(xpath = "//h1[@class='page-title']")
    public WebElement TitleMasters;

    @FindBy(xpath = "//span[text()=' Site Master ']")
    public WebElement TitleSiteUser;

    @FindBy(xpath = "//li[@id='master']")
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[3]")
    public WebElement SiteCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[3]")
    public WebElement SiteFullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[3]")
    public WebElement NumberOfRecordsPerPage;

    @FindBy(xpath = "(//input[@class='fontColor'])[3]")
    public WebElement SiteSearch;

    @FindBy(xpath = "//span[text()=' Site Master ']/../../..//div//table/tbody/tr[1]")
    public WebElement SiteFirstRowData;

    /*--------------Edit Site Employee ---------------*/

    @FindBy(xpath = "//h4[contains(text(),'Edit Site')]")
    public WebElement SiteEditHeader;

    @FindBy(xpath = "//span[text()=' Site Master ']/../../..//div//table/tbody/tr[1]//a//i[@title='Edit Employee']")
    public WebElement SiteEditBtn;

    @FindBy(xpath = "//span[text()=' Site Master ']/../../..//div//table/tbody/tr[1]//a//i[@title='Delete Employee']")
    public WebElement SiteDeleteBtn;

    @FindBy(xpath = "//h3[contains(text(),'Do You Wish To Edit Site')]")
    public WebElement EditPopupAlertMsg;

    @FindBy(xpath = "(//button[@class='btn btn-lg btn-success'])[9]")
    public WebElement EditPopupAlertYes;

    @FindBy(xpath = "(//button[@class='btn btn-lg btn-danger'])[3]")
    public WebElement EditPopupAlertNo;

    @FindBy(xpath = "//input[@id='siteNo']")
    public WebElement EditSiteId;

    @FindBy(xpath = "//input[@id='code']")
    public WebElement EditSiteCode;

    @FindBy(xpath = "//h4[contains(text(),'Edit Site')]/../..//input[@id='name']")
    public WebElement EditSiteName;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement EditSiteAddress;

    @FindBy(xpath = "//input[@id='county']")
    public WebElement EditSiteCounty;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement EditSiteCity;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement EditSiteCountry;

    @FindBy(xpath = "//input[@id='postCode']")
    public WebElement EditSitePostcode;

    @FindBy(xpath = "//input[@id='contactNo']")
    public WebElement EditSiteContactNo;

    @FindBy(xpath = "//h4[contains(text(),'Edit Site')]//..//..//input[@value='Save']")
    public WebElement EditSaveButton;


    @FindBy(xpath = "//a[text()='Add New Site']")
    public WebElement AddNewSite;

    /*--------------Add New Site ---------------*/

    @FindBy(xpath = "//h4[contains(text(),'Add New Site')]")
    WebElement titleAddSite;

    @FindBy(xpath = "//input[@id='siteNo']")
    WebElement SiteId;

    @FindBy(xpath = "//input[@id='code']")
    WebElement SiteCode;

    @FindBy(xpath = "//input[@id='name']")
    WebElement SiteName;

    @FindBy(xpath = "//input[@id='address']")
    WebElement SiteAddress;

    @FindBy(xpath = "//input[@id='county']")
    WebElement SiteCounty;

    @FindBy(xpath = "//input[@id='city']")
    WebElement SiteCity;

    @FindBy(xpath = "//input[@id='country']")
    WebElement SiteCountry;

    @FindBy(xpath = "//input[@id='postCode']")
    WebElement SitePostCode;

    @FindBy(xpath = "//input[@id='contactNo']")
    WebElement SiteContactNo;

    @FindBy(xpath = "(//input[@value='Save'])[3]")
    WebElement SiteAddSubmit;

    @FindBy(xpath = "(//input[@value='Clear'])[3]")
    WebElement SiteAddClear;

    @FindBy(xpath = "(//input[@value='Cancel'])[3]")
    WebElement SiteAddCancel;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[7]")
    WebElement SitePaginationPrevious;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
    WebElement SitePaginationNext;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[8]")
    WebElement SitePaginationNo;

    @FindBy(xpath = "//h3[contains(text(),'Do You Wish To Delete Site ')]//..//..//button[@class='btn btn-lg btn-success']")
    WebElement SiteDeleteYesOption;

    @FindBy(xpath = "//h3[contains(text(),'Do You Wish To Delete Site ')]")
    WebElement SiteDeleteAlertMsg;

    public Cx_HelpDesk_page_Master_SiteLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * TESTCASE METHOD: Create Site
     */
    public void createSite(){
        try {
            genericUtil = new GenericUtil();

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleSiteUser);
            genericUtil.clickWithPause(TitleSiteUser,1000);

            HighlightElement.highlightElement(SiteCollapse);
            genericUtil.clickWithPause(SiteCollapse,1000);

            HighlightElement.highlightElement(AddNewSite);
            genericUtil.clickWithPause(AddNewSite,3000);

            HighlightElement.highlightElement(titleAddSite);
            genericUtil.clickWithPause(titleAddSite,3000);

            HighlightElement.highlightElement(SiteId);
            genericUtil.clickWithPause(SiteId,1000);

            HighlightElement.highlightElement(SiteCode);
            genericUtil.writeTextWithPause(SiteCode,"bnsvd" + Constants.date.getTime(),1000);

            HighlightElement.highlightElement(SiteName);
            genericUtil.writeTextWithPause(SiteName,"BNS Group",1000);

            HighlightElement.highlightElement(SiteAddress);
            genericUtil.writeTextWithPause(SiteAddress,"CHHANI JAKATNAJKA",1000);

            HighlightElement.highlightElement(SiteCounty);
            genericUtil.writeTextWithPause(SiteCounty,"VDA",1000);

            HighlightElement.highlightElement(SiteCity);
            genericUtil.writeTextWithPause(SiteCity,"VADODARA",1000);

            HighlightElement.highlightElement(SiteCountry);
            genericUtil.writeTextWithPause(SiteCountry,"INDIA",1000);

            HighlightElement.highlightElement(SiteContactNo);
            genericUtil.writeTextWithPause(SiteContactNo,"9874561230",1000);

            HighlightElement.highlightElement(SitePostCode);
            genericUtil.writeTextWithPause(SitePostCode,"989754",1000);

            HighlightElement.highlightElement(SiteAddSubmit);
            genericUtil.clickWithPause(SiteAddSubmit,3000);

            HighlightElement.highlightElement(SiteSearch);
            genericUtil.writeTextWithPause(SiteSearch,"BNS",1000);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void editSite(){
        try {
            genericUtil = new GenericUtil();

            HighlightElement.highlightElement(SiteFirstRowData);
            genericUtil.clickWithPause(SiteFirstRowData,1000);

            HighlightElement.highlightElement(SiteEditBtn);
            genericUtil.clickWithPause(SiteEditBtn,1000);

            wait.until(ExpectedConditions.visibilityOf(EditPopupAlertMsg));
            HighlightElement.highlightElement(EditPopupAlertMsg);
            genericUtil.clickWithPause(EditPopupAlertMsg,1000);

            HighlightElement.highlightElement(EditPopupAlertYes);
            genericUtil.clickWithPause(EditPopupAlertYes,1000);

            HighlightElement.highlightElement(SiteEditHeader);
            genericUtil.clickWithPause(SiteEditHeader,3000);

            HighlightElement.highlightElement(EditSiteId);
            genericUtil.clickWithPause(EditSiteId,1000);

            HighlightElement.highlightElement(EditSiteCode);
            genericUtil.writeTextWithPause(EditSiteCode,"Updated laxmico" + Constants.date.getTime(),1000);

            HighlightElement.highlightElement(EditSiteName);
            genericUtil.writeTextWithPause(EditSiteName,"BNS LAXMICO Luxshtech",1000);

            HighlightElement.highlightElement(EditSiteAddress);
            genericUtil.writeTextWithPause(EditSiteAddress,"Updated CHHANI JAKATNAJKA",1000);

            HighlightElement.highlightElement(EditSiteCounty);
            genericUtil.writeTextWithPause(EditSiteCounty,"UpdatedVDA",1000);

            HighlightElement.highlightElement(EditSiteCity);
            genericUtil.writeTextWithPause(EditSiteCity,"UpdatedVADODARA",1000);

            HighlightElement.highlightElement(EditSiteCountry);
            genericUtil.writeTextWithPause(EditSiteCountry,"UpdatedINDIA",1000);

            HighlightElement.highlightElement(EditSiteContactNo);
            genericUtil.writeTextWithPause(EditSiteContactNo,"89981230",1000);

            HighlightElement.highlightElement(EditSitePostcode);
            genericUtil.writeTextWithPause(EditSitePostcode,"987456",1000);

            HighlightElement.highlightElement(EditSaveButton);
            genericUtil.clickWithPause(EditSaveButton,3000);

            HighlightElement.highlightElement(SiteSearch);
            genericUtil.writeTextWithPause(SiteSearch,"Updated BNS LAXMICO" + Constants.date.getTime(),1000);


        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void deleteSite(){
        try {
            genericUtil = new GenericUtil();

            HighlightElement.highlightElement(SiteFirstRowData);
            genericUtil.clickWithPause(SiteFirstRowData,1000);

            HighlightElement.highlightElement(SiteDeleteBtn);
            genericUtil.clickWithPause(SiteDeleteBtn,2000);

            HighlightElement.highlightElement(SiteDeleteAlertMsg);
            genericUtil.clickWithPause(SiteDeleteAlertMsg,1000);

            HighlightElement.highlightElement(SiteDeleteYesOption);
            genericUtil.clickWithPause(SiteDeleteYesOption,1000);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
