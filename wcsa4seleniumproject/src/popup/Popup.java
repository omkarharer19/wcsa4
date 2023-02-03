package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/Desktop/selenium/popup.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement c = driver.findElement(By.xpath("//button[@type='button']"));	
		c.click();
		
		
		
		Alert a = driver.switchTo().alert();
		String v = a.getText();
		System.out.println("Text of popup=" + v);
		
		
		//a.accept();
		a.dismiss();
		driver.quit();

	}

}
