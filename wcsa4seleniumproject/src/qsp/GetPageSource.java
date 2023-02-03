package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String GetSource = driver.getPageSource();
		Thread.sleep(5000);
		System.out.println(GetSource);
		
		


	}

}
