package testNg3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Acti3 extends BaseTest {
	@Test
	  public void actimevalid() throws IOException 
	  {
		  BaseTest base = new BaseTest();
		  base.openBrowser();
		  
		  Flib fis = new Flib();
		  
		  String usr = fis.readProperties(Prop_path, "Username");
		  String pwd = fis.readProperties(Prop_path, "Password");
		  
		  driver.findElement(By.name("username")).sendKeys(usr);
		  driver.findElement(By.name("pwd")).sendKeys(pwd);
		  
		  driver.findElement(By.id("loginButton")).click();
	  }
}
