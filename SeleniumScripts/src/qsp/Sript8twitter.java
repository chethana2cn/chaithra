package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript8twitter
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://twitter.com/");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@href='/login']")).click();
	 Thread.sleep(4500);
      driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("hana@gmail.com");
	 Thread.sleep(3500);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	 Thread.sleep(1500);
		
		

}
}