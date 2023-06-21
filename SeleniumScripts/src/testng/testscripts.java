package testng;

import org.apache.commons.compress.harmony.pack200.CPClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testscripts 
{
	@Test
	public void Script()
	{System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	Pomclass pmc=new pomclass(driver);
	pmc.username("first data");
	Thread.sleep(2000);
	driver.navigate();
	Thread.sleep(2000);
	pmc.username("second data");
	
		
	
}
}
 


