package pages;

import TestUtil.*;
import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.util.Password;

import javax.management.relation.Role;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;

public class Cx_HelpDesk_page_Master_CustomerUserLocator extends TestBase {

    public Cx_HelpDesk_page_Master_CustomerUserLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;
    public static CheckBox objCheckBox;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement TitleMasters;

    @FindBy(xpath = "//li[@id='master']") //i[@class='fa fa-database']
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "//span[text()=' Customer User Master ']")
    WebElement TitleCustomerUser;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[5]")
    WebElement CustomerUserCollapse; //V 3.0

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[5]")
    WebElement FullScreen; //V 3.0

    @FindBy(xpath ="(//select[@class='fontColor'])[5]")
    WebElement List; //V 3.0

    @FindBy(xpath = "(//input[@class='fontColor'])[5]")
    WebElement Search; //V 3.0

    @FindBy(xpath = "(//div/table[@id='tblCustomer']/tbody/tr[1])[11]")
    WebElement Data; //V 3.0

    /*--------------Edit---------------*/
    @FindBy(xpath = "//h4[contains(text(),'Edit Customer User')]")
    public WebElement EmpCustHeader;

    @FindBy(xpath = "(//i[@title='Edit Customer User'])[1]")
    WebElement EditBtn;

    @FindBy(xpath = "(//i[@title='Delete Customer User'])[1]")
    WebElement DeleteBtn;

    @FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[2]")
    WebElement EditCustomerName;

    @FindBy(xpath = "(//span[@class='c-angle-down ng-star-inserted'])[2]")
    WebElement EditCustomerNameDD;

    @FindBy(xpath = "(//input[@id='login_Id'])")
    WebElement EditUserName;

    @FindBy(xpath = "(//input[@formcontrolname=\"emp_No\"])[2]")
    WebElement EditUserID;

    @FindBy(xpath ="(//input[@type=\"password\"])[1]")
    WebElement EditPassword;

    @FindBy(xpath ="(//input[@type=\"password\"])[2]")
    WebElement EditConfirmPassword;

    @FindBy(xpath = "//input[@formcontrolname='department']")
    WebElement EditDepartment;

    @FindBy(xpath ="//input[@formcontrolname='designation']")
    WebElement EditDesignation;

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer User')]/../..//select[@formcontrolname='user_Type']")
    WebElement EditRole;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[4]")
    WebElement EditStatus;

