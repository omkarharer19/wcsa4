package methodsOfWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement pop = driver.findElement(By.xpath("//a[.='Open a popup window']"));
		pop.click();
		
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		
		Set<String> b = driver.getWindowHandles();
		for(String v:b)
		{
			System.out.println(v);
		}
	}

}
