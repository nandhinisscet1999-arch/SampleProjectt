package testScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
		
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("./src/TestData3/TestScriptData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet shet=wb.getSheet("org2");
	 for(int i =0;i<=shet.getLastRowNum();i++)
	 {
		     Row row = shet.getRow(i);
		     
		  for(int j=0;j<row.getLastCellNum();j++)
		  {
			  Cell cel = row.getCell(j);
			  System.out.println(cel);
		  }
	 }

	 
	}
}
