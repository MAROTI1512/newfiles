package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsselectedUse {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\\\patil\\\\ChromedriverExeFile\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(8000);
		
		WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
		
		boolean Result = Female.isSelected();
		
		if(Result==true)// will check for condition  //checking 1st time
		{
			//if condition is true print below statement
			System.out.println("Radio button is already selected");
		}
		
		else {
			//if condition is false print below statement and take click action
			System.out.println("Radio button is not selected");
			Female.click();// now element is selected
			boolean Result1 = Female.isSelected();
			
			if (Result1==true)//check 2nd time
			{
				System.out.println("Radio button is selected now");
			}
			
			else {
				System.out.println("Please select radio button");
			}
		}
	}

}
