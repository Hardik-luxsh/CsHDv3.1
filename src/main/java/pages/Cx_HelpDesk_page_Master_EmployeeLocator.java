package pages;

import TestUtil.*;
import base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;

public class Cx_HelpDesk_page_Master_EmployeeLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;
    public static CheckBox objCheckBox;

    @FindBy(xpath = "//h1[@class='page-title']")
    public WebElement TitleMasters;

    @FindBy(xpath = "//span[text()=' Employee User Master']")
    public WebElement TitleEmpUser;

    @FindBy(xpath = "//li[@id='master']") //i[@class='fa fa-database']
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    public WebElement EmpCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    public WebElement EmpFullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[1]")
    public WebElement NumberOfRecordsPerPage;

    @FindBy(xpath = "(//input[@class='fontColor'])[1]")
    public WebElement EmpSearch;

    @FindBy(xpath = "(//div/table/tbody/tr[1])[1]")
    public WebElement EmpFirstRowData;

    /*--------------Edit Employee ---------------*/
    @FindBy(xpath = "//h4[contains(text(),'Edit Employee User')]")
    public WebElement EmpEditHeader;

    @FindBy(xpath = "(//i[@title='Edit Employee'])[1]")
    public WebElement EmpEditBtn;

    @FindBy(xpath = "(//i[@title='Delete Employee'])[1]")
    public WebElement EmpDeleteBtn;

    @FindBy(xpath = "//label[text()='Login Id']/..//input[@formcontrolname='login_Id']")
    public WebElement EMPUserId; //V3.0

    @FindBy(xpath = "//input[@id='fullName']")
    public WebElement EmpEditName;

    @FindBy(xpath = "(//input[@formcontrolname='email'])[1]")
    public WebElement EmpEditEmail;

    @FindBy(xpath = "(//input[@formcontrolname='emp_No'])[1]")
    public WebElement EmpEditNo;

    @FindBy(xpath = "//h4[contains(text(),'Edit Employee User')]//..//..//select[@id='user_Type']") //Added
    public WebElement EmpEditRole;

    @FindBy(xpath = "//label[contains(text(),'Attached To')]/..//input[@formcontrolname='groupName']")
    public WebElement EmpAttachedTo;

    @FindBy(xpath = "//input[@formcontrolname='groupStatus']")
    public WebElement EmpGroupStatus;

    @FindBy(xpath ="(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[1]")
    public WebElement EmpEditStatus;

    @FindBy(xpath =  "//h4[contains(text(),'Edit Employee User')]/../..//input[@value='Save']")    //"(//input[@value='Save'])[1]")
    public WebElement EmpEditSave;//V3.0

    @FindBy(xpath = "(//input[@value='Clear'])[1]")
    public WebElement EmpEditClear;//V3.0

    @FindBy(xpath = "(//input[@value='Cancel'])[1]")
    public WebElement EmpEditCancel;//V3.0

    @FindBy(xpath = "//a[contains(text(),'Add New Employee User')]")
    public WebElement AddNewEmployeeUser;//V3.0

    /*--------------Add New Employee ---------------*/
    @FindBy(xpath = "//h4[contains(text(),'Add New Employee User')]")
    WebElement TitleEmpAddName;

    @FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
    WebElement EmpAddName;

    //    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-invalid ng-touched']")
    @FindBy(xpath = "(//input[@formcontrolname='email'])[1]")
    WebElement EmpAddEmail;

    //    @FindBy(xpath = "//input[@class='form-control ng-dirty ng-invalid ng-touched']")
    @FindBy(xpath = "(//input[@formcontrolname='emp_No'])[1]")
    WebElement EmpAddEmpNo;

    @FindBy(xpath = "(//select[@id='user_Type'])[1]")
    WebElement EmpAddRole;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[1]")
    WebElement EmpAddStatus;

    //  @FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
    //Change xpath in version-2.0
    @FindBy(xpath = "(//input[@value='Save'])[1]")
    public WebElement EmpAddSave; //V3.0

    @FindBy(xpath = "(//input[@value='Clear'])[1]")
    public WebElement EmpAddClear;//V3.0

    @FindBy(xpath = "(//input[@value='Cancel'])[1]")
    public WebElement EmpAddCancel;//V3.0

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
    WebElement EmpPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[8]")
    WebElement EmpPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[5]")
    WebElement EmpPaginationNo;

    @FindBy(xpath = "//h3[contains(text(),'Are you sure! You want to Delete this Employee Use')]")
    WebElement TitleEmpDelete;

    @FindBy(xpath = "(//h4[@class='modal-title'])[6]")
    WebElement SuccessMsgEmpDelete;

    @FindBy(xpath = "(//button[@class='btn white btn-outline'])[1]")
    WebElement CloseBtnSuccessMsgEmpDelete;

    @FindBy(xpath = "(//button[@class='btn btn-lg btn-success'])[1]")
    WebElement YesOptionEmpDelete;

    /*--------------Import Employee ---------------*/
    @FindBy(xpath = "//a[contains(text(),'Import Employee User')]")
    public WebElement EmpImport;//V3.0

    @FindBy(xpath = "//h4[contains(text(),'Import Employee User')]")
    public WebElement EmpImportPopTitle;

    @FindBy(xpath = "(//ngx-dropzone[@id='importFile'])[1]")
    public WebElement EmpImportattchment;

    @FindBy(xpath = "//h4[contains(text(),'Import Employee User')]/../..//input[@value='Import']")
    public WebElement EmpImportPopbtn;

    @FindBy(xpath = "(//h3[contains(text(),'Data Mismatch In Sheet Used For Import Please Check!')])[1]")
    public WebElement EmpImportSuccessMsg;

    @FindBy(xpath = "(//button[contains(text(),'OK')])[2]")
    public WebElement EmpImportSuccessOk;

    @FindBy(xpath = "//h4[contains(text(),'Import Employee User')]/..//button[@class='close']")
    public WebElement EmpImportPopClosebtn;

    public Cx_HelpDesk_page_Master_EmployeeLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * TESTCASE METHOD: CREATE EMPLOYEE
     * @param EmpName
     * @param EmpEmail
     * @param EmpNo
     * @param EmpRole
     * @param searchText
     */
    public void createEmployee(String EmpName,String EmpEmail,String EmpNo,String EmpRole,String searchText){
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

            HighlightElement.highlightElement(EmpCollapse);
            genericUtil.clickWithPause(EmpCollapse,1000);

//            HighlightElement.highlightElement(TitleEmpUser);
//            genericUtil.pause(1000);

//            HighlightElement.highlightElement(TitleEmpAddName);
//            genericUtil.pause(500);

            jsDown.executeScript("window.scrollBy(0,500)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(AddNewEmployeeUser);
            genericUtil.clickWithPause(AddNewEmployeeUser,3000);

            HighlightElement.highlightElement(EmpAddName);
            genericUtil.writeTextWithPause(EmpAddName,EmpName,2000); //"Employee Test"

            HighlightElement.highlightElement(EmpAddEmail);
            genericUtil.writeTextWithPause(EmpAddEmail,EmpEmail,2000); //"EmpTest@test.com"

            HighlightElement.highlightElement(EmpAddEmpNo);
            genericUtil.writeTextWithPause(EmpAddEmpNo,EmpNo,2000); //"EmpTest"

            HighlightElement.highlightElement(EmpAddRole);
            Select role = new Select(EmpAddRole);
            role.selectByVisibleText(EmpRole); //"Employee"
            genericUtil.pause(1000);

            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(EmpAddStatus);
                objCheckBox.Select_The_Checkbox(EmpAddStatus);
                genericUtil.pause(1200);
                HighlightElement.highlightElement(EmpAddStatus);
                objCheckBox.DeSelect_The_Checkbox(EmpAddStatus);
                genericUtil.pause(1200);
                HighlightElement.highlightElement(EmpAddStatus);
                objCheckBox.Select_The_Checkbox(EmpAddStatus);
                genericUtil.pause(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(EmpAddSave);
            genericUtil.clickWithPause(EmpAddSave,3000); //v3.0

            HighlightElement.highlightElement(EmpSearch);
            genericUtil.writeTextWithPause(EmpSearch,searchText,3000); //"EmpTest"
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: EDIT or MODIFY EMPLOYEE
     * @param UpdatedEmpName
     * @param UpdatedEmpEmail
     * @param UpdatedEmpNo
     * @param UpdatedEmpRole
     * @param UpdatedSearchText
     */
    public void editEmployee(String UpdatedEmpName,String UpdatedEmpEmail,String UpdatedEmpNo,String UpdatedEmpRole,String UpdatedSearchText){
        try {
            genericUtil = new GenericUtil();

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(EmpSearch);
            genericUtil.writeTextWithPause(EmpSearch,UpdatedSearchText,3000); //"EmpTest"

            HighlightElement.highlightElement(EmpCollapse);
            genericUtil.clickWithPause(EmpCollapse,1000);

            HighlightElement.highlightElement(EmpEditBtn);
            genericUtil.clickWithPause(EmpEditBtn,3000);

            HighlightElement.highlightElement(EmpEditHeader);
            genericUtil.clickWithPause(EmpEditHeader,1000);

            HighlightElement.highlightElement(EMPUserId);
            genericUtil.clickWithPause(EMPUserId,1000);//V3.0

            HighlightElement.highlightElement(EmpEditName);
            genericUtil.writeTextWithPause(EmpEditName,UpdatedEmpName,1000); //"Updated EmpTest"

            HighlightElement.highlightElement(EmpEditEmail);
            genericUtil.writeTextWithPause(EmpEditEmail,UpdatedEmpEmail,2000); //"UpdatedEmpTest@test.com"

            HighlightElement.highlightElement(EmpEditNo);
            genericUtil.writeTextWithPause(EmpEditNo,UpdatedEmpNo,2000); //"UpdatedEmpTest"

            HighlightElement.highlightElement(EmpEditRole);
            genericUtil.clickWithPause(EmpEditRole,1000);
            Select roleEdit = new Select(EmpEditRole);
            roleEdit.selectByVisibleText(UpdatedEmpRole); //"Admin"
            genericUtil.pause(2000);

            HighlightElement.highlightElement(EmpAttachedTo);
            genericUtil.clickWithPause(EmpAttachedTo,2000);//V3.0

            HighlightElement.highlightElement(EmpGroupStatus);
            genericUtil.clickWithPause(EmpGroupStatus,2000);//V3.0

            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(EmpEditStatus);
                objCheckBox.Select_The_Checkbox(EmpEditStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(EmpEditStatus);
                objCheckBox.DeSelect_The_Checkbox(EmpEditStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(EmpEditStatus);
                objCheckBox.Select_The_Checkbox(EmpEditStatus);
                genericUtil.pause(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(EmpEditSave);
            genericUtil.clickWithPause(EmpEditSave,3000); //3.0

            HighlightElement.highlightElement(EmpSearch);
            genericUtil.writeTextWithPause(EmpSearch,UpdatedSearchText,3000); //"UpdatedEmpTest"
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /** TESTCASE METHOD: DELETE or REMOVE EMPLOYEE
     *
     * @param SearchText
     */
    public void deleteEmployee(String SearchText){
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            HighlightElement.highlightElement(EmpEditNo);
            genericUtil.writeTextWithPause(EmpEditNo,SearchText,3000); //"UpdatedEmpTest"

            HighlightElement.highlightElement(EmpDeleteBtn);
            genericUtil.clickWithPause(EmpDeleteBtn,3000);

            HighlightElement.highlightElement(TitleEmpDelete);

            HighlightElement.highlightElement(YesOptionEmpDelete);
            genericUtil.clickWithPause(YesOptionEmpDelete,3000);

            wait.until(ExpectedConditions.visibilityOf(SuccessMsgEmpDelete));
            HighlightElement.highlightElement(YesOptionEmpDelete);
            genericUtil.pause(2000);

            HighlightElement.highlightElement(SuccessMsgEmpDelete);
            genericUtil.pause(2000);

            HighlightElement.highlightElement(CloseBtnSuccessMsgEmpDelete);
            genericUtil.clickWithPause(CloseBtnSuccessMsgEmpDelete,3000);

            HighlightElement.highlightElement(EmpEditNo);
            genericUtil.writeTextWithPause(EmpEditNo,SearchText,3000); //"UpdatedEmpTest"
            genericUtil.pause(2000);

            HighlightElement.highlightElement(CloseBtnSuccessMsgEmpDelete);
            genericUtil.clickWithPause(CloseBtnSuccessMsgEmpDelete,2000);

            HighlightElement.highlightElement(EmpSearch);
            EmpSearch.clear();
            genericUtil.writeTextWithPause(EmpSearch,SearchText,3000); //"UpdatedEmpTest"
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE: importEmployee
     */
    public void importEmployee() {
        try {
            genericUtil = new GenericUtil();

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

//            HighlightElement.highlightElement(TitleMasters);
//            genericUtil.pause(1000);

            HighlightElement.highlightElement(EmpCollapse);
            genericUtil.clickWithPause(EmpCollapse,1000);

//            HighlightElement.highlightElement(TitleEmpUser);
//            genericUtil.pause(1000);

            HighlightElement.highlightElement(EmpImport);
            genericUtil.clickWithPause(EmpImport,2000);

            HighlightElement.highlightElement(EmpImportPopTitle);
            genericUtil.clickWithPause(EmpImportPopTitle,2000);

            HighlightElement.highlightElement(EmpImportattchment);
            genericUtil.clickWithPause(EmpImportattchment,2000);
            wait.until(ExpectedConditions.visibilityOf(EmpImportattchment));

            StringSelection stringSelection = new StringSelection(Constants.IMPORT_EMP_PATH);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
            /*-----BEGIN-------------File Upload Logic---------------------*/
            // Create object of Robot class
            Robot robot = new Robot();
//            genericUtil.pause(2000);

            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
//            genericUtil.pause(1000);

            // Press CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
//            genericUtil.pause(1000);

            // Release CTRL+V
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_V);
//            genericUtil.pause(2000);


            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


            /*----END--------------File Upload Logic---------------------*/

            wait.until(ExpectedConditions.visibilityOf(EmpImportPopbtn));
            HighlightElement.highlightElement(EmpImportPopbtn);
            genericUtil.clickWithPause(EmpImportPopbtn,1000);

            HighlightElement.highlightElement(EmpImportSuccessMsg);
            genericUtil.clickWithPause(EmpImportSuccessMsg,1000);

            HighlightElement.highlightElement(EmpImportSuccessOk);
            genericUtil.clickWithPause(EmpImportSuccessOk,1000);

            HighlightElement.highlightElement(EmpImportPopTitle);
            genericUtil.clickWithPause(EmpImportPopTitle,2000);

            HighlightElement.highlightElement(EmpImportPopClosebtn);
            genericUtil.clickWithPause(EmpImportPopClosebtn,1000);

        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}