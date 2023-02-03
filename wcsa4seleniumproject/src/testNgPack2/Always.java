package testNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Always {
  @Test
  public void m1() {
	 junit.framework.Assert.fail();
  }
  
  @Test(dependsOnMethods = "m1", alwaysRun = true)
  public void m2()
  {
	  long thread = Thread.currentThread().getId();
	  Reporter.log("m2" + thread,true);
  }
}
