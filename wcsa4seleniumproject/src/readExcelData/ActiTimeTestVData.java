package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestVData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=u2xfgvlauiym");
		Thread.sleep(4000);
		
		FileInputStream f = new FileInputStream("./data/actitime.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet s = wb.getSheet("VALID");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		String v = c.getStringCellValue();
		Thread.sleep(4000);
		
		driver.findElement(By.className("username")).sendKeys("v");
		Thread.sleep(4000);
		
		Row r1 = s.getRow(1);
		Cell c1 = r1.getCell(0);
		String v1 = c1.getStringCellValue();
		driver.findElement(By.className("pwd")).sendKeys(v);
		



	}

}
