package pages;

import TestUtil.CheckBox;
import TestUtil.Constants;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Cx_HelpDesk_page_Master_GroupLocator extends TestBase{

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;
    public static CheckBox objCheckBox;

    /*--------------Group ---------------*/
    @FindBy(xpath = "//h1[@class='page-title']")
    public WebElement TitleMasters;

    @FindBy(xpath = "//span[contains(text(),'Groups ')]")
    public WebElement TitleGroup; //V3.1

    @FindBy(xpath = "//li[@id='master']") //i[@class='fa fa-database']
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[2]")
    public WebElement GroupCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[2]")
    public WebElement GroupFullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[2]")
    public WebElement GroupList;

    @FindBy(xpath = "(//input[@class='fontColor'])[2]")
    public WebElement GroupSearch;

    @FindBy(xpath = "(//tr[@class='odd shown'])[1]")
    public WebElement GroupData;

    @FindBy(xpath = "(//tr/td[@class='text-center btnPlus'])[1]")
    public WebElement GroupBtnPlus;

    @FindBy(xpath = "(//tr/td[@class='text-center btnMinus'])[1]")
    public WebElement GroupBtnMinus;

    @FindBy(xpath = "(//tr[@class='ng-star-inserted'])[3]")
    public WebElement GroupDataListFirstRow;

    @FindBy(xpath = "(//input[@class='fontColor'])[3]")
    public WebElement GroupDataSearch;

    @FindBy(xpath = "(//tr[@class='ng-star-inserted'])[3]")
    public WebElement GroupEmpDataFirstRow;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[3]")
    public WebElement GroupEmpPaginationPrevious;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[5]")
    public WebElement GroupEmpPaginationNext;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[4]")
    public WebElement GroupEmpPaginationNo ;

    /*--------------Edit Group ---------------*/

    @FindBy(xpath = "//i[@title=\"Edit Group\"]")
    public WebElement GroupEditBtn;

    @FindBy(xpath = "//i[@title='Delete Group']")
    public WebElement GroupDeleteBtn;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
    public WebElement GroupEditName;

    @FindBy(xpath ="(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[2]")
    public WebElement GroupEditStatus;

    @FindBy(xpath = "(//input[@value='Save'])[2]")
    public WebElement GroupEditSave; //v3.0

    @FindBy(xpath = "(//input[@value='Clear'])[2]")
    public WebElement GroupEditClear;//v3.0

    @FindBy(xpath = "(//input[@value='Cancel'])[2]")
    public WebElement GroupEditCancel;//v3.0

    @FindBy(xpath = "//a[contains(text(),'Add New Group')]")
    public WebElement GroupAdd;//v3.1

    @FindBy(xpath = "//h3[contains(text(),'Are you sure! You want to Delete this Group?')]")
    public WebElement DeleteGroupMessage;

    @FindBy(xpath = "(//button[@class='btn btn-lg btn-success'])[4]")
    public WebElement YesOptionDeleteGroupMessage;//V3.0

    @FindBy(xpath = "//h4[contains(text(),'Add New Group')]")
    public  WebElement GroupAddTitle; //V3.1

    @FindBy(xpath = "//h4[contains(text(),'Edit Group')]")
    public WebElement GroupEditTitle; //V3.1

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement GroupAddName;

    @FindBy(xpath = "(//div[@class='cuppa-dropdown'])[1]")
    public WebElement GroupAddAttachedUser;

    @FindBy(xpath = "//label[@for='selectAll']")
    public WebElement SelectedAllAttachedUser;

    @FindBy(xpath = "//span[contains(text(),'Deselect All')]")
    public WebElement DeSelectedAllAttachedUser;

    @FindBy(xpath = "(//span[@class='c-angle-down ng-star-inserted'])[1]")
    public WebElement downArrowAttachedUser;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[2]")
    public WebElement GroupAddStatus;

    @FindBy(xpath = "(//input[@value='Save'])[2]")
    public WebElement GroupAddSave; //v3.0

    @FindBy(xpath = "(//input[@value='Clear'])[2]")
    public WebElement GroupAddClear;//v3.0

    @FindBy(xpath = "(//input[@value='Cancel'])[2]")
    public WebElement GroupAddCancel;//v3.0

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[8]")
    public WebElement GroupPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[11]")
    public WebElement GroupPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[10]")
    public WebElement GroupPaginationNo ;

    @FindBy(xpath = "//h4[contains(text(),'You have successfully deleted the selected Group')]")
    WebElement SuccessMsgGroupDelete; //V3.1

    @FindBy(xpath = "(//button[@class='btn white btn-outline'])[2]")
    WebElement CloseBtnSuccessGroupDelete;

    /*--------------Import Group ---------------*/
    @FindBy(xpath = "//a[contains(text(),'Import Groups')]")
    public WebElement GroupImport;//v3.1

    @FindBy(xpath = "//h4[contains(text(),'Import Groups')]")
    public WebElement GroupImportPopTitle; //V3.1

    @FindBy(xpath = "(//ngx-dropzone[@id='importFile'])[2]")
    public WebElement GroupImportattchment;

    @FindBy(xpath = "//h4[contains(text(),'Import Groups')]/../..//input[@value='Import']")
    public WebElement GroupImportPopbtn;

    @FindBy(xpath = "(//h3[contains(text(),'Data Mismatch In Sheet Used For Import Please Check!')])[2]")
    public WebElement GroupImportSuccessMsg;

    @FindBy(xpath = "(//button[contains(text(),'OK')])[4]")
    public WebElement GroupImportSuccessOk;

    @FindBy(xpath = "//h4[contains(text(),'Import Groups')]/..//button[@class='close']")
    public WebElement GroupImportPopClosebtn;

    public Cx_HelpDesk_page_Master_GroupLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     *
     * @param GroupName
     * @param searchText
     */
    public void createGroup(String GroupName,String searchText){
        try {
            genericUtil = new GenericUtil();

            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(GroupCollapse);
            genericUtil.clickWithPause(GroupCollapse,1000);

            HighlightElement.highlightElement(TitleGroup);
            genericUtil.pause(1000); //V3.1

            HighlightElement.highlightElement(GroupAdd);
            genericUtil.clickWithPause(GroupAdd,3000);//v3.0

            HighlightElement.highlightElement(GroupAddTitle);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(GroupAddName);
            genericUtil.writeTextWithPause(GroupAddName,GroupName,2000); //"Group Test"

            HighlightElement.highlightElement(GroupAddAttachedUser);
            genericUtil.clickWithPause(GroupAddAttachedUser,1000);

            HighlightElement.highlightElement(SelectedAllAttachedUser);
            genericUtil.clickWithPause(SelectedAllAttachedUser,1000);

            HighlightElement.highlightElement(downArrowAttachedUser);
            genericUtil.clickWithPause(downArrowAttachedUser,1000);

            try {
                objCheckBox = new CheckBox();
                HighlightElement.highlightElement(GroupAddStatus);
                objCheckBox.Select_The_Checkbox(GroupAddStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(GroupAddStatus);
                objCheckBox.DeSelect_The_Checkbox(GroupAddStatus);
                genericUtil.pause(1000);
                HighlightElement.highlightElement(GroupAddStatus);
                objCheckBox.Select_The_Checkbox(GroupAddStatus);
                genericUtil.pause(1000);
            }catch (Exception e) {
                e.printStackTrace();
            }

            HighlightElement.highlightElement(GroupAddSave);
            genericUtil.clickWithPause(GroupAddSave,3000);//v3.0

            HighlightElement.highlightElement(GroupSearch);
            genericUtil.writeTextWithPause(GroupSearch,searchText,3000); //"Group Test"

            HighlightElement.highlightElement(GroupBtnPlus);
            genericUtil.clickWithPause(GroupBtnPlus,2000); //"Group Test"

            HighlightElement.highlightElement(GroupBtnMinus);
            genericUtil.clickWithPause(GroupBtnMinus,2000); //"Group Test"
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     *
     * @param UpdatedGroupName
     * @param searchText
     */
    public void editGroup(String UpdatedGroupName,String searchText){
        try {
            genericUtil = new GenericUtil();

            HighlightElement.highlightElement(GroupEditBtn);
            genericUtil.clickWithPause(GroupEditBtn,3000);

            HighlightElement.highlightElement(GroupEditTitle);
            genericUtil.clickWithPause(GroupEditTitle,1000);

            HighlightElement.highlightElement(GroupAddName);
            genericUtil.writeTextWithPause(GroupAddName,UpdatedGroupName,2000); //"Group Test"

            HighlightElement.highlightElement(GroupAddAttachedUser);
            genericUtil.clickWithPause(GroupAddAttachedUser,1000);

            HighlightElement.highlightElement(DeSelectedAllAttachedUser);
            genericUtil.clickWithPause(DeSelectedAllAttachedUser,2000);

            HighlightElement.highlightElement(SelectedAllAttachedUser);
            genericUtil.clickWithPause(SelectedAllAttachedUser,2000);

            HighlightElement.highlightElement(downArrowAttachedUser);
            genericUtil.clickWithPause(downArrowAttachedUser,1000);

            HighlightElement.highlightElement(GroupEditSave);
            genericUtil.clickWithPause(GroupEditSave,3000);//v3.0

            HighlightElement.highlightElement(GroupSearch);
            GroupSearch.clear();
            genericUtil.writeTextWithPause(GroupSearch,searchText,3000); //"Group Test"
        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     *
     * @param UpdatedGroupName
     * @param searchText
     */
    public void deleteGroup(String UpdatedGroupName,String searchText){
        try {
            genericUtil = new GenericUtil();

            HighlightElement.highlightElement(GroupEditBtn);
            genericUtil.clickWithPause(GroupEditBtn,3000);

            HighlightElement.highlightElement(GroupAddName);
            genericUtil.writeTextWithPause(GroupAddName,UpdatedGroupName,2000); //"Group Test"

            HighlightElement.highlightElement(GroupAddAttachedUser);
            genericUtil.clickWithPause(GroupAddAttachedUser,1000);

            HighlightElement.highlightElement(DeSelectedAllAttachedUser);
            genericUtil.clickWithPause(DeSelectedAllAttachedUser,2000);

            HighlightElement.highlightElement(GroupEditSave);
            genericUtil.clickWithPause(GroupEditSave,3000); //v3.0

            HighlightElement.highlightElement(GroupSearch);
            GroupSearch.clear();
            genericUtil.writeTextWithPause(GroupSearch,searchText,3000); //"Group Test"

            HighlightElement.highlightElement(GroupDeleteBtn);
            genericUtil.clickWithPause(GroupDeleteBtn, 3000);

            HighlightElement.highlightElement(DeleteGroupMessage);

            HighlightElement.highlightElement(YesOptionDeleteGroupMessage);
            genericUtil.clickWithPause(YesOptionDeleteGroupMessage, 3000);

            Thread.sleep(2000);
            HighlightElement.highlightElement(SuccessMsgGroupDelete);
            Thread.sleep(2000);

            HighlightElement.highlightElement(CloseBtnSuccessGroupDelete);
            genericUtil.clickWithPause(CloseBtnSuccessGroupDelete,3000);

            Thread.sleep(2000);

            HighlightElement.highlightElement(GroupSearch);
            GroupSearch.clear();
            genericUtil.writeTextWithPause(GroupSearch, searchText, 3000); //"Group Test"
        }catch (Exception ex){
            ex.getStackTrace();
        }
    }

    /**
     * TESTCASE: importGroup
     */
    public void importGroup() {
        try {
            genericUtil = new GenericUtil();

//            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
//            HighlightElement.highlightElement(sidebar_textMaster);
//            sidebar_textMaster.click();
//            genericUtil.pause(2000);

//            HighlightElement.highlightElement(TitleMasters);
//            genericUtil.pause(1000);
//
//            HighlightElement.highlightElement(GroupCollapse);
//            genericUtil.clickWithPause(GroupCollapse,1000);

            HighlightElement.highlightElement(TitleGroup);
            genericUtil.pause(1000); //V3.1

            HighlightElement.highlightElement(GroupImport);
            genericUtil.clickWithPause(GroupImport,2000);

            HighlightElement.highlightElement(GroupImportPopTitle);
            genericUtil.clickWithPause(GroupImportPopTitle,2000);

            HighlightElement.highlightElement(GroupImportattchment);
            genericUtil.clickWithPause(GroupImportattchment,2000);
            wait.until(ExpectedConditions.visibilityOf(GroupImportattchment));

            StringSelection stringSelection = new StringSelection(Constants.IMPORT_GROUP_PATH);
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

            wait.until(ExpectedConditions.visibilityOf(GroupImportPopbtn));
            HighlightElement.highlightElement(GroupImportPopbtn);
            genericUtil.clickWithPause(GroupImportPopbtn,1000);

            HighlightElement.highlightElement(GroupImportSuccessMsg);
            genericUtil.clickWithPause(GroupImportSuccessMsg,1000);

            HighlightElement.highlightElement(GroupImportSuccessOk);
            genericUtil.clickWithPause(GroupImportSuccessOk,1000);

            HighlightElement.highlightElement(GroupImportPopTitle);
            genericUtil.clickWithPause(GroupImportPopTitle,2000);

            HighlightElement.highlightElement(GroupImportPopClosebtn);
            genericUtil.clickWithPause(GroupImportPopClosebtn,1000);

        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
