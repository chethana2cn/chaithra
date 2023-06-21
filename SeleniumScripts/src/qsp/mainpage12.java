package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class mainpage12
{

	public static void main(String[] args) throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/mainpage1.html");
		Thread.sleep(2500);
		driver.findElement(By.id("a1")).sendKeys("abc");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		WebElement ele= driver.findElement(By.id("f1"));
		driver.switchTo().frame(ele);
		Thread.sleep(2500);
		driver.findElement(By.id("b1")).sendKeys("xyz");
		
	
		
		
}
}