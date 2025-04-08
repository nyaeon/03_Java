package com.ohgiraffers.section03.employeement;

public class Application {
    public static void main(String[] args) {
        /***
         * 인터페이스
         * 여기서 다루는 인터페이스는 자바의 클래스와 유사한 형태이지만
         * 추상 메소드와 상수 필드(public static final)만 가질 수 있는 클래스의 변형체를 말함
          */
        // Interproduct  interproduct = new Interproduct(); 에러남
         Interproduct interproduct = new Product(); //혼자 생성은 불가함, 상위 타입으로는 사용가능
         interproduct.abstractMethod();
         interproduct.abstmethod();

         interproduct.defaultmethod();
         Interproduct.staticmethod();
         //상수 필드(public static final) 접근도 인터페이스명.필드명으로 함
         System.out.println(Interproduct.Max_num);
         System.out.println(Interproduct.Min_num);

    }
}
