package pages;

import TestUtil.CheckBox;
import TestUtil.Constants;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.*;
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

    @FindBy(xpath = "//span[text()=' Sites ']")
    public WebElement TitleSiteUser; //V3.1

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

    @FindBy(xpath = "//span[text()=' Sites ']/../../..//div//table/tbody/tr[1]")
    public WebElement SiteFirstRowData;

    /*--------------Edit Site Employee ---------------*/

    @FindBy(xpath = "//h4[contains(text(),'Edit Site')]")
    public WebElement SiteEditHeader; //V3.1

    @FindBy(xpath = "//span[text()=' Sites ']/../../..//div//table/tbody/tr[1]//i[@title=\"Edit Employee\"]")  //span[contains(text()=' Sites ']/../../..//div//table/tbody/tr[1]//a//i[@title='Edit Employee')]
    public WebElement SiteEditBtn; //V3.1

    @FindBy(xpath = "(//i[@title='Delete Employee'])[11]")
    public WebElement SiteDeleteBtn; //V3.1

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
    public WebElement EditSaveButton; //V3.1

    @FindBy(xpath = "//h3[contains(text(),'Modified successfully!!!')]")
    public WebElement EditSuccessMessage; //V3.1

    @FindBy(xpath = "//h3[contains(text(),'Modified successfully!!!')]//..//..//button[contains(text(),'Ok')]")
    public WebElement EditSuccessMessageOkButton;

    @FindBy(xpath = "//a[text()='Add New Site']")
    public WebElement AddNewSite; //V3.1

    /*--------------Add New Site ---------------*/

    @FindBy(xpath = "//h4[contains(text(),'Add New Site')]")
    WebElement titleAddSite; //V3.1

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

    @FindBy(xpath = "//th[normalize-space()='Actions']")
    WebElement SiteTableActionsColumn;

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

    @FindBy(xpath = "//h3[contains(text(),'deleted successfully!!!')]")
    public WebElement DeleteSuccessMessage;

    @FindBy(xpath = "//h3[contains(text(),'deleted successfully!!!')]//..//..//button[contains(text(),'Ok')]")
    public WebElement DeleteSuccessMessageOkButton; //V3.1

    public Cx_HelpDesk_page_Master_SiteLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * TESTCASE METHOD: Create Site
     * @param strSiteCode
     * @param strSiteName
     * @param strSiteAddress
     * @param strSiteCounty
     * @param strSiteCity
     * @param strSiteCountry
     * @param strSitePostcode
     * @param strSiteContactNumber
     */
    public void createSite(String strSiteCode,String strSiteName,String strSiteAddress,String strSiteCounty,String strSiteCity,String strSiteCountry,String strSitePostcode,String strSiteContactNumber,String strSiteSearch){
        try {
            genericUtil = new GenericUtil();

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000); //V3.1

            HighlightElement.highlightElement(TitleSiteUser);
            genericUtil.clickWithPause(TitleSiteUser,1000);

            HighlightElement.highlightElement(SiteCollapse);
            genericUtil.clickWithPause(SiteCollapse,1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)");

            HighlightElement.highlightElement(AddNewSite);
            genericUtil.clickWithPause(AddNewSite,3000);

            HighlightElement.highlightElement(titleAddSite);
            genericUtil.clickWithPause(titleAddSite,3000);

            HighlightElement.highlightElement(SiteId);
            genericUtil.clickWithPause(SiteId,1000);

            HighlightElement.highlightElement(SiteCode);
            genericUtil.writeTextWithPause(SiteCode,strSiteCode,1000); //bns_vd

            HighlightElement.highlightElement(SiteName);
            genericUtil.writeTextWithPause(SiteName, strSiteName,1000); //BNS Group

            HighlightElement.highlightElement(SiteAddress);
            genericUtil.writeTextWithPause(SiteAddress,strSiteAddress,1000); //"CHHANI JAKATNAKA"

            HighlightElement.highlightElement(SiteCounty);
            genericUtil.writeTextWithPause(SiteCounty,strSiteCounty,1000); //"VDA"

            HighlightElement.highlightElement(SiteCity);
            genericUtil.writeTextWithPause(SiteCity,strSiteCity,1000); //"VADODARA"

            HighlightElement.highlightElement(SiteCountry);
            genericUtil.writeTextWithPause(SiteCountry,strSiteCountry,1000); //"INDIA"

            HighlightElement.highlightElement(SitePostCode);
            genericUtil.writeTextWithPause(SitePostCode,strSitePostcode,1000); //"989754"

            HighlightElement.highlightElement(SiteContactNo);
            genericUtil.writeTextWithPause(SiteContactNo,strSiteContactNumber,1000); //"9874561230"

            HighlightElement.highlightElement(SiteAddSubmit);
            genericUtil.clickWithPause(SiteAddSubmit,3000);

            HighlightElement.highlightElement(SiteSearch);
            genericUtil.writeTextWithPause(SiteSearch,"bns_vd",1000);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     *
     * @param strSiteName
     * @param strSiteAddress
     * @param strSiteCounty
     * @param strSiteCity
     * @param strSiteCountry
     * @param strSitePostcode
     * @param strSiteContactNumber
     * @param strEditSiteSearch
     */
    public void editSite(String strSiteName, String strSiteAddress, String strSiteCounty, String strSiteCity, String strSiteCountry, String strSitePostcode, String strSiteContactNumber, String strEditSiteSearch){
        try {
            genericUtil = new GenericUtil();

//            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
//            HighlightElement.highlightElement(sidebar_textMaster);
//            sidebar_textMaster.click();
//            genericUtil.pause(2000);

//            HighlightElement.highlightElement(TitleMasters);
//            genericUtil.pause(1000);

//            HighlightElement.highlightElement(TitleSiteUser);
//            genericUtil.clickWithPause(TitleSiteUser,1000);
//
//            HighlightElement.highlightElement(SiteCollapse);
//            genericUtil.clickWithPause(SiteCollapse,1000);

            HighlightElement.highlightElement(SiteFirstRowData);
            genericUtil.clickWithPause(SiteFirstRowData,1000);

            HighlightElement.highlightElement(TitleSiteUser);
            genericUtil.clickWithPause(TitleSiteUser,1000);

            HighlightElement.highlightElement(SiteEditBtn);
            genericUtil.clickWithPause(SiteEditBtn,1000);

            wait.until(ExpectedConditions.visibilityOf(EditPopupAlertMsg));
            HighlightElement.highlightElement(EditPopupAlertMsg);
            genericUtil.clickWithPause(EditPopupAlertMsg,1000);

            HighlightElement.highlightElement(EditPopupAlertYes);
            genericUtil.clickWithPause(EditPopupAlertYes,1000);

            HighlightElement.highlightElement(SiteEditHeader);
            genericUtil.clickWithPause(SiteEditHeader,3000);

//            HighlightElement.highlightElement(EditSiteId);
//            genericUtil.clickWithPause(EditSiteId,1000); //V3.1

            HighlightElement.highlightElement(EditSiteCode);
            genericUtil.writeTextWithPause(EditSiteCode,"Updated laxmico",1000); //V3.1

            HighlightElement.highlightElement(EditSiteName);
            genericUtil.writeTextWithPause(EditSiteName,strSiteName,1000); //"BNS LAXMICO Luxshtech" + Constants.date.getTime()

            HighlightElement.highlightElement(EditSiteAddress);
            genericUtil.writeTextWithPause(EditSiteAddress,strSiteAddress,1000); //"Updated CHHANI JAKATNAJKA"

            HighlightElement.highlightElement(EditSiteCounty);
            genericUtil.writeTextWithPause(EditSiteCounty,strSiteCounty,1000); //"UpdatedVDA"

            HighlightElement.highlightElement(EditSiteCity);
            genericUtil.writeTextWithPause(EditSiteCity,strSiteCity,1000); //"UpdatedVADODARA"

            HighlightElement.highlightElement(EditSiteCountry);
            genericUtil.writeTextWithPause(EditSiteCountry,strSiteCountry,1000); //"UpdatedINDIA"

            HighlightElement.highlightElement(EditSitePostcode);
            genericUtil.writeTextWithPause(EditSitePostcode,strSitePostcode,1000); //"987456"

            HighlightElement.highlightElement(EditSiteContactNo);
            genericUtil.writeTextWithPause(EditSiteContactNo,strSiteContactNumber,1000); //"8998121230"

            HighlightElement.highlightElement(EditSaveButton);
            genericUtil.clickWithPause(EditSaveButton,3000); //V3.1

            wait.until(ExpectedConditions.visibilityOf(EditSuccessMessage));
            HighlightElement.highlightElement(EditSuccessMessage);
            genericUtil.clickWithPause(EditSuccessMessage,1000);

            HighlightElement.highlightElement(EditSuccessMessageOkButton);
            genericUtil.clickWithPause(EditSuccessMessageOkButton,2000);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: Delete Site
     *
     * @param strDeSiteCode
     */
    public void deleteSite(String strDeSiteCode){
        try {
            genericUtil = new GenericUtil();

            HighlightElement.highlightElement(TitleSiteUser);
            genericUtil.click(TitleSiteUser);

            HighlightElement.highlightElement(SiteSearch);
            genericUtil.writeTextWithPause(SiteSearch,strDeSiteCode,1000); //V3.1

//            HighlightElement.highlightElement(SiteFirstRowData);
//            genericUtil.clickWithPause(SiteFirstRowData,1000);

            try {
                HighlightElement.highlightElement(SiteDeleteBtn);
                genericUtil.clickWithPause(SiteDeleteBtn,2000); //V3.1
            }
            catch (StaleElementReferenceException e){
                HighlightElement.highlightElement(SiteDeleteBtn);
                genericUtil.clickWithPause(SiteDeleteBtn,2000);
            }

            HighlightElement.highlightElement(SiteDeleteAlertMsg);
            genericUtil.clickWithPause(SiteDeleteAlertMsg,1000);

            HighlightElement.highlightElement(SiteDeleteYesOption);
            genericUtil.clickWithPause(SiteDeleteYesOption,1000);

            wait.until(ExpectedConditions.visibilityOf(DeleteSuccessMessage));
            HighlightElement.highlightElement(DeleteSuccessMessage);
            genericUtil.clickWithPause(DeleteSuccessMessage,1000);

            HighlightElement.highlightElement(DeleteSuccessMessageOkButton);
            genericUtil.clickWithPause(DeleteSuccessMessageOkButton,2000);

            HighlightElement.highlightElement(SiteSearch);
            genericUtil.writeTextWithPause(SiteSearch,strDeSiteCode,1000); //"Updated BNS LAXMICO" + Constants.date.getTime() //V3.1

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
