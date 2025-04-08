package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /*
         * JDK 1.0 부터 지원하는 API 로 파일 처리를 수행하는 대표적인 클래스
         */

        // test.txt 파일을 상대 경로 기준으로 생성
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            // 파일 생성 (이미 존재하면 false 반환)
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess : " + createSuccess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 파일 정보 출력
        System.out.println("File size : " + file.length() + " bytes");
        System.out.println("File path : " + file.getPath());
        System.out.println("File previous path : " + file.getParent());
        System.out.println("File Absolute path : " + file.getAbsolutePath());

        // 새로운 폴더 생성
        String path = "B:\\Development\\devTest\\test";
        File filePath = new File(path);
        boolean mkdir = filePath.mkdirs();
        System.out.println("mkdir : " + mkdir); // true면 폴더 생성됨

        // 생성한 폴더 삭제 시도 (단, 비어있어야 삭제 가능)
        boolean deleteSuccess = filePath.delete();
        System.out.println("deleteSuccess : " + deleteSuccess); // false일 수 있음 (비어있지 않다면)

        // 폴더 내 파일 삭제 시도
        File filePath2 = new File("B:\\Development\\devTest\\test.txt");
        boolean deleteSuccess2 = filePath2.delete();
        System.out.println("deleteSuccess2 : " + deleteSuccess2); // true면 삭제 성공

        // 폴더 존재 여부 확인
        System.out.println("filePath.exists() : " + filePath.exists());
    }
}
