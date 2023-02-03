package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=43d3d8kmfnu77");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@href='/administration/administration.do']")).click();
		driver.findElement(By.xpath("//a[@href='/administration/customization.do']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement t = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Actions act = new Actions(driver);
		act.doubleClick(t).perform();
		

	}

}
