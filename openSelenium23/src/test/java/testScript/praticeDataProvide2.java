package testScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class praticeDataProvide2 {
	
	@Test(dataProvider="getData")
	public void data(String name,int id)
	{
		System.out.println(name+""+id);
	}
    @DataProvider
	public Object[][] getData()
	{
    	
    	Object[][]obj= new Object[2][2];
    	obj[0][0]="nandhini";
    	obj[0][1]=1;
    	
    	obj[1][0]="Agathiya";
    	obj[1][1]=2;
		return obj;
		
	}
	
}
