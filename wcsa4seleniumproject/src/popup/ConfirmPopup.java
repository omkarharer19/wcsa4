package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/Desktop/selenium/popup.htmlfile:///C:/Users/rahul/OneDrive/Desktop/selenium/popup.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement c = driver.findElement(By.xpath("//button[@type='button']"));	
		c.click();
	}

}
