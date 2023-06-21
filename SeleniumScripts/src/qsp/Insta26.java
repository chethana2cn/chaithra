package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta26
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1500);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement un=driver.findElement(By.name("username"));
	Thread.sleep(1500);
	un.sendKeys("1234567");
	WebElement pwd=driver.findElement(By.name("password"));
	pwd.sendKeys("9634566");
	Thread.sleep(1500);
	WebElement btn=driver.findElement(By.xpath("//button[@type='submit']'"));
	Thread.sleep(1500);
	js.executeScript("arguments[0].click();", btn);
	
	
	
	
	

	
	
	
}
}
