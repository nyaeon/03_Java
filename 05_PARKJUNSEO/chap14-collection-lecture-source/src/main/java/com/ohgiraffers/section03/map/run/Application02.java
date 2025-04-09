package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application02 {

    public static void main(String[] args) {

        /*
        * Properties란?
        *    HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조
        *    주로 설정 파일 관련된 파일과의 입출력에 사용
        * */
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/test");
        prop.setProperty("user", "root");
        prop.setProperty("password", "wasabi");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat"), "jdbc driver");
            prop.store(new FileWriter("src/main/java/com/ohgiraffers/section03/map/run/driver.properties"), "jdbc driver properties");
            prop.storeToXML(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.XML"), "jdbc driver XML");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();
        System.out.println("prop2 = " + prop2);

        try {
            //prop2.load(new FileInputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat"));
            prop2.load(new FileReader("src/main/java/com/ohgiraffers/section03/map/run/driver.properties"));
            //prop2.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.XML"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("prop2 = " + prop2);;
        System.out.println("driver = " + prop2.getProperty("driver"));

    }
}
