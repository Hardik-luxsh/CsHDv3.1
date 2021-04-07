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

public class Cx_HelpDesk_page_FAQs_CreditControlRelatedLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_FAQs_CreditControlRelatedLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//span[contains(text(),\"FAQ's\") and @class='title']")
    public WebElement sidebarFaqs;

    @FindBy(xpath = "//h1[contains(text(),'FAQs')]")
    public WebElement titleFaq;

    /**********************  Credit Control Related  **************************/

    @FindBy(xpath = "//span[contains(text(),'Credit Control Related') and @class='title']")
    public WebElement sidebarCreditControlRelatedFaq;

    @FindBy(xpath = "//span[contains(text(),'Credit Control Related') and @class='title']")
    public WebElement titleCreditControlRelated;

    @FindBy(xpath = "//span[@class=\"caption-subject font-dark bold uppercase\"]")
    public WebElement sectionHeadingCreditControlRelated;

    @FindBy(xpath = "//p[contains(text(),'How do I check OTC offers and how to download it in an excel file?')]")
    public WebElement CRQueFAQ1;

    @FindBy(xpath = "//p[contains(text(),'How do I check OTC offers and how to download it in an excel file?')]//..//ul")
    public WebElement CRAnsFAQ1;

    @FindBy(xpath = "//p[contains(text(),'How can I order special and special obtains from the website?')]")
    public WebElement CRQueFAQ2;

    @FindBy(xpath = "//p[contains(text(),'How can I order special and special obtains from the website?')]//..//ul")
    public WebElement CRAnsFAQ2;

    @FindBy(xpath = "//p[contains(text(),'How can I see my requested prices in BD - Tool?')]")
    public WebElement CRQueFAQ3;

    @FindBy(xpath = "//p[contains(text(),'On your right-hand side of the website, there is an Exclusive order tab, Besides it, there is a thumbs-up sign Click on the thumbs-up sign and there you will see your requested prices.")
    public WebElement CRAnsFAQ3;

    @FindBy(xpath = "//p[contains(text(),'How do I see my previous orders?')]")
    public WebElement CRQueFAQ4;

    @FindBy(xpath = "//p[contains(text(),'How do I see my previous orders?')]//..//ul")
    public WebElement CRAnsFAQ4;

    @FindBy(xpath = "//p[contains(text(),'I have forgotten my password, how do I log in to the website.?')]")
    public WebElement CRQueFAQ5;

    @FindBy(xpath = "//p[contains(text(),' Enter your registered email address in a user name, wait for few seconds and you will receive a temporary password on your registered email id, then you will be able to reset your password.')]")
    public WebElement CRAnsFAQ5;

    @FindBy(xpath = "//p[contains(text(),'Can you please help me to select all the candesartan range in one go?')]")
    public WebElement CRQueFAQ6;

    @FindBy(xpath = "//p[contains(text(),'Can you please help me to select all the candesartan range in one go?')]//..//ul")
    public WebElement CRAnsFAQ6;

    @FindBy(xpath = "//p[contains(text(),'I have 3 different accounts with same login ID and password, How can I differentiate between orders from the same system?')]")
    public WebElement CRQueFAQ7;

    @FindBy(xpath = "//p[contains(text(),'I have 3 different accounts with same login ID and password, How can I differentiate between orders from the same system?')]//..//ul")
    public WebElement CRAnsFAQ7;

    /**
     * TESTCASE METHOD: verifyFAQsCreditControlRelatedDetails
     */
    public void verifyFAQsCreditControlRelatedDetails(){
        try {

            genericUtil = new GenericUtil();
            JavascriptExecutor jsDown = (JavascriptExecutor) driver;
            JavascriptExecutor jsUp = (JavascriptExecutor) driver;

            wait.until(ExpectedConditions.visibilityOf(sidebarFaqs));
            HighlightElement.highlightElement(sidebarFaqs);
            sidebarFaqs.click();
            genericUtil.pause(1000);

            HighlightElement.highlightElement(sidebarCreditControlRelatedFaq);
            genericUtil.clickWithPause(sidebarCreditControlRelatedFaq, 1000);

            HighlightElement.highlightElement(titleFaq);
            genericUtil.clickWithPause(titleFaq, 1000);

            HighlightElement.highlightElement(titleCreditControlRelated);
            genericUtil.clickWithPause(titleCreditControlRelated, 1000);

            HighlightElement.highlightElement(sectionHeadingCreditControlRelated);
            genericUtil.clickWithPause(sectionHeadingCreditControlRelated, 1000);

            HighlightElement.highlightElement(CRQueFAQ1);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ1);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRQueFAQ2);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ2);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRQueFAQ3);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ3);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRQueFAQ4);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ4);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRQueFAQ5);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ5);
            genericUtil.pause(1000);

            jsDown.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(1000);

            HighlightElement.highlightElement(CRQueFAQ6);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ6);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRQueFAQ7);
            genericUtil.pause(1000);

            HighlightElement.highlightElement(CRAnsFAQ7);
            genericUtil.pause(1000);

            jsUp.executeScript("window.scrollBy(0,-1000)");
            Thread.sleep(1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
