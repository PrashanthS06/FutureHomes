package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import Utilities.BaseClass;



public class HomePage extends BaseClass
{
	//Locating the element in the Home Page

	By LoginMsg=By.partialLinkText("Welcome");
	By Logout=By.linkText("Logout");

	// Method to retrieve the user name after successful login

	public void successMsg()
	{
		String Successmsg=driver.findElement(LoginMsg).getText();
		System.out.println("Successful Login Message : " +Successmsg);

		String[] splituser=Successmsg.split("\\s");

		List<String> Usermsg=new ArrayList<String>();

		for(String username:splituser)
		{
			Usermsg.add(username);
		}
		String LoggedinUser = Usermsg.get(1);

		System.out.println("The name of the user is : " +LoggedinUser);
	}

	// Method to Logout the Browser

	public void logout()
	{
		driver.findElement(LoginMsg).click();
		driver.findElement(Logout).click();
	}
}
