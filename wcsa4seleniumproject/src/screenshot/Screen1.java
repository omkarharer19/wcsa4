package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=66f7faalab2j0");
		
		File s = driver.getScreenshotAs(OutputType.FILE);
		File d = new File("./screenshot/o.png");
		
		Files.copy(s, d);
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
