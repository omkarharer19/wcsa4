package senarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7Kada {

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
		driver.findElement(By.className("exclusive btn style2 btn-block addToCart")).click();
		 Thread.sleep(4000);
		 
		 
		 WebElement e = driver.findElement(By.xpath("//div[.='* This field is required']"));
		 
		 if(e.isDisplayed())
		 {
			 System.out.println("test case pass");
		 }
		 else
		 {
			 System.out.println("test case fail");
		 }
		
	}

}
