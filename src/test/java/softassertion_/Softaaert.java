package softassertion_;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softaaert {
	
	SoftAssert softassertion= new SoftAssert();
	@Test
	public void tes1() {
		System.out.println("number1");
		System.out.println("number2");
		softassertion.assertEquals(false,true,"fistsoft");
		System.out.println("number3");
		System.out.println("number4");
		softassertion.assertEquals(false,true,"2soft");
		
		System.out.println("number5");
		System.out.println("number6");
		softassertion.assertEquals(false,true,"3soft");

//		softassertion.assertAll();// executes but shows test cases failure ..
		//in absence of sotassertion.asserAll() all test assertions are shown as passed
		
	}
	@Test
	public void test3() {
		System.out.println("numv");
		System.out.println("num");
		softassertion.assertEquals(false,true,"test3");
	}

	@Test
	public void test2() {
		System.out.println("in test2");
		
		Assert.assertEquals(false, true,"1hard");
	}
	
	
}
