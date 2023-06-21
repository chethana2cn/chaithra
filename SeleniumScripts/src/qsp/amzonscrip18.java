package qsp;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzonscrip18
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	Thread.sleep(1500);
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	for(WebElement link:links)
	{
		String ref_point=link.getAttribute("href");
		System.out.println(ref_point);
		
	}
	
		
	}
}

 