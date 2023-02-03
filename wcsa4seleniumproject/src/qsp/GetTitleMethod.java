package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://consciousplanet.org/action-now");
		String titleofLoginPage=driver.getTitle();
		System.out.println(titleofLoginPage);
		driver.quit();

	}

}
