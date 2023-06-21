package qsp;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngsecondsript
{
@Test
public void lunch()
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
driver.get("https://www.moneycontrol.com");
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement stk = driver.findElement(By.xpath("//a[text()='STOCK ACTION']"));
js.executeScript("arguments[0].ScrollIntoview();",stk);
stk.click();






	

}
}
