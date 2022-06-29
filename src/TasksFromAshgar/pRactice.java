package TasksFromAshgar;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class pRactice {
  public static List<Map<String, String>> getData (String path,String sheetName) throws IOException {
    FileInputStream fis = new FileInputStream(path);
    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
    Sheet sheet = xssfWorkbook.getSheet(sheetName);
    List<Map<String, String>> excelData = new ArrayList<>();
    Row headerRow = sheet.getRow(0);
    for(int j = 1; j<sheet.getPhysicalNumberOfRows(); j++){
      Row row = sheet.getRow(j);
      LinkedHashMap<String,String>linkedHashMap = new LinkedHashMap<>();
      for(int i=1;i<sheet.getPhysicalNumberOfRows();i++){
        linkedHashMap.put(headerRow.getCell(i).toString(), row.getCell(i).toString());
      }
      excelData.add(linkedHashMap);
    }
    return excelData;
  }
}
