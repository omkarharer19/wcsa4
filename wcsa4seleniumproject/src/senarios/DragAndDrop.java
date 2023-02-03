package senarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 
		WebElement drag = driver.findElement(By.xpath("//p[.='Drag me to my target']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		//act.doubleClick(drag).perform();
		act.dragAndDrop(drag, drop).build().perform();
	}

}
