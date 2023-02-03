package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement ActiLink;
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']")
	private WebElement SelectUsr;
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getActiLink() {
		return ActiLink;
	}

	public WebElement getSelectUsr() {
		return SelectUsr;
	}	
	//operational method
	public void select(int i)
	{
		SelectUsr.click();
		Select s = new Select(SelectUsr);
		s.selectByIndex(i);
	}
	
	public void link()
	{
		ActiLink.click();
		
	}
}
