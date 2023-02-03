package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/Desktop/selenium/Muldropdown.html");
		WebElement MOS = driver.findElement(By.id("i1"));
		Select s = new Select(MOS);
		List<WebElement> options = s.getOptions();
		for(WebElement opt:options)
		{
			String v = opt.getText();
			System.out.println(v);
			Thread.sleep(5000);
		}
		

	}

}
