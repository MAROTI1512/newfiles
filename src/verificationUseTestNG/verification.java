package verificationUseTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class verification {
  @Test
  public void MyTest1() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	
//	if(checkBox1.isSelected())
//	{
//		Reporter.log("My TC is passed",true);
//	}
//	else {
//		Reporter.log("My TC is faild",true);
//	}
	
	Assert.assertTrue(checkBox1.isSelected(),"checkbox is not selected tc is faild" );
	
  }
}
