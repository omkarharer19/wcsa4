package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAuto {
	static WebDriver driver;
	
	public void openBrower() throws IOException
	{
		Flib flib = new Flib();
	   String url = flib.readProperty(Prop_path, "Url");
	   String browser = flib.readProperty(Prop_path, "Brower");
	   
	   if(browser.equals("chrome"))
	   {
		   System.setProperty(Chrome_key, Chrome_Value);
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   driver.get(url);
	   }
	   else if(browser.equals("firefox"))
	   {
		   System.setProperty(Gecko_key, Gecko_value);
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   driver.get(url);	   
	   }
}
	   
	   public void closeBrower()
	   {
		   driver.quit();
		   
	   }
	   
	   
		

}
