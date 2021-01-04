package pages;

import TestUtil.GenericUtil;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_Master_CustomerLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_Master_CustomerLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement TitleMasters;

    @FindBy(xpath = "//span[text()=' Customer Master ']")
    WebElement TitleUser;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[3]")
    WebElement Collapse;
    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[3]")
    WebElement FullScreen;

    @FindBy(xpath ="(//select[@class='fontColor'])[3]")
    WebElement List;

    @FindBy(xpath = "(//input[@class='fontColor'])[3]")
    WebElement Search;

    @FindBy(xpath = "(//div/table/tbody/tr[1])[21]")
    WebElement Data;

    @FindBy(xpath = "(//i[@title='Delete Customer'])[1]")
    WebElement DeleteBtn;

    @FindBy(xpath = "(//i[@title='Edit Customer'])[1]")
    WebElement EditBtn;

    /*--------------Edit---------------*/
    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[1]")
    WebElement EditCustomerName;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
    WebElement EditCustomerAddress;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[3]")
    WebElement EditCustomerCountry;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[4]")
    WebElement EditCustomerAccNo;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[5]")
    WebElement EditCustomerCity;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[6]")
    WebElement EditCustomerPostcode;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[7]")
    WebElement EditCustomerContactName;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[8]")
    WebElement EditCustomerContactNo;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[9]")
    WebElement EditCustomerFaxNumber;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[10]")
    WebElement EditCustomerEmail;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[9]")
    WebElement EditSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[10]")
    WebElement EditClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[11]")
    WebElement EditCancel;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[5]")
    WebElement AddCustomer;

    @FindBy(xpath = "(//a[@class='btn btn-success language_btn'])[6]")
    WebElement ImportCustomer;

    /*--------------Add New loyee ---------------*/
    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[1]")
    WebElement AddCustomerName;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[1]")
    WebElement AddCustomerAddress;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
    WebElement AddCustomerCountry;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[2]")
    WebElement AddCustomerAccNo;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[3]")
    WebElement AddCustomerCity;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[4]")
    WebElement AddCustomerPostcode;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[3]")
    WebElement AddCustomerContactName;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[4]")
    WebElement AddCustomerContactNo;

    @FindBy(xpath ="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[5]")
    WebElement AddCustomerFaxNumber;

    @FindBy(xpath = "(//input[@class='form-control ng-pristine ng-invalid ng-touched'])[5]")
    WebElement AddCustomerEmail;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[9]")
    WebElement AddSubmit;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[10]")
    WebElement AddClear;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[11]")
    WebElement AddCancel;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
    WebElement EmpCustomerPaginationPrevious;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[8]")
    WebElement EmpCustomerPaginationNext;

    @FindBy(xpath = "(//a[@class='ng-star-inserted'])[5]")
    WebElement EmpCustomerPaginationNo ;

    /**
     * TESTCASE: add Customer
     */
    public void addCustomer(){

    }

}
