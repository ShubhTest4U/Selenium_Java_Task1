package testNG_Program;

import org.testng.annotations.Test;

public class priority_method {
	
	
	//Priority sequesnce -3,-2,-1,0,1,2
	
	@Test(priority = 2)
	void first()
	{
		System.out.println("First");
	}
	
	@Test(priority = 0)
	void second()
	{
		System.out.println("second");
	}
	
	@Test(priority = 1)
	void third()
	{
		System.out.println("third");
	}
	
	@Test(priority = -3)
	void fourth()
	{
		System.out.println("fourth");
	}
	
	@Test(priority = -2)
	void fifth()
	{
		System.out.println("fifth");
	}
	
}




