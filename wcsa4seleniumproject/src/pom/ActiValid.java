package pom;

import java.io.IOException;

public class ActiValid extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib fis = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.actiivalid(fis.readproperty(PROP_path, "Username"),fis.readproperty(PROP_path, "Password"));
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		
				
				//hp.select(1);
				Thread.sleep(2000);
				hp.link();

	}

}
	