package testNG_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderGoogleSearch1 {
	
	//1. India Qutub minar
	//2. Agra Taj mahal
	//3. Hyderabad charminar
	
//	@DataProvider(name = "searchDataSet")
//	public Object[][] searchData()
//	{
//		Object[][] searchKeyword = new Object[3][2];
//		searchKeyword[0][0] = "India";
//		searchKeyword[0][1] = "Qutub minar";
//		
//		searchKeyword[1][0] = "Agara";
//		searchKeyword[1][1] = "Taj Mahal";
//		
//		searchKeyword[2][0] = "Hyderabad";
//		searchKeyword[2][1] = "Charminar";
//		
//		return searchKeyword;
//	}
	
	
	//Fetch data from another class
	@Test(dataProvider = "searchDataSet", dataProviderClass = GoogleSearch1Data.class)
	void GoogleSearch(String City, String monuments)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(City + " " + monuments);
		searchText.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
