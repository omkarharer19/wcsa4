package dataDrivernFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalid {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=u2xfgvlauiym");
		Thread.sleep(4000);
		
		
		Flib f = new Flib();
		
		int rc = f.rowCount("./data/actitime.xlsx", "INVALID");
		
		for(int i=1;i<=rc;i++)
		{
			String usr = f.readData("./data/actitime.xlsx", "INVALID", i, 0);
			
			String pwd = f.readData("./data/actitime.xlsx", "INVALID", i, 1);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usr);
			
			Thread.sleep(4000);
		    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
			
			
			driver.findElement(By.xpath("//a[.='Login']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='username']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='pwd']")).clear();
			Thread.sleep(3000);
			
		}
		driver.quit();
		
	}

}
