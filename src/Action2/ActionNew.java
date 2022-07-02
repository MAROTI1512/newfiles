package Action2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionNew {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://youtube.com/"); //TO open the application we used the get method
		driver.manage().window().maximize();
		
		//driver.get("https://www.cricbuzz.com/");
		
	//	driver.close();
	//	driver.quit();
		
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
		
		
		//driver.getTitle();
        driver.get("https://www.youtube.com/");
        Thread.sleep(100);
		String Title = driver.getTitle();
		System.out.println("Title is " +Title);

		//driver.getCurrentUrl();
		driver.get("https://www.youtube.com/");
		Thread.sleep(100);
		String url = driver.getCurrentUrl();
		System.out.println("current url is "+url);
		
		
	}

}
