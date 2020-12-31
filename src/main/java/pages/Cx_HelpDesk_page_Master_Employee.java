package pages;

import TestUtil.GenericUtil;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class Cx_HelpDesk_page_Master_Employee extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement TitleMasters;

    @FindBy(xpath = "//span[text()=' Employee User Master']")
    WebElement TitleEmpUser;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    WebElement EmpCollapse;
    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    WebElement EmpFullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[1]")
    WebElement EmpList;

    @FindBy(xpath = "(//input[@class='fontColor'])[1]")
    WebElement EmpSearch;

    @FindBy(xpath = "(//div/table/tbody/tr[1])[1]")
    WebElement EmpData;

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
    WebElement EmpAdd;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[2]")
    WebElement EmpImport;

    /*--------------Add New Employee ---------------*/

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[1]")
    WebElement EmpAddName;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[2]")
    WebElement EmpAddEmail;


    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[3]")
    WebElement EmpAddEmpNo;

    @FindBy(xpath = "//select[@class='form-control ng-pristine ng-invalid ng-touched']")
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

    public Cx_HelpDesk_page_Master_Employee(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }


}
