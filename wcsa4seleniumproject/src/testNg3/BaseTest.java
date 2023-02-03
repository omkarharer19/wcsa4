package testNg3;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoIT {
	
	static WebDriver driver;
 
  @BeforeMethod
  public void openBrowser() throws IOException {
	  Flib flib = new Flib();
	  String url = flib.readProperties(Prop_path, "Url");
	  String b = flib.readProperties(Prop_path, "Brower");
	  
	  if(b.equals("firefox"))
	  {
		  System.setProperty(Gecko_key, Gecko_value);
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  driver.get(url);
	  }
	  else if(b.equals("chrome"))
	  {
		  System.getProperty(Chrome_key, Chrome_value);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  driver.get(url);
		  
	  }
	  
	  
  }

}
