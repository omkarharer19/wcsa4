package senarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenari14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.xpath("//a[.='Coins ']")).click();
		driver.findElement(By.xpath("//span[.='weight (Gram)']")).click();
		driver.findElement(By.xpath("//span[.='1 Gram']"));
		

	}

}
