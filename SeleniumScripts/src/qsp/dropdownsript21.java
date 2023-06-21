package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsript21 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/heroines.html");
	Thread.sleep(1500);
	WebElement dropdown= driver.findElement(By.xpath("//select[@id='heroines']"));
	Select sel=new Select(dropdown);
	sel.selectByIndex(7);
	Thread.sleep(1500);
	sel.selectByValue("D");
	Thread.sleep(1500);
	sel.deselectByVisibleText("pallavi");
	Thread.sleep(1500);
	sel.deselectAll();
	
	
}
}
