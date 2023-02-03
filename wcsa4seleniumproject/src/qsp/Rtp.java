package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://consciousplanet.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Action Now']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();

	}

}
