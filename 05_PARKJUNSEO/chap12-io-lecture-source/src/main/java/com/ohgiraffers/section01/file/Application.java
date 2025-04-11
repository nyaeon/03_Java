package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /*
        * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스
        * */
                                            // 상대 경로
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");    // 이 클래스는 기본 생성자가 없음. 매개변수 반드시 작성

        try {
            // 파일 생성 후 성공/실패 여부를 boolean으로 리턴 (생성되면 true)
            boolean createSuccess = file.createNewFile();

            // 최초 실행하면 새롭게 파일이 만들어지기 때문에 true를 반환
            // 파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 false를 반환
            System.out.println("file = " + file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");    // 파일의 크기    // 영어와 공백은 1byte
        System.out.println("파일의 경로  : " + file.getPath());    
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
        System.out.println("현재 파일의 상위경로 : " + file.getParent());

        String path = "C:\\devTest\\test";
        File filepath = new File(path);

        // 파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 한번 더 실행하면 false를 반환
        boolean mkdir = filepath.mkdirs();
        System.out.println("mkdir = " + mkdir);

        // devTest 디렉토리까지는 남아있고 test 파일은 삭제됨
        boolean deleteSuccess = filepath.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);

        // 디렉토리까지 삭제
        boolean deleteSuccess1 = new File("C:\\devTest").delete();
        System.out.println("deleteSuccess1 = " + deleteSuccess1);

        // 폴더의 생성여부를 exists() 메소드를 이용해서 판별
        System.out.println("filepath.exists() : " + filepath.exists());

    }
}
