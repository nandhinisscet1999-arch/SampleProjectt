package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

    String path = "./src/TestData3/TestScriptData.xlsx";

    // ✅ Read data (FIXED)
    public String getDataFromExcel(String sheet, int rownum, int column)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        DataFormatter formatter = new DataFormatter();

        String data = formatter.formatCellValue(
                wb.getSheet(sheet)
                  .getRow(rownum)
                  .getCell(column)
        );

        wb.close();
        return data;
    }

    // ✅ Get row count
    public int getRowCount(String sheetName)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        int rowcount = wb.getSheet(sheetName).getLastRowNum();

        wb.close();
        return rowcount;
    }

    // ✅ Write data (FIXED)
    public void setDataIntoExcel(String sheetName, int rownum, int column, String data)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheet(sheetName);

        Row row = sheet.getRow(rownum);
        if (row == null) {
            row = sheet.createRow(rownum);
        }

        Cell cell = row.getCell(column);
        if (cell == null) {
            cell = row.createCell(column);
        }

        cell.setCellValue(data);

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);

        wb.close();
    }
}