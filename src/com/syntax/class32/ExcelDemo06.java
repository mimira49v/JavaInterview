package com.syntax.class32;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ExcelDemo06 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\Names.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        // A list of maps to store the data from excell each map will store the data from each row
        List<Map<String, String>> excelData = new ArrayList<>();
        // getting the header form the excell file so that we can use the data from this header row as keys
        // for the maps like first name last name etc
        Row headerRow = sheet.getRow(0);
        // we write a loop to get all the rows from this sheet except the first row because it contains the
        // headers
        for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
            // getting all the rows starting from raw number 2 skipping the first one because it contains headers
            Row row = sheet.getRow(j);
            // for each raw we create a new map (can't use the same map cuz it will override the data)
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
            // once we got the raw we fetch all the data from all the cells with the help of a loop
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                // we use the header row to get the keys and the row to get the values for the data
                linkedHashMap.put(headerRow.getCell(i).toString(),row.getCell(i).toString());
            }
            // once we are done storing all the data from a row inside a map,
            // we put the map inside the list that we created
            excelData.add(linkedHashMap);
        }
        System.out.println(excelData);
    }
}
