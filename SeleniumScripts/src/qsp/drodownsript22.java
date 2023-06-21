package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drodownsript22
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	 Thread.sleep(1500);
	WebElement dropdown= driver.findElement(By.xpath("//select[@id='day']"));
	WebElement dropdown1= driver.findElement(By.xpath("//select[@id='month']"));
	WebElement dropdown2= driver.findElement(By.xpath("//select[@id='year']"));
	Select sel=new Select(dropdown);
	sel.selectByValue("3");
	Select sel1=new Select(dropdown1);
	sel1.selectByValue("8");
	Select sel2=new Select(dropdown2);
	sel2.selectByValue("2000");



}
}
