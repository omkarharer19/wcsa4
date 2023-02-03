package methodsOfWebdriver.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-demr4uj:81/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement img = driver.findElement(By.xpath("//img[@src='/img/custom/logo.0.9670924124038598.jpg?hash=1692528820']"));
		Point loc = img.getLocation();
		int x = loc.getX();
		int y = loc.getX();
		System.out.println("x axis=" + x + "y axis=" + y);
		

	}

}
