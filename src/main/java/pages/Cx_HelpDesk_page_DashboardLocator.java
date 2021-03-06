package pages;

import TestUtil.*;
import base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

public class Cx_HelpDesk_page_DashboardLocator extends TestBase {

    public static WebDriverWait wait;
    public static GenericUtil genericUtil;

    public Cx_HelpDesk_page_DashboardLocator(WebDriver driver){
        TestBase.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 40);
    }

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Dashboard']")
    public WebElement sidebar_textDashboard;

    @FindBy(xpath = "//h1[normalize-space()='Luxsh Customer Services Help Desk']")
    public WebElement titleCsHD;

    @FindBy(xpath = "//span[@class='caption-subject bold font-dark uppercase']")
    public WebElement titleDashboard;

    /************************************************** Daily Report Tile or Section **************************************************/
    @FindBy(xpath = "//small[contains(text(),'Daily Report')]")
    public WebElement sectionTextDailyReport;

    @FindBy(xpath = "//h4[normalize-space()='Daily Report']")
    public WebElement headerTitleDailyReport;

    @FindBy(xpath = "//input[@formcontrolname='SelectStartdateDailyReport']")
    public WebElement FromDate; //V3.1

    @FindBy(xpath = "//input[@formcontrolname='SelectEnddateDailyReport']")
    public WebElement ToDate; //V3.1

    @FindBy(xpath = "//input[@value='Genrate Report']")
    public WebElement ButtonGenerateReport;

    @FindBy(xpath = "//input[@id='Check-Return']")
    public WebElement checkboxReturn;

    @FindBy(xpath = "//input[@id='Check-Missing']")
    public WebElement checkboxMissing;

    @FindBy(xpath = "//input[@id='Check-Issue']")
    public WebElement checkboxIssue;

    @FindBy(xpath = "//input[@id='Check-Other']")
    public WebElement checkboxOther;

    @FindBy(xpath = "//input[@id='Check-Complaints']")
    public WebElement checkboxComplaints;

    @FindBy(xpath = "//p[contains(text(),'Loading...')]")
    public WebElement loading;

    @FindBy(xpath = "//button[normalize-space()='Download CSV']")
    public WebElement DR_ButtonDownloadCSV;

    @FindBy(xpath = "//button[normalize-space()='Download CSV']/..//button[contains(text(),'Close')]")
    public WebElement DR_ButtonClose;
    /*--------------------------------------------------------------------------------------------------------------------------------*/

    /************************************************** List Of Escalated Tickets Tile or Section *************************************/
    @FindBy(xpath = "//small[contains(text(),'List of Escalated Tickets')]")
    public WebElement sectionTextListOfEscalatedTickets;

    @FindBy(xpath = "//h4[normalize-space()='List of Escalated Tickets']")
    public WebElement headerTitleListOfEscalatedTickets;

    @FindBy(xpath = "//h4[normalize-space()='List of Escalated Tickets']/../..//input[@placeholder='Display Agent Name']")
    public WebElement LOE_AgentName;

    @FindBy(xpath = "//input[@value='Download Csv']")
    public WebElement LOE_ButtonDownloadCSV;

    @FindBy(xpath = "//input[@value='Download Csv']/..//button[contains(text(),'Close')]")
    public WebElement LOE_ButtonClose;
    /*--------------------------------------------------------------------------------------------------------------------------------*/

    /************************************************** Channels Of Distribution Tile or Section **************************************/
    @FindBy(xpath = "//small[contains(text(),'Channels of Distribution')]")
    public WebElement sectionTextChannelsOfDistribution;

    @FindBy(xpath = "//h4[normalize-space()='Channels of Distribution']")
    public WebElement headerTitleChannelsOfDistribution;

    @FindBy(xpath = "//input[@formcontrolname='SelectStartdate']")
    public WebElement COD_FromDate;

    @FindBy(xpath = "//input[@formcontrolname='SelectEnddate']")
    public WebElement COD_ToDate;

    @FindBy(xpath = "//select[@id='drpAgent']")
    public WebElement COD_Agent;

    @FindBy(xpath = "//select[@id='drptickettype']")
    public WebElement COD_TicketType;

    @FindBy(xpath = "//select[@id='drpsite']")
    public WebElement COD_Site;

    @FindBy(xpath = "//input[@formcontrolname='AccountNo']")
    public WebElement COD_AccountNo;

    @FindBy(xpath = "//strong[normalize-space()='S1032']") //Changes in v3.1 on 27-May-2021
    public WebElement COD_AccountNo_S1032;

    @FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
    public WebElement COD_CustomerName;

    @FindBy(xpath = "//input[@placeholder='Display Total Count']")
    public WebElement COD_TotalCount;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement COD_ButtonSearch;

    @FindBy(xpath = "//input[@value='Clear']")
    public WebElement COD_buttonClear;

    @FindBy(xpath = "//div[@id='ChannelsDistribution']//button[@type='button']")
    public WebElement COD_buttonClose;
    /*--------------------------------------------------------------------------------------------------------------------------------*/

    /************************************************** My Tickets Tile or Section ***************************************************/
    @FindBy(xpath = "//small[contains(text(),'My Tickets')]")
    public WebElement sectionTextMyTickets;

    @FindBy(xpath = "//h4[normalize-space()='Tickets Assigned To Me']")
    public WebElement headerTitleTicketAssignedToMe;

    @FindBy(xpath = "//div[@id='TicketsAssigned']//input[@placeholder='Display Agent Name']")
    public WebElement MT_Agent;

    @FindBy(xpath = "//div[@class='col-md-6']//input[@placeholder='Display Ticket Count']")
    public WebElement MT_TicketCount;

    @FindBy(xpath = "//table[@id=\"sample_62\"]")
    public WebElement MT_Table;

    @FindBy(xpath = "//div[@id='TicketsAssigned']//input[@type='search']")
    public WebElement MT_Search;

    @FindBy(xpath = "//div[@id='TicketsAssigned']//input[@value='Close']")
    public WebElement MT_Close;
    /*--------------------------------------------------------------------------------------------------------------------------------*/

    /************************************************** Ticket Performance Tile or Section ********************************************/
    @FindBy(xpath = "//small[contains(text(),'Tickets Performance')]")
    public WebElement sectionTextTicketsPerformance;

    @FindBy(xpath = "//h4[normalize-space()='Ticket Performance']")
    public WebElement headerTitleTicketPerformance;

    @FindBy(xpath = "//span[contains(text(),'Agent Name: ')]")
    public WebElement TP_Agent;

    @FindBy(xpath = "//div[@id='TicketPerformance']//button[@type='button']")
    public WebElement TP_Close;
    /*--------------------------------------------------------------------------------------------------------------------------------*/

    /************************************************** Ticket Reopening Rate Tile or Section ******************************************/
    @FindBy(xpath = "//small[contains(text(),'Ticket Reopening Rate')]")
    public WebElement sectionTextTicketReopeningRate;

    @FindBy(xpath = "//h4[normalize-space()='Ticket Reopening Rate']")
    public WebElement headerTitleTicketReopeningRate;

    @FindBy(xpath = "//tr[@class='ng-star-inserted']//th[@class='text-center'][normalize-space()='Ticket Type']")
    public WebElement TRP_TicketType;

    @FindBy(xpath = "//th[@class='text-center'][normalize-space()='Ticket Priority']")
    public WebElement TRP_TicketPriority;

    @FindBy(xpath = "//th[normalize-space()='Low']")
    public WebElement TRP_TicketPriority_Low;

    @FindBy(xpath = "//th[normalize-space()='Medium']")
    public WebElement TRP_TicketPriority_Medium;

    @FindBy(xpath = "//th[normalize-space()='High']")
    public WebElement TRP_TicketPriority_High;

    @FindBy(xpath = "//td[normalize-space()='Complaints']")
    public WebElement TRP_TicketType_Complaints;

    @FindBy(xpath = "//td[normalize-space()='Returns']")
    public WebElement TRP_TicketType_Returns;

    @FindBy(xpath = "//td[normalize-space()='Missings']")
    public WebElement TRP_TicketType_Missings;

    @FindBy(xpath = "//td[normalize-space()='Other']")
    public WebElement TRP_TicketType_Other;

    @FindBy(xpath = "//td[normalize-space()='Delivery Issue']")
    public WebElement TRP_TicketType_DeliveryIssue;

    @FindBy(xpath = "//div[@id='TicketReopening']//button[@type='button']")
    public WebElement TRP_Close;
    /*--------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * TESTCASE METHOD: Daily Report Tile
     * @param strFromDate
     * @param strToDate
     */
    public void dailyReport(String strFromDate,String strToDate){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textDashboard));
            HighlightElement.highlightElement(sidebar_textDashboard);
            genericUtil.clickWithPause(sidebar_textDashboard, 2000);
            Assert.assertEquals(driver.getCurrentUrl(),Constants.BASEURL + "dashboard");

            HighlightElement.highlightElement(titleCsHD);
            genericUtil.clickWithPause(titleCsHD, 1000);

            HighlightElement.highlightElement(titleDashboard);
            genericUtil.clickWithPause(titleDashboard, 1000);

            HighlightElement.highlightElement(sectionTextDailyReport);
            genericUtil.clickWithPause(sectionTextDailyReport, 1000);

            HighlightElement.highlightElement(headerTitleDailyReport);
            genericUtil.clickWithPause(headerTitleDailyReport, 1000);

            HighlightElement.highlightElement(FromDate);
            genericUtil.writeTextWithPause(FromDate,strFromDate,1000); //V3.1

            HighlightElement.highlightElement(ToDate);
            genericUtil.writeTextWithPause(ToDate,strToDate,1000); //V3.1

            /************************************************************************************************************/

            HighlightElement.highlightElement(checkboxReturn);
            genericUtil.clickWithPause(checkboxReturn, 1000);

            HighlightElement.highlightElement(ButtonGenerateReport);
            genericUtil.clickWithPause(ButtonGenerateReport, 1000);

            HighlightElement.highlightElement(DR_ButtonDownloadCSV);
            genericUtil.clickWithPause(DR_ButtonDownloadCSV, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            /************************************************************************************************************/
            HighlightElement.highlightElement(checkboxMissing);
            genericUtil.clickWithPause(checkboxMissing, 1000);

            HighlightElement.highlightElement(ButtonGenerateReport);
            genericUtil.clickWithPause(ButtonGenerateReport, 1000);

            HighlightElement.highlightElement(DR_ButtonDownloadCSV);
            genericUtil.clickWithPause(DR_ButtonDownloadCSV, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            /************************************************************************************************************/
            HighlightElement.highlightElement(checkboxComplaints);
            genericUtil.clickWithPause(checkboxComplaints, 1000);

            HighlightElement.highlightElement(ButtonGenerateReport);
            genericUtil.clickWithPause(ButtonGenerateReport, 1000);

            HighlightElement.highlightElement(DR_ButtonDownloadCSV);
            genericUtil.clickWithPause(DR_ButtonDownloadCSV, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            /************************************************************************************************************/
            HighlightElement.highlightElement(checkboxIssue);
            genericUtil.clickWithPause(checkboxIssue, 1000);

            HighlightElement.highlightElement(ButtonGenerateReport);
            genericUtil.clickWithPause(ButtonGenerateReport, 1000);

            HighlightElement.highlightElement(DR_ButtonDownloadCSV);
            genericUtil.clickWithPause(DR_ButtonDownloadCSV, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            /************************************************************************************************************/
            HighlightElement.highlightElement(checkboxOther);
            genericUtil.clickWithPause(checkboxOther,1000);

            HighlightElement.highlightElement(ButtonGenerateReport);
            genericUtil.clickWithPause(ButtonGenerateReport, 1000);

            HighlightElement.highlightElement(DR_ButtonDownloadCSV);
            genericUtil.clickWithPause(DR_ButtonDownloadCSV, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            /************************************************************************************************************/

            HighlightElement.highlightElement(DR_ButtonClose);
            genericUtil.clickWithPause(DR_ButtonClose, 1000);

            /**********************************************************************************************************/
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: List Of Escalated Tickets Tile
     */
    public void listOfEscalatedTickets(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textDashboard));
            HighlightElement.highlightElement(sidebar_textDashboard);
            genericUtil.clickWithPause(sidebar_textDashboard, 2000);
            Assert.assertEquals(driver.getCurrentUrl(),Constants.BASEURL + "dashboard");

            HighlightElement.highlightElement(titleCsHD);
            genericUtil.clickWithPause(titleCsHD, 1000);

            HighlightElement.highlightElement(titleDashboard);
            genericUtil.clickWithPause(titleDashboard, 1000);

            HighlightElement.highlightElement(sectionTextListOfEscalatedTickets);
            genericUtil.clickWithPause(sectionTextListOfEscalatedTickets, 1000);

            HighlightElement.highlightElement(headerTitleListOfEscalatedTickets);
            genericUtil.clickWithPause(headerTitleListOfEscalatedTickets, 1000);

//            HighlightElement.highlightElement(loading);
//            wait.until(ExpectedConditions.invisibilityOf(loading));
            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            HighlightElement.highlightElement(LOE_AgentName);
            genericUtil.clickWithPause(LOE_AgentName, 1000);

            HighlightElement.highlightElement(LOE_ButtonDownloadCSV);
            genericUtil.clickWithPause(LOE_ButtonDownloadCSV, 1000);

            HighlightElement.highlightElement(LOE_ButtonClose);
            genericUtil.clickWithPause(LOE_ButtonClose, 1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: Channels Of Distribution Tile
     */
    public void channelsOfDistribution(String strFromDate,String strToDate){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textDashboard));
            HighlightElement.highlightElement(sidebar_textDashboard);
            genericUtil.clickWithPause(sidebar_textDashboard, 2000);
            Assert.assertEquals(driver.getCurrentUrl(),Constants.BASEURL + "dashboard");

            HighlightElement.highlightElement(titleCsHD);
            genericUtil.clickWithPause(titleCsHD, 1000);

            HighlightElement.highlightElement(titleDashboard);
            genericUtil.clickWithPause(titleDashboard, 1000);

            HighlightElement.highlightElement(sectionTextChannelsOfDistribution);
            genericUtil.clickWithPause(sectionTextChannelsOfDistribution, 1000);

            HighlightElement.highlightElement(headerTitleChannelsOfDistribution);
            genericUtil.clickWithPause(headerTitleChannelsOfDistribution, 1000);

            HighlightElement.highlightElement(COD_FromDate);
            genericUtil.writeTextWithPause(COD_FromDate,strFromDate,1000);

            HighlightElement.highlightElement(COD_ToDate);
            genericUtil.writeTextWithPause(COD_ToDate,strToDate,1000);

            HighlightElement.highlightElement(COD_Agent);
            genericUtil.clickWithPause(COD_Agent, 1000);
            Select selectAgent = new Select(COD_Agent);
            selectAgent.selectByVisibleText("HP Agent");
            genericUtil.pause(1000);
            genericUtil.clickWithPause(COD_Agent, 1000);

            HighlightElement.highlightElement(COD_TicketType);
            genericUtil.clickWithPause(COD_TicketType, 1000);
            Select selectTicketType = new Select(COD_TicketType);
            selectTicketType.selectByVisibleText("Returns");
            genericUtil.pause(1000);
            genericUtil.clickWithPause(COD_TicketType, 1000);

            HighlightElement.highlightElement(COD_Site);
            genericUtil.clickWithPause(COD_Site, 1000);
            Select selectSite = new Select(COD_Site);
            selectSite.selectByVisibleText("HP Tech");
            genericUtil.pause(1000);
            genericUtil.clickWithPause(COD_Site, 1000);

            HighlightElement.highlightElement(COD_AccountNo);
            genericUtil.writeTextWithPause(COD_AccountNo,"S1032",1000);

            HighlightElement.highlightElement(COD_AccountNo_S1032);
            genericUtil.clickWithPause(COD_AccountNo_S1032,1000);

            HighlightElement.highlightElement(COD_CustomerName);
            genericUtil.clickWithPause(COD_CustomerName,1000);

            HighlightElement.highlightElement(COD_TotalCount);
            genericUtil.clickWithPause(COD_TotalCount,1000);

            HighlightElement.highlightElement(COD_ButtonSearch);
            genericUtil.clickWithPause(COD_ButtonSearch,1000);

            HighlightElement.highlightElement(COD_buttonClear);
            genericUtil.clickWithPause(COD_buttonClear,1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: My Tickets Tile
     */
    public void ticketAssignedToMe(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textDashboard));
            HighlightElement.highlightElement(sidebar_textDashboard);
            genericUtil.clickWithPause(sidebar_textDashboard, 2000);
            Assert.assertEquals(driver.getCurrentUrl(),Constants.BASEURL + "dashboard");

            HighlightElement.highlightElement(titleCsHD);
            genericUtil.clickWithPause(titleCsHD, 1000);

            HighlightElement.highlightElement(titleDashboard);
            genericUtil.clickWithPause(titleDashboard, 1000);

            HighlightElement.highlightElement(sectionTextMyTickets);
            genericUtil.clickWithPause(sectionTextMyTickets, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            HighlightElement.highlightElement(headerTitleTicketAssignedToMe);
            genericUtil.clickWithPause(headerTitleTicketAssignedToMe, 1000);

            HighlightElement.highlightElement(MT_Agent);
            genericUtil.clickWithPause(MT_Agent,1000);

            HighlightElement.highlightElement(MT_Table);
            genericUtil.clickWithPause(MT_Table,1000);

            HighlightElement.highlightElement(MT_Search);
            genericUtil.writeTextWithPause(MT_Search,"HP Agent",1000);

            HighlightElement.highlightElement(MT_TicketCount);
            genericUtil.clickWithPause(MT_TicketCount,1000);

            HighlightElement.highlightElement(MT_Close);
            genericUtil.clickWithPause(MT_Close,1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * TESTCASE METHOD: Tickets Performance Tile
     */
    public void ticketPerformance(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textDashboard));
            HighlightElement.highlightElement(sidebar_textDashboard);
            genericUtil.clickWithPause(sidebar_textDashboard, 2000);
            Assert.assertEquals(driver.getCurrentUrl(),Constants.BASEURL + "dashboard");

            HighlightElement.highlightElement(titleCsHD);
            genericUtil.clickWithPause(titleCsHD, 1000);

            HighlightElement.highlightElement(titleDashboard);
            genericUtil.clickWithPause(titleDashboard, 1000);

            HighlightElement.highlightElement(sectionTextTicketsPerformance);
            genericUtil.clickWithPause(sectionTextTicketsPerformance, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            HighlightElement.highlightElement(headerTitleTicketPerformance);
            genericUtil.clickWithPause(headerTitleTicketPerformance, 1000);

            HighlightElement.highlightElement(TP_Agent);
            genericUtil.clickWithPause(TP_Agent,1000);

            HighlightElement.highlightElement(TP_Close);
            genericUtil.clickWithPause(TP_Close,1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    /**
     * TESTCASE METHOD: Ticket Reopening Rate Tile
     */
    public void ticketReopeningRate(){
        genericUtil = new GenericUtil();
        try {
            wait.until(ExpectedConditions.visibilityOf(sidebar_textDashboard));
            HighlightElement.highlightElement(sidebar_textDashboard);
            genericUtil.clickWithPause(sidebar_textDashboard, 2000);
            Assert.assertEquals(driver.getCurrentUrl(),Constants.BASEURL + "dashboard");

            HighlightElement.highlightElement(titleCsHD);
            genericUtil.clickWithPause(titleCsHD, 1000);

            HighlightElement.highlightElement(titleDashboard);
            genericUtil.clickWithPause(titleDashboard, 1000);

            HighlightElement.highlightElement(sectionTextTicketReopeningRate);
            genericUtil.clickWithPause(sectionTextTicketReopeningRate, 1000);

            try {
                HighlightElement.highlightElement(loading);
                if(loading.isDisplayed()) {
                    wait.until(ExpectedConditions.visibilityOf(loading));
                }
            }
            catch (NoSuchElementException ex){
                ex.getStackTrace();
            }

            HighlightElement.highlightElement(headerTitleTicketReopeningRate);
            genericUtil.clickWithPause(headerTitleTicketReopeningRate, 1000);

            HighlightElement.highlightElement(TRP_TicketType);
            genericUtil.clickWithPause(TRP_TicketType,1000);

            HighlightElement.highlightElement(TRP_TicketPriority);
            genericUtil.clickWithPause(TRP_TicketPriority,1000);

            HighlightElement.highlightElement(TRP_TicketPriority_Low);
            genericUtil.clickWithPause(TRP_TicketPriority_Low, 1000);

            HighlightElement.highlightElement(TRP_TicketPriority_Medium);
            genericUtil.clickWithPause(TRP_TicketPriority_Medium, 1000);

            HighlightElement.highlightElement(TRP_TicketPriority_High);
            genericUtil.clickWithPause(TRP_TicketPriority_High, 1000);

            HighlightElement.highlightElement(TRP_TicketType_Complaints);
            genericUtil.clickWithPause(TRP_TicketType_Complaints, 1000);

            HighlightElement.highlightElement(TRP_TicketType_DeliveryIssue);
            genericUtil.clickWithPause(TRP_TicketType_DeliveryIssue, 1000);

            HighlightElement.highlightElement(TRP_TicketType_Missings);
            genericUtil.clickWithPause(TRP_TicketType_Missings, 1000);

            HighlightElement.highlightElement(TRP_TicketType_Other);
            genericUtil.clickWithPause(TRP_TicketType_Other, 1000);

            HighlightElement.highlightElement(TRP_TicketType_Returns);
            genericUtil.clickWithPause(TRP_TicketType_Returns, 1000);

            HighlightElement.highlightElement(TRP_Close);
            genericUtil.clickWithPause(TRP_Close,1000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
