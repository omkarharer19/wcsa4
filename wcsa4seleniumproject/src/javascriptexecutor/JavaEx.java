package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/Desktop/selenium/disabled.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement u = driver.findElement(By.id("i2"));
		
		if(u.isEnabled())
		{
			u.sendKeys("admin");
		}
		else 
		{
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('i2').value=\"admin\";");
		}
		
		WebElement p = driver.findElement(By.id("i3"));
		
		if(p.isEnabled())
		{
			p.sendKeys("manager");
		}
		
		else
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('i3').value=\"manager\";");
			
		}

	}

}
