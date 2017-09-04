package pomPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage 
{
	@FindBy(xpath = "//a[@class = 'hdrLink']") private WebElement HomeLink;
	@FindBy(xpath = "//img[@src = 'themes/softed/images/btnL3Add.gif']") private WebElement PlusIcon;
	@FindBy(xpath = "//img[@title ='Open Calendar...']")private WebElement CalendarIcon;
	@FindBy(xpath = "//img[@title='Show World Clock...']") private WebElement ClockIcon;
	@FindBy(xpath = "//img[@title = 'Open Calculator...']") private WebElement CalcIcon;
	@FindBy(xpath = "//img[@title = 'Chat...']") private WebElement ChatIcon;
	@FindBy(xpath = "//img[@title = 'Last Viewed']") private WebElement LastViewedIcon;
	@FindBy(xpath = "//img[@title='Change layout']") private WebElement ChangeLayoutIcon;
	@FindBy(xpath = "(//td[@class ='homePageMatrixHdr']/b)[1]") private WebElement PendingActivities;
	@FindBy(xpath = "(//img[@alt = 'Edit'])[1]") private WebElement PAEdit;
	@FindBy(xpath = "//*[@id='editRowmodrss_11']/table/tbody/tr/td[2]/input[1]") private WebElement PAEditSave;
	@FindBy(xpath = "//*[@id='editRowmodrss_11']/table/tbody/tr/td[2]/input[2]") private WebElement PAEditCancel;
	@FindBy(xpath = "//select[@id='maxentries_13']") private WebElement PAEditSelect;
	@FindBy(xpath = "(//img[@title = 'Refresh'])[1]") private WebElement PARefresh;
	@FindBy(xpath = "(//img[@alt='Hide'])[1]") private WebElement PAHide;
	@FindBy(xpath = "(//img[@title = 'More Information'])[1]") private WebElement PAMoreInfo;
	@FindBy(xpath = "(//tr/td[1]/a)[31]") private WebElement PAMore;


	public void HomeLink() 
	{
		HomeLink.click();
	}

}
