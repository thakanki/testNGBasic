package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodInSelenium {

	//the test where we apply depends on method will excute at end if depended method pass then the dependsOnMethod will get exceute
	
	// to get dependsOnMethds  after de preses ctrl + space
	
	@Test(dependsOnMethods= {"Method2"})
	public void method1()
	{
		System.out.println("Method1");
	}
	
	@Test
	public void method2()
	{
		//here condition is fail 
		Assert.assertEquals("20", "21");
		//System.out.println("Method2");
	}
	
	@Test
	public void method3()
	{
		System.out.println("Method3");
	}
	
	
}
