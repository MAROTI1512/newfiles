package HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  @Test
  public void mymethod() {
	  
	  boolean a=true;
	  boolean b=false;
	  boolean c=true;
	  
	  Assert.assertTrue(a,"value is false tc is faild");
	 Reporter.log("A valu is true Tc is passed",true); 
	 
	 
	 Assert.assertFalse(b,"value is false tc is faild");
	 Reporter.log("B value is false tc is passed",true);
  }
}
