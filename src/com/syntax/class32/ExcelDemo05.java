package com.syntax.class32;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo05 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\Batch12.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        Sheet sheet = hssfWorkbook.createSheet("Sheet1");
        for(int i =0; i<10;i++){
            Row row = sheet.createRow(i);
            for (int j = 0; j < 5; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(i+" "+j);
                cell.setCellValue("Milos");
            }
        }
        hssfWorkbook.write(fileOutputStream);
    }
}
