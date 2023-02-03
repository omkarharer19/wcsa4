package testNg3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActitimeBaseTest extends BaseTest2 {
  @Test
  public void ActitimeValid() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  
	  driver.findElement(By.id("loginButton")).click();
  }
}
