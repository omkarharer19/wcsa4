package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen4 {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		
		TakesScreenshot t=driver;
		
		driver.manage().window().maximize();
		
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("./screenshot/a.png");
		
		Files.copy(s, d);

	}
}
