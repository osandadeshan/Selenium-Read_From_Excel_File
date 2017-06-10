package com.osanda.readexcelfile;

import lib.ExcelDataConfig;

/**
 * Created by Osanda on 10/3/2016.
 */

public class ReadExcelDataUsingLib {
    static String ROOT = System.getProperty("user.dir");

    public static void main(String[] args) {
        ExcelDataConfig excel=new ExcelDataConfig(ROOT + "\\TestData.xlsx");
        System.out.println(excel.getData(0,0,0));
    }

}
