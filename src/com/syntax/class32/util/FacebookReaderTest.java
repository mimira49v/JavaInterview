package com.syntax.class32.util;

import java.io.IOException;

public class FacebookReaderTest {
    public static void main(String[] args) throws IOException {
            System.out.println(FacebookReader.getProperty("browser"));
            System.out.println(FacebookReader.getProperty("url"));
            System.out.println(FacebookReader.getProperty("username"));
            System.out.println(FacebookReader.getProperty("password"));
    }
}
