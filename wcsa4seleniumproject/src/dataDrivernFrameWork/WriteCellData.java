package dataDrivernFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteCellData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Flib flib = new Flib();
		
		flib.writeData("./data/actitime.xlsx", "INVALID", 0, 2, "Link");

	}

}
