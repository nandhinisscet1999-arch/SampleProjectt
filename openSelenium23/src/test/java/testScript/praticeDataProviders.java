package testScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class praticeDataProviders {
	@Test(dataProvider = "getData")
	public void praticedataproviders(String firstName, String LastName)
	{
		System.out.println(firstName+" "+LastName);
	}
	@DataProvider
	public Object[][] getData()
	{
		//3==>how many times we want to execute
		//2==>how many parameters we want to pass
		Object[][] ObjArr = new Object[3][2];
		ObjArr[0][0]="deepak";
		ObjArr[0][1]="hr";
		
		ObjArr[1][0]="nandhini";
		ObjArr[1][1]="agathiya";
		
		ObjArr[2][0]="krishnamoorthy";
		ObjArr[2][1]="agathiya";
		
		return ObjArr;
		
	}

}
