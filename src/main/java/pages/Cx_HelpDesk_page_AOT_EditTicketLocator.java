package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cx_HelpDesk_page_AOT_EditTicketLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    @FindBy(xpath = "//span[contains(text(),'Edit Ticket') and @class='title']")
    public WebElement TitleEditTicket;

    @FindBy(xpath = "//li[@id='actiononticket']")
    public WebElement sidebar_textActiononTicket;

    @FindBy(xpath = "(//a[@class='collapse btn btn-circle btn-icon-only btn-default'])[1]")
    public WebElement SatCollapse;

    @FindBy(xpath = "(//a[@class='btn btn-circle btn-icon-only btn-default fullscreen'])[1]")
    public WebElement SatFullScreen;

    public Cx_HelpDesk_page_AOT_EditTicketLocator(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * TESTCASE METHOD: Assign Ticket
     *
     */
    public void EditTicket() {
        try {
            genericUtil = new GenericUtil();
            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebar_textActiononTicket));
            HighlightElement.highlightElement(sidebar_textActiononTicket);
            sidebar_textActiononTicket.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(TitleEditTicket);
            genericUtil.clickWithPause(TitleEditTicket,1000);

//            HighlightElement.highlightElement(SatCollapse);
//            genericUtil.pause(1000);



        }
        catch (Exception ex){
            ex.getStackTrace();
        }
    }
}
