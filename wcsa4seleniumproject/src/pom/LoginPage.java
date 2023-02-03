package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='username']") private WebElement UsrTB;
	@FindBy(xpath = "//input[@name='pwd']") private WebElement PwdTB;
	@FindBy(id = "loginButton") private WebElement LoginButton;
	@FindBy(xpath = "//a[.='Actimind Inc.']") private WebElement ActiLink;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsrTB() {
		return UsrTB;
	}

	public WebElement getPwdTB() {
		return PwdTB;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getActiLink() {
		return ActiLink;
	}
	
	//operational method
	public void actiValid(String VU,String VP) throws InterruptedException
	{
		UsrTB.sendKeys(VU);
		Thread.sleep(3000);
		PwdTB.sendKeys(VP);
		Thread.sleep(2000);
		LoginButton.click();
	}
	
	public void actiivalid(String IVU,String IVP) throws InterruptedException
	{
		UsrTB.sendKeys(IVU);
		Thread.sleep(3000);
		PwdTB.sendKeys(IVP);
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		UsrTB.clear();
		Thread.sleep(2000);
	
		
		
	}
	
	
	

}
