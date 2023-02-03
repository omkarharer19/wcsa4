package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement rup = driver.findElement(By.xpath("//a[.=' 5000']"));
		WebElement box = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(rup, box).perform();
		
	}

}
