package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10demoshop
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@12.9787393,77.5504666,15z");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//img[@alt='']/../../../div[]")).click();
	 Thread.sleep(1500);
	
	
	}
}