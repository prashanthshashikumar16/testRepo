package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonUtils.Browser;
import commonUtils.Extensions;

public class TopNavigation 
{
	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']") private WebElement Home;
	@FindBy(xpath = "//a[text()='Calendar']") private WebElement Calendar;
	@FindBy(xpath = "(//a[text()='Leads'])[1]") private WebElement Leads;
	@FindBy(xpath = "//a[text()='Organizations']") private WebElement Organizations;
	@FindBy(xpath = "//a[text()='Contacts']") private WebElement Contacts;
	@FindBy(xpath = "//a[text()='Opportunities']") private WebElement Opportunities;
	@FindBy(xpath = "//a[text()='Products']") private WebElement Products;
	@FindBy(xpath = "//a[text()='Documents']") private WebElement Documents;
	@FindBy(xpath = "//a[text()='Email']") private WebElement Email;
	@FindBy(xpath = "//a[text()='Trouble Tickets']") private WebElement TroubleTickets;
	@FindBy(xpath = "//input[@class = 'searchBox']") private WebElement SearchQuery;
	@FindBy(xpath = "//a[text() = 'Dashboard']") private WebElement Dashboard;	
	@FindBy(xpath = "//img[@src = 'themes/images/arrow_down_black.png']") private WebElement SelectDrpdwnArrow;
	@FindBy(xpath = "//input[@class='searchBtn']") private WebElement SearchBtn;
	@FindBy(xpath = "//a[ text()='Select All']") private WebElement SelectAll;
	@FindBy(xpath = "//a[ text()='UnSelect All']") private WebElement UnSelectAll;
	@FindBy(xpath = "(//img[@src = 'themes/images/close.gif'])[2]") private WebElement CloseSearch;
	@FindBy(xpath = "//input[@value = 'Accounts']") private WebElement OrganisationChkbx;
	@FindBy(xpath = "//input[@value = 'Campaigns']") private WebElement CampaignsChkbx;
	@FindBy(xpath = "//input[@value = 'Emails']") private WebElement EmailsChkbx;
	@FindBy(xpath = "//input[@value = 'Invoice']") private WebElement InvoiceChkbx;
	@FindBy(xpath = "//input[@value = 'PBXManager']") private WebElement PBXManagerChkbx;
	@FindBy(xpath = "//input[@value = 'Products']") private WebElement ProductsChkbx;
	@FindBy(xpath = "//input[@value = 'ProjectTask']") private WebElement ProjectTaskChkbx;
	@FindBy(xpath = "//input[@value = 'SMSNotifier']") private WebElement SMSNotifierChkbx;
	@FindBy(xpath = "//input[@value = 'Services']") private WebElement ServicesChkbx;
	@FindBy(xpath = "//input[@value = 'Assets']") private WebElement AssetsChkbx;
	@FindBy(xpath = "//input[@value = 'Contacts']") private WebElement ContactsChkbx;
	@FindBy(xpath = "//input[@value = 'Faq']") private WebElement FaqChkbx;
	@FindBy(xpath = "//input[@value = 'Leads']") private WebElement LeadsChkbx;
	@FindBy(xpath = "//input[@value = 'Potentials']") private WebElement OpportunitiesChkbx;
	@FindBy(xpath = "//input[@value = 'Project']") private WebElement ProjectChkbx;
	@FindBy(xpath = "//input[@value = 'PurchaseOrder']") private WebElement PurchaseOrderChkbx;
	@FindBy(xpath = "//input[@value = 'SalesOrder']") private WebElement SalesOrderChkbx;
	@FindBy(xpath = "//input[@value = 'Vendors']") private WebElement VendorsChkbx;
	@FindBy(xpath = "//input[@value = 'Calendar']") private WebElement CalendarChkbx;
	@FindBy(xpath = "//input[@value = 'Documents']") private WebElement DocumentsChkbx;
	@FindBy(xpath = "//input[@value = 'HelpDesk']") private WebElement HelpDeskChkbx;
	@FindBy(xpath = "//input[@value = 'ModComments']") private WebElement CommentsChkbx;
	@FindBy(xpath = "//input[@value = 'PriceBooks']") private WebElement PriceBooksChkbx;
	@FindBy(xpath = "//input[@value = 'ProjectMilestone']") private WebElement ProjectMilestoneChkbx;
	@FindBy(xpath = "//input[@value = 'Quotes']") private WebElement QuotesChkbx;
	@FindBy(xpath = "//input[@value = 'ServiceContracts']") private WebElement ServiceContractsChkbx;
	@FindBy(xpath = "(//input[@value='Cancel'])[1]")private WebElement CancelButton;
	
