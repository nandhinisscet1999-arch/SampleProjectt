package testScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParaticeDataProvidersWithNumbers {
	@Test(dataProvider="getData")
	public void DataPtoviderswithNumbers(String Firstname,String Lastname,Long ContactNumber)
	{
		System.out.println(Firstname+" "+Lastname+" "+ContactNumber);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr = new Object[3][3];
		objArr[0][0] ="deepak";
		objArr[0][1] ="hr";
		objArr[0][2] =9845227919l;
		
		objArr[1][0] ="nandhini";
		objArr[1][1] ="agathiya";
		objArr[1][2] =9345249373l;
		
		objArr[2][0] ="Krishnamoorthy";
		objArr[2][1] ="agathiya";
		objArr[2][2] =9597259140l;
		
		return objArr;
		
	}

}
