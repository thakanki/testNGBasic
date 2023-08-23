package Demo;

import org.testng.annotations.Test;

public class prioritiesInTestNG {
	
	// -1,0,1,2,3....
	//Default priority will be 0
	//priority will be negative number
	
	// if priority is same then it will go with alphabetic

	@Test(priority =1)
	public void method1()
	{
		System.out.println("prioritiesinmetho1");
	}
	
	@Test(priority =0)
	public void method2()
	{
		System.out.println("prioritiesinmetho2");
	}
	
	@Test(priority =-1)
	public void method3()
	{
		System.out.println("prioritiesinmetho1");
	}
}
