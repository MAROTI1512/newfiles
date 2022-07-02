package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//switch selenium focus on main page to frame
		driver.switchTo().frame("iframe-name");
		
		//current focus on frame now
     driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click(); // this element presnt on iframe
     
     //take to action on main page ,we need switch to selenuim focus on main page
     
     driver.switchTo().defaultContent();  //switing to focus on main page 
      driver.findElement(By.xpath("//input[@value='Radio1']")).click();
     
     
     
     
     
	}

}
