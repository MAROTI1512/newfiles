package Action2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		
		// 1st way
		//textBox.sendKeys("Maroti");
		//2nd way
		Actions act=new Actions(driver);
		act.sendKeys(textBox,"Bhosle").perform();
		
		act.keyDown(textBox,Keys.SHIFT).sendKeys("bhosle").build().perform();


	}

}
