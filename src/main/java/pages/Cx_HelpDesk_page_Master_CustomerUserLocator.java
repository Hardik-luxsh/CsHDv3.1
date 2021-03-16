package pages;

import TestUtil.CheckBox;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
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

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[4]")
    WebElement CustomerUserCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[4]")
    WebElement FullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[4]")
    WebElement List;

    @FindBy(xpath = "(//input[@class='fontColor'])[4]")
    WebElement Search;

    @FindBy(xpath = "(//div/table/tbody/tr[1])[31]")
    WebElement Data;

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

    @FindBy(xpath = "(//select[@formcontrolname=\"user_Type\" and @class=\"form-control ng-pristine ng-valid ng-touched\"])")
    WebElement EditRole;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[4]")
    WebElement EditStatus;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[15]")
    WebElement EditSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[16]")
    WebElement EditClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[17]")
    WebElement EditCancel;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[7]")
    WebElement AddNewCustomerUser;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[8]")
    WebElement ImportCustomer;

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
    @FindBy(xpath = "//input[@class='btn btn-success' and @type='button' and @tabindex ='109']")
    WebElement AddSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[14]")
    WebElement AddClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[15]")
    WebElement AddCancel;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[15]")
    WebElement CustomerUserPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[18]")
    WebElement CustomerUserPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[16]")
    WebElement CustomerUserPaginationNo ;

    @FindBy(xpath = "(//input[@class='fontColor'])[4]")
    public WebElement search;

    /** TESTCASE METHOD: CREATE CUSTOMER USER
     * @param Username
     * @param UserID
     * @param strPassword
     * @param strConfirmPassword
     * @param Department
     * @param Designation
     * @param Role
     */
    public void createCustomerUser(String Username, String UserID, String strPassword, String strConfirmPassword,
                                   String Department, String Designation ,String Role, String searchText){
        try {
            genericUtil = new GenericUtil();

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleCustomerUser);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerUserCollapse);
            genericUtil.clickWithPause(CustomerUserCollapse,1000);

            HighlightElement.highlightElement(AddNewCustomerUser);
            genericUtil.clickWithPause(AddNewCustomerUser,3000);

            HighlightElement.highlightElement(AddCustomerName);
            genericUtil.click(AddCustomerName);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CustomerName);
            genericUtil.click(CustomerName);

            genericUtil.pause(1000);

            genericUtil.writeTextWithPause(AddUserName,Username,2000);

            genericUtil.writeTextWithPause(AddUserID,UserID,2000);

            genericUtil.writeTextWithPause(Password,strPassword,2000);
            genericUtil.writeTextWithPause(ConfirmPassword,strConfirmPassword,2000);
            genericUtil.writeTextWithPause(AddDepartment,Department,2000);
            genericUtil.writeTextWithPause(AddDesignation,Designation,2000);

            HighlightElement.highlightElement(AddRole);
            Select role = new Select(AddRole);
            role.selectByVisibleText(Role); //"Admin"
            genericUtil.pause(1000);

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

            HighlightElement.highlightElement(AddSubmit);
            genericUtil.clickWithPause(AddSubmit,3000);

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
     *
     */
    public void editCustomerUser(String UpdatedUsername, String UpdatedUserID, String UpdatedstrPassword, String UpdatedstrConfirmPassword,
                             String UpdatedDepartment, String UpdatedDesignation ,String UpdatedRole, String UpdatedsearchText){

        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(1000);
//            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
//            HighlightElement.highlightElement(sidebar_textMaster);
//            sidebar_textMaster.click();
//            genericUtil.pause(2000);
//
//            HighlightElement.highlightElement(TitleCustomerUser);
//            genericUtil.pause(1000);
//
//            HighlightElement.highlightElement(CustomerUserCollapse);
//            genericUtil.clickWithPause(CustomerUserCollapse,1000);



            HighlightElement.highlightElement(EditBtn);
            genericUtil.clickWithPause(EditBtn,3000);

            HighlightElement.highlightElement(EmpCustHeader);
            genericUtil.pause(1000);
//            genericUtil.clickWithPause(EmpCustHeader,1000);




            genericUtil.writeTextWithPause(EditUserName,UpdatedUsername,2000);

            genericUtil.writeTextWithPause(EditUserID,UpdatedUserID,2000);

            genericUtil.writeTextWithPause(EditPassword,UpdatedstrPassword,2000);
            genericUtil.writeTextWithPause(EditConfirmPassword,UpdatedstrConfirmPassword,2000);
            genericUtil.writeTextWithPause(EditDepartment,UpdatedDepartment,2000);
            genericUtil.writeTextWithPause(EditDesignation,UpdatedDesignation,2000);


            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(EditStatus);
                objCheckBox.Select_The_Checkbox(EditStatus);
                genericUtil.pause(1200);
                HighlightElement.highlightElement(EditStatus);
                objCheckBox.DeSelect_The_Checkbox(EditStatus);
                genericUtil.pause(1200);
                HighlightElement.highlightElement(EditStatus);
                objCheckBox.Select_The_Checkbox(EditStatus);
                genericUtil.pause(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(EditSubmit);
            genericUtil.clickWithPause(EditSubmit,3000);

            HighlightElement.highlightElement(search);
            genericUtil.writeTextWithPause(search,UpdatedsearchText,1000);


        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}
