package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/diabled.html");
	Thread.sleep(1500);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('text-field'). value='abc'");
	Thread.sleep(1500);
	js.executeScript("document.getElementById('text-field'). value=''");
	Thread.sleep(1500);
	
	

	
}
}
