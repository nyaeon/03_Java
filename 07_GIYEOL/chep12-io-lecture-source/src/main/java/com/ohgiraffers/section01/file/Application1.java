package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Application1 {
    public static void main(String[] args) {
        /***
         * JDK 1.0 부터 지원받는 API 로 파일 처리를 수행하는 대표적인 클래스
         *
         */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            //파일 생성하고 실패, 성공 여부를 boolean으로 리턴(생성되면 true)
            boolean createSuccess = file.createNewFile();
            
            //최초 실행하면 새롭게 파일이 만들어지기 때문에 참이다
            //파일이 한 번 생성되고 난 이후에는 새롭게 만든게 아니기에 거짓으로 반환
            System.out.println("File created: " + createSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일 크기 : " +file.length());
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        String path = "c:\\devTest\\test";
        File filelPath = new File(path);

        boolean mkdir = filelPath.mkdirs();
        System.out.println("mkdir " + mkdir);

        boolean deleteSuccess = filelPath.delete();
        System.out.println(deleteSuccess);

        boolean deleteSuccess2 = new File("c:\\devTest").delete();
        System.out.println(deleteSuccess2);
        boolean deleteSuccess3 = file.delete();
        System.out.println(deleteSuccess3);

        //폴더의 생성여부 exists() 메소드를 이용해서 판별
        System.out.println("filelPath.exists() " + filelPath.exists());
    }

}
