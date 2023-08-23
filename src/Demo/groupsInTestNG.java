package Demo;

import org.testng.annotations.Test;

public class groupsInTestNG {
	
	@Test(groups ={"Smoke testing", "Regression"})
	public void method1()
	{
		System.out.println("groupsInTestNGMethod1");
	}
	
	@Test (groups="Regression")
	public void method2()
	{
		System.out.println("groupsInTestNGMethod2");
	}

	@Test(groups="Regression")
	public void method3()
	{
		System.out.println("groupsInTestNGMethod3");
	}
}
