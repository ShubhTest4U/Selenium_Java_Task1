package All_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("Selenium");
		List<WebElement> SuggestionList = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		System.out.println("Size of SuggestionList=" + SuggestionList.size());

		for (WebElement ListIteam : SuggestionList) 
		{
			if(ListIteam.getText().contains("downloasd"))
			{
				System.out.println(ListIteam.getText().contains("download"));
				ListIteam.click();
				break;
			}
		}
		

	

}
}
