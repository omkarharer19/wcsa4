package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyW {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[.='Core i5']")).click();
		
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		
		driver.findElement(By.xpath("//div[.='ASUS']")).click();
		
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		
		driver.findElement(By.xpath("//div[.='DOS']")).click();
		
		String device = driver.findElement(By.xpath("//div[.='ASUS ExpertBook P2 Core i5 10th Gen - (8 GB/1 TB HDD/DOS/2 GB Graphics) ExpertBook P2 P2451FB Thin and...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(device);
		driver.quit();
		

	}

}
