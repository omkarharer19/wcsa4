package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAsign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement t = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		Actions a = new Actions(driver);
		a.moveToElement(t).perform();
		
		WebElement t2 = driver.findElement(By.xpath("//a[.='Band']"));
		
		t2.click();
		
		WebElement t3 = driver.findElement(By.xpath("//div[.='Filter by']"));
		
		Actions b = new Actions(driver);
		
		b.clickAndHold(t3).perform();
	}

}
