package Utilities;

import org.junit.After;
import io.cucumber.java.Scenario;


public class Hooks extends BaseClass
{
	
	// Method to take screenshot for the failed case
	
	@After
	public void screenshot(Scenario scenario)  {
		try {
            String screenshotName = scenario.getName();
            if (scenario.isFailed()) 
            {
            	captureScreenshot(driver,screenshotName);
            
            }
		} catch (Exception e) 
		{
            e.printStackTrace();
        }
	
}

}
	




