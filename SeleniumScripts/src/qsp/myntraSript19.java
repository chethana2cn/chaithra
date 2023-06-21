package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraSript19
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@placeholder='Search for products,brands and more']")).sendKeys("shoes");
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@class='desktop-summit']")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@class='results-base']/li[5]")).click();
	 Thread.sleep(1500);



}
}
