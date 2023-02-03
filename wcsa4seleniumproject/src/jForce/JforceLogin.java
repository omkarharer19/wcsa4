package jForce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JforceLogin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.xpath("//a[.='Create an Account']")).click();
		
		Flib flib = new Flib();
		
		String fn = flib.createAccount("./data/account.xlsx","create",0 , 1);
		
		String ln = flib.createAccount("./data/account.xlsx","create", 1, 1);
		String en = flib.createAccount("./data/account.xlsx","create", 2, 1);
		String pass = flib.createAccount("./data/account.xlsx","create",3, 1);
		String pass2 = flib.createAccount("./data/account.xlsx","create",3, 1);
		
		driver.findElement(By.id("firstname")).sendKeys(fn);
		driver.findElement(By.id("lastname")).sendKeys(ln);
		driver.findElement(By.id("email_address")).sendKeys(en);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("password-confirmation")).sendKeys(pass2);
		
		driver.findElement(By.xpath("//button[.='Create an Account']")).click();
	}
}
