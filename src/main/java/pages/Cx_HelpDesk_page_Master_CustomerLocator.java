package pages;

import TestUtil.CheckBox;
import TestUtil.Constants;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Cx_HelpDesk_page_Master_CustomerLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;
    public static CheckBox objCheckBox;

    public Cx_HelpDesk_page_Master_CustomerLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement TitleMasters;

    @FindBy(xpath = "//li[@id='master']") //i[@class='fa fa-database']
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "//span[text()=' Customer Master ']")
    WebElement TitleCustomerMaster;

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]")
    WebElement EditTitleCustomerMaster;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[4]")
    WebElement CustomerCollapse; //V 3.0

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[4]")
    WebElement FullScreen;//V 3.0

    @FindBy(xpath ="(//select[@class='fontColor'])[4]")
    WebElement List;//V 3.0

    @FindBy(xpath = "(//input[@class='fontColor'])[4]")
    WebElement Search;//V 3.0

    @FindBy(xpath = "(//div/table[@id='tblCustomer']/tbody/tr[1])[1]")
    WebElement Data; //V 3.0

    @FindBy(xpath = "(//i[@title='Delete Customer'])[1]")
    WebElement DeleteBtn;

    @FindBy(xpath = "(//i[@title='Edit Customer'])[1]")
    WebElement EditBtn;

    /*--------------Edit---------------*/
    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]/../..//input[@id='name']")
    WebElement EditCustomerName;//V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]/../..//input[@formcontrolname='address']")
    WebElement EditCustomerAddress;//V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]/../..//input[@formcontrolname='county']")
    WebElement EditCustomerCountry;//V 3.0

    @FindBy(xpath ="//h4[contains(text(),'Edit Customer')]/../..//input[@formcontrolname='account_No']")
    WebElement EditCustomerAccNo;//V 3.0

    @FindBy(xpath ="//h4[contains(text(),'Edit Customer')]/../..//input[@formcontrolname='city']")
    WebElement EditCustomerCity;//V 3.0

    @FindBy(xpath ="//h4[contains(text(),'Edit Customer')]/../..//input[@formcontrolname='postCode']")
    WebElement EditCustomerPostcode;//V 3.0

    @FindBy(xpath ="//input[@formcontrolname=\"contact_Name\"]")
    WebElement EditCustomerContactName;

    @FindBy(xpath ="//input[@formcontrolname=\"contact_No\"]")
    WebElement EditCustomerContactNo;

    @FindBy(xpath ="//input[@formcontrolname=\"fax\"]")
    WebElement EditCustomerFaxNumber;

    @FindBy(xpath = "(//input[@formcontrolname=\"email\"])[2]")
    WebElement EditCustomerEmail;

    @FindBy(xpath = "(//select[@id='siteId'])[1]")
    public WebElement EditSiteId; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]/../..//input[@value='Save']")
    WebElement EditSubmit; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]/../..//input[@value='Clear']")
    WebElement EditClear; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer')]/../..//input[@value='Cancel']")
    WebElement EditCancel;//V 3.0

    @FindBy(xpath = "(//a[contains(text(),'Add New Customer')])[1]")
    WebElement AddCustomer;

    @FindBy(xpath = "(//a[contains(text(),'Import Customer')])[1]")
    WebElement ImportCustomer;

    /*--------------Add New Customer ---------------*/
    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]")
    WebElement AddCustomerTitle;

    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@id='name']")
    WebElement AddCustomerName; //V 3.0

    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@formcontrolname='address']")
    WebElement AddCustomerAddress; // V 3.0

    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@formcontrolname='county']")
    WebElement AddCustomerCounty; // V 3.0

    @FindBy(xpath ="//input[@formcontrolname=\"account_No\"]")
    WebElement AddCustomerAccNo;

    @FindBy(xpath ="(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@formcontrolname='city']")
    WebElement AddCustomerCity;//V 3.0

    @FindBy(xpath ="(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@formcontrolname='postCode']")
    WebElement AddCustomerPostcode;//V 3.0

    @FindBy(xpath ="//input[@formcontrolname=\"contact_Name\"]")
    WebElement AddCustomerContactName;

    @FindBy(xpath ="//input[@formcontrolname=\"contact_No\"]")
    WebElement AddCustomerContactNo;

    @FindBy(xpath ="//input[@formcontrolname=\"fax\"]")
    WebElement AddCustomerFaxNumber;

    @FindBy(xpath = "(//input[@formcontrolname=\"email\"])[2]")
    WebElement AddCustomerEmail;

    @FindBy(xpath = "(//select[@id='siteId'])[1]")
    public WebElement AddSiteId;//V 3.0

    @FindBy(xpath ="(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[3]")
    public WebElement AddCustomerStatus;

    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@value='Save']")
    WebElement AddSubmit;

    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@value='Clear']")
    WebElement AddClear; //V 3.0

    @FindBy(xpath = "(//h4[contains(text(),'Add New Customer')])[1]/../..//input[@value='Cancel']")
    WebElement AddCancel;//V 3.0

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
    WebElement EmpCustomerPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[8]")
    WebElement EmpCustomerPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[5]")
    WebElement EmpCustomerPaginationNo ;

    @FindBy(xpath = "//h3[contains(text(),'Are you sure! You want to Delete this Customer?')]")
    public WebElement DeleteCustomerMessage;

    @FindBy(xpath = "//h3[contains(text(),'Are you sure! You want to Delete this Customer?')]/../..//button[@class='btn btn-lg btn-success']")
    public WebElement YesOptionDeleteCustomerMessage;

    @FindBy(xpath = "//h4[contains(text(),'You have successfully deleted the selected Customer')]")
    public WebElement DeleteSuccessMsg;

    @FindBy(xpath = "(//button[@class='btn white btn-outline'])[3]")
    public WebElement CloseBtnPopUp;

    /*--------------Import Group ---------------*/

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[6]")
    WebElement CustomerImport;

    @FindBy(xpath = "//h4[contains(text(),'Import Customers')]")
    public WebElement CustomerImportPopTitle;

    @FindBy(xpath = "(//ngx-dropzone[@id='CustomerImportFile'])")
    public WebElement CustomerImportattchment;

    @FindBy(xpath = "//h4[contains(text(),'Import Customers')]/../..//input[@value='Import']")
    public WebElement CustomerImportPopbtn;

    @FindBy(xpath = "(//h3[contains(text(),'Data Mismatch In Sheet Used For Import Please Check!')])[3]")
    public WebElement CustomerImportSuccessMsg;

    @FindBy(xpath = "(//button[contains(text(),'OK')])[8]")
    public WebElement CustomerImportSuccessOk;

    @FindBy(xpath = "//h4[contains(text(),'Import Customers')]/..//button[@class='close']")
    public WebElement CustomerImportPopClosebtn;

    /**
     * TESTCASE: Add Customer
     * @param CustomerName
     * @param CustomerAddress
     * @param County
     * @param CustomerAccountNumber
     * @param City
     * @param PostCode
     * @param ContactPersonName
     * @param ContactPersonNumber
     * @param FaxNumber
     * @param Email
     * @param SiteId    //V 3.0
     */
    public void addCustomer(String CustomerName,String CustomerAddress,String County,String CustomerAccountNumber,String City,
                            String PostCode,String ContactPersonName, String ContactPersonNumber,String FaxNumber,String Email,String SiteId) { //V 3.0
        try {
            genericUtil = new GenericUtil();
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;
            genericUtil.pause(2000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(3000);

//            HighlightElement.highlightElement(TitleMasters);
//            genericUtil.pause(1000);
//
//            HighlightElement.highlightElement(TitleCustomerMaster);
//            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerCollapse);
            CustomerCollapse.click();
            genericUtil.pause(1000);

            jsDown.executeScript("window.scrollBy(0,500)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(AddCustomer);
            genericUtil.clickWithPause(AddCustomer,2000);

            HighlightElement.highlightElement(AddCustomerTitle);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(AddCustomerName);
            genericUtil.writeTextWithPause(AddCustomerName,CustomerName,1000);

            HighlightElement.highlightElement(AddCustomerAddress);
            genericUtil.writeTextWithPause(AddCustomerAddress,CustomerAddress,1000);

            HighlightElement.highlightElement(AddCustomerCounty);
            genericUtil.writeTextWithPause(AddCustomerCounty,County,1000);

            HighlightElement.highlightElement(AddCustomerAccNo);
            genericUtil.writeTextWithPause(AddCustomerAccNo,CustomerAccountNumber,1000);

            HighlightElement.highlightElement(AddCustomerCity);
            genericUtil.writeTextWithPause(AddCustomerCity,City,1000);

            HighlightElement.highlightElement(AddCustomerPostcode);
            genericUtil.writeTextWithPause(AddCustomerPostcode,PostCode,1000);

            HighlightElement.highlightElement(AddCustomerContactName);
            genericUtil.writeTextWithPause(AddCustomerContactName,ContactPersonName,1000);

            HighlightElement.highlightElement(AddCustomerContactNo);
            genericUtil.writeTextWithPause(AddCustomerContactNo,ContactPersonNumber,1000);

            HighlightElement.highlightElement(AddCustomerFaxNumber);
            genericUtil.writeTextWithPause(AddCustomerFaxNumber,FaxNumber,1000);

            HighlightElement.highlightElement(AddCustomerEmail);
            genericUtil.writeTextWithPause(AddCustomerEmail,Email,1000);

            HighlightElement.highlightElement(AddSiteId);
            Select site = new Select(AddSiteId);
            site.selectByVisibleText(SiteId); //"Site ID"
            genericUtil.pause(1000);  //V 3.0

            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(AddCustomerStatus);
                objCheckBox.Select_The_Checkbox(AddCustomerStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(AddCustomerStatus);
                objCheckBox.DeSelect_The_Checkbox(AddCustomerStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(AddCustomerStatus);
                objCheckBox.Select_The_Checkbox(AddCustomerStatus);
                genericUtil.pause(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(AddSubmit);
            genericUtil.clickWithPause(AddSubmit,3000);

            HighlightElement.highlightElement(Search);
            genericUtil.writeTextWithPause(Search,CustomerName,3000);
        }catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE METHOD-2 : EDIT OR MODIFY CUSTOMER
     * @param UpdatedCustomerName
     * @param UpdatedCustomerAddress
     * @param UpdatedCounty
     * @param UpdatedCustomerAccountNumber
     * @param UpdatedCity
     * @param UpdatedPostCode
     * @param UpdatedContactPersonName
     * @param UpdatedContactPersonNumber
     * @param UpdatedFaxNumber
     * @param UpdatedEmail
     * @param UpdateSiteId //V 3.0
     */
    public void editCustomer(String UpdatedCustomerName,String UpdatedCustomerAddress,String UpdatedCounty,String UpdatedCustomerAccountNumber,String UpdatedCity,
                             String UpdatedPostCode,String UpdatedContactPersonName, String UpdatedContactPersonNumber,String UpdatedFaxNumber,String UpdatedEmail,String UpdateSiteId){ //V 3.0
        try {
            genericUtil = new GenericUtil();
//
//            HighlightElement.highlightElement(TitleMasters);
//            genericUtil.pause(1000);
//
//            HighlightElement.highlightElement(TitleCustomerMaster);
//            genericUtil.pause(1000);

            HighlightElement.highlightElement(EditBtn);
            genericUtil.clickWithPause(EditBtn, 1000);

            HighlightElement.highlightElement(EditTitleCustomerMaster);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(EditCustomerName);
            genericUtil.writeTextWithPause(EditCustomerName, UpdatedCustomerName, 1000);

            HighlightElement.highlightElement(EditCustomerAddress);
            genericUtil.writeTextWithPause(EditCustomerAddress, UpdatedCustomerAddress, 1000);

            HighlightElement.highlightElement(EditCustomerCountry);
            genericUtil.writeTextWithPause(EditCustomerCountry, UpdatedCounty, 1000);

            HighlightElement.highlightElement(EditCustomerAccNo);
            genericUtil.writeTextWithPause(EditCustomerAccNo, UpdatedCustomerAccountNumber, 1000);

            HighlightElement.highlightElement(EditCustomerCity);
            genericUtil.writeTextWithPause(EditCustomerCity, UpdatedCity, 1000);

            HighlightElement.highlightElement(EditCustomerPostcode);
            genericUtil.writeTextWithPause(EditCustomerPostcode, UpdatedPostCode, 1000);

            HighlightElement.highlightElement(EditCustomerContactName);
            genericUtil.writeTextWithPause(EditCustomerContactName, UpdatedContactPersonName, 1000);

            HighlightElement.highlightElement(EditCustomerContactNo);
            genericUtil.writeTextWithPause(EditCustomerContactNo, UpdatedContactPersonNumber, 1000);

            HighlightElement.highlightElement(EditCustomerFaxNumber);
            genericUtil.writeTextWithPause(EditCustomerFaxNumber, UpdatedFaxNumber, 1000);

            HighlightElement.highlightElement(EditCustomerEmail);
            genericUtil.writeTextWithPause(EditCustomerEmail, UpdatedEmail, 1000);

            HighlightElement.highlightElement(EditSiteId);
            Select site = new Select(EditSiteId);
            site.selectByVisibleText(UpdateSiteId); //"Site ID"
            genericUtil.pause(1000); //V 3.0

            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(AddCustomerStatus);
                objCheckBox.Select_The_Checkbox(AddCustomerStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(AddCustomerStatus);
                objCheckBox.DeSelect_The_Checkbox(AddCustomerStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(AddCustomerStatus);
                objCheckBox.Select_The_Checkbox(AddCustomerStatus);
                genericUtil.pause(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(EditSubmit);
            genericUtil.clickWithPause(EditSubmit, 3000);

            HighlightElement.highlightElement(Search);
            genericUtil.writeTextWithPause(Search, UpdatedCustomerName, 3000);
        }catch(Exception ex){
            ex.getStackTrace();
        }
    }

    public void deleteCustomer(String searchText){
        try {
            genericUtil = new GenericUtil();
            HighlightElement.highlightElement(DeleteBtn);
            genericUtil.clickWithPause(DeleteBtn, 2000);

            wait.until(ExpectedConditions.visibilityOf(DeleteCustomerMessage));
            HighlightElement.highlightElement(DeleteCustomerMessage);

            HighlightElement.highlightElement(YesOptionDeleteCustomerMessage);
            genericUtil.clickWithPause(YesOptionDeleteCustomerMessage, 2000);

            wait.until(ExpectedConditions.visibilityOf(DeleteSuccessMsg));
            HighlightElement.highlightElement(DeleteSuccessMsg);
            genericUtil.clickWithPause(DeleteSuccessMsg,2000);

            HighlightElement.highlightElement(CloseBtnPopUp);
            genericUtil.clickWithPause(CloseBtnPopUp,3000);

            HighlightElement.highlightElement(Search);
            Search.clear();
            genericUtil.writeTextWithPause(Search, searchText, 3000); //"Group Test"
        }catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE: importCustomer
     */
    public void importCustomer() {
        try {
            genericUtil = new GenericUtil();
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerCollapse);
            genericUtil.clickWithPause(CustomerCollapse,1000);

//            HighlightElement.highlightElement(TitleCustomerMaster);
//            genericUtil.pause(1000);

            jsDown.executeScript("window.scrollBy(0,500)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerImport);
            genericUtil.clickWithPause(CustomerImport,2000);

            HighlightElement.highlightElement(CustomerImportPopTitle);
            genericUtil.clickWithPause(CustomerImportPopTitle,2000);

            HighlightElement.highlightElement(CustomerImportattchment);
            genericUtil.clickWithPause(CustomerImportattchment,2000);
            wait.until(ExpectedConditions.visibilityOf(CustomerImportattchment));

            StringSelection stringSelection = new StringSelection(Constants.IMPORT_CUST_PATH);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);

            /*-----BEGIN-------------File Upload Logic---------------------*/
            // Create object of Robot class
            Robot robot = new Robot();

            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Press CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            // Release CTRL+V
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            /*----END--------------File Upload Logic---------------------*/

            wait.until(ExpectedConditions.visibilityOf(CustomerImportPopbtn));
            HighlightElement.highlightElement(CustomerImportPopbtn);
            genericUtil.clickWithPause(CustomerImportPopbtn,1000);

            HighlightElement.highlightElement(CustomerImportSuccessMsg);
            genericUtil.clickWithPause(CustomerImportSuccessMsg,1000);

            HighlightElement.highlightElement(CustomerImportSuccessOk);
            genericUtil.clickWithPause(CustomerImportSuccessOk,1000);

            HighlightElement.highlightElement(CustomerImportPopTitle);
            genericUtil.clickWithPause(CustomerImportPopTitle,2000);

            HighlightElement.highlightElement(CustomerImportPopClosebtn);
            genericUtil.clickWithPause(CustomerImportPopClosebtn,1000);

        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }

}
