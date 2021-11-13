package testNgframework;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/*BeforeSuite
BeforeTest
BeforeClass

BeforeMethod
Test
AfterMethod

BeforeMethod
Test1
AfterMethod

BeforeMethod
Test2
AfterMethod

AfterClass
AfterTest*/
//ASCII order
public class FirstProject {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@Test // (retryAnalyzer=
			// retryAnalyser.Retryanalyser.class)//retryAnalyzer(class)=package.classname.class
	public void Test2() {
		System.out.println("Test2");
		Assert.assertEquals(false, true);
	}

	@Test(priority = 2)
	public void Test() {
		System.out.println("Test");
		Assert.assertEquals(false, true);
	}

	@Test // (retryAnalyzer= retryAnalyser.Retryanalyser.class)
	public void Test1() {
		System.out.println("Test1");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
}
