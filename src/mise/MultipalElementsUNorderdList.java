package mise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipalElementsUNorderdList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
	List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

	for(WebElement search:searchResult)
	{
		System.out.println(search.getText());
		
	}
	}

}
