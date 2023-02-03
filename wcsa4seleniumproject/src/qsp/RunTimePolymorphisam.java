package qsp;
import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphisam {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("browser");
		String browserValue=sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://web.whatsapp.com/");
			driver.close();
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://web.whatsapp.com/");
			driver.close();
		
		}
		else
		{
			System.out.println("enter valid browser");
		}

	}

}
