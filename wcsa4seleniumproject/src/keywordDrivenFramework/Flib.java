package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readProperty(String Proppath,String value) throws IOException
	{
		FileInputStream fis = new FileInputStream(Proppath);
		Properties p = new Properties();
		p.load(fis);
	    String data = p.getProperty(value);
	    return data;
	}
	
	public String readExcelData(String excelp, String spath,int r,int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelp);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(spath);
		Row row = s.getRow(r);
		
		Cell cell = row.getCell(c);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public int rowcount(String epath,String spath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(epath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(spath);
		int lr = s.getLastRowNum();
		return lr;
	}
}
