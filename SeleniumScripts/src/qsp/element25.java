package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element25 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	Thread.sleep(1500);
	driver.manage().window().fullscreen();
	Thread.sleep(1500);
	WebElement  textfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 Thread.sleep(1500);
	 if(textfield.isDisplayed())
	 {
		 if(textfield.isEnabled())
		 {
		 textfield.sendKeys("Displayed and enabled");
	 }
	 else
	 {
		 System.out.println("Displayaed");
	 }
		 
	 }
	 else
	 {
		 System.out.println(" not Displayaed");
	 }
		 
}

	
		
	}



