package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationCountStudy {
  @Test(invocationCount = 2)
  public void Mymethod()
  
  {
	Reporter.log("Mymethod is running", true); 
  }
  @BeforeMethod
  public void befor()
  {
	  Reporter.log("Befor method is running", true);
  }
}
