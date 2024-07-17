package utils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {

public static String[][] getExcelData(String fileName,String sheetName){

    String [][] arrayExcelData = null;

    try{
        FileInputStream fs = new FileInputStream(fileName);

        HSSFWorkbook workbook = new HSSFWorkbook(fs);

        HSSFSheet sheet = workbook.getSheet(sheetName);

        HSSFRow row = sheet.getRow(0);

        int noOfCol = row.getLastCellNum();

        int noOfRows = sheet.getPhysicalNumberOfRows();

        arrayExcelData = new String[noOfRows-1][noOfCol];
        Cell cell;
        for(int i =1;i<noOfRows;i++){
            for(int j=0;j<noOfCol;j++){
                row  = sheet.getRow(i);
                cell = row.getCell(j);

                arrayExcelData[i-1][j] = cell.getStringCellValue();
            }
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    return arrayExcelData;
}

}
