package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceOfLaptop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Core i7']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Windows 10']")).click();
		
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(4000);
		
		WebElement price = driver.findElement(By.xpath("//div[.='HP Chromebook Intel Core i7 11th Gen - (16 GB/1 TB SSD/Windows 10 Home) 14-dv0058TU Thin and Light Lap...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		String value = price.getText();
		System.out.println("Price of the Laptop is = " + value);
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		

	}

}
