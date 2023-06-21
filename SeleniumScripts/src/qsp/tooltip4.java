package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip4
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1500);
    WebElement login_btn= driver.findElement(By.xpath("//h2[contains(text().face"));
	Dimension Size=login_btn.getSize();
	System.out.println(Size);
	int h=Size.getHeight();
	int w=Size.getWidth();
	
	 
	
	 
}
}


