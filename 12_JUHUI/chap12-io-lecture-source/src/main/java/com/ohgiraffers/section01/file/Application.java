package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        /*
         * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스
         */
        // File은 생성자가 없어 매개변수가 있어야함. 매개변수에는 경로가 있어야 함. 상대경로든 절대경로든. src부터 작성하면됨.
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            // 파일 생성 후 성공/실패 여부를 boolean으로 리턴(생성되면 true)
            boolean createSuccess = file.createNewFile();

            //최초 실행시에만 새롭게 파일이 만들어지기 때문에 true 반환.
            //파일이 한 번 생성되고 난 이후에는 새롭게 파일이 만들어지지 않기 때문에 false를 반환.
            System.out.println("File created: " + createSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        String path = "c:\\devTest\\test";
        File filePath = new File(path);

        //sql처럼 새 파일 생성하는 방법 같음.
        boolean mkdir = filePath.mkdirs();
        System.out.println("mkdir = " + mkdir);

        //devTest 파일 삭제
        boolean deleteSuccess = filePath.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);

        //devTest 파일 삭제하는데 경로를 직접 적어줘서 사용
        boolean deleteSuccess2 = new File("c:\\devTest").delete();
        System.out.println("deleteSuccess2 = " + deleteSuccess2);

        // file 자체를 삭제함으로써 다 삭제함
        boolean deleteSuccess3 = file.delete();
        System.out.println("deleteSuccess3 = " + deleteSuccess3);

        // 폴더의 생성 여부를 exists() 메소드를 이용해 판별함.
        System.out.println("filePath.exists() : " + filePath.exists());
    }
}
