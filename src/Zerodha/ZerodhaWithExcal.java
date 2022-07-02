package Zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithExcal {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File Myfile =new File("D:\\b.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
 	    String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
 	   String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
 	  
		WebElement userName = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userName.sendKeys(UN);
		 password.sendKeys(PWD);
		 loginbutton.click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys(PIN);
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualuserID = userid.getText();
		String expecteduserID=UN;
		
		if(actualuserID.equals(expecteduserID)) 
		{
		System.out.println("user ID matching Tc is passed");
		}
		else
		{
			System.out.println("user ID not matching Tc is faild");
		}
		 userid.click();
		 Thread.sleep(1000);
		 
		WebElement logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutbutton.click();
		Thread.sleep(1000);
		driver.close();
	}

}
