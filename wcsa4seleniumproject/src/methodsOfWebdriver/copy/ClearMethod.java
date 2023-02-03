package methodsOfWebdriver.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		 WebElement u = driver.findElement(By.name("username"));
		
		WebElement p = driver.findElement(By.name("password"));
		u.sendKeys("admin");
		p.sendKeys("manager");
		Thread.sleep(5000);
		
		u.clear();
		p.clear();
		

	}

}
