package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
	 @Test
     public void mythodsD()
	{
		Reporter.log("D is running",true);
	  }
	  
          @Test 
      public void A()
{
	  Reporter.log("A is running",true);
}
      @Test (priority = -1,timeOut = 900,enabled = true,dependsOnMethods = {"A"})
   public void B() 
{
	 Reporter.log("B is running",true);
}
    @Test
  public void C()
{
	Reporter.log("C is running", true);
}
}
