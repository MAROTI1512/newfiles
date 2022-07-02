package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLoginPage login =new KiteLoginPage(driver);
		
		login.sendUserName();
		login.sendPassword();
		login.clickonloginButton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		kitePinPage pin =new kitePinPage(driver);
		pin.sendpin();
		pin.clickOnContinubutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		kiteHomePage home =new kiteHomePage(driver);
		home.validateUserID();
		home.clickonLogoutButton();
		
		driver.close();
		
		
		
	}

}
