package testNgPkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTestNgClass {
	
	@BeforeSuite
	public void beforeSuits() {
		
		System.out.println("Before Suits - Automation");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test - Automation");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class - Automation");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method - Automation");
	}
	
	@Test
	public void test() {
		
		System.out.println("Test 1 - Automation");
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test 2 - Automation");
		
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test 3 - Automation");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method - Automation");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class - Automation");
		
	}
	
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test - Automation");
	}
	
	@AfterSuite
	public void afterSuits() {
		
		System.out.println("After Suits - Automation");
	}

}
