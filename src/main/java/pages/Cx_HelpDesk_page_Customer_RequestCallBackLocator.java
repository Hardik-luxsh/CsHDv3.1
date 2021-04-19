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

    @FindBy(xpath = "//li[@id='requestcallback']")
    public WebElement sidebar_textRequestCallBack;

    /**********************  Request Call Back **************************/

    @FindBy(xpath = "//h1[contains(text(),'Request Call Back')]")
    public WebElement titleRCB;

    @FindBy(xpath = "//span[contains(text(),' About You ')]")
    public WebElement titleAboutYou;

    @FindBy(xpath = "//span[contains(text(),' About Your Query ')]")
    public WebElement titleAboutYourQuery;

    @FindBy(xpath = "//span[contains(text(),'Submit Message')]")
    public WebElement titleSubmitMessage;

    /**********************  About you: Request Call Back **************************/

    @FindBy(xpath = "//input[@formcontrolname='account_No']")
    public WebElement accountNo;

    @FindBy(xpath = "//input[@formcontrolname='contact_Name']")
    public WebElement contactName;

    @FindBy(xpath = "//input[@formcontrolname='contact_No']")
    public WebElement contactNo;

    /**********************  About Your Query: Request Call Back **************************/
    @FindBy(xpath = "//span[contains(text(),'--- Select ---')]")
    public WebElement invoiceNumberDropDown;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    public WebElement invoiceSearch;

    @FindBy(xpath = "//span[contains(text(),'Select all filtered results')]")
    public WebElement selectAllFilteredResultsButton;

    @FindBy(xpath = "//input[@value=\"See Invoice\"]")
    public WebElement seeInvoiceButton;

    @FindBy(xpath = "//div[@id=\"full_invoice\"]//..//input[@value='Close']")
    public WebElement seeInvoicePopupCloseButton;

    @FindBy(xpath = "//div[@id=\"full_invoice\"]//h4[contains(text(),'Invoice')]")
    public WebElement seeInvoicePopupTitle;

    @FindBy(xpath = "//select[@id='Ticket_Type_Id']")
    public WebElement selectQuery;

    @FindBy(xpath = "//input[@id='no_invoice']//..//span")
    public WebElement checkIDoNotHaveInvoice;

    @FindBy(xpath = "(//input[@class='group-checkable'])[3]/..//span")
    public WebElement checkOther;

    /**********************  Submit Message: Request Call Back **************************/

    @FindBy(xpath = "//input[@id=\"Description\"]")
    public WebElement description;

    @FindBy(xpath = "//textarea[@id='Notes']")
    public WebElement notes;

    @FindBy(xpath = "//input[@value=\"Submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@value=\"Cancel\"]")
    public WebElement cancelButton;

    @FindBy(xpath = "//h4[contains(text(),'Request Callback Confirmation!')]")
    public WebElement titleConfirmMessage;

    @FindBy(xpath = "//h3[contains(text(),'Are You Sure To Generate Call Back Request?')]")
    public WebElement ConfirmMessage;

    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement confirmYesButton;

    @FindBy(xpath = "//input[@value='No']")
    public WebElement confirmNoButton;

    @FindBy(xpath = "//h4[contains(text(),'Success!')]")
    public WebElement titleSuccess;

    @FindBy(xpath = "//p[contains(text(),' Request for Callback Generated Successfully! ')]")
    public WebElement SuccessMessage;

    @FindBy(xpath = "//input[@value='OK']")
    public WebElement SuccessOkButton;

    public void requestCallBack(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textCustomer));
            HighlightElement.highlightElement(sidebar_textCustomer);
            sidebar_textCustomer.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(sidebar_textRequestCallBack);
            sidebar_textRequestCallBack.click();
            genericUtil.pause(2000);
            Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "requestcallback");

            HighlightElement.highlightElement(titleRCB);
            genericUtil.clickWithPause(titleRCB,1000);

            HighlightElement.highlightElement(titleAboutYou);
            genericUtil.clickWithPause(titleAboutYou,1000);

            HighlightElement.highlightElement(accountNo);
            genericUtil.clickWithPause(accountNo,1000);

            HighlightElement.highlightElement(contactName);
            genericUtil.clickWithPause(contactName,1000);

            HighlightElement.highlightElement(contactNo);
            genericUtil.clickWithPause(contactNo,1000);

            /**********************  About Your Query: Request Call Back **************************/
            HighlightElement.highlightElement(titleAboutYourQuery);
            genericUtil.clickWithPause(titleAboutYourQuery,1000);

            HighlightElement.highlightElement(invoiceNumberDropDown);
            genericUtil.clickWithPause(invoiceNumberDropDown,1000);

            HighlightElement.highlightElement(invoiceSearch);
            genericUtil.writeTextWithPause(invoiceSearch,"983586538",1000);

            HighlightElement.highlightElement(selectAllFilteredResultsButton);
            genericUtil.clickWithPause(selectAllFilteredResultsButton,1000);

            HighlightElement.highlightElement(selectQuery);
            genericUtil.selectElementWithPause(selectQuery,"Returns",1000);

            HighlightElement.highlightElement(checkOther);
            genericUtil.clickWithPause(checkOther,1000);

            HighlightElement.highlightElement(seeInvoiceButton);
            genericUtil.clickWithPause(seeInvoiceButton,1000);
            wait.until(ExpectedConditions.visibilityOf(seeInvoicePopupTitle));

            HighlightElement.highlightElement(seeInvoicePopupTitle);
            genericUtil.clickWithPause(seeInvoicePopupTitle,2000);

            HighlightElement.highlightElement(seeInvoicePopupCloseButton);
            genericUtil.clickWithPause(seeInvoicePopupCloseButton,2000);

            /**********************  Submit Message: Request Call Back **************************/

            HighlightElement.highlightElement(titleSubmitMessage);
            genericUtil.clickWithPause(titleSubmitMessage,1000);

            HighlightElement.highlightElement(description);
            genericUtil.writeTextWithPause(description,"Test Description",1000);

            HighlightElement.highlightElement(notes);
            genericUtil.writeTextWithPause(notes,"Test Notes",1000);

            HighlightElement.highlightElement(submitButton);
            genericUtil.clickWithPause(submitButton,2000);

            HighlightElement.highlightElement(titleConfirmMessage);
            genericUtil.clickWithPause(titleConfirmMessage,1000);

            HighlightElement.highlightElement(ConfirmMessage);
            genericUtil.clickWithPause(ConfirmMessage,1000);

            HighlightElement.highlightElement(confirmYesButton);
            genericUtil.clickWithPause(confirmYesButton,1000);

            HighlightElement.highlightElement(titleSuccess);
            genericUtil.clickWithPause(titleSuccess,1000);

            HighlightElement.highlightElement(SuccessMessage);
            genericUtil.clickWithPause(SuccessMessage,1000);

            HighlightElement.highlightElement(SuccessOkButton);
            genericUtil.clickWithPause(SuccessOkButton,1000);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
