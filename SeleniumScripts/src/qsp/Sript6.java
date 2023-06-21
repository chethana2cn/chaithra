package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript6
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://shaadi.com");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello@gmail.com");
	 Thread.sleep(1500); 
	 driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("bangalore");
	 Thread.sleep(1500); 
	 driver.findElement(By.xpath("//button[@data-testid='sign_in']")).click();
	
	
	
}
}
