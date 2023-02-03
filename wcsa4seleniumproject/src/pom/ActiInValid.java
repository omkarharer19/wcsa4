package pom;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiInValid extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib fis = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		int rc = fis.rowCount(EXCEL_path, "INVALID");
		for(int i=1; i<=rc; i++)
		{
			lp.actiivalid(fis.readexcel(EXCEL_path, "INVALID", i, 0),fis.readexcel(EXCEL_path, "INVALID", i,1));	
		}
		
		bt.closeB();
		

	}

}
