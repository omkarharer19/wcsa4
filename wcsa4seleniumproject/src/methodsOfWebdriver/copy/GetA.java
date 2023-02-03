package methodsOfWebdriver.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetA {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-demr4uj:81/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	WebElement a = driver.findElement(By.xpath("//input[@name='username']"));
	String c = a.getAttribute("class");
	System.out.println(c);

	}

}
