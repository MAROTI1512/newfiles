package POM;

import java.io.File;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassUsingTNG {
	kiteHomePage home;
	KiteLoginPage login;
	kitePinPage pin;
	WebDriver driver;
	 
	 File Myfile =new File("D:\\b.xlsx");
	Sheet mysheet;
	
	@BeforeClass
	public void lounchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new KiteLoginPage(driver);
		home =new kiteHomePage(driver);
		pin=new kitePinPage(driver);
		
	}
	@BeforeMethod
	public void loginTokiteApp()
	{
		
	}
		
  @Test
  public void vaerifyUserID() 
  {
	  
  }
  
  @AfterMethod
   public void LogoutfromkiteApp()
  {
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  
  }
}
