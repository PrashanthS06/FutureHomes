package StepDefinitions;

import Utilities.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidLoginSteps extends BaseClass

{
	//Declaring object to implement methods from login and home page

	LoginPage login=new LoginPage();
	HomePage home=new HomePage();

	@Given("user navigates to the desired URL")

	public void user_navigates_desired_url()
	{
		login.launchURL();   //calling the method to launch url
	}

	@When ("entering username and password by Capturing in the screen")

	public void capture_username_password()
	{
		login.captureCredentials();   //calling the method to capture credentials
	}

	@Then("login should be successful")

	public void login_successful()
	{
		login.clickSubmit();       //calling the method to click on submit button
	}

	@And("Print the Name of the user")

	public void print_user_name()
	{
		home.successMsg();       // calling the method to capture user name
		home.logout();        	 //calling the method to logout
		quit();					// //calling the method to close browser
	}

}
