package com.ohgiraffers.section03.map.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /*
        * Properties란?
        * HashMap과 거의 유사하지만 Key와 value 모두를 Stirng 으로만 사용할 수 있는 자료구조이다.
        * 주로 설정 파일 관련 파일과의 입출력에 사용된다.
        *
        * */

        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/test");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
