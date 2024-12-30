package All_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Selenium");



	}

}
