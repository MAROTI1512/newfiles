package LocatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//find  xpath by attribut   
		// syntax // tagname [@attribut name='attribut valu'
	    driver.findElement(By.xpath("//input[@value='Radio1']" )).click();
	     
	  // xpath by text
		  //syntax     // tagname[text()='link;]
	driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
	
		// xpath by text 
		//1.	Contains with text() :
			//tagname[contains(text(),’textvalue’)]
			//a[contains(text(),‘link1’)]
        driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate Training Center')]")).click();
		
		//2.	Contains with attribute :
				//tagname[contains(@attribute name, ‘attribute value’)]
		   driver.findElement(By.xpath("//input[contains(@name,'enter-name')]")).sendKeys("maroti");
		   
		// xpath by index
        driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		   
     driver.close();

	}

}
