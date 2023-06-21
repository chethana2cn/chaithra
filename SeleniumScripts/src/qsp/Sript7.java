package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sript7 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@href='/login']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("preethi12@gmail.com");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
	 Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Smartphone");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@type='submit' and @value='Search' and @class='button-1 search-box-button']")).click();
	 Thread.sleep(1500); 
	 driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	 Thread.sleep(1500); 
	 driver.findElement(By.xpath("//a[text( )='Shopping cart']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@href='/logout']")).click();
	 Thread.sleep(1500);
		
		
		
		
	
	
	

}
}
