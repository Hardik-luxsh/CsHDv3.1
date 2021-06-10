package pages;

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
import org.testng.Assert;

public class Cx_HelpDesk_page_Customer_RequestCallBackLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_Customer_RequestCallBackLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),'Customer') and @class='title']") //Changes in v2.0 on 04-Feb-2021
    public WebElement sidebar_textCustomer;

    @FindBy(xpath = "//a[@routerlink='/callbackrequest']//span[@class='title']") //Changes in v3.1 on 10-June-2021
    public WebElement sidebar_textRequestCallBack;

    /****************************  Request Call Back ***************** Added in version 3.1 on 10-June-2021 *********/

    @FindBy(xpath = "//span[contains(text(),'Call Back Requests')]")
    public WebElement titleRCB;

    @FindBy(xpath = "//label[contains(text(),'From Date ')]/..//input[@type='date']")
//    @FindBy(xpath = "//input[@formcontrolname=\"Start\" and @style='color: black; width: 100%;']")
    public WebElement FromDate; //V3.1

    @FindBy(xpath = "//label[contains(text(),'To Date')]/..//input[@type='date']")
    public WebElement ToDate; //V3.1

    @FindBy(xpath = "//label[contains(text(),'Account No.')]/..//input[@type='text']")
    public WebElement AccountNo;

    @FindBy(xpath = "//strong[normalize-space()='S1032']") //Changes in v3.1 on 27-May-2021
    public WebElement AccountNo_S1032;

    @FindBy(xpath = "//label[contains(text(),'Customer Name')]/..//input[@type='text']")
    public WebElement CustomerName;

    @FindBy(xpath = "//input[@id='Pending_call']")
    public WebElement checkboxPendingCall;

    @FindBy(xpath = "//input[@id='Responded_call']")
    public WebElement checkboxRespondedCall;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement SearchBtn;

    @FindBy(xpath = "//input[@value='Search']/..//input[@value='Clear']")
    public WebElement SearchClearButton;

    /**********************  Table: Request Call Back **************** Added in version 3.1 on 10-June-2021 **********/
    @FindBy(xpath = "//th[@aria-label=': activate to sort column descending']//input[@type='checkbox']")
    public WebElement SelectAll;

    @FindBy(xpath = "//th[@aria-label=': activate to sort column ascending']//input[@type='checkbox']")
    public WebElement DeselectAll;

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement FirstRowTable;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
    public WebElement CheckboxFirstRowTable;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement SearchBar; //Returns

    @FindBy(xpath = "//input[@value=\"Cancel\"]")
    public WebElement cancelButton;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//input[@value='Save']/..//input[@value='Clear']")
    public WebElement ClearButton;

    @FindBy(xpath = "//input[@value='Save']/..//input[@value='Cancel']")
    public WebElement CancelButton;

    public void requestCallBack(String strFromDate,String strToDate){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textCustomer));
            HighlightElement.highlightElement(sidebar_textCustomer);
            sidebar_textCustomer.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(sidebar_textRequestCallBack);
            sidebar_textRequestCallBack.click();
            genericUtil.pause(2000);
            Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "callbackrequest");

            HighlightElement.highlightElement(titleRCB);
            genericUtil.clickWithPause(titleRCB,1000);

            HighlightElement.highlightElement(FromDate);
            genericUtil.writeTextWithPause(FromDate,strFromDate,1000); //V3.1

            HighlightElement.highlightElement(ToDate);
            genericUtil.writeTextWithPause(ToDate,strToDate,1000); //V3.1

            HighlightElement.highlightElement(AccountNo);
            genericUtil.writeTextWithPause(AccountNo,"S1032",1000);

            HighlightElement.highlightElement(AccountNo_S1032);
            genericUtil.clickWithPause(AccountNo_S1032,1000);

            HighlightElement.highlightElement(CustomerName);
            genericUtil.clickWithPause(CustomerName,1000);

            /**********************  Pending: Request Call Back Section **************************/
            HighlightElement.highlightElement(checkboxPendingCall);
            genericUtil.clickWithPause(checkboxPendingCall,1000);

            HighlightElement.highlightElement(SearchBtn);
            genericUtil.clickWithPause(SearchBtn,3000);

            HighlightElement.highlightElement(SearchBar);
            genericUtil.writeTextWithPause(SearchBar,"Returns",3000);

            HighlightElement.highlightElement(SelectAll);
            genericUtil.clickWithPause(SelectAll,1000);

            HighlightElement.highlightElement(DeselectAll);
            genericUtil.clickWithPause(DeselectAll,1000);

            HighlightElement.highlightElement(FirstRowTable);
            genericUtil.clickWithPause(FirstRowTable,1000);

            HighlightElement.highlightElement(CheckboxFirstRowTable);
            genericUtil.clickWithPause(CheckboxFirstRowTable,1000);

            HighlightElement.highlightElement(SaveButton);
            genericUtil.clickWithPause(SaveButton,2000);

            HighlightElement.highlightElement(SearchBar);
            genericUtil.writeTextWithPause(SearchBar,"Returns",3000);

            /**********************  Responded: Request Call Back Section **************************/
            HighlightElement.highlightElement(checkboxRespondedCall);
            genericUtil.clickWithPause(checkboxRespondedCall,1000);

            HighlightElement.highlightElement(SearchBtn);
            genericUtil.clickWithPause(SearchBtn,3000);

            HighlightElement.highlightElement(SearchBar);
            genericUtil.writeTextWithPause(SearchBar,"Returns",3000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
