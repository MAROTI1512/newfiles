package AnnotationUse;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
	@Test
	  public void myTest1() 
	  {
		  Reporter.log("Test method is running", true);
	  }
	 
	  @BeforeMethod
	  public void logIn1()
	  {
		  Reporter.log("Before method is running ",true);
	  }
	  @AfterMethod
	  public void logOut1()
	  {
		  Reporter.log("Before method is runnig ",true);
	  }
	  @BeforeClass
	  public void launchBrowser1()
	  {
	  Reporter.log("Before class is running", true); 
	  }
	  @AfterClass
	  public void closeBrowser1()
	  {
		  Reporter.log("After class is running", true);
	  }
}
