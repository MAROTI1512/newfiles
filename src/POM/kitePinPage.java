package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage 
{

	//1.data membres
	
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")WebElement continueButton;
	
	//2.constructor
	public kitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3.methods
	
	
	public void sendpin()
	{
		PIN.sendKeys("151215");
	}
	public void clickOnContinubutton()
	{
		continueButton.click();
	}
}
