package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String GetUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(GetUrl);
		driver.quit();

	}

}
