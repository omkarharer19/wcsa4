package methodsOfWebdriver.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-demr4uj:81/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement id = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean s = id.isSelected();
		System.out.println(s);
		id.click();
		boolean s2 = id.isSelected();
		System.out.println(s2);
		
	}

}
