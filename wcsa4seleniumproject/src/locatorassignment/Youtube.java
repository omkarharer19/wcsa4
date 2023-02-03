package locatorassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--text yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-only-default yt-spec-button-shape-next--workaround-icon-no-border-radius ']")).click();
		Thread.sleep(5000);
		List<WebElement> s = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
for(int i=0;i<s.size();i++)
{
	WebElement options=s.get(i);
	String opt = options.getText();
	Thread.sleep(5000);
	System.out.println("youtube shorts name:- " + opt);
	}
	}

}
