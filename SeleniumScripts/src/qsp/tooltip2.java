package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tooltip2
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1500);
    WebElement welcome_text= driver.findElement(By.xpath("//h2[contains(text().face"));
	String text= welcome_text.getText();
	System.out.println(text);
    		
    	

	 
}
}
