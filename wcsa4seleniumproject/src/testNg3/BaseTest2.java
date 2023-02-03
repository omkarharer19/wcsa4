package testNg3;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
	static WebDriver driver;
 
  @BeforeMethod
  public void setup() 
  {
	 
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  driver.get("http://127.0.0.1:81/login.do;jsessionid=u2xfgvlauiym");
	  
  }
  @AfterMethod
  public void setupClose()
  {
	  driver.quit();
	  
  }
  }


