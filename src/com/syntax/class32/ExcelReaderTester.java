package com.syntax.class32;

import com.syntax.class32.util.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        ExcelReader ExcelReader = new ExcelReader();
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\Previous LapTop\\Test\\PPP.xlsx";
        List<Map<String, String>> excelData = ExcelReader.getData(path,"Sheet1");
        System.out.println(excelData.get(1).get("FirstName"));
        System.out.println(excelData.get(1).get("LastName"));
    }
}
