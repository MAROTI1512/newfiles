package Action2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 //double click
		WebElement MyElement = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 Actions act=new Actions(driver);
		 act.doubleClick(MyElement).perform();
		Alert alt=driver.switchTo().alert();
		
		alt.accept();

	}

}
