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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cx_HelpDesk_page_CreateTicketLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_CreateTicketLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//img[@class=\"logo-default\"]")
    public WebElement logo_img;

    @FindBy(xpath = "//span[contains(text(),'Customer')]")
    public WebElement sidebar_textCustomer;

    @FindBy(xpath = "//span[contains(text(),'Create a New Ticket')]")
    public WebElement sidebar_textCreateTicket;

    @FindBy(xpath = "//select[@id='selectBox']")
    public WebElement customer; //EmpCust

    @FindBy(xpath = "//span[contains(text(),'Create New Ticket')]")
    public WebElement titleCreateTicket;

    @FindBy(xpath = "//select[@id='createTicketTitle']")
    public WebElement ticketType; //Returns

    @FindBy(xpath = "//input[@formcontrolname='Description']")
    public WebElement description;

    @FindBy(xpath = "//label[contains(text(),'Owner')]/..//input[@class='form-control']")
    public WebElement labelOwner;

    @FindBy(xpath = "//select[@formcontrolname='Status']")
    public WebElement state;

    @FindBy(xpath = "//select[@formcontrolname='Priority']")
    public WebElement priority;

    @FindBy(xpath = "//input[@formcontrolname='Tags']")
    public WebElement tag;

    @FindBy(xpath = "//span[contains(text(),'Select file')]") //div[@class='form-control uneditable-input input-fixed input-small fileUPload']
    public WebElement file;

    @FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
    public WebElement buttonSubmit;

    @FindBy(xpath = "//h4[contains(text(),'Confirm Ticket Creation!')]")
    public WebElement confirmTicket;

    @FindBy(xpath = "//input[@value='Yes']")
    public WebElement optionConfirmYesTicket;

    @FindBy(xpath = "//input[@value='No']")
    public WebElement optionConfirmNoTicket;

    @FindBy(xpath = "//input[@value='No']")
    public WebElement optionConfirmCloseTicket;

    @FindBy(xpath = "//h4[text()='Confirm Ticket Creation!']/../button")
    public WebElement closeConfirmCreateTicket;

    /**
     * TESTCASE: Create Ticket
     */
    public void createTicket() {
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textCustomer));
            HighlightElement.highlightElement(sidebar_textCustomer);
            sidebar_textCustomer.click();
            genericUtil.pause(2000);

            HighlightElement.highlightElement(sidebar_textCreateTicket);
            sidebar_textCreateTicket.click();
            genericUtil.pause(2000);
            Assert.assertEquals(driver.getCurrentUrl(), Constants.BASEURL + "createnewticket");

            HighlightElement.highlightElement(titleCreateTicket);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(customer);
            genericUtil.click(customer);
            Select selectCustomer = new Select(customer);
            selectCustomer.selectByVisibleText("EmpCust");
            genericUtil.pause(1000);
            genericUtil.click(customer);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(ticketType);
            genericUtil.click(ticketType);
            Select selectTicketType = new Select(ticketType);
            selectTicketType.selectByVisibleText("Returns");
            genericUtil.pause(1000);
            genericUtil.click(ticketType);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(description);
            genericUtil.writeTextWithPause(description, "Test Description", 1000);
            genericUtil.pause(2000);

            HighlightElement.highlightElement(labelOwner);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(state);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(priority);
            genericUtil.click(priority);
            genericUtil.pause(1000);
            Select selectPriority = new Select(priority);
            selectPriority.selectByVisibleText("Low");
            genericUtil.pause(2000);

            HighlightElement.highlightElement(tag);
            genericUtil.writeTextWithPause(tag, "#New#Created#Open#", 2000);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(buttonSubmit);
            genericUtil.clickWithPause(buttonSubmit, 2000);

            HighlightElement.highlightElement(optionConfirmYesTicket);
            genericUtil.clickWithPause(optionConfirmYesTicket, 3000);

        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
