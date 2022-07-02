package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
       driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@role='button'])[2]")).click();
	//	Thread.sleep(2000);
		
		//driver.findElement(By.xpath(null))
	}

}
