package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_Master_EmployeeLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement TitleMasters;

    @FindBy(xpath = "//span[text()=' Employee User Master']")
    WebElement TitleEmpUser;

    @FindBy(xpath = "//i[@class='fa fa-database']")
    public WebElement sidebar_textMaster;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    WebElement EmpCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    WebElement EmpFullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[1]")
    WebElement NumberOfRecordsPerPage;

    @FindBy(xpath = "(//input[@class='fontColor'])[1]")
    WebElement EmpSearch;

    @FindBy(xpath = "(//div/table/tbody/tr[1])[1]")
    WebElement EmpFirstRowData;

    /*--------------Edit---------------*/

    @FindBy(xpath = "(//i[@title='Edit Employee'])[1]")
    WebElement EmpEditBtn;

    @FindBy(xpath = "(//i[@title='Delete Employee'])[1]")
    WebElement EmpDeleteBtn;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
    WebElement EmpEditEmail;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[3]")
    WebElement EmpEditNo;

    @FindBy(xpath = "//select[@id='user_Type']")
    WebElement EmpEditRole;

    @FindBy(xpath ="(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[1]")
    WebElement EmpEditStatus;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
    WebElement EmpEditSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[2]")
    WebElement EmpEditClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[3]")
    WebElement EmpEditCancel;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[1]")
    WebElement AddNewEmployeeUser;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[2]")
    WebElement EmpImport;

    /*--------------Add New Employee ---------------*/

    @FindBy(xpath = "//h4[contains(text(),'Add New Employee User')]")
    WebElement TitleEmpAddName;

    @FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
    WebElement EmpAddName;

    @FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[2]")
    WebElement EmpAddEmail;

    @FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[3]")
    WebElement EmpAddEmpNo;

    @FindBy(xpath = "(//select[@id='user_Type'])[1]")
    WebElement EmpAddRole;

    @FindBy(xpath = "(//label[@class='mt-checkbox mt-checkbox-single mt-checkbox-outline']/span)[1]")
    WebElement EmpAddStatus;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
    WebElement EmpAddSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[2]")
    WebElement EmpAddClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[3]")
    WebElement EmpAddCancel;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
    WebElement EmpPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[8]")
    WebElement EmpPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[5]")
    WebElement EmpPaginationNo ;

    public Cx_HelpDesk_page_Master_EmployeeLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    public void createEmployee(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textMaster));
            HighlightElement.highlightElement(sidebar_textMaster);
            sidebar_textMaster.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(TitleMasters);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(EmpCollapse);
            genericUtil.clickWithPause(EmpCollapse,1000);

            HighlightElement.highlightElement(TitleEmpUser);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleEmpAddName);

            HighlightElement.highlightElement(AddNewEmployeeUser);
            genericUtil.clickWithPause(AddNewEmployeeUser,3000);

//            wait.until(ExpectedConditions.visibilityOf(EmpAddName));
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            Actions builder = new Actions(driver);
//            builder.moveToElement(EmpAddName).click().build().perform();

            HighlightElement.highlightElement(EmpAddName);
//            js.executeScript("arguments[0].click();",EmpAddName);
            genericUtil.writeTextWithPause(EmpAddName,"Employee Test",2000);

            HighlightElement.highlightElement(EmpAddEmail);
            genericUtil.writeTextWithPause(EmpAddEmail,"EmpTest@test.com",2000);

            HighlightElement.highlightElement(EmpAddEmpNo);
            genericUtil.writeTextWithPause(EmpAddEmpNo,"EmpTest",2000);

            HighlightElement.highlightElement(EmpAddRole);
            Select role = new Select(EmpAddRole);
            role.selectByVisibleText("Employee");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(EmpAddStatus);
            genericUtil.DeSelect_The_Checkbox(EmpAddStatus);
            genericUtil.pause(1000);
            HighlightElement.highlightElement(EmpAddStatus);
            genericUtil.Select_The_Checkbox(EmpAddStatus);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(EmpAddSubmit);
            genericUtil.clickWithPause(EmpAddSubmit,3000);

            HighlightElement.highlightElement(EmpSearch);
            genericUtil.writeTextWithPause(EmpSearch,"EmpTest",3000);

            //***************** Edit functionality ****************


        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }

}
