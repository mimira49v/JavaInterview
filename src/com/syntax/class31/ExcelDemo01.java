package com.syntax.class31;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo01 {
    public static void main(String[] args) throws IOException, IOException {
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\Book1.xls";
        FileInputStream fileInputStream = new FileInputStream(path);
        HSSFWorkbook xssfWorkbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);
    }
}
