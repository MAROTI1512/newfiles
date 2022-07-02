package Zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userName.sendKeys("GNU415");
		 password.sendKeys("maroti1512");
		 loginbutton.click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys("151215");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualuserID = userid.getText();
		String expecteduserID="GNU415";
		
		if(actualuserID.equals(expecteduserID)) 
		{
		System.out.println("user ID matching Tc is passed");
		}
		else
		{
			System.out.println("user ID not matching Tc is faild");
		}
		 userid.click();
		 Thread.sleep(1000);
		 
		WebElement logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutbutton.click();
		Thread.sleep(1000);
		driver.close();
	}

}
