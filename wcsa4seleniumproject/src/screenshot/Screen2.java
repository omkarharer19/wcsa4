package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screen2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		RemoteWebDriver r = (RemoteWebDriver)driver;
		
		r.manage().window().maximize();
		
		r.get("http://127.0.0.1:81/login.do;jsessionid=66f7faalab2j0");
		
		File s = r.getScreenshotAs(OutputType.FILE);
		
		File d = new File("./screenshot/m.png");
		
		Files.copy(s, d);
		r.close();
		
		
		
		

	}

}
