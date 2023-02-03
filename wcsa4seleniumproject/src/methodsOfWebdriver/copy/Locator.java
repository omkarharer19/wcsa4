package methodsOfWebdriver.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-demr4uj:81/login.do");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(8000);
		driver.findElement(By.linkText("Projects & Customers")).click();
		Thread.sleep(8000);
		//driver.findElement(By.cssSelector("input[value='Create New Customer']")).click();
		//Thread.sleep(8000);
		//driver.findElement(By.cssSelector("input[name='name']")).sendKeys("wipro");
		//Thread.sleep(8000);
		//driver.findElement(By.cssSelector("input[name='createCustomerSubmit']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[value='Create New Project']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("select[name='customerId']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("option[value='6']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("application development");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[name='createProjectSubmit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[value='Create New User']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("manger2");
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[name='passwordText']")).sendKeys("ru");
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[name='passwordTextRetype']")).sendKeys("ru");
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("om");
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("namah shivay");
		
		//driver.findElement(By.className("logout")).click();
		//Thread.sleep(5000);
		//driver.quit();
	}

}
