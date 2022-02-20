package Pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import Utilities.BaseClass;



public class LoginPage extends BaseClass


{
	// Locating the elements in LoginPage and Storing it in variable 

	By Username = By.id("txtUsername");
	By Password=By.id("txtPassword");
	By Submit=By.name("Submit");
	By Errormsg=By.id("spanMessage");
	By UserCredentials=By.xpath("//span[contains(text(), 'Username :')]");

	// Storing the expected error message to validate

	String ExpectedError="Invalid credentials";


	// Method to click on the submit button

	public HomePage clickSubmit()
	{
		driver.findElement(Submit).click();
		return new HomePage();
	}

	//Method to Capture the Error Message 

	public void captureErrorMsg()
	{
		String ActualError=driver.findElement(Errormsg).getText();

		if(ExpectedError.equals(ActualError))
		{
			System.out.println("The Expected Error Message is displayed:" +ActualError);

		}
		else
		{
			System.out.println("The Expected Error Message is not displayed:" +ActualError);

			{	System.out.println("**calling 3...");
			captureScreenshot(driver, "FailTest");
			}
		}

	}

	//Method to Capture the User Credentials from the login Page

	public void captureCredentials()
	{
		String BothCredentials=driver.findElement(UserCredentials).getText();
		String Login=BothCredentials.replaceAll("[\\s\\(\\)]", "");
		System.out.println(Login);
		String[] Credentials=Login.split("[\\:\\|]");

		List<String> credentialList= new ArrayList<String>();

		for(String credentialvalue:Credentials)
		{

			credentialList.add(credentialvalue);

		}

		String username= credentialList.get(1);
		String password= credentialList.get(3);
		System.out.println("The Username is : " + username);
		System.out.println("The Password is : " + password);
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);



	}


}
