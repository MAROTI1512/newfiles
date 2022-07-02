package LocatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_text {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");    
	      
        driver.manage().window().maximize();
        Thread.sleep(100);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Nitesh Bhosle Patil");
        
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9890007740");
        driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
