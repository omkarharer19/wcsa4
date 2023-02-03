package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	  
	 // System.out.println("demo");
	  Reporter.log("demo",true);
	  
  }
  @Test
  public void demo1()
  {
	  Reporter.log("This is demo1",true);
	  int a=23;
	  int b=2;
	  System.out.println(a/b);
	 
	
	  
  }
}
