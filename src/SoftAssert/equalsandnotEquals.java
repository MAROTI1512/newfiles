package SoftAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class equalsandnotEquals {
	
	SoftAssert Soft = new SoftAssert();
	
	
  @Test
  public void Mymethod() 
  { 
	  String m= "nanded";
	  String p = "nanded";
	  String l="latur";	  
	  
	  Soft.assertEquals(m, l,"TC is faild bothe are not equal");
      
       Soft.assertNotEquals(m, l,"TC is faild bothe are not equal");
      
        Soft.assertAll();
  }
  @Test
  public void mymethod1()
  {
	  boolean a=true;
	  
	 Soft.assertTrue(a,"M is not equal TC is failed");
	 Reporter.log("TC is passed a is true", true);
	Soft.assertAll();
	
	
	
	
	
  }
  
 
  
  
}
