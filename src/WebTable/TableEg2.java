package WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("//D:/Velocity/Java%20Class/Aug2021%20Class/Java%20notes/Webpage/table.html");
		driver.manage().window().maximize();

	}

}
