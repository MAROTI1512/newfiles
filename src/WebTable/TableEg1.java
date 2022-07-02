package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		
		List<WebElement> tableheader = driver.findElements(By.xpath("//table//th"));
	
		for(WebElement th:tableheader) 
		{
			System.out.print(th.getText()+" || ");
		}
		
		
	}

}
