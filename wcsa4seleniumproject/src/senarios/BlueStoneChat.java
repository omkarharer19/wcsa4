package senarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneChat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("fc_widget");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("omkar");
		driver.findElement(By.id("chat-fc-email")).sendKeys("omkarharer19@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9082436442");
		Thread.sleep(3000);
		
		
		driver.findElement(By.className("fc-button")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
