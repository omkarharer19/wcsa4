package testNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prirotiy {
  @Test(priority = -3)
  public void z() {
	  Reporter.log("z",true);
  }
  @Test(priority = 1)
  public void h() {
	  Reporter.log("h",true);
  }
  @Test(priority = 0)
  public void demo() {
	  Reporter.log("demo",true);
  }
  @Test(priority = 0)
  public void demo1() {
	  Reporter.log("demo1",true);
  }
  @Test(priority = 3)
  public void h1() {
	  Reporter.log("h1",true);
  }
  @Test(priority = 4)
  public void lemo() {
	  Reporter.log("lemo",true);
  }
}
