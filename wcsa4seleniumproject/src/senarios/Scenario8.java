package senarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement t = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		a.moveToElement(t).perform();
		
		driver.findElement(By.xpath("//span[@data-p='mens-jewellery-kadas,m']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt=\"The Vans Kada For Him\"]")).click();
		Thread.sleep(4000);
		WebElement o = driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']"));
				
		Select s = new Select(o);
		s.selectByVisibleText("2-2(2 2/16\")");
		
		

	}

}
