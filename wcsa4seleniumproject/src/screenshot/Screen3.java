package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screen3 {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		
		e.manage().window().maximize();
		
		File s = e.getScreenshotAs(OutputType.FILE);
		
		File d = new File("./screenshot/k.png");
		
		Files.copy(s, d);
		
	}

}
