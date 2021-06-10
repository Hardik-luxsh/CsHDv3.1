package pages;

import TestUtil.*;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

public class Cx_HelpDesk_page_Customer_SearchMyInvoiceLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_Customer_SearchMyInvoiceLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),'Customer') and @class='title']")
    public WebElement sidebar_textCustomer;

    @FindBy(xpath = "//span[contains(text(),'Search My Invoice')]")
    public WebElement sidebar_textSearchMyInvoice;

    @FindBy(xpath = "//h1[normalize-space()='Search My Invoice']")
    public WebElement titleSMI;

    @FindBy(xpath = "//label[contains(text(),'Account Number')]/..//input[@type='text']") //input[@formcontrolname="AccountNumber"]
    public WebElement AccountNo;

    @FindBy(xpath = "//strong[normalize-space()='S1032']") //Changes in v3.1 on 27-May-2021
    public WebElement AccountNo_S1032;

    @FindBy(xpath = "//label[contains(text(),'Customer Name')]/..//input[@type='text']")
    public WebElement CustomerName;

    @FindBy(xpath = "//input[@placeholder='Enter Invoice Number']")
    public WebElement InvoiceNumber;

    @FindBy(xpath = "//input[@placeholder='Enter Product Name']")
    public WebElement ProductName;

    @FindBy(xpath = "//label[contains(text(),'Start Date')]/..//input[@type='date']")
//    @FindBy(xpath = "//input[@formcontrolname=\"Start\" and @style='color: black; width: 100%;']")
    public WebElement FromDate; //V3.1

    @FindBy(xpath = "//label[contains(text(),'End Date')]/..//input[@type='date']")
    public WebElement ToDate; //V3.1

    @FindBy(xpath = "//select[@formcontrolname=\"siteId\"]")
    public WebElement Site;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement SearchBtn;

    @FindBy(xpath = "//input[@value='Search']/..//input[@value='Clear']")
    public WebElement SearchClearButton;

    @FindBy(xpath = "//span[normalize-space()='Invoice List']")
    public WebElement titleInvoiceList;

    public void searchMyInvoice(String strFromDate,String strToDate){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textCustomer));
            HighlightElement.highlightElement(sidebar_textCustomer);
            sidebar_textCustomer.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(sidebar_textSearchMyInvoice);
            sidebar_textSearchMyInvoice.click();
            genericUtil.pause(2000);
            Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "searchmyinvoice");

            HighlightElement.highlightElement(titleSMI);
            genericUtil.clickWithPause(titleSMI,1000);

            HighlightElement.highlightElement(AccountNo);
            genericUtil.writeTextWithPause(AccountNo,"S1032",1000);

            HighlightElement.highlightElement(AccountNo_S1032);
            genericUtil.clickWithPause(AccountNo_S1032,1000);

            HighlightElement.highlightElement(CustomerName);
            genericUtil.clickWithPause(CustomerName,1000);

            HighlightElement.highlightElement(InvoiceNumber);
            genericUtil.writeTextWithPause(InvoiceNumber,"980100123",1000);

            HighlightElement.highlightElement(ProductName);
            genericUtil.writeTextWithPause(ProductName,"Calcium Carb 250mg Disp Tabs 60s",1000);

            HighlightElement.highlightElement(FromDate);
            genericUtil.writeTextWithPause(FromDate,strFromDate,1000); //V3.1

            HighlightElement.highlightElement(ToDate);
            genericUtil.writeTextWithPause(ToDate,strToDate,1000); //V3.1

            HighlightElement.highlightElement(SearchBtn);
            genericUtil.clickWithPause(SearchBtn,3000);
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

}
