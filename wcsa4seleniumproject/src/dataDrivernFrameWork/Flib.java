package dataDrivernFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flib {
	
	public void cBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void writeData(String excelp,String sname ,int rc,int cc,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelp);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet s = wb.getSheet(sname);
		 Row row = s.getRow(rc);
		 Cell cell = row.createCell(cc);
		 cell.setCellValue(data);
		 
		 FileOutputStream fos = new FileOutputStream(excelp);
		 wb.write(fos);
		 
		 
	}
	
	
	public String readData(String excelp,String sheetname,int rc,int cc) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelp);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetname);
		Row r = s.getRow(rc);
		Cell c = r.getCell(cc);
		String data = c.getStringCellValue();
		return data;
	}
	
	public int rowCount(String path,String sname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sname);
		int rc = s.getLastRowNum();
		return rc;
	}

}
