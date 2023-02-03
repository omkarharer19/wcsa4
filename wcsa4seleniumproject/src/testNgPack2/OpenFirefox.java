package testNgPack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class OpenFirefox {
	static WebDriver driver;
  @Test
  @Parameters(("browservalue"))
  public void openBrowser(String browser) 
  {
	  if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  
	  }
  }
}
