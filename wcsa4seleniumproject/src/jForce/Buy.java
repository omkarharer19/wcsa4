package jForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")).click();
		driver.findElement(By.id("email")).sendKeys("omkarharer19@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rupali@321");
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-168']")).click();
		driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']")).click();
		driver.findElement(By.xpath("//button[@class='action tocart primary']/descendant::span[.='Add to Cart']")).click();
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='control']/descendant::input[@name=\"company\"]")).sendKeys("jforce");
		
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("vile parle");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("dadar");
		WebElement d = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select(d);
		sel.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("233423");
		driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("9082436442");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[.='Place Order']")).click();
		
	}

}
