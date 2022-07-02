package Scrolling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingSetPotions {

	public static void main(String[] args) throws InterruptedException 
	{
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://vctcpune.com/");
	
	System.out.println(driver.manage().window().getPosition());
	
	Thread.sleep(300);
	
	//To set Position--> use Point class and create object of Point class

	//Point p = new Point(800, 500);
	
//	driver.manage().window().setPosition(p);
	

	}
}		
	


