package testTCExucation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel1 {
  @Test
  public void Mymethod1()
  {
  System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
	Reporter.log("Mymethod1 is running", true);
}
}
