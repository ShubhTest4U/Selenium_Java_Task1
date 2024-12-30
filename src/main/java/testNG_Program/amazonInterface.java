package testNG_Program;

import org.openqa.selenium.By;

public interface amazonInterface {
	
	String base_url ="https://www.amazon.in/";
	By id = By.id("nav-link-accountList");
	//By account = By.xpath("//span[normalize-space()='Your Account']");
	By account = By.linkText("Your Account");
	By Your_Orders = By.xpath("//h2[normalize-space()='Your Orders']");
	//*[starts-with(text(),'Your Orders')]
}
