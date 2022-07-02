package AnnotationUse;

import org.junit.After;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationstudy {
  @Test
  public void myTest() 
  {
	  Reporter.log("Test method is running", true);
  }
  @Test
  public void myTest1()
  {
	  Reporter.log("Test method 1 is running", true);
  }
  @BeforeMethod
  public void logIn()
  {
	  Reporter.log("Before method is running ",true);
  }
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("Before method is runnig ",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
  Reporter.log("Before class is running", true); 
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("After class is running", true);
  }
}
