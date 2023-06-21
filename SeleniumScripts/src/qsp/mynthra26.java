package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mynthra26
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("watches");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//span[@data-reactid='909']")).click();
	  Thread.sleep(1500);
}
}
