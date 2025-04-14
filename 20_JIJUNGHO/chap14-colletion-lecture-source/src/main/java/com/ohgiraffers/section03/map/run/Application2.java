package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /*
         * Properties란?
         *   HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
         *   주로 설정 파일 관련된 파일과의 입출력에 해당된다.
         * */

        Properties prop = new Properties();

        // 파일에 값 추가
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/test");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        String filePath1 = "src/main/java/com/ohgiraffers/section03/map/run/driver.dat";
        String filePath2 = "src/main/java/com/ohgiraffers/section03/map/run/driver.properties";
        String filePath3 = "src/main/java/com/ohgiraffers/section03/map/run/driver.xml";

        try {
            // byte 기반 파일 생성
            prop.store(new FileOutputStream(filePath1), "Jdbc Driver");
            // 문자 기반 파일 생성
            prop.store(new FileWriter(filePath2), "Java Driver");
            // XML 기반 (태그, 대용량 설정을 위한) 파일 생성
            prop.storeToXML(new FileOutputStream(filePath3), "Xml Driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 파일 읽기
        Properties prop2 = new Properties();

        try {
            // byte 기반 파일 읽기
            //            prop2.load(new FileInputStream(filePath1));
            // 문자 기반 파일 읽기
            //            prop2.load(new FileReader(filePath2));
            // XML 기반 파일 읽기
            prop2.loadFromXML(new FileInputStream(filePath3));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("prop2 = " + prop2);

        // 값 조회하기
        System.out.println("driver : " + prop.getProperty("driver"));
        System.out.println("driver : " + prop.getProperty("url"));
        System.out.println("driver : " + prop.getProperty("user"));
        System.out.println("driver : " + prop.getProperty("password"));

    }

}
