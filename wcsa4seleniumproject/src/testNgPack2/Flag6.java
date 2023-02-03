package testNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "FUNCTIONAL")
  public void ft1() {
	  Reporter.log("Funtional test case",true);
  }
  @Test(groups = "INTEGRATION")
  public void it1() {
	  Reporter.log("integration test case",true);
  }
  @Test(groups = "SYSTEM")
  public void st1() {
	  Reporter.log("system  test case",true);
  }
//---------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft2() {
	  Reporter.log("Funtional test case2",true);
  }
  @Test(groups = "INTEGRATION")
  public void it2() {
	  Reporter.log("integration test case2",true);
  }
  @Test(groups = "SYSTEM")
  public void st2() {
	  Reporter.log("system  test case2",true);
  }
  //------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() {
	  Reporter.log("Funtional test case3",true);
  }
  @Test(groups = "INTEGRATION")
  public void it3() {
	  Reporter.log("integration test case3",true);
  }
  @Test(groups = "SYSTEM")
  public void st3() {
	  Reporter.log("system  test case3",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft4() {
	  Reporter.log("Funtional test case4",true);
  }
  @Test(groups = "INTEGRATION")
  public void it4() {
	  Reporter.log("integration test case4",true);
  }
  @Test(groups = "SYSTEM")
  public void st4() {
	  Reporter.log("system  test case4",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft5() {
	  Reporter.log("Funtional test case5",true);
  }
  @Test(groups = "INTEGRATION")
  public void it5() {
	  Reporter.log("integration test case5",true);
  }
  @Test(groups = "SYSTEM")
  public void st5() {
	  Reporter.log("system  test case5",true);
  }
  
  @Test(groups = "FUNCTIONAL")
  public void ft6() {
	  Reporter.log("Funtional test case6",true);
  }
  @Test(groups = "INTEGRATION")
  public void it6() {
	  Reporter.log("integration test case6",true);
  }
  @Test(groups = "SYSTEM")
  public void st6() {
	  Reporter.log("system  test case6",true);
  }
}
