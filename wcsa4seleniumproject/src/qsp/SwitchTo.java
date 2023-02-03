package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("shiva",Keys.ENTER);
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("shiva",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.quit();

	}

}
