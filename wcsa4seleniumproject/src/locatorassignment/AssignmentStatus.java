package locatorassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentStatus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement usrn = driver.findElement(By.name("username"));
		
		
//		boolean d = usrn.isDisplayed();
		if(usrn.isDisplayed())
		{
			usrn.sendKeys("admin");	
		}
	}
}
