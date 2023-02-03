package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=1n5fgo782anin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement usr = driver.findElement(By.xpath("//input[@name='username']"));
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		Thread.sleep(4000);
		
		if(usr.isDisplayed())
		{
			usr.sendKeys("admin");	
		}
		else
		{
			System.out.println("exception webelement not found");
		}
		Thread.sleep(4000);
		
		if(pwd.isDisplayed())
		{
			pwd.sendKeys("manager");	
		}
		else
		{
			System.out.println("exception webelement not found");
		}
		
		Thread.sleep(4000);
		
		usr.clear();
		
		Thread.sleep(2000);
		pwd.clear();
		
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		
		
		
		
		
		
		

	}

}
