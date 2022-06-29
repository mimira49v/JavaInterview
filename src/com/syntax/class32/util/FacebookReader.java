package com.syntax.class32.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FacebookReader {
    public static String getProperty(String key) throws IOException {
        //1st step - location the file that we want to read.
        String path = "Files/Facebook.properties";

        //2nd step - navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);

        //special class which knows how to read the .properties file
        Properties properties = new Properties();
        //loading all the data from the file to properties object

        properties.load(fileInputStream);
        return properties.getProperty(key);
    }
}
