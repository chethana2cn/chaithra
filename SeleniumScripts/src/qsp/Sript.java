package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript
{
	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1500);
	 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("hello@gmail.com");
	 Thread.sleep(1500);
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("hii@gmail.com");
	 Thread.sleep(1500);
	 driver.findElement(By.cssSelector("button[type='summit']")).click();
	 Thread.sleep(1500);



}
}
