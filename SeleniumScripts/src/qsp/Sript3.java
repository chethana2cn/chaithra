package qsp;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Sript3
	{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipcart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement Search_text = driver.findElement(By.id("Search for products, brands and more"));
			Search_text.sendKeys("mobile phones");
			Thread.sleep(2000);
			Search_text.clear();
	}
	}



