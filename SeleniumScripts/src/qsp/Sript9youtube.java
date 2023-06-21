package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript9youtube
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://youtube.com/");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("the hills weeknd");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.linkText("The Weeknd - The Hills")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//yt-formatted-string[@id='content']")).click();
	 Thread.sleep(1500);
	
	
	
	
	
	
     

     

	
	
	
	
	
	
     

     

}
}