package com.syntax.class32;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelDemo03 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\Batch12.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        HSSFWorkbook lilly=new HSSFWorkbook(fileInputStream);
        Sheet sheet=lilly.getSheet("Sheet1");
        // System.out.println(lilly.getSheetIndex("Sheet1"));
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row=sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
