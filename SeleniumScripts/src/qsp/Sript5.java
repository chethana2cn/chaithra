package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript5
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	Thread.sleep(1500);
	 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hana");
	 Thread.sleep(1500);
	 driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hello@gmail.com");
	 Thread.sleep(1500); 
	 driver.findElement(By.cssSelector(" input[textarea placeholder='Current Address']")).sendKeys("bangalore");
	 Thread.sleep(1500); 
	 driver.findElement(By.cssSelector("input[id='Permanent Address']")).sendKeys("bangalore");
	 Thread.sleep(1500); 
	 driver.findElement(By.cssSelector("button[type='summit']")).click();
	 Thread.sleep(1500);

	
	

	
				
	

}
}
