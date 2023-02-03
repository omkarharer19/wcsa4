package locatorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("omkarharer19@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("rupali@123",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Log in")).click();
		//Thread.sleep(5000);
		//driver.quit();

	}

}
