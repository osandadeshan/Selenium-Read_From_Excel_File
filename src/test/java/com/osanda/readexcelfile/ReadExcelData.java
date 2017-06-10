package com.osanda.readexcelfile;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Osanda on 10/3/2016.
 */
public class ReadExcelData {
    static String ROOT = System.getProperty("user.dir");

    public static void main(String[] args) throws Exception {
        File src=new File(ROOT + "\\TestData.xlsx");
        FileInputStream fis=new FileInputStream(src);

        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet1=wb.getSheetAt(0);

     /*   // Reading one cell of the Excel file
        String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is "+data0);    */

        for(int i=0; i<= sheet1.getLastRowNum(); i++){
            String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println("Data from Excel is "+data0);
        }
        fis.close();
    }
}
