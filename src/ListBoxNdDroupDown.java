import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxNdDroupDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\patil\\ChromedriverExeFile\\chromedriver_win32 (3)\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//driver.get("https://vctcpune.com/selenium/practice.html");
	//	driver.manage().window().maximize();
	//	Thread.sleep(200);
		
		// we hava to find list box create refernce varivble of list box
      //  WebElement patil = driver.findElement(By.id("dropdown-class-example"));
		
		//create object of select class and pass varibal as aargument
		
	//	Select n =new Select(patil);
		// used select class method to select list box option
		//n.selectByValue("option2");              // select by valu
	//	n.selectByVisibleText("Option1");         //select by visible text
	//	n.selectByIndex(3);                     // select by Index
	//	 System.out.println( n.isMultiple());
	     Thread.sleep(3000);
		
	     WebDriver driver1 =new ChromeDriver();
	 	
	 	driver1.get("https://demoqa.com/select-menu");
	 	WebElement droupdown = driver1.findElement(By.id("cars"));
	 	Select k=new Select(droupdown);
	 	k.selectByIndex(1);
	 	k.selectByValue("volvo");
	 	//if you want to deslect one  option
	//  k.deselectByIndex(1);
	//	k.deselectAll();
	 	
	 	System.out.println(k.isMultiple());
	 	
	 	
	 	for(int i=0;i<=k.getAllSelectedOptions().size()-1;i++)
	 	{
	 		System.out.println(i);
	 		System.out.println(k.getAllSelectedOptions().get(i).getText());
	 	}
	 	System.out.println(k.getFirstSelectedOption().getText());
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	}

}
