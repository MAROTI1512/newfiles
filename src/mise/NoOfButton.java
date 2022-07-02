package mise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfButton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		
		System.out.println(buttons.size());
		System.out.println("======================");
		Iterator<WebElement> it = buttons.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		System.out.println("===================");
		
		for(WebElement h:buttons)
		{
			System.out.println(h.getText());
		}
			
		
		
		
		
		
		
		
		
		
	}

}
