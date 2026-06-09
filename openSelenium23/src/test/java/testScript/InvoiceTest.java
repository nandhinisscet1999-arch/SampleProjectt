package testScript;


import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassExample.BaseClassUtility;

public class InvoiceTest extends BaseClassUtility {

	@Test
	public void createInvoiceTest() {
		System.out.println("execute createInvoiceTest");

		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "login");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");

	}

	@Test
	public void createInvoiceWithContactTest() {
		System.out.println("execute createInvoiceWithContactTest");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
	}

}
