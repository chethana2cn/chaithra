package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsript20
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/heroines.html");
	Thread.sleep(1500);
	WebElement dropdown= driver.findElement(By.xpath("//select[@id='heroines']"));
	Select sel=new Select(dropdown);
	if(sel.isMultiple()) 
	{
		System.out.println("multiple");
	}
	else
	{
		System.out.println("single");
	}
	

}
}
