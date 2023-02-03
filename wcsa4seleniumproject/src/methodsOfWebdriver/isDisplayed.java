package methodsOfWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-demr4uj:81/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement img = driver.findElement(By.xpath("//img[@src='/img/custom/logo.0.9670924124038598.jpg?hash=1692528820']"));
		boolean s = img.isDisplayed();
		System.out.println(s);
	}

}
