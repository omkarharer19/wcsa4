package pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements AutoI
{
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		Flib fis = new Flib();
		String url = fis.readproperty(PROP_path, "Url");
		String bro = fis.readproperty(PROP_path, "Brower1");
		String bro1 = fis.readproperty(PROP_path, "Brower");
		
		if(bro.equals("chrome"))
		{
			 System.setProperty(CHROME_K,CHROME_V);
			   driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			   driver.get(url);
		}
		else if(bro1.equals("firefox"))
		{
			  System.setProperty(GECKO_k,GECKO_v);
			   driver=new FirefoxDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			   driver.get(url);	  
		}
	}
		
		public void closeB()
		{
			driver.quit();
			
		}
	}
	
