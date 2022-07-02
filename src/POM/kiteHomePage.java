package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage 

{
    //1. data member 
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;

   @FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;


  //2.constructor
   
public kiteHomePage(WebDriver driver)
{
	 PageFactory.initElements(driver, this);
}


//3. method 
   public void  validateUserID()
   {
	   String actualUserID = userID.getText();
	 String expectedUserID = "GNU415";
	 
	 if (actualUserID.equals(expectedUserID))
	 {
		 System.out.println("user ID matching TC is passed");
	 }
	 
	 else {
		 System.out.println("user ID not matching TC is faild");
		 
	 }
   }
   public void clickonLogoutButton() throws InterruptedException
   {
	   userID.click();
	   Thread.sleep(200);
	   logoutButton.click();
   }

}
