package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotassign {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=emk5gtchj8bgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement t = driver.findElement(By.name("username"));
		
		Actions act = new Actions(driver);
		
		Robot  r= new Robot();
		
		
		

	}

}
