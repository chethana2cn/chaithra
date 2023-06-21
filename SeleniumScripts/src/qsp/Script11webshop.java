package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11webshop
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@href='/books']/../../../../../../div[4]/div[2]/ul[1]/li[1]/a")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@href='/computing-and-internet']/../../../../../../../div[2]/div[1]/h1")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//a[@href='/fiction']/../../div[3]/div[2]/input")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//input[@type='button']/../../div[4]")).click();
	 Thread.sleep(1500);
	
	
}
	
}

