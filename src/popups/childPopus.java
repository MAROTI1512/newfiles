package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childPopus {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		String idofmainpage = driver.getWindowHandle();
		System.out.println("main page id "+idofmainpage);
		
		// all ids are recevid in set
		Set<String> allID = driver.getWindowHandles();
		
		// set need to convert to arraylist
		
		ArrayList<String> ar= new ArrayList<>(allID);
		
		for(int i=0;i<= ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		String mainpageId = ar.get(0);
		String childpageId = ar.get(1);
		
		// to switch to child id
		driver.switchTo().window(childpageId); // seleniun focus on child page
		Thread.sleep(1000);
	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("Bhosle");
		driver.close(); // will close only current open tab
	//	driver.quit();  // will close  all windows open by selenium in current session
		
		Thread.sleep(1000);
		driver.switchTo().window(mainpageId);
		driver.findElement(By.name("NewTab")).click();
		
		
	}

}
