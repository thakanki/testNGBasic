package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

	// Interview: explain testNG .xml file use and advantage
	//every function convert as test by using annotation @
	
	// 	What are the annotation
	
	//where we have use @Test that is only executed in show Test run : value 
	
	//precondition put in @before suite and to close test case put in @after suite
	
	
	//Types of TestNG Annotations
	//Below is the list of annotations that TestNG support in Selenium
 
	//if we run testNG on perticular class then it will execute all annotation only within class
	// if run .xml with testng then all class annotation run

	//BeforeSuite
	//BeforeTest
	//BeforeClass
	//BeforeMethod
	//Test Case
	//AfterMethod
	//AfterClass
	//AfterTest
	//AfterSuite
	
	@BeforeSuite
	public void method1()
	{
		System.out.println("Test1Metho1");
	}
	
	@AfterTest
	public void method2()
	{
		System.out.println("Test1Metho2");
	}
	
	@Test
	public void method3()
	{
		System.out.println("Test1Metho3");
	}
	
	@Test
	public void method4()
	{
		System.out.println("Test1Metho4");
	}
	
	@BeforeClass
	public void method5()
	{
		System.out.println("Test1Metho5");
	}
	
	@AfterClass
	public void method6()
	{
		System.out.println("Test1Metho6");
	}
	
	@AfterSuite
	public void method7()
	{
		System.out.println("Test1Metho7");
	}
}
