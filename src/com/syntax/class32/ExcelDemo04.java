package com.syntax.class32;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo04 {
    // CREATING CELL NAMED ALI BURAFA //
    public static void main(String[] args) throws IOException {
    String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\Batch12.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        Sheet sheet = hssfWorkbook.createSheet("Batch12");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Ali Burafa");
        hssfWorkbook.write(fileOutputStream);
    }
}
