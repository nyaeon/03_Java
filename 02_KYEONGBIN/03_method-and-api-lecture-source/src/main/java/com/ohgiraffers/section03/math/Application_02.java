package com.ohgiraffers.section03.math;

public class Application_02 {

    public static void main(String[] args) {

        // 0 ~ 9 까지의 난수를 생성
        // Math.random()은 0.0 이상 1.0 미만의 실수 난수를 생성합니다.
        // (Math.random() * 10)은 0 이상 10 미만의 실수 난수를 생성.
        // (int)로 형변환하여 소수점을 버리고 정수로 변환 후, 0을 더해서 0 ~ 9 사이의 정수 생성.
        int random1 = (int) ((Math.random() * 10) + 0); // + 0은 시작 값이 0부터 시작되도록 함
        System.out.println(random1); // 결과 출력

        // 1 ~ 10 까지의 난수 생성
        // Math.random() * 10은 0 이상 10 미만의 실수 난수를 생성.
        // + 1은 최소값을 1로 설정하여 1 이상 10 미만의 난수를 생성.
        int random2 = (int) ((Math.random() * 10) + 1);
        System.out.println("random2 = " + random2); // 결과 출력

        // 10 ~ 15 까지의 난수 생성
        // Math.random() * 6은 0 이상 6 미만의 실수 난수를 생성.
        // + 10은 난수의 시작을 10으로 설정하여 10 이상 16 미만의 난수를 생성.
        int random3 = (int) (((Math.random()) * 6) + 10);
        System.out.println("random3 = " + random3); // 결과 출력

        // -128 ~ 127 까지의 난수 생성
        // Math.random() * 256은 0 이상 256 미만의 실수 난수를 생성.
        // -128을 더하여 -128 이상 128 미만의 난수를 생성.
        int random4 = (int) ((Math.random() * 256) - 128);
        System.out.println("random4 = " + random4); // 결과 출력

    }
}
