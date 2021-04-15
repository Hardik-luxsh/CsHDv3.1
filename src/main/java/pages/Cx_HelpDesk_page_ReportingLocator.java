package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_ReportingLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_ReportingLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),'Reporting')]")
    public WebElement sidebar_textReporting;

    @FindBy(xpath = "//h1[contains(text(),'Reporting')]")
    public WebElement titleReporting;

    @FindBy(xpath = "//span[contains(text(),'Ticket Count')]")
    public WebElement titleTicketCount;

    @FindBy(xpath = "//span[contains(text(),'Ticket Count')]/../../..")
    public WebElement sectionTicketCount;

    @FindBy(xpath = "//span[contains(text(),'Channel')]")
    public WebElement titleChannel;

    @FindBy(xpath = "//span[contains(text(),'Channel')]/../../..")
    public WebElement sectionChannel;

    @FindBy(xpath = "//span[contains(text(),'Ticket Type')]")
    public WebElement titleTicketType;

    @FindBy(xpath = "//span[contains(text(),'Ticket Type')]/../../..")
    public WebElement sectionTicketType;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement buttonSearch;

    @FindBy(xpath = "//button[contains(text(),'Clear Filters')]")
    public WebElement buttonClearFilters;

    @FindBy(xpath = "//a[contains(text(),'Year')]")
    public WebElement tabYear;

    @FindBy(xpath = "//a[contains(text(),'Month')]")
    public WebElement tabMonth;

    @FindBy(xpath = "//a[contains(text(),'Week')]")
    public WebElement tabWeek;

    @FindBy(xpath = "//a[contains(text(),'Day')]")
    public WebElement tabDay;

    @FindBy(xpath = "//a[@class=\"btn btn-download\"]")
    public WebElement buttonDownload;

    @FindBy(xpath = "//h4[contains(text(),'Ticket Details')]")
    public WebElement titleDetails;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover order-column']")
    public WebElement tableDetails;

    /**
     * TESTCASE: GENERATE REPORT
     */
    public void generateReport(){

        JavascriptExecutor jsDown = (JavascriptExecutor) driver;
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textReporting));
            HighlightElement.highlightElement(sidebar_textReporting);
            genericUtil.clickWithPause(sidebar_textReporting,2000);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(titleReporting);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(titleTicketCount);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(sectionTicketCount);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(titleChannel);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(sectionChannel);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(titleTicketType);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(sectionTicketType);

            genericUtil.pause(1000);
            HighlightElement.highlightElement(buttonSearch);
            genericUtil.clickWithPause(buttonSearch,2000);

            jsDown.executeScript("window.scrollBy(0,1200)");
            genericUtil.pause(1000);

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

            jsDown.executeScript("window.scrollBy(0,200)");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(buttonClearFilters);
            genericUtil.clickWithPause(buttonClearFilters,2000);

            HighlightElement.highlightElement(buttonDownload);
            genericUtil.clickWithPause(buttonDownload,2000);

            jsUp.executeScript("window.scrollBy(0,-1000)");
            genericUtil.pause(1000);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
