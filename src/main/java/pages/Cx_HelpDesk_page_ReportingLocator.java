package pages;

import TestUtil.Constants;
import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cx_HelpDesk_page_ReportingLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_ReportingLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//h1[contains(text(),'Reporting ')]")
    public WebElement sidebar_textReporting;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement buttonSearch;

    @FindBy(xpath = "//button[contains(text(),'Clear Filters')]")
    public WebElement buttonClearFilters;

    @FindBy(xpath = "//a[@id='tabyear']")
    public WebElement tabYear;

    @FindBy(xpath = "//a[@id='tabmonth']")
    public WebElement tabMonth;

    @FindBy(xpath = "//a[@id='tabweek']")
    public WebElement tabWeek;

    @FindBy(xpath = "//a[@id='tabday']")
    public WebElement tabDay;

    @FindBy(xpath = "//a[@class=\"btn btn-download\"]")
    public WebElement buttonDownload;

    @FindBy(xpath = "//h4[contains(text(),'Ticket Details ')]")
    public WebElement titleDetails;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover order-column']")
    public WebElement tableDetails;

    /**
     * TESTCASE: GENERATE REPORT
     */
    public void generateReport(){

        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textReporting));
            HighlightElement.highlightElement(sidebar_textReporting);
            genericUtil.clickWithPause(sidebar_textReporting,2000);
            Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "reporting");

            HighlightElement.highlightElement(buttonSearch);
            genericUtil.clickWithPause(buttonSearch,2000);

            HighlightElement.highlightElement(tabYear);
            genericUtil.clickWithPause(tabYear,2000);

            HighlightElement.highlightElement(tabMonth);
            genericUtil.clickWithPause(tabMonth,2000);

            HighlightElement.highlightElement(tabWeek);
            genericUtil.clickWithPause(tabWeek,2000);

            HighlightElement.highlightElement(tabDay);
            genericUtil.clickWithPause(tabDay,2000);

            HighlightElement.highlightElement(tableDetails);
            genericUtil.clickWithPause(tableDetails,2000);

            HighlightElement.highlightElement(titleDetails);
            genericUtil.clickWithPause(titleDetails,1000);

            HighlightElement.highlightElement(buttonClearFilters);
            genericUtil.clickWithPause(buttonClearFilters,2000);

            HighlightElement.highlightElement(buttonDownload);
            genericUtil.clickWithPause(buttonDownload,2000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
