package locatorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("omkarharer19@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("pass")).sendKeys("rupali@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		//driver.quit();
	}

}