//    @FindBy(xpath = "//h4[contains(text(),'Edit Customer User')]/../..//div[@class='form-group text-center']/..//input[@type='button' and @value='Save']")
    @FindBy(xpath = "//h4[contains(text(),'Edit Customer User')]/../..//input[@value='Save']")
    WebElement EditSave; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer User')]/../..//input[@value='Clear']")
    WebElement EditClear; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Edit Customer User')]/../..//input[@value='Cancel']")
    WebElement EditCancel; //V 3.0

    @FindBy(xpath = "//a[contains(text(),'Add New Customer User')]")
    WebElement AddNewCustomerUser; // V 3.0

    @FindBy(xpath = "//a[contains(text(),'Import Customer User')]")
    WebElement ImportCustomer; //V 3.0

    /*--------------Add New CustomerUser ---------------*/
    @FindBy(xpath = "(//div[@class='selected-list'])[2]")
    WebElement AddCustomerName;

    @FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[3]")
    WebElement CustomerName;

    //   @FindBy(xpath = "//input[@class=\"c-input ng-pristine ng-valid ng-star-inserted ng-touched\"]")
    //  WebElement SearchCustomerName;

    @FindBy(xpath = "(//input[@id='login_Id'])")
    WebElement AddUserName;

    //  @FindBy(xpath = "//input[@class='form-control ng-pristine ng-invalid ng-touched']")
    @FindBy(xpath = "(//input[@formcontrolname=\"emp_No\"])[2]")
    WebElement AddUserID;

    //    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[1]")
    @FindBy(xpath = "//input[@formcontrolname=\"department\" and @class=\"form-control ng-untouched ng-pristine ng-valid\"]")
    WebElement AddDepartment;

    //    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
    @FindBy(xpath = "//input[@formcontrolname=\"designation\" and @class=\"form-control ng-untouched ng-pristine ng-valid\"]")
    WebElement AddDesignation;

    //Added in v2.0
    @FindBy(xpath ="(//input[@type=\"password\"])[1]")
    WebElement Password;

    //Added in v2.0
    @FindBy(xpath ="(//input[@type=\"password\"])[2]")
    WebElement ConfirmPassword;

    //    @FindBy(xpath ="(//select[@class='form-control ng-dirty ng-valid ng-touched'])[3]")
    @FindBy(xpath ="(//select[@formcontrolname=\"user_Type\" and @class=\"form-control ng-untouched ng-pristine ng-invalid\"])[2]")
    WebElement AddRole;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[4]")
    WebElement CustomerUserStatus;

    //    @FindBy(xpath = "(//input[@class='btn btn-success'])[13]")
    @FindBy(xpath = "//h4[contains(text(),'Add New Customer User')]/../..//input[@value='Save']")
    WebElement AddSave; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Add New Customer User')]/../..//input[@value='Clear']")
    WebElement AddClear; //V 3.0

    @FindBy(xpath = "//h4[contains(text(),'Add New Customer User')]/../..//input[@value='Cancel']")
    WebElement AddCancel; //V 3.0

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[15]")
    WebElement CustomerUserPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[18]")
    WebElement CustomerUserPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[16]")
    WebElement CustomerUserPaginationNo ;

    @FindBy(xpath = "(//input[@class='fontColor'])[5]")
    public WebElement search; //V 3.0

    @FindBy(xpath = "//h3[contains(text(),'Are you sure! You want to delete this Customer User?')]")
    public WebElement DeleteCustomerUserMessage; //V 3.0

    @FindBy(xpath = "(//button[@class='btn btn-lg btn-success'])[16]")
    public WebElement YesOptionDeleteCustomerUserMessage;//V 3.0

    @FindBy(xpath = "//h4[contains(text(),'You have successfully deleted the selected Customer User.')]")
    public WebElement CloseBtnSuccessMsgDelete; //V 3.0

    @FindBy(xpath = "(//button[@class='btn white btn-outline'])[4]")
    public WebElement CloseBtnSuccessDelete; //V 3.0

    /*--------------Import Group ---------------*/

    @FindBy(xpath = "(//a[contains(text(),'Import Customer User')])[1]")
    WebElement CustomerUserImport;

    @FindBy(xpath = "//h4[contains(text(),'Import Customer User')]")
    public WebElement CustomerUserImportPopTitle;

    @FindBy(xpath = "//h4[contains(text(),'Import Customer User')]/../..//ngx-dropzone[@id='importFile']")
    public WebElement CustomerUserImportattchment;

    @FindBy(xpath = "//h4[contains(text(),'Import Customer User')]/../..//input[@value='Import']")
    public WebElement CustomerUserImportPopbtn;

    @FindBy(xpath = "(//h3[contains(text(),'Data Mismatch In Sheet Used For Import Please Check!')])[4]")
    public WebElement CustomerUserImportSuccessMsg;

    @FindBy(xpath = "(//button[contains(text(),'OK')])[10]")
    public WebElement CustomerUserImportSuccessOk;

    @FindBy(xpath = "//h4[contains(text(),'Import Customer User')]/..//button[@class='close']")
    public WebElement CustomerUserImportPopClosebtn;

    /** TESTCASE METHOD: CREATE CUSTOMER USER
     * @param Username
     * @param UserID
     * @param strPassword
     * @param strConfirmPassword
     * @param Department
     * @param Designation
     * @param Role
     */
    public void createCustomerUser(String Username, String UserID,String Department, String Designation ,String Role, String strPassword, String strConfirmPassword,
                                   String searchText){ // V 3.0
        try {
            genericUtil = new GenericUtil();
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleCustomerUser);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerUserCollapse);
            genericUtil.clickWithPause(CustomerUserCollapse,1000);

            jsDown.executeScript("window.scrollBy(0,500)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(AddNewCustomerUser);
            genericUtil.clickWithPause(AddNewCustomerUser,3000);

            HighlightElement.highlightElement(AddCustomerName);
            genericUtil.click(AddCustomerName);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerName); //V 3.0
            genericUtil.click(CustomerName);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(AddUserName); //V 3.0
            genericUtil.writeTextWithPause(AddUserName,Username,2000);

            HighlightElement.highlightElement(AddUserID); //V 3.0
            genericUtil.writeTextWithPause(AddUserID,UserID,2000);

            HighlightElement.highlightElement(AddDepartment); //V 3.0
            genericUtil.writeTextWithPause(AddDepartment,Department,2000);

            HighlightElement.highlightElement(AddDesignation); //V 3.0
            genericUtil.writeTextWithPause(AddDesignation,Designation,2000);

            HighlightElement.highlightElement(AddRole);
            Select role = new Select(AddRole);
            role.selectByVisibleText(Role); //"Admin"
            genericUtil.pause(1000);

            HighlightElement.highlightElement(Password); //V 3.0
            genericUtil.writeTextWithPause(Password,strPassword,2000);

            HighlightElement.highlightElement(ConfirmPassword); //V 3.0
            genericUtil.writeTextWithPause(ConfirmPassword,strConfirmPassword,2000);

            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(CustomerUserStatus);
                objCheckBox.Select_The_Checkbox(CustomerUserStatus);
                genericUtil.pause(1200);
                HighlightElement.highlightElement(CustomerUserStatus);
                objCheckBox.DeSelect_The_Checkbox(CustomerUserStatus);
                genericUtil.pause(1200);
                HighlightElement.highlightElement(CustomerUserStatus);
                objCheckBox.Select_The_Checkbox(CustomerUserStatus);
                genericUtil.pause(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(AddSave);
            genericUtil.clickWithPause(AddSave,3000); //V 3.0

            HighlightElement.highlightElement(search);
            genericUtil.writeTextWithPause(search,searchText,3000);
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: EDIT or MODIFY EMPLOYEE
     *     @param UpdatedUsername
     *     @param UpdatedUserID
     *     @param UpdatedstrPassword
     *     @param UpdatedstrConfirmPassword
     *     @param UpdatedDepartment
     *     @param UpdatedDesignation
     *     @param UpdatedRole
     *     @param UpdatedRole
     */
    public void editCustomerUser(String UpdatedUsername, String UpdatedUserID,String UpdatedDepartment, String UpdatedDesignation ,String UpdatedRole, String UpdatedstrPassword, String UpdatedstrConfirmPassword,
                                 String UpdatedsearchText){ // V 3.0

        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(1000);
            wait.until(ExpectedConditions.visibilityOf(EditBtn));
            HighlightElement.highlightElement(EditBtn);
            EditBtn.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(EditBtn);
            genericUtil.clickWithPause(EditBtn,3000);

            wait.until(ExpectedConditions.visibilityOf(EmpCustHeader));
            HighlightElement.highlightElement(EmpCustHeader);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(EditUserName); //V 3.0
            genericUtil.writeTextWithPause(EditUserName,UpdatedUsername,2000);

            HighlightElement.highlightElement(EditUserID); //V 3.0
            genericUtil.writeTextWithPause(EditUserID,UpdatedUserID,2000);

            HighlightElement.highlightElement(EditDepartment); //V 3.0
            genericUtil.writeTextWithPause(EditDepartment,UpdatedDepartment,2000);

            HighlightElement.highlightElement(EditDesignation); //V 3.0
            genericUtil.writeTextWithPause(EditDesignation,UpdatedDesignation,2000);

            HighlightElement.highlightElement(EditRole);
            Select role = new Select(EditRole);
            role.selectByVisibleText(UpdatedRole); //"User"
            genericUtil.pause(1000); //V 3.0

            HighlightElement.highlightElement(EditPassword); //V 3.0
            genericUtil.writeTextWithPause(EditPassword,UpdatedstrPassword,2000);

            HighlightElement.highlightElement(EditConfirmPassword); //V 3.0
            genericUtil.writeTextWithPause(EditConfirmPassword,UpdatedstrConfirmPassword,2000);

//            try {
//                objCheckBox = new CheckBox();
//                HighlightElement.highlightElement(EditStatus);
//                objCheckBox.Select_The_Checkbox(EditStatus);
//                genericUtil.pause(1200);
//                HighlightElement.highlightElement(EditStatus);
//                objCheckBox.DeSelect_The_Checkbox(EditStatus);
//                genericUtil.pause(1200);
//                HighlightElement.highlightElement(EditStatus);
//                objCheckBox.Select_The_Checkbox(EditStatus);
//                genericUtil.pause(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            HighlightElement.highlightElement(EditSave);
            genericUtil.clickWithPause(EditSave,3000); //V 3.0

            HighlightElement.highlightElement(search);
            genericUtil.writeTextWithPause(search,UpdatedsearchText,1000);
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * @param searchText
     */
    public void deleteCustomerUser(String searchText){
        try {
            genericUtil = new GenericUtil();
            HighlightElement.highlightElement(DeleteBtn);
            genericUtil.clickWithPause(DeleteBtn, 3000);

            HighlightElement.highlightElement(DeleteCustomerUserMessage);

            HighlightElement.highlightElement(YesOptionDeleteCustomerUserMessage);
            genericUtil.clickWithPause(YesOptionDeleteCustomerUserMessage, 3000);
            HighlightElement.highlightElement(CloseBtnSuccessMsgDelete);
            genericUtil.clickWithPause(CloseBtnSuccessMsgDelete,3000);

            HighlightElement.highlightElement(CloseBtnSuccessDelete);
            genericUtil.clickWithPause(CloseBtnSuccessDelete,3000);

            HighlightElement.highlightElement(Search);
            Search.clear();
            genericUtil.writeTextWithPause(Search, searchText, 3000); //"Group Test"
        }catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE: importCustomerUser
     */
    public void importCustomerUser() {
        try {
            genericUtil = new GenericUtil();
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerUserCollapse);
            genericUtil.clickWithPause(CustomerUserCollapse,1000);

//            HighlightElement.highlightElement(TitleCustomerUser);
//            genericUtil.pause(1000);

            Thread.sleep(1000);
            jsDown.executeScript("window.scrollBy(0,800)");
            Thread.sleep(1000);

            HighlightElement.highlightElement(CustomerUserImport);
            genericUtil.clickWithPause(CustomerUserImport,2000);

            HighlightElement.highlightElement(CustomerUserImportPopTitle);
            genericUtil.clickWithPause(CustomerUserImportPopTitle,2000);

            HighlightElement.highlightElement(CustomerUserImportattchment);
            genericUtil.clickWithPause(CustomerUserImportattchment,2000);
            wait.until(ExpectedConditions.visibilityOf(CustomerUserImportattchment));

            StringSelection stringSelection = new StringSelection(Constants.IMPORT_CUSTUSER_PATH);
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

            wait.until(ExpectedConditions.visibilityOf(CustomerUserImportPopbtn));
            HighlightElement.highlightElement(CustomerUserImportPopbtn);
            genericUtil.clickWithPause(CustomerUserImportPopbtn,1000);

            HighlightElement.highlightElement(CustomerUserImportSuccessMsg);
            genericUtil.clickWithPause(CustomerUserImportSuccessMsg,1000);

            HighlightElement.highlightElement(CustomerUserImportSuccessOk);
            genericUtil.clickWithPause(CustomerUserImportSuccessOk,1000);

            HighlightElement.highlightElement(CustomerUserImportPopTitle);
            genericUtil.clickWithPause(CustomerUserImportPopTitle,2000);

            HighlightElement.highlightElement(CustomerUserImportPopClosebtn);
            genericUtil.clickWithPause(CustomerUserImportPopClosebtn,1000);

        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
