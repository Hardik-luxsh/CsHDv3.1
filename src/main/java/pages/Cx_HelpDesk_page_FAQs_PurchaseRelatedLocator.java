package pages;

import TestUtil.GenericUtil;
import TestUtil.HighlightElement;
import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Cx_HelpDesk_page_FAQs_PurchaseRelatedLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_FAQs_PurchaseRelatedLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),\"FAQ's\") and @class='title']")
    public WebElement sidebarFaqs;

    @FindBy(xpath = "//h1[contains(text(),'FAQs')]")
    public WebElement titleFaq;

    /********************** Purchase Related **************************/

    @FindBy(xpath = "//span[contains(text(),'Purchase Related') and @class='title']")
    public WebElement sidebarPurchaseRelatedFaq;

    @FindBy(xpath = "//span[contains(text(),'Purchase Related') and @class='title']")
    public WebElement titlePurchaseRelated;

    @FindBy(xpath = "//span[@class=\"caption-subject font-dark bold uppercase\"]")
    public WebElement sectionHeadingPurchaseRelated;

    @FindBy(xpath = "//p[contains(text(),'How do I return an item?')]")
    public WebElement PRqueFAQ1;

    @FindBy(xpath = "//p[contains(text(),' Please contact customer services within 48hrs from the time you receive the delivery, on 08000193839 opt 5 between 8.30 am and 6.30 pm, Monday to Friday or write to them on ')]")
    public WebElement PRansFAQ1;

    @FindBy(xpath = "//p[contains(text(),' Please contact customer services within 48hrs from the time you receive the delivery, on 08000193839 opt 5 between 8.30 am and 6.30 pm, Monday to Friday or write to them on ')]//..//a[@href='https://bnsgroup.co.uk/']")
    public WebElement PRNavToWebsiteAnsFAQ1;

    @FindBy(xpath = "//p[contains(text(),'How do I report a shortage from my delivery?')]")
    public WebElement PRqueFAQ2;

    @FindBy(xpath = "//p[contains(text(),' Please contact customer services within 48hrs from the time you receive the delivery, on 08000193839 between 8.30 am and 6.30 pm Monday to Friday or write to them on')]")
    public WebElement PRansFAQ2;

    @FindBy(xpath = "//p[contains(text(),'How can I track the delivery of the orders placed?')]")
    public WebElement PRqueFAQ3;

    @FindBy(xpath = "//p[contains(text(),' Please contact customer services on 08000193839 opt.5 between 8.30 am and 6.30 pm Monday to Friday or write to them on ')]")
    public WebElement PRansFAQ3;

    @FindBy(xpath = "//p[contains(text(),'Do you offer delivery on Saturday?')]")
    public WebElement PRqueFAQ4;

    @FindBy(xpath = "//p[contains(text(),' Yes, we offer a Saturday delivery however if you are on a courier route, delivery would be made between 9 am and 5 pm.')]")
    public WebElement PRansFAQ4;

    @FindBy(xpath = "//p[contains(text(),'If I place an order on Saturday, when will I receive the delivery?')]")
    public WebElement PRqueFAQ5;

    @FindBy(xpath = "//p[contains(text(),'Orders placed after cut off (7 PM) time on Friday and during the weekend get picked and packed on Monday and delivered on Tuesday')]")
    public WebElement PRansFAQ5;

    @FindBy(xpath = "//p[contains(text(),'How do I check status on credits that are expected?')]")
    public WebElement PRqueFAQ6;

    @FindBy(xpath = "//p[contains(text(),'Please contact customer services on 0800 019 3839 between 8.30 am to 6.30 pm Monday to Friday or write to them on')]")
    public WebElement PRansFAQ6;

    @FindBy(xpath = "//p[contains(text(),'How should I report a quality issue to yourselves?')]")
    public WebElement PRqueFAQ7;

    @FindBy(xpath = "//p[contains(text(),'Please send customer services an email on')]")
    public WebElement PRansFAQ7;

    @FindBy(xpath = "//p[contains(text(),'Where should I raise a complaint about any of the following?')]")
    public WebElement PRqueFAQ8;

    @FindBy(xpath = "//ul//li[contains(text(),'Delivery Timing Issue.')]/..")
    public WebElement PRansFAQ8;

    @FindBy(xpath = "//p[contains(text(),'How do I open an account with you?')]")
    public WebElement PRqueFAQ9;

    @FindBy(xpath = "//p[contains(text(),'Send us the complete account application, you can download the account application form at below link or call at our free phone line (0800) 019 3839 (opt. 6) to speak with the credit control team. ')]")
    public WebElement PRansFAQ9;

    @FindBy(xpath = "//p[contains(text(),'I have sent an account opening form already, how soon can I start placing orders?')]")
    public WebElement PRqueFAQ10;

    @FindBy(xpath = "//p[contains(text(),'We will inform you by sending a welcome email once the account is ready for placing orders. Or to know your current application status, feel free to contact at our free phone line (0800) 019 3839 (opt. 6) to speak with credit control team')]")
    public WebElement PRansFAQ10;

    @FindBy(xpath = "//p[contains(text(),'How can I get a copy of my statement, credit notes and invoices online?')]")
    public WebElement PRqueFAQ11;

    @FindBy(xpath = "//p[contains(text(),'You can log in to the online portal to extract statements, credit notes and invoices.')]")
    public WebElement PRansFAQ11;

    /**
     * TESTCASE METHOD: verifyFAQsPRDetails
     */
    public void verifyFAQsPRDetails(){
        try {
            genericUtil = new GenericUtil();
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;
//            genericUtil.pause(3000);

            wait.until(ExpectedConditions.visibilityOf(sidebarFaqs));
            HighlightElement.highlightElement(sidebarFaqs);
            sidebarFaqs.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(sidebarPurchaseRelatedFaq);
            genericUtil.clickWithPause(sidebarPurchaseRelatedFaq, 1000);

            HighlightElement.highlightElement(titleFaq);
            genericUtil.clickWithPause(titleFaq, 1000);

            HighlightElement.highlightElement(titlePurchaseRelated);
            genericUtil.clickWithPause(titlePurchaseRelated, 1000);

            HighlightElement.highlightElement(sectionHeadingPurchaseRelated);
            genericUtil.clickWithPause(sectionHeadingPurchaseRelated, 1000);

            HighlightElement.highlightElement(PRqueFAQ1);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ1);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRNavToWebsiteAnsFAQ1);
            genericUtil.pause(1000);
            genericUtil.clickWithPause(PRNavToWebsiteAnsFAQ1,1000);

            //------Close TAB key ------------
//            Robot r = new Robot();
//            r.keyPress(KeyEvent.VK_CONTROL);
//            r.keyPress(KeyEvent.VK_T);
//            r.keyRelease(KeyEvent.VK_CONTROL);
//            r.keyRelease(KeyEvent.VK_T);
//            genericUtil.pause(2000);
//            Actions actionObj = new Actions(driver);
//            actionObj.keyDown(Keys.LEFT_CONTROL).sendKeys(Keys.NUMPAD1).build().perform();
//            driver.switchTo().defaultContent();

            genericUtil.pause(2000);
            driver.switchTo().window(driver.getWindowHandle());

//            genericUtil.switchToTab(titleFaq,driver,"1");
//            titleFaq.sendKeys(Keys.LEFT_CONTROL + "1");
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ2);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ2);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ3);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ3);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ4);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ4);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ5);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ5);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ6);
            genericUtil.pause(1000);

            jsDown.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(1000);

            HighlightElement.highlightElement(PRansFAQ6);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ7);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ7);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ8);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ8);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ9);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ9);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ10);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ10);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRqueFAQ11);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(PRansFAQ11);
            genericUtil.pause(1000);

            jsUp.executeScript("window.scrollBy(0,-1000)");
            Thread.sleep(1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}