package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13map 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@12.9968619,77.5504667,15z");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("preethi12@gmail.com");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
	 Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	 Thread.sleep(1500);
	
}
}
