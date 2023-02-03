package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePropertiesFiles {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		Flib flib = new Flib();
		String u = flib.readProperty("./data/coding.properties", "Url");
		String usr = flib.readProperty("./data/coding.properties", "Username");
		String pwd = flib.readProperty("./data/coding.properties", "Password");
		
		driver.get(u);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usr);
		
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		
		
		
		

	}

}
