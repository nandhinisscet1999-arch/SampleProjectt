package testScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassExample.BaseClass1;
import genericUtility.listerner;
@Listeners(listerner.class)

public class Pratice2 extends BaseClass1 {
	@Test
	public void t3()
	{
		System.out.println("t1");
		//Assert.fail();
	}
	
	@Test
	public void t4()
	{
		System.out.println("t2");
	}


}
