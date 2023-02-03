package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeKeywordFramework extends BaseTest implements IAuto {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest base = new BaseTest();
		base.openBrower();
		
		Flib flib = new Flib();  
		
		int rc = flib.rowcount(Excel_path, "INVALID");
		
		for(int i=1;i<=rc;i++ )
		{
			String usr = flib.readExcelData(Excel_path, "INVALID", i, 0);
			String pwd = flib.readExcelData(Excel_path, "INVALID", i, 1);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usr);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='username']")).clear();
			driver.findElement(By.xpath("//input[@name='pwd']")).clear();
			
		}
	}

}
