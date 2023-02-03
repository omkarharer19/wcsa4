package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectByText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/Desktop/selenium/Muldropdown.html");
		WebElement MDD = driver.findElement(By.xpath("//select[@name='chkbox']"));
		Select s = new Select(MDD);
		s.selectByVisibleText("idli dosa");
		Thread.sleep(5000);
		s.deselectByVisibleText("idli dosa");

	}
}
