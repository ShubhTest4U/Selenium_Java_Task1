package testNG_Program;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazon_Testng implements amazonInterface {
	
	ChromeDriver driver;
	@BeforeTest
	void open_webpage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		System.out.println("Webpage opened");
		Thread.sleep(9000);
	}
	@Test
	void Mouse_Hover()
	{
		Actions action = new Actions(driver);
		WebElement mv = driver.findElement(id);
		action.moveToElement(mv).perform();
		driver.findElement(account).click();
	
	}
	@Test
	void Your_Orders()
	{
		driver.findElement(Your_Orders).click();
	}
	
	@AfterTest
	void close()
	{
		System.out.println("Webpage closed");
		driver.close();
	}

}
