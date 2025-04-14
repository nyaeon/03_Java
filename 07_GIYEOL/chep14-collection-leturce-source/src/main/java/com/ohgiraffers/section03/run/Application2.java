package com.ohgiraffers.section03.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /***
         * properties
         * HashMap 과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조다
         * 주로 설정 파일 관련된 파일과 입출력에 사용됨
         */
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/test");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileOutputStream("driver.properties"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Properties prop2 = new Properties();
        System.out.println(prop2);

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.properties"));
            prop2.load(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(prop2);
        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password"));
    }
}