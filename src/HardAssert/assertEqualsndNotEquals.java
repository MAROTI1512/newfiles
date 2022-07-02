package HardAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertEqualsndNotEquals {
  @Test
  public void Mytest() {
	  
	  String M ="Bhosle";
	  String b = "Bhosle";
	  String k = "Patil";

	  //if m and b are same then Tc shoudld be passed else faild
	
	  
	  Assert.assertEquals(M, b,"string are not matching tc is faild");
	  Reporter.log("string are matching tc is passed", true);
	  
	  
	  Assert.assertNotEquals(b, b, "string are not matching tc is faild ");
  
	  Reporter.log("string are matching tc is passed", true);
	  
  
  }
}
