package testNg3;

import org.testng.annotations.Test;

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
import org.testng.annotations.BeforeMethod;

public class Flib  {
  
  @BeforeMethod
  public String readExcelProperty(String exceln,String sheetn,int r,int c) throws EncryptedDocumentException, IOException {
	  FileInputStream fis = new FileInputStream(exceln);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet s = wb.getSheet(sheetn);
	  Row row = s.getRow(r);
	  Cell cell = row.getCell(c);
	  String data = cell.getStringCellValue();
	  return data;
  }
    
  @BeforeMethod
  public String readProperties(String propp,String value) throws IOException
  {
	  FileInputStream fis = new FileInputStream(propp);
	  Properties p = new Properties();
	  p.load(fis);
	 String v = p.getProperty(value);
	 return v;
  }
  
  @BeforeMethod
  public int readLastRowCount(String excelp,String sheetp) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis = new FileInputStream(excelp);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet s = wb.getSheet(sheetp);
	  int lastr = s.getLastRowNum();
	  return lastr;
	  
  }


  
  
  

}
