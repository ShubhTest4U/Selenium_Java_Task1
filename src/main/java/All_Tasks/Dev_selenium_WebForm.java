package All_Tasks;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.text.Document;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dev_selenium_WebForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		WebElement title = driver.findElement(By.className("display-6"));
		String firstName = title.getText();
		System.out.println();
		if(firstName.equals("Web form"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		driver.findElement(By.id("my-text-id")).sendKeys("Shubh");
		driver.findElement(By.name("my-password")).sendKeys("Test");
		String text = "My name is shubhma";
		driver.findElement(By.cssSelector("textarea[name='my-textarea']")).sendKeys(text);
		driver.findElement(By.linkText("Return to index")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='blank.html'])[1]")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().back();
		WebElement S = driver.findElement(By.cssSelector("select[name='my-select']"));
		Select sel = new Select(S);
		sel.selectByIndex(2);
		WebElement S1 = driver.findElement(By.xpath("//input[@list=\"my-options\"]"));
		S1.sendKeys("San Francisco");
		WebElement uploadFile = driver.findElement(By.name("my-file"));
		String filePath = "C:\\Users\\shubham.kori\\Downloads\\case1.png";
		uploadFile.sendKeys(filePath);
		driver.findElement(By.id("my-check-1")).click();
		System.out.println("First Checkbox is cleared");
		driver.findElement(By.id("my-check-1")).click();
		System.out.println("Second Checkbox is select");
		driver.findElement(By.id("my-check-2")).click();
		System.out.println("Third Checkbox is selected");
		driver.findElement(By.id("my-radio-2")).click();
		
		WebElement datePicker = driver.findElement(By.name("my-date"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		String currentDate = dateFormat.format(new Date());
		datePicker.sendKeys(currentDate);
		System.out.println(datePicker.getText());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement formSubmit = driver.findElement(By.xpath("//h1[@class=\"display-6\"]"));
		System.out.println(formSubmit.getText());

		driver.quit();
	}

}
