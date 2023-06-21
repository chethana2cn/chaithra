package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class instagram14
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9686477358");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("chai1@");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 Thread.sleep(1500); driver.findElement(By.xpath("//input[@aria-label='Search Facebook']/../../div[1]\")")).click();
	 Thread.sleep(1500);
		
	



}
}