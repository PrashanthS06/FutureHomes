package StepDefinitions;

import org.openqa.selenium.By;

import Utilities.BaseClass;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLoginSteps extends BaseClass
{
	//Declaring object to implement methods from login page

	LoginPage login=new LoginPage();


	@Given ("user navigates to the URL") 
	public void user_navigates_url()
	{
		login.launchURL();			//calling the method to launch url
	}
	@ When ("entering random \"([^\"]*)\" and \"([^\"]*)\"$")

	public void  enter_username_password(String username,String password)
	{

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		login.clickSubmit();


	}

	@ Then ("Invalid Credentials message is displayed correctly")

	public void error_message_displayed()
	{	

		login.captureErrorMsg();		//calling the method to capture error message
		quit();

	}

}
