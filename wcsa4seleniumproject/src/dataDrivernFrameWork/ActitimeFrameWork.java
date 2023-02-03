package dataDrivernFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeFrameWork {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=u2xfgvlauiym");
		Thread.sleep(4000);
		
		Flib flib = new Flib();
		String usr = flib.readData("./data/actitime.xlsx", "VALID", 1, 0);
		
		String pwd = flib.readData("./data/actitime.xlsx", "VALID", 1, 1);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usr);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		driver.findElement(By.xpath("//a[.='Login']")).click();
	}

}
