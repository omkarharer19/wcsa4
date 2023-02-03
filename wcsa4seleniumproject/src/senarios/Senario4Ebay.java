package senarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario4Ebay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("apple watch",Keys.ENTER);
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//a[.='Smart Watch Accessories']")).click();
		//Thread.sleep(4000);
		
		WebElement w = driver.findElement(By.xpath("//span[.='Apple Watch Series 3 38 mm Gray Case Black Aluminium Smartwatch PRISTINE IN BOX']"));
		String  v= w.getText(); 
		
		System.out.println("First Product Name =" + v);
		Thread.sleep(4000);
		
			
		 List<WebElement> w2 = driver.findElements(By.xpath("//div[@class='srp-river srp-layout-inner']/descendant::span[.='Apple Watch Series 3 38 mm Gray Case Black Aluminium Smartwatch PRISTINE IN BOX']"));
		 for(int i=0;i<w2.size();i++)
		 {
			 
		
			 WebElement o = w2.get(i);
			String value = o.getText();
			System.out.println(value);
			 
		 }		 
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='srp-river srp-layout-inner']//descendant::span[.='Apple Watch Band - 38mm/ 40mm/ 41mm - Pink Sand Sport Band']"));	
	}

}
