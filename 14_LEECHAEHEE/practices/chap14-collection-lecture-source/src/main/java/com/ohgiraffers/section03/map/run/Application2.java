package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties란?
        * HashMap과 거의 유사하지만 key와 value모두를 String으로만 사용할 수 있는 자료구조이다.
        * 주로 설정 파일 관련된 파일과의 입출력에 사용된다.
        * */
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/student");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/driver.dat"), "jdbc driver");
            prop.store(new FileWriter("src/main/java/com/ohgiraffers/section03/map/driver.props"), " driver properties");
            prop.storeToXML(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/driver.xml"), "driver.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();
        System.out.println(prop2);
        try {
//            prop2.load(new FileInputStream("src/main/java/com/ohgiraffers/section03/map/driver.dat"));
//            prop2.load(new FileReader("src/main/java/com/ohgiraffers/section03/map/driver.props"));
            prop2.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section03/map/driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prop2 : " + prop2);
        System.out.println("driver : " + prop.getProperty("driver"));
        System.out.println("url : " + prop.getProperty("url"));
        System.out.println("user : " + prop.getProperty("user"));
        System.out.println("password : " + prop.getProperty("password"));
    }
}
