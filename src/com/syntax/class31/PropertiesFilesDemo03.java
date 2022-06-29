package com.syntax.class31;

import javax.sound.sampled.Port;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo03 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mileu\\OneDrive\\Desktop\\test\\trump.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("isCrazy","false");
        properties.put("isRich","true");
        properties.store(fileOutputStream,"Added some new fileds");
    }
}