	@FindBy(xpath = "//input[@value='Apply']") private WebElement Applybtn;
	@FindBy(xpath = "//img[@src = 'themes/softed/images/user.PNG']") private WebElement Userimgicon;
	@FindBy(xpath = "//*[@id='_my_preferences_']") private WebElement myPreferences;
	@FindBy(xpath = "//a[text()='Sign Out']")private WebElement Signout;
	@FindBy(xpath = "//img[@src = 'themes/softed/images/info.PNG']") private WebElement info;
	@FindBy(xpath = "//a[text() = 'Help']") private WebElement Help;
	@FindBy(xpath = "//a[text()='Feedback']") private WebElement Feedback;
	@FindBy(xpath = "//img[@src = 'themes/softed/images/menuDnArrow.gif']") private WebElement More;
	
	@FindBy(xpath = "//a[text()='SMSNotifier']") private WebElement MoreSMSNotifier;
	@FindBy(xpath = "//a[text() = 'Our Sites']") private WebElement MoreOurSites;
	@FindBy(xpath = "//a[text() = 'Integration']") private WebElement MoreIntegration;
	@FindBy(xpath = "//a[text() = 'Mail Manager']") private WebElement MoreMailManager; 
	@FindBy(xpath = "//a[text() = 'PBX Manager']") private WebElement MorePBXManager;
	@FindBy(xpath = "//a[text() = 'Comments']") private WebElement MoreComments;
	@FindBy(xpath = "//a[text() = 'Recycle Bin']") private WebElement MoreRecycleBin;
	@FindBy(xpath = "//a[text() = 'RSS']") private WebElement MoreRSS;
	@FindBy(xpath = "//a[text() = ' Analytics']") private WebElement MoreAnalytics;
	@FindBy(xpath = "//a[text() = 'Reports']") private WebElement MoreReports;
	@FindBy(xpath = "//a[text() = ' Marketing']") private WebElement MoreMarketing;
	@FindBy(xpath = "//a[text() = 'Campaigns']") private WebElement MoreCampaigns;
	@FindBy(xpath = "//a[text() = ' Support']") private WebElement MoreSupport;
	@FindBy(xpath = "//a[text() = 'Service Contracts']") private WebElement MoreServiceContracts;
	@FindBy(xpath = "(//a[text() = 'Project Milestones'])[2]")private WebElement MoreProjectMilestones;
	@FindBy(xpath = "//a[text() = 'Project Tasks']") private WebElement MoreProjectTasks;
	@FindBy(xpath = "//a[text() = 'Projects']") private WebElement MoreProjects;
	@FindBy(xpath = "//a[text() = 'FAQ']") private WebElement MoreFAQ;
	@FindBy(xpath = "//a[text() = ' Inventory']") private WebElement MoreInventory;
	@FindBy(xpath = "//a[text() = 'Services']") private WebElement MoreServices;
	@FindBy(xpath = "//a[text() = 'Assets']") private WebElement MoreAssets;
	@FindBy(xpath = "//a[text() = 'Purchase Order']") private WebElement MorePurchaseOrder;
	@FindBy(xpath = "//a[text() = 'Price Books']") private WebElement MorePriceBooks;
	@FindBy(xpath = "//a[text() = 'Vendors']") private WebElement MoreVendors;
	@FindBy(xpath = "//a[text() = ' Sales']") private WebElement MoreSales;
	@FindBy(xpath = "//a[text() = 'Invoice']") private WebElement MoreInvoice;
	@FindBy(xpath = "//a[text() = 'SalesOrder']") private WebElement MoreSalesOrder;
	@FindBy(xpath = "//a[text() = 'Quotes']") private WebElement MoreQuotes;
	@FindBy(xpath = "//select[@id='qccombo']") private WebElement QuickCreate;
	
