package pomPages;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import commonUtils.Constants;

	public class LoginPage 
	{
		@FindBy(name = "user_name") private WebElement usernameTxtbox;
		@FindBy(name = "user_password") private WebElement userpwdTxtbox;
		@FindBy(xpath = "//input[@id='submitButton']") private WebElement loginBtn;
		
		public void login() throws EncryptedDocumentException, InvalidFormatException, Exception
		{
			usernameTxtbox.click();
			usernameTxtbox.sendKeys(Constants.userName);
			userpwdTxtbox.sendKeys(Constants.pwd);
			loginBtn.click();		
			
		}

	}


