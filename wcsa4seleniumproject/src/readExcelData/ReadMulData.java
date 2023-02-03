package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMulData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=1;i<7;i++)
		{
		
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wf = WorkbookFactory.create(fis);
		Sheet s = wf.getSheet("IPL");
		Row r = s.getRow(i);
		Cell c = r.getCell(0);
		String v = c.getStringCellValue();
		System.out.println(v);
		}


	}

}
