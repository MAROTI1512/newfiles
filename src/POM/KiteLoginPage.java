package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 

    //1. data member /veraibles
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement UserID;
	
    @FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;
	

	// constructor
	public KiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    //. method 
	public void sendUserName()
	{
		UserID.sendKeys("GNU415");
	}
	public void sendPassword()
	{
		PWD.sendKeys("maroti1512");
	}
	
	public void clickonloginButton()
	{
		LoginButton.click();
	}
}
