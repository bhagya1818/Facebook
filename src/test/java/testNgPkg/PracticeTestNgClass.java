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

public class PracticeTestNgClass {
	
	@BeforeSuite
	public void beforeSuits() {
		
		System.out.println("Before Suits");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
	}
	
	@Test
	public void test() {
		
		System.out.println("Test 1");
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test 2");
		
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test 3");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class");
		
	}
	
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuits() {
		
		System.out.println("After Suits");
	}
	
	
	
 }
