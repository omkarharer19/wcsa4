package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetsizeMehod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Dimension
		Dimension Om = new Dimension(500,300);
		driver.manage().window().setSize(Om);
		Thread.sleep(4000);
		//Point
		Point namo = new Point(30,300);
		driver.manage().window().setPosition(namo);
		Thread.sleep(4000);
		driver.quit();
		
	

	}

}
