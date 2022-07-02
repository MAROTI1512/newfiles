package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_use {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		System.out.println(password.isEnabled());
		
	}

}
