package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebsript17
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/qat.html");
	Thread.sleep(1500);
	WebElement first_text=driver.findElement(By.id("email"));
	user_text.sendKeys("data entered");
	Thread.sleep(1500);
	user_text.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(1500);
	
	
	
	
}
}


