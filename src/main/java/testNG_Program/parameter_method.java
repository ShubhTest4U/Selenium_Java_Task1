package testNG_Program;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter_method {
	
	WebDriver driver;
	
	@Parameters({"base_url"})
	@Test
	void open_webpage( String base_url)
	{
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
	}

	@Parameters({"Username", "Password"})
	@Test
	void double_parameter(String Username, String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@Parameters({"Username", "Password", "Login"})
	@Test
	void three_parameter(String Username, String Password, String Login)
	{
		System.out.println(Username);
		System.out.println(Password);
		System.out.println(Login);
	}
	
	@AfterClass
	void close_webpage()
	{
		driver.quit();
	}
}
