package mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		RemoteWebDriver r=(RemoteWebDriver) driver;
		
		r.get("http://127.0.0.1:81/login.do");
		
		File src=r.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/S02.png");
		Thread.sleep(4000); 
		Files.copy(src, dest);
		Thread.sleep(4000); 
		r.quit();
	}

}