	public void home()
		{
			Home.click();
		}
	
	public void calendar()
		{
			Calendar.click();
		}
	
	public void lead()
		{
			Leads.click();
		}
	public void contacts()
		{
			Contacts.click();
		}

	public void Products()
		{
			Products.click();
		}
	public void Opportunities()
		{
			Opportunities.click();
		}
	public void products()
		{
			Products.click();
		}
	public void Documents()
		{
			Documents.click();
		}
	public void Email()
		{
			Email.click();
		}

	public void TroubleTickets()
		{
			TroubleTickets.click();
		}
	public void Dashbooard()
		{
			Dashboard.click();
		}
	public void CancelButon()
	{
		CancelButton.click();
	}
	public void ApplyButon()
	{
		Applybtn.click();
	}
	public void MoreClick()
		{
			More.click();
		}
	public void MoreSMSNotifer()
		{
			MoreClick();
			MoreSMSNotifier.click();
		}
	public void MoreOurSites()
		{
			MoreClick();
			MoreOurSites.click();
		}
	public void MoreIntegration()
		{
			MoreClick();
			MoreIntegration.click();
			
		}
	public void MoreMailManager()
		{
			MoreClick();
			MoreMailManager.click();
			
		}
	public void MorePBXManager()
		{
			MoreClick();
			MorePBXManager.click();
		}
	public void MoreComments()
		{
			MoreClick();
			MoreComments.click();
		}
	public void MoreRecyclebin()
		{
			MoreClick();
			MoreRecycleBin.click();
		}
	public void MoreRss()
		{
			MoreClick();
			MoreRSS.click();
		}
	public void MoreReports()
		{
			MoreClick();
			MoreReports.click();
		}
	public void MoreCampaigns()
		{
			MoreClick();
			MoreCampaigns.click();
		}
	public void MoreServiceContracts()
		{
			MoreClick();
			MoreServiceContracts.click();
		}
	
	public void MoreProjectMilestones()
		{
			MoreClick();
			MoreProjectMilestones.click();
		}
	public void MoreProjectTasks()
		{
			MoreClick();
			MoreProjectTasks.click();
		}
	public void MoreProjecs()
		{
			MoreClick();
			MoreProjects.click();
		}
	public void MoreFAQ()
		{
			MoreClick();
			MoreFAQ.click();
		}
	public void MoreServices()
		{
			MoreClick();
			MoreServices.click();
		}
	public void MoreAssets()
		{
			MoreClick();
			MoreAssets.click();
		}
	public void MorePurchaseOrder()
		{
			MoreClick();
			MorePurchaseOrder.click();
		}
	public void MorePriceBooks()
		{
			MoreClick();
			MorePriceBooks.click();
		}
	public void MoreVendors()
		{
			MoreClick();
			MoreVendors.click();
		}
	public void MoreInvoice()
		{
			MoreClick();
			MoreInvoice.click();
		}
	public void MoreSalesOrder()
		{
			MoreClick();
			MoreSalesOrder.click();
		}
	public void MoreQuotes()
		{
			MoreClick();
			MoreQuotes.click();
		}
	
	public void SearchQuery(String str)
		{
			SearchQuery.click();
			SearchQuery.sendKeys(str);
			SearchBtn.click();
		}

	public void QuickCreateSelByIndex(String xpath,int n)
		{
			Extensions.selectDDByIndex(xpath, n-1);
		}
	public void QuickCreateSelByValue(String xpath,String value)
		{
			Extensions.deSelectDDByValue(xpath, value);
		}
	public void QuickCreateSelByvisbileText(String xpath,String text)
		{
			
			Extensions.deSelectDDByVisibleText(xpath, text);
		}

	public void checkchkbx(String xpath) throws Exception
		{
			Browser.driver.findElement(By.xpath("//img[@src='themes/images/arrow_down_black.png']")).click();
			Thread.sleep(500);
			Extensions.checkchkbx(xpath);
		}




}
