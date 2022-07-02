package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShotUse {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		
		
		//1st we have to typecast takes screenshot interface with driver
	
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //screenshotready
	  File desti =new File("D:\\ScreenShot.myscreenshot.png");
      FileHandler.copy(source, desti);
	
	   
	}

}
