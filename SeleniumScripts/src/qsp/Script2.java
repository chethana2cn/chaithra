package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		WebElement d=driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]"));
		d.click();
		driver.findElement(By.xpath("(//button[@name='child'])[2]")).click();
		Thread.sleep(5000);
		WebElement btn=driver.findElement(By.xpath("//button[@align='right']/../../div[2]/button"));
		btn.click();
		Thread.sleep(5000);
		WebElement btns=driver.findElement(By.xpath("//input[@type='file']"));
		btns.sendKeys("C:\\Users\\Admin\\Downloads\\demo-data.xlsx");
		driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")).click();
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screen/prexo.png");
		FileHandler.copy(src, dst);
	}

}
