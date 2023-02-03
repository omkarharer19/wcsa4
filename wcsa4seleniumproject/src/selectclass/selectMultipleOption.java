package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectMultipleOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/Desktop/selenium/Muldropdown.html");
		WebElement MOS = driver.findElement(By.id("i1"));
		Select sel=new Select(MOS);
		for(int i=0; i<8 ; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(5000);
		}
	}
}
