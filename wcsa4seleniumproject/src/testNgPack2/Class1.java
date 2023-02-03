package testNgPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 {
	static WebDriver driver;
  @Test(description = "SQL")
  public void sql() 
  {
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	   driver.get("https://www.google.com/");
	   driver.switchTo().activeElement().sendKeys("sql");
  }
}
