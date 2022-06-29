package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo07 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\Names.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(6);
        row.createCell(0).setCellValue("Asel");
        row.createCell(1).setCellValue("KIyatova");
        row.createCell(2).setCellValue("16");
        row.createCell(3).setCellValue("Almaty");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);


    }
}

//FirstName	LastName	Age	CIty
//Donald	Duck	25	Disneyland
//Ali	Bouarfa	31	Orlando
//Johny	Bravo	34	Hollywood
//Coco	Chanel	33	Hollywood
//Nassir	Airyan	60	Walnut Creek
//Asel	KIyatova	16	Almaty
