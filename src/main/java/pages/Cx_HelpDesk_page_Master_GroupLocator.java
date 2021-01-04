package pages;

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

public class Cx_HelpDesk_page_Master_GroupLocator extends TestBase{

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement TitleMasters;

    @FindBy(xpath = "//span[text()=' Group Master']")
    WebElement TitleGroup;

    @FindBy(xpath = "//i[@class='fa fa-database']")
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[2]")
    WebElement GroupCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[2]")
    WebElement GroupFullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[2]")
    WebElement GroupList;

    @FindBy(xpath = "(//input[@class='fontColor'])[2]")
    WebElement GroupSearch;

    @FindBy(xpath = "(//tr[@class='odd shown'])[1]")
    WebElement GroupData;

    @FindBy(xpath = "(//tr/td[@class='text-center btnPlus'])[1]")
    WebElement GroupBtnPlus;

    @FindBy(xpath = "(//tr/td[@class='text-center btnMinus'])[1]")
    WebElement GroupBtnMinus;

    @FindBy(xpath = "(//tr[@class='ng-star-inserted'])[3]")
    WebElement GroupDataListFirstRow;

    @FindBy(xpath = "(//input[@class='fontColor'])[3]")
    WebElement GroupDataSearch;

    @FindBy(xpath = "(//tr[@class='ng-star-inserted'])[3]")
    WebElement GroupEmpDataFirstRow;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[3]")
    WebElement GroupEmpPaginationPrevious;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[5]")
    WebElement GroupEmpPaginationNext;

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[4]")
    WebElement GroupEmpPaginationNo ;

    /*--------------Edit---------------*/

    @FindBy(xpath = "(//i[@title='Edit Group'])[1]")
    WebElement GroupEditBtn;

    @FindBy(xpath = "((//i[@title='Delete Group'])[1]")
    WebElement GroupDeleteBtn;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
    WebElement GroupEditName;
    /*

    //don't no which xpath use

    @FindBy(xpath = "")
    WebElement GroupEditAttachedUser;

    */
    @FindBy(xpath ="(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[2]")
    WebElement GroupEditStatus;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[5]")
    WebElement GroupEditSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[6]")
    WebElement GroupEditClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[7]")
    WebElement GroupEditCancel;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[3]")
    WebElement GroupAdd;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[4]")
    WebElement GroupImport;

    /*--------------Add New Group ---------------*/

    @FindBy(xpath = "//input[@id='Name']")
    WebElement GroupAddName;

    @FindBy(xpath = "(//div[@class='cuppa-dropdown'])[1]")
    WebElement GroupAddAttachedUser;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[2]")
    WebElement GroupAddStatus;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[5]")
    WebElement GroupAddSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[6]")
    WebElement GroupAddClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[7]")
    WebElement GroupAddCancel;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[8]")
    WebElement GroupPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[11]")
    WebElement GroupPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[10]")
    WebElement GroupPaginationNo ;

    public Cx_HelpDesk_page_Master_GroupLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    public void createGroup(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(GroupCollapse);
            genericUtil.clickWithPause(GroupCollapse,1000);

            HighlightElement.highlightElement(TitleGroup);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(GroupAdd);
            genericUtil.clickWithPause(GroupAdd,3000);

            wait.until(ExpectedConditions.visibilityOf(GroupAddName));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(GroupAddName).click().build().perform();

            HighlightElement.highlightElement(GroupAddName);
            genericUtil.writeTextWithPause(GroupAddName,"Group Test",2000);

            GroupAddAttachedUser.click();

        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

}
