package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class BaseClass 
{

	// Declaration of driver and file properties

	public static WebDriver driver;
	File propfile, datafile;
	FileInputStream fip,fis;
	Properties prop;

	public void initialconfig()
	{
		propfile = new File(System.getProperty("user.dir")+"//src//test//resources//config//config.properties");

		try 
		{
			fip=new FileInputStream(propfile);
			prop= new Properties();
			prop.load(fip);
		} catch (FileNotFoundException e) {

			System.out.println("FileNotException caught in the initialconfig:"+e.getMessage());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// Method to read the config property file

	public String ReadPropertyFile(String key)
	{
		return prop.getProperty(key);

	}

	// Method to launch the URL

	public void launchURL()
	{
		initialconfig();
		System.setProperty("webdriver.chrome.driver", ReadPropertyFile("chromedriverpath"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadPropertyFile("applicationaurl"));
	}

	// Method to capture Screenshot

	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{

		try 
		{
			TakesScreenshot screenshot=(TakesScreenshot)driver;

			File source=screenshot.getScreenshotAs(OutputType.FILE);

			FileHandler.copy(source, new File(("user.dir")+"//Screenshots//"+screenshotName+".png"));

		} 
		catch (Exception e)
		{

			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
	}

	// Method to close the browser

	public void quit()
	{
		driver.quit();
	}


}



