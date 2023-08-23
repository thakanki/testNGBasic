package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvidersInTestNG {
	
	//@Dataprovider one of the annotation
	// use to execute same test case with same data multiple time then we use invocation count
	// when we have small data (e.g username and password with 5 member details)
    // it is read data sequentially however we pass it

	@DataProvider
	 public Object [][] Testdata()
	 {
		Object [][] myData = new Object [2][3];
		
		String str ="Test1";
		
		//Enter data to row 0 and column 0
		myData [0][0] =str;
		
		//Enter data to row 0 and column 1
		myData [0][1] ="Test11";
		
		//Enter data to row 0 and column 2
		myData [0][2] ="Test111";
		
		//Enter data to row 0 and column 2
		myData [1][0] ="Test1111";
		
		//Enter data to row 0 and column 2
		myData [1][1] ="Test11111";
		
		 //Enter data to row 0 and column 2
		myData [1][2] ="Test111111";
		
		return myData;
		
	 }
	
	@DataProvider
	 public Object [][] Testdata1()
	 {
		Object [][] myData = new Object [2][3];
		
		String str ="Test1";
		
		//Enter data to row 0 and column 0
		myData [0][0] =str;
		
		//Enter data to row 0 and column 1
		myData [0][1] ="Test11";
		
		//Enter data to row 0 and column 2
		myData [0][2] ="Test111";
		
		//Enter data to row 0 and column 2
		myData [1][0] ="Test1111";
		
		//Enter data to row 0 and column 2
		myData [1][1] ="Test11111";
		
		 //Enter data to row 0 and column 2
		myData [1][2] ="Test111111";
		
		return myData;
	
		
	 }
	
	  // we can create multiple testdata
	
		@Test(dataProvider="Testdata")
		public void method(String username, String password, String password1)
		{
		System.out.println("Username is :" + username);
		System.out.println("Password is :" + password);
		System.out.println("Password1 is :" + password1);
		System.out.println("Password1 is :" + password);
		}
		
		
	 
		@Test(dataProvider="Testdata1")
		public void method1(String username1, String password1, String password11)
		{
		System.out.println("Username is :" + username1);
		System.out.println("Password is :" + password1);
		System.out.println("Password1 is :" + password11);
		
		}
	 
}
