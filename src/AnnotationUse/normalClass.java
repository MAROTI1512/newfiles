package AnnotationUse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class normalClass
{
	 @Test
	  public void mymethod1() 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver  = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
			driver.manage().window().maximize();
			Reporter.log("my method is running");
			
	  }
	 @Test
	 
		 public void Mymethod2() 
		 {
	 System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 }
}
