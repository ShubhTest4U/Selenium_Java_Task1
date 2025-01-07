package testNG_Program;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter_method {
	
	WebDriver driver;
	
	@Parameters({"base_url"})
	@Test
	void open_webpage( String base_url) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	}

	@Parameters({"Username", "Password"})
	@Test
	void double_parameter(String Username, String Password)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		usernameField.sendKeys(Username);
		//driver.findElement(By.name("username")).sendKeys(Username);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}
	
	@Parameters({"Username", "Password", "Login"})
	@Test(enabled = false)
	void three_parameter(String Username, String Password, String Login)
	{
		System.out.println(Username);
		System.out.println(Password);
		System.out.println(Login);
	}
	
	@AfterTest
	void close_webpage()
	{
		driver.quit();
	}
}
