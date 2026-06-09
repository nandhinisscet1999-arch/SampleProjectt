package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/TestData3/Commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String Url = prop.getProperty("url");
		System.out.println(Url);
		String user = prop.getProperty("username");
		System.out.println(user);
		String pass = prop.getProperty("password");
		System.out.println(pass);

	}

}
