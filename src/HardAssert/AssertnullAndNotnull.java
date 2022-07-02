package HardAssert;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertnullAndNotnull {
  @Test
  public void mymethod() {
	  
	  
	  String s= null;
	  String m= "hi";
	  
	 
	  Assert.fail();
	 Assert.assertNotNull(m , "valu is null tc is faild");
	  Reporter.log("value is not null tc is passed",true);  
	
	  
	Assert.assertNull(s, "valu is notnull Tc is failed");
	 Reporter.log("valu is null tc is passed", true); 
	  
  }
}
