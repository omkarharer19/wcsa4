package senarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.xpath("//span[.='Offers ']")).click();
		
		WebElement a = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/descendant::span[.='Offers']"));
		
		a.click();
		//Actions act = new Actions(driver);
		//act.moveToElement(a);
		
		driver.findElement(By.xpath("//span[@data-p='jewellery@filter@10+percent+making+charge+off!!']")).click();
		
		
	}
}
