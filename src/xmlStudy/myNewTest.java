package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myNewTest {
  @Test
  public void mymethodA() 
  {
	  Reporter.log("mymethod A is running ", true);
  }
  
  @Test
  public void mymethodB()
  {
	   Reporter.log("mymethod B is running ", true); 
  }
  
  @Test
  public void mymethodC()
  {
	  Reporter.log("mymethod C is running", true);
  }
  @Test
  public void mymethodD()
  {
	  Reporter.log("mymethod D is running", true);
  }
  @Test
  public void mymethodE()
  {
	  Reporter.log("mymethod E is running", true);
  }
}
