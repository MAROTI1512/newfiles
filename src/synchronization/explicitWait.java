package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.discoveryplus.in/");

		WebElement signButton = driver.findElement(By.xpath("//h6[text()='sign In'])[2]"));
		
		WebDriverWait w =new WebDriverWait(driver, Duration.ofMillis(6000));
		
		w.until(ExpectedConditions.visibilityOf(signButton));
		signButton.click();
		
		
		
		
	}

}
