package lib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Osanda on 10/3/2016.
 */
public class ExcelDataConfig {
    XSSFWorkbook wb;
    XSSFSheet sheet;
    String ROOT = System.getProperty("user.dir");
    public ExcelDataConfig(String excelPath ){
       try{
           File src=new File(ROOT + "\\TestData.xlsx");
           FileInputStream fis=new FileInputStream(src);
           wb=new XSSFWorkbook(fis);
       }
       catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetNumber, int row, int column) {
        sheet = wb.getSheetAt(sheetNumber);
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }

}
